package de.kaliburg.morefair.account.services.mapper;

import de.kaliburg.morefair.account.model.AccountEntity;
import de.kaliburg.morefair.account.model.dto.AccountDetailsDto;
import de.kaliburg.morefair.account.services.AccountSettingsService;
import de.kaliburg.morefair.game.ladder.model.LadderEntity;
import de.kaliburg.morefair.game.ladder.services.LadderService;
import de.kaliburg.morefair.game.ranker.services.RankerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * The Mapper that can convert the {@link AccountEntity AccountEntities} to DTOs.
 */
@Component
@RequiredArgsConstructor
public class AccountMapper {

  private final LadderService ladderService;

  private final RankerService rankerService;

  private final AccountSettingsService accountSettingsService;

  private final AccountSettingsMapper accountSettingsMapper;

  /**
   * Mapping the {@link AccountEntity} to a {@link AccountDetailsDto}.
   *
   * @param account the {@link AccountEntity}
   * @return the {@link AccountDetailsDto}
   */
  public AccountDetailsDto mapToAccountDetailsDto(AccountEntity account) {
    int ladderNumber = rankerService.findHighestActiveRankerOfAccount(account)
        .map(r -> ladderService.findLadderById(r.getLadderId()).orElseThrow())
        .map(LadderEntity::getNumber)
        .orElse(1);

    var accountSettings = accountSettingsService.findOrCreateByAccount(account.getId());

    return AccountDetailsDto.builder()
        .uuid(account.getUuid())
        .accountId(account.getId())
        .username(account.getUsername())
        .email(account.getUsername())
        .accessRole(account.getAccessRole())
        .highestCurrentLadder(ladderNumber)
        .settings(accountSettingsMapper.mapToAccountSettingsDto(accountSettings))
        .build();
  }
}
