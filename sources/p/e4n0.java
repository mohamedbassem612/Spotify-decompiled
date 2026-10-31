package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class e4n0 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ e4n0(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new f4n0(aey0Var.c("music-platform-root:enable_node_based_root_ui", false), (luk) null);
            case 1:
                return new m8r0(aey0Var.b(0, 1000, 0, "page-match-entry-point:gradient_border_max_event_count"), (luk) null, aey0Var.c("page-match-entry-point:gradient_border_enabled", false));
            case 2:
                return new v8r0(aey0Var.b(1, 3600, 60, "page-match-outbound-scanning:haptic_time_offset_threshold_seconds"), null);
            case 3:
                return new m0s0(aey0Var.c("partner-account-linking-alexa:use_cmp_alexa_linking", false), (luk) null);
            case 4:
                return new d1s0(aey0Var.c("partner-account-linking:account_link_using_auth_code", false), aey0Var.c("partner-account-linking:samsung_linking_use_cmp", false), (luk) null);
            case 5:
                return new gys0(aey0Var.c("pigeon-onboarding:replace_go_to_settings_with_close", false), null);
            case 6:
                return new hys0(aey0Var.c("pigeon-upsell:should_show_pigeon_upsell", false), null);
            case 7:
                return new f6v0(aey0Var.c("podcast-playback-speed-domain:use_playback_settings_system", false), (luk) null);
            case 8:
                return new s9v0(aey0Var.c("podcast-ui-platform-contextmenuimpl:content_agnostic_show_menu_loader_enabled", false), null);
            case 9:
                return new w9v0(aey0Var.c("podcastexperience-settings-trailingactions:setting_visible", false), (luk) null);
            case 10:
                return new isv0(aey0Var.c("premium-destination:enable_premium_marketing", false), aey0Var.c("premium-destination:premium_tab_enabled", true), aey0Var.c("premium-destination:premium_tab_shows_on_tablets", true), aey0Var.a("premium-destination:premium_tab_title", hsv0.b), (luk) null);
            case 11:
                return new bpy0(aey0Var.c("puffin-access:puffin_client_enabled", true), (luk) null);
            case 12:
                return new qpy0(aey0Var.c("puffin-cross-device-syncing:enabled", false), (luk) null);
            case 13:
                return new mz11(aey0Var.c("remote-config-fetching:enable_quasar_background_fetch", true), (luk) null);
            case 14:
                return new nz11(aey0Var.c("remote-config-fetching:enable_fetch_readiness", false), aey0Var.b(0, 10000, 0, "remote-config-fetching:millis_to_defer"), (cz11) null);
            case 15:
                return new de31(aey0Var.c("rewardedad:on_demand_cap_reached", false), (luk) null);
            case 16:
                return new zs61(aey0Var.c("settings-quickaccess:enable_quick_access_settings_customization", false), aey0Var.c("settings-quickaccess:show_quick_access_settings_in_settings", false), aey0Var.c("settings-quickaccess:use_quick_settings_grid", false), (tgp0) null, (luk) null);
            case 17:
                return new xa91(aey0Var.c("sleeptimer-dialogs:enable_sleeptimer_dialogs", false), (luk) null);
            case 18:
                return new ya91(aey0Var.c("sleeptimer-handler:enable_sleeptimer_fade_out", false), aey0Var.c("sleeptimer-handler:use_player_state_backed_sleep_timer", false), (luk) null);
            case 19:
                return new wvd1(aey0Var.c("tasteprofile-contextmenu:is_edit_taste_profile_context_menu_enabled", false), (luk) null);
            case 20:
                return new m5l1(aey0Var.c("watch-feed-artwork-accessory:watchfeed_artwork_accessory_enabled", false), (luk) null);
            case 21:
                return new gal1(aey0Var.c("watch-feed-playlist-section:spotify_playlist_check_enabled", true), aey0Var.c("watch-feed-playlist-section:watchfeed_entity_explorer_in_header_enabled", true), aey0Var.c("watch-feed-playlist-section:watchfeed_inline_entity_explorer_row_enabled", true), aey0Var.c("watch-feed-playlist-section:watchfeed_playlist_enabled", false), (luk) null);
            case 22:
                return new zrm1(aey0Var.c("your-library-audiobook-progress-nudge:enabled", false), aey0Var.b(0, 100, 20, "your-library-audiobook-progress-nudge:percentage_threshold"), aey0Var.b(2, Integer.MAX_VALUE, 18, "your-library-audiobook-progress-nudge:time_threshold"), aey0Var.c("your-library-audiobook-progress-nudge:use_show_esperanto_endpoint", false), (luk) null);
            case 23:
                return new zum1(aey0Var.c("your-library-pro:enabled", false), (luk) null);
            case 24:
                return new dvm1(aey0Var.c("your-library:default_grid_view_googlebook", false), aey0Var.a("your-library:default_view_density", bvm1.b), (luk) null);
            default:
                return new f3n1(aey0Var.c("yourlibrary-messaging-page:full_tree_move_structure", false), (luk) null);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 6:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 7:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 8:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 9:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 10:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 11:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 12:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 13:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 14:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 15:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 16:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 17:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 18:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 19:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 20:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 21:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 22:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 23:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 24:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        f3n1 f3n1Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (f4n0) f3n1Var, f4n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/MusicPlatformRootProperties;", 0);
            case 1:
                return new tv30(1, (m8r0) f3n1Var, m8r0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/pagematch/elements/pagematchbutton/impl/PageMatchEntryPointProperties;", 0);
            case 2:
                return new tv30(1, (v8r0) f3n1Var, v8r0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/pagematch/outboundscanningpage/PageMatchOutboundScanningProperties;", 0);
            case 3:
                return new tv30(1, (m0s0) f3n1Var, m0s0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PartnerAccountLinkingAlexaProperties;", 0);
            case 4:
                return new tv30(1, (d1s0) f3n1Var, d1s0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PartnerAccountLinkingProperties;", 0);
            case 5:
                return new tv30(1, (gys0) f3n1Var, gys0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PigeonOnboardingProperties;", 0);
            case 6:
                return new tv30(1, (hys0) f3n1Var, hys0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PigeonUpsellProperties;", 0);
            case 7:
                return new tv30(1, (f6v0) f3n1Var, f6v0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastplaybackspeed/domainimpl/PodcastPlaybackSpeedDomainProperties;", 0);
            case 8:
                return new tv30(1, (s9v0) f3n1Var, s9v0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastuiplatform/contextmenuimpl/PodcastUiPlatformContextmenuimplProperties;", 0);
            case 9:
                return new tv30(1, (w9v0) f3n1Var, w9v0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastexperience/settings/trailingactions/impl/PodcastexperienceSettingsTrailingactionsProperties;", 0);
            case 10:
                return new tv30(1, (isv0) f3n1Var, isv0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PremiumDestinationProperties;", 0);
            case 11:
                return new tv30(1, (bpy0) f3n1Var, bpy0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PuffinAccessProperties;", 0);
            case 12:
                return new tv30(1, (qpy0) f3n1Var, qpy0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PuffinCrossDeviceSyncingProperties;", 0);
            case 13:
                return new tv30(1, (mz11) f3n1Var, mz11.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/backgroundsyncservice/RemoteConfigFetchingProperties;", 0);
            case 14:
                return new tv30(1, (nz11) f3n1Var, nz11.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/authenticatedfetcherservice/RemoteConfigFetchingProperties;", 0);
            case 15:
                return new tv30(1, (de31) f3n1Var, de31.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/RewardedadProperties;", 0);
            case 16:
                return new tv30(1, (zs61) f3n1Var, zs61.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/settings/quickaccess/properties/SettingsQuickaccessProperties;", 0);
            case 17:
                return new tv30(1, (xa91) f3n1Var, xa91.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastexperience/sleeptimerdialogs/SleeptimerDialogsProperties;", 0);
            case 18:
                return new tv30(1, (ya91) f3n1Var, ya91.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastexperience/sleeptimerhandler/SleeptimerHandlerProperties;", 0);
            case 19:
                return new tv30(1, (wvd1) f3n1Var, wvd1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/TasteprofileContextmenuProperties;", 0);
            case 20:
                return new tv30(1, (m5l1) f3n1Var, m5l1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/WatchFeedArtworkAccessoryProperties;", 0);
            case 21:
                return new tv30(1, (gal1) f3n1Var, gal1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/WatchFeedPlaylistSectionProperties;", 0);
            case 22:
                return new tv30(1, (zrm1) f3n1Var, zrm1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/audiobookprogressnudgeimpl/YourLibraryAudiobookProgressNudgeProperties;", 0);
            case 23:
                return new tv30(1, (zum1) f3n1Var, zum1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/libraryproproperties/YourLibraryProProperties;", 0);
            case 24:
                return new tv30(1, (dvm1) f3n1Var, dvm1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/settings/layout/impl/remoteconfiguration/YourLibraryProperties;", 0);
            default:
                return new tv30(1, f3n1Var, f3n1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/messaging/page/YourlibraryMessagingPageProperties;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
