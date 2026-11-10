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
- **2026-11-03** — DEC-13: MngBrandColors.kt and flavor XML add navicon, section tab and tab label colors. Figma: Shell colors · Android (468, aliases of Core Brand colors) + Shell theme · Android (20 modes).
- **2026-11-03** — DEC-14: control tokens generated (see mng_apps_core_ds DECISIONS DEC-14).
- **2026-11-04** — DEC-14: app shell exceptions removed (majority values); Continue size tokens. See mng_apps_core_ds PROGRESS.
- **2026-11-05** — Repo links point to the dfmedia org (CLAUDE.md, README.md; same change in mng_apps_core_ds).
- **2026-11-05** — DEC-15: `statusbar` (MngBrandPalette.statusbar, @color/mng_brand_statusbar) now follows navbar (regenerated from mng_apps_core_ds). Figma: Components · App shell › 01 · Status bar exceptions; statusbar variables in Shell colors / Shell theme · Android (majority vs suggested override per exception market).
- **2026-11-05** — DEC-15 overrides accepted: MngBrandPalette.statusbarOverride + flavor XML for DP, MC, NYDN, OS, SS, TSAR, VP (dark status bar). Figma: those 7 statusbar variables hold the shipped hex; samples relinked. See mng_apps_core_ds DEC-15.
- **2026-11-10** — DEC-16: tokens/MngSystemColors.kt and res/values/mng_system_colors.xml (system colors: Core 11 + Android 84, plus 19 brand-following), generated from mng_apps_core_ds.
- **2026-11-10** — Figma: System colors · Android (103 variables, 19 alias the Core Brand theme) collection (DEC-16; see mng_apps_core_ds).
- **2026-11-10** — DEC-15 Android 15+ status bar (confirmed on device by the Apps team): MngBrandPalette `statusbar15`, `statusbarFor(sdkInt)`, `statusbarDarkIconsFor(sdkInt)`; flavor XML `@bool/mng_brand_statusbar_dark_icons` and `res/values-v35/mng_brand_statusbar.xml` (navbar + dark icons) in DP, MC, NYDN, OS, SS, TSAR, VP. Generated from mng_apps_core_ds. Figma: Components · App shell › 01 now shows Android 14 and below vs 15+.
- **2026-11-10** — Compile check (GitHub Actions, `.github/workflows/compile.yml` + compile-only `build.gradle.kts`): Kotlin compiled once, resources linked for all 78 flavors on every push. First run found a duplicate resource (`@color/mng_button_primary_label` = generated token and the button's state list); the state list is now `mng_button_primary_label_states`. Green from 7bc2fd2. See mng_apps_core_ds PROGRESS.
- **2026-11-10** — DEC-15 Android 15+ icon rule confirmed (EdgeToEdgeUtil.java:30: dark icons only on an exactly #FFFFFF bar). Regenerated: `MngBrandPalettes.TSAR` no longer sets `statusbarDarkIcons15`; `flavors/tsar/res/values-v35/mng_brand_statusbar.xml` sets dark icons false (TSAR's bar is #F5F5F5, white icons as shipped, IMPROVEMENTS CLR-09). Figma: Components · App shell › 01 · Status bar exceptions rebuilt. See mng_apps_core_ds PROGRESS.
