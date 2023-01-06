module.exports = {
  theme: {
    extend: {
      colors: {
        navbar: {
          bg: "var(--navbar-bg-color)",
          text: "var(--navbar-text-color)",
        },
        button: {
          bg: {
            DEFAULT: "var(--button-bg-color)",
            hover: "var(--button-bg-hover-color)",
          },
          text: {
            DEFAULT: "var(--button-text-color)",
            hover: "var(--button-text-hover-color)",
          },
          border: {
            DEFAULT: "var(--button-border-color)",
            hover: "var(--button-border-hover-color)",
          },
        },
        toggle: {
          bg: {
            on: "var(--toggle-bg-on-color)",
            off: "var(--toggle-bg-off-color)",
          },
          border: "var(--toggle-border-color)",
          circle: {
            bg: {
              on: "var(--toggle-circle-bg-on-color)",
              off: "var(--toggle-circle-bg-off-color)",
            },
            border: "var(--toggle-inner-border-color)",
          },
        },
        text: {
          DEFAULT: "var(--text-color)",
          light: "var(--text-light-highlight-color)",
          dark: "var(--text-dark-highlight-color)",
          placeholder: "var(--text-placeholder-color)",
        },
        background: {
          DEFAULT: "var(--background-color)",
        },
        ladder: {
          bg: {
            DEFAULT: "var(--ladder-bg-color)",
            promoted: "var(--ladder-bg-promoted-color)",
            you: "var(--ladder-bg-you-color)",
          },
          text: {
            DEFAULT: "var(--ladder-text-color)",
            promoted: "var(--ladder-text-promoted-color)",
            you: "var(--ladder-text-you-color)",
          },
        },
        eta: {
          best: "var(--eta-best-color)",
          mid: "var(--eta-mid-color)",
          worst: "var(--eta-worst-color)",
        },
      },
      fontSize: {
        "2xs": "0.64rem",
        "3xs": "0.512rem",
        "4xs": "0.41rem",
        "5xs": "0.328rem",
      },
    },
  },
  plugins: [],
  content: ["./src/**/*.vue"],
};
