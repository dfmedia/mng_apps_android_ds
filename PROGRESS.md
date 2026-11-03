# Progress — MNG Android Design System

Legend: ✅ done · 🔄 in progress · ⏸ waiting on review/input · ⬜ not started

| Step | Status | Notes |
|------|--------|-------|
| Repo and Figma file created | ✅ | 2026-10-20 |
| Receive approved Android-only items from Core | ⬜ | Waiting on PLAT-01 … PLAT-10 (Core: docs/PLATFORM-OWNERSHIP.md) |

| Brand color tokens generated | ✅ | tokens/MngBrandColors.kt and tokens/flavors/<flavor>/res/values/mng_brand_colors.xml (DEC-04) |
| Button pilot (DEC-07) | ⏸ review | tokens/res/values/mng_button.xml (generated) and components/button/: Widget.MNG.Button.Primary, Widget.MNG.Button.TextLink, MngTextLink (View-based UI). Not compiled yet |

## Log

- **2026-10-20** — Repo set up with CLAUDE.md pointing to Core instructions.
- **2026-10-21** — First generated brand color tokens from Core (DEC-04).
- **2026-10-26** — Button pilot (DEC-07): tokens/res/values/mng_button.xml (generated) and components/button/: Widget.MNG.Button.Primary, Widget.MNG.Button.TextLink, MngTextLink (View-based UI). Not compiled yet. Core: docs/components/BUTTON.md, DEC-07 (mng_apps_core_ds). Figma: Button variables in this platform file.
- **2026-10-26** — Figma: page Components · Button with Button/Primary (State) and Button/Text link; collection Button · Android; text styles Button/Label, Button/Text link. Core library enabled (mng_apps_core_ds).
- **2026-10-29** — Kotlin package `com.mng.designsystem.tokens` confirmed (DEC-04, mng_apps_core_ds).
- **2026-10-30** — DEC-09: tokens/MngTypeStyles.kt (generated): every Android text style as shipped, with asset file names for TypefaceCache (mng_apps_core_ds docs/TYPE-STYLES.md).
- **2026-10-30** — Figma: 25 text styles (DEC-09 production values) + page Type · Text styles. Article/Subhead waits on its font (MISSING-ASSETS 4.4, mng_apps_core_ds).
- **2026-11-03** — tokens/res/values/mng_scale.xml generated and Spacing · Android variables in Figma (DEC-11, mng_apps_core_ds).
- **2026-11-03** — DEC-12: mng_scale.xml adds breakpoints and component metrics; TextLink style uses @dimen/mng_size_touch_min. Figma: Breakpoints · Android, Components · Android; Text link bound to the touch target.
