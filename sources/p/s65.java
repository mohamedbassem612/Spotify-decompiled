package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class s65 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ s65(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new t65(aey0Var.b(5000, 30000, 5000, "android-usersnearby-settings-impl:check_in_sheet_presentation_timeout_ms"), null, aey0Var.c("android-usersnearby-settings-impl:is_enabled", true), aey0Var.c("android-usersnearby-settings-impl:users_nearby_qr_code", true));
            case 1:
                return new v65(aey0Var.c("android-video-preview-flags:cn_element_carousel_for_nova_scroll_enabled", false), aey0Var.c("android-video-preview-flags:cn_element_carousel_play_entire_podcast_video_enabled", false), aey0Var.c("android-video-preview-flags:cn_element_carousel_use_common_trait_for_preview_playback", false), aey0Var.c("android-video-preview-flags:disable_all_previews", false), aey0Var.c("android-video-preview-flags:element_videos_carousel_enabled", false), aey0Var.c("android-video-preview-flags:enable_duration_label_video_preview_carousel", false), aey0Var.c("android-video-preview-flags:multiplayer_stream_reporting_enabled", false), aey0Var.c("android-video-preview-flags:use_compose_video_card_ui", false), (luk) null);
            case 2:
                return new x65(aey0Var.c("android-videoautoplay-videoautoplayimpl:skip_connect_device_check", false), (luk) null);
            case 3:
                return new b75(aey0Var.c("android-videorecommendation-entrypointsconfigimpl:enable_music_video_carousel_on_creator_page_in_mft_plus", false), aey0Var.c("android-videorecommendation-entrypointsconfigimpl:enable_music_video_carousel_on_npv_scroll_in_mft_plus", false), aey0Var.c("android-videorecommendation-entrypointsconfigimpl:enable_music_video_carousel_on_search_page_in_mft_plus", false), aey0Var.c("android-videorecommendation-entrypointsconfigimpl:enable_music_video_time_cap_upsell_for_video_first_search_results", false), aey0Var.c("android-videorecommendation-entrypointsconfigimpl:is_music_video_autoplay_copy_enabled", false), aey0Var.a("android-videorecommendation-entrypointsconfigimpl:music_video_carousel_creator_page_cap_behavior", y65.b), aey0Var.a("android-videorecommendation-entrypointsconfigimpl:music_video_carousel_npv_scroll_cap_behavior", z65.b), aey0Var.a("android-videorecommendation-entrypointsconfigimpl:music_video_carousel_search_page_cap_behavior", a75.b), aey0Var.b(0, 100000, AudioEpisode.SHOW_URI_FIELD_NUMBER, "android-videorecommendation-entrypointsconfigimpl:time_cap_music_video_upsell_delay_millis"), (luk) null);
            case 4:
                return new r75(aey0Var.c("android-voiceassistants-musicappvoiceassistants:prepare_player", false), (luk) null);
            case 5:
                return new s75(aey0Var.c("android-voting-playlist:enable_debug_tools", false), aey0Var.c("android-voting-playlist:enable_entrypoint_section", true), aey0Var.c("android-voting-playlist:enable_screenshot_detection", true), aey0Var.c("android-voting-playlist:enable_share_header_action", true), aey0Var.c("android-voting-playlist:enable_watchfeed_header_action", false), (luk) null);
            case 6:
                return new t75(aey0Var.c("android-watch-feed-components:boxed_entity_row_playlist_cache_sync_enabled", true), aey0Var.c("android-watch-feed-components:disable_adaptive_content_prewarming", false), aey0Var.c("android-watch-feed-components:disable_progressive_content_prewarming", false), aey0Var.c("android-watch-feed-components:enable_surface_view", false), aey0Var.c("android-watch-feed-components:replace_explore_button_with_search_bar", false), aey0Var.c("android-watch-feed-components:skip_aligned_curation_dialog_on_remove", false), aey0Var.c("android-watch-feed-components:tap_to_mute_gesture_enabled", false), (luk) null);
            case 7:
                return new v75(aey0Var.c("android-watch-feed:auto_retry_only_on_certain_status_codes", false), aey0Var.c("android-watch-feed:exponential_backoff_for_retries_enabled", false), aey0Var.c("android-watch-feed:page_request_auto_retry_enabled", false), aey0Var.c("android-watch-feed:restore_npv_upon_back_navigation", false), aey0Var.a("android-watch-feed:vertical_scroll_onboarding_completion_strategy", u75.b), (luk) null);
            case 8:
                return new w75(aey0Var.c("android-watchfeed-carousel:enable_time_measurements", false), aey0Var.c("android-watchfeed-carousel:enabled_delayed_video_playback", false), aey0Var.c("android-watchfeed-carousel:load_video_when_focused", false), aey0Var.c("android-watchfeed-carousel:npv_scroll_watchfeed_carousel_entrypoint_enabled", false), (luk) null);
            case 9:
                return new x75(aey0Var.c("android-watchfeed-explorerentrypoint:enable_time_measurements", false), (luk) null);
            case 10:
                return new y75(aey0Var.c("android-wear-activation:cross_device_prompt_installation_enabled", false), aey0Var.c("android-wear-activation:debug_snackbar_enabled", false), aey0Var.c("android-wear-activation:onboarding_enabled", false), aey0Var.c("android-wear-activation:onboarding_experiment_enabled", false), (luk) null);
            case 11:
                return new d85(aey0Var.c("android-webview-checkout:paypal_custom_tabs_enabled", false), (luk) null);
            case 12:
                return new e85(aey0Var.c("android-webview-startup:enable_lazy_preloading", false), (luk) null);
            case 13:
                return new g85(aey0Var.c("android-where-to-play:enable_active_device_id_saver", false), (luk) null);
            case 14:
                return new h85(aey0Var.c("android-widget-educationalmessage:show_animated_educational_message", false), (luk) null);
            case 15:
                return new i85(aey0Var.b(1, 365, 7, "android-widget-widgetpromo:native_prompt_frequency_days"), (luk) null, aey0Var.c("android-widget-widgetpromo:enable_native_prompt", false));
            case 16:
                return new k85(aey0Var.a("android-widgets-colorextractionimpl:color_extraction_source", j85.b), (luk) null);
            case 17:
                return new l85(aey0Var.c("android-widgets-dynamicnpvwidget-wrapped:campaign_enabled", false), null);
            case 18:
                return new m85(aey0Var.c("android-widgets-mediabrowserdatasource:cancellation_cleanup_on_main_thread", false), null);
            case 19:
                return new n85(aey0Var.c("android-widgets-miuidynamicnpvwidget:is_miui_widget_enabled", false), null);
            case 20:
                return new p85(aey0Var.c("android-widgets-npvwidget:customizable_widget", false), aey0Var.a("android-widgets-npvwidget:entity_click_behaviour", o85.b), aey0Var.c("android-widgets-npvwidget:fetch_traits_metadata", true), aey0Var.c("android-widgets-npvwidget:hide_skip_buttons_in_compact_format", true), aey0Var.c("android-widgets-npvwidget:launcher_logging", false), aey0Var.c("android-widgets-npvwidget:recommendations_cache", true), aey0Var.c("android-widgets-npvwidget:save_action", false), aey0Var.c("android-widgets-npvwidget:skip_loading_on_update", false), aey0Var.c("android-widgets-npvwidget:use_loader_with_cross_profile", false), (luk) null);
            case 21:
                return new q85(aey0Var.c("android-widgets-npvwidget:material_system_theme_unauth", false), (xz11) null);
            case 22:
                return new r85(aey0Var.c("android-widgets-transsioncardwidget:is_transsion_widget_enabled", false), (xz11) null);
            case 23:
                return new s85(aey0Var.c("android-widgets-widget-attribution-impl:is_playback_attribution_enabled", false), null);
            case 24:
                return new t85(aey0Var.b(0, Integer.MAX_VALUE, 0, "android-widgets-widgetbackgroundupdates:update_period_minutes"), null);
            case 25:
                return new f95(aey0Var.c("android-xr-glasses:glasses_detection_enabled", false), aey0Var.c("android-xr-glasses:glasses_projected_experience_enabled", false), aey0Var.c("android-xr-glasses:onboarding_account_linking_nudge_enabled", false), aey0Var.c("android-xr-glasses:onboarding_education_enabled", false), aey0Var.c("android-xr-glasses:onboarding_session_scoped_dismissals_enabled", false), aey0Var.c("android-xr-glasses:onboarding_visual_music_enabled", false), (luk) null);
            case 26:
                return new g95(aey0Var.c("android-yourlibrary-contextmenuusecases:enable_add_to_playlist_for_albums", false), (luk) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new h95(aey0Var.c("android-yourlibrary-importnotifications:import_notifications_enabled", false), null);
            case 28:
                return new j95(aey0Var.c("android-zephyr:chip_selection_enabled", false), aey0Var.c("android-zephyr:connect_transfer_messaging_enabled", false), aey0Var.c("android-zephyr:enabled", false), aey0Var.c("android-zephyr:opt_in_enabled", false), aey0Var.c("android-zephyr:playlist_speed_opt_out_context_menu_enabled", false), (i95) aey0Var.a("android-zephyr:speed_disclosure_and_opt_out", i95.O_F_F), aey0Var.c("android-zephyr:sync_lyrics_enabled", true), aey0Var.c("android-zephyr:track_context_menu_enabled", false), aey0Var.c("android-zephyr:validate_transitions_using_core_enabled", false), (luk) null);
            default:
                return new c26(aey0Var.c("apps-music-features-remoteconfiguration:button_big", false), (y16) aey0Var.a("apps-music-features-remoteconfiguration:button_color", y16.BLUE), (z16) aey0Var.a("apps-music-features-remoteconfiguration:message", z16.C_O_N_T_R_O_L), null, null);
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
            case 25:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 26:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 28:
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
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (t65) j95Var, t65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/usersnearby/settings/impl/rc/AndroidUsersnearbySettingsImplProperties;", 0);
            case 1:
                return new tv30(1, (v65) j95Var, v65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidVideoPreviewFlagsProperties;", 0);
            case 2:
                return new tv30(1, (x65) j95Var, x65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/videoautoplay/videoautoplayimpl/rc/AndroidVideoautoplayVideoautoplayimplProperties;", 0);
            case 3:
                return new tv30(1, (b75) j95Var, b75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/videorecommendation/entrypointsconfigimpl/AndroidVideorecommendationEntrypointsconfigimplProperties;", 0);
            case 4:
                return new tv30(1, (r75) j95Var, r75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidVoiceassistantsMusicappvoiceassistantsProperties;", 0);
            case 5:
                return new tv30(1, (s75) j95Var, s75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidVotingPlaylistProperties;", 0);
            case 6:
                return new tv30(1, (t75) j95Var, t75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWatchFeedComponentsProperties;", 0);
            case 7:
                return new tv30(1, (v75) j95Var, v75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWatchFeedProperties;", 0);
            case 8:
                return new tv30(1, (w75) j95Var, w75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWatchfeedCarouselProperties;", 0);
            case 9:
                return new tv30(1, (x75) j95Var, x75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWatchfeedExplorerentrypointProperties;", 0);
            case 10:
                return new tv30(1, (y75) j95Var, y75.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWearActivationProperties;", 0);
            case 11:
                return new tv30(1, (d85) j95Var, d85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWebviewCheckoutProperties;", 0);
            case 12:
                return new tv30(1, (e85) j95Var, e85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/webview/startupservice/AndroidWebviewStartupProperties;", 0);
            case 13:
                return new tv30(1, (g85) j95Var, g85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/wheretoplay/AndroidWhereToPlayProperties;", 0);
            case 14:
                return new tv30(1, (h85) j95Var, h85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetEducationalmessageProperties;", 0);
            case 15:
                return new tv30(1, (i85) j95Var, i85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetWidgetpromoProperties;", 0);
            case 16:
                return new tv30(1, (k85) j95Var, k85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsColorextractionimplProperties;", 0);
            case 17:
                return new tv30(1, (l85) j95Var, l85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsDynamicnpvwidgetWrappedProperties;", 0);
            case 18:
                return new tv30(1, (m85) j95Var, m85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/widgets/mediabrowserdatasource/rc/AndroidWidgetsMediabrowserdatasourceProperties;", 0);
            case 19:
                return new tv30(1, (n85) j95Var, n85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsMiuidynamicnpvwidgetUnauthProperties;", 0);
            case 20:
                return new tv30(1, (p85) j95Var, p85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsNpvwidgetProperties;", 0);
            case 21:
                return new tv30(1, (q85) j95Var, q85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsNpvwidgetUnauthProperties;", 0);
            case 22:
                return new tv30(1, (r85) j95Var, r85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsTranssioncardwidgetUnauthProperties;", 0);
            case 23:
                return new tv30(1, (s85) j95Var, s85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidWidgetsWidgetAttributionImplProperties;", 0);
            case 24:
                return new tv30(1, (t85) j95Var, t85.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/widgets/widgetbackgroundupdates/rc/AndroidWidgetsWidgetbackgroundupdatesProperties;", 0);
            case 25:
                return new tv30(1, (f95) j95Var, f95.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/xrprojected/properties/rc/AndroidXrGlassesProperties;", 0);
            case 26:
                return new tv30(1, (g95) j95Var, g95.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/contextmenuusecases/AndroidYourlibraryContextmenuusecasesProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (h95) j95Var, h95.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/libraryimport/importmessages/impl/AndroidYourlibraryImportnotificationsProperties;", 0);
            case 28:
                return new tv30(1, j95Var, j95.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicplaybackspeed/configurationimpl/AndroidZephyrProperties;", 0);
            default:
                return new tv30(1, (c26) j95Var, c26.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/debugfeature/AppsMusicFeaturesRemoteconfigurationProperties;", 0);
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
            case 25:
                break;
            case 26:
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                break;
            case 28:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
