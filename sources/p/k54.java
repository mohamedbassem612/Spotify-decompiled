package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class k54 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ k54(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new l54(aey0Var.c("android-audio-focus-coreinternal:oboe_ducking_coordination_kill_switch", false), null);
            case 1:
                return new m54(aey0Var.c("android-audio-focus-services-impl:always_request_focus_after_gaining_focus", false), aey0Var.c("android-audio-focus-services-impl:focus_ducking_stop_guard_kill_switch", false), aey0Var.c("android-audio-focus-services-impl:preserve_transient_focus_loss_on_speaker_disconnect", true), aey0Var.c("android-audio-focus-services-impl:resume_playback_on_focus_gain_on_alarm_stream", true), aey0Var.c("android-audio-focus-services-impl:use_list_player_audio_focus_esperanto", true), aey0Var.c("android-audio-focus-services-impl:wait_for_player_command_completion", true), (luk) null);
            case 2:
                return new n54(aey0Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 60000, 5000, "android-audiobook-ccbottomsheet:fetch_copy_timeout_millis"), null);
            case 3:
                return new q54(aey0Var.c("android-audiobook-playerlistener:should_refresh_capping_state_on_player_error", true), aey0Var.c("android-audiobook-playerlistener:should_stop_player_when_capped", true), aey0Var.c("android-audiobook-playerlistener:use_extended_metadata_client_for_legacy_capping", true), (tgp0) null, (luk) null);
            case 4:
                return new r54(aey0Var.c("android-audiobook:context_menu_in_toolbar_trailing_action_book", false), aey0Var.c("android-audiobook:credits_search_link_enabled", false), aey0Var.c("android-audiobook:enable_buy_option_in_context_menu", false), aey0Var.c("android-audiobook:enable_omni_play_button_on_audiobook_page", false), aey0Var.c("android-audiobook:granular_ratings_button_enabled", false), aey0Var.c("android-audiobook:inline_card_on_audiobook_page_enabled", false), aey0Var.c("android-audiobook:is_chapter_progress_options_context_menu_enabled", false), aey0Var.c("android-audiobook:is_chapter_replay_mark_unplayed_checkbox_enabled", false), aey0Var.c("android-audiobook:is_mark_as_unplayed_from_here_enabled", false), aey0Var.c("android-audiobook:play_audiobooks_as_part_of_list", false), aey0Var.c("android-audiobook:recap_observe_page_match_enabled", false), aey0Var.c("android-audiobook:recap_observe_progress_enabled", false), aey0Var.c("android-audiobook:rich_series_about_tab_entry_point_enabled", false), aey0Var.c("android-audiobook:series_book_count_enabled", false), aey0Var.c("android-audiobook:should_enable_mark_as_finished_on_home", false), aey0Var.c("android-audiobook:should_use_compose_encore_list_row", false), aey0Var.c("android-audiobook:use_reputation_trait_ratings", false), null);
            case 5:
                return new s54(aey0Var.c("android-audiobookpremium-listening-hours-request:feature_enabled", false), (luk) null);
            case 6:
                return new u54(aey0Var.b(0, Integer.MAX_VALUE, 48, "android-audiobooks-onboarding-bottom-sheet:intervening_time_in_hours"), aey0Var.c("android-audiobooks-onboarding-bottom-sheet:is_eligible", false), aey0Var.b(1, Integer.MAX_VALUE, 2, "android-audiobooks-onboarding-bottom-sheet:presentation_cap"), aey0Var.a("android-audiobooks-onboarding-bottom-sheet:type", t54.b), (luk) null);
            case 7:
                return new w54(aey0Var.c("android-authentication-login5:exponential_backoff_enabled", false), aey0Var.a("android-authentication-login5:persist_rotated_stored_credential", v54.b), (xz11) null);
            case 8:
                return new x54(aey0Var.c("android-authentication-logout-service-impl:enable_backend_session_termination", false), null);
            case 9:
                return new o74(aey0Var.c("android-betamax-audio-language-page-impl:enable_unified_language_picker", false), null);
            case 10:
                return new p74(aey0Var.c("android-betamax-context-player:absolute_clip_position_enabled", false), aey0Var.c("android-betamax-context-player:defer_app_start_prepare_enabled", false), aey0Var.c("android-betamax-context-player:resume_anchored_pttff_enabled", false), aey0Var.c("android-betamax-context-player:stop_ad_player_on_transition_enabled", false), aey0Var.c("android-betamax-context-player:video_ads_caching_enabled", false), (luk) null);
            case 11:
                return new q74(aey0Var.b(0, 1000000, 0, "android-betamax-playerpool:player_pool_size"), (luk) null);
            case 12:
                return new t74(aey0Var.c("android-ble-connect-device-reader:ble_connect_device_reader_enabled", true), aey0Var.b(0, 600000, 60000, "android-ble-connect-device-reader:ble_connect_device_reader_eviction_interval_millis"), aey0Var.b(0, 600000, 300000, "android-ble-connect-device-reader:ble_connect_device_reader_inactivity_timeout_millis"), aey0Var.b(0, 100000, 3, "android-ble-connect-device-reader:ble_connect_device_reader_max_attempts"), (luk) null);
            case 13:
                return new v74(aey0Var.c("android-ble-scanning:enable_overflow_area_bit_filter", false), aey0Var.c("android-ble-scanning:include_overflow_area_scan_filter", false), (luk) null);
            case 14:
                return new d84(aey0Var.c("android-boombox-settings-gapless:use_playback_settings_gapless", true), null);
            case 15:
                return new g84(aey0Var.c("android-boombox-settings:crossfade_enabled", true), aey0Var.c("android-boombox-settings:use_playback_settings_crossfade", true), null, null);
            case 16:
                return new h84(aey0Var.c("android-btpermissions:enable_app_scoped_permission_state", false), aey0Var.c("android-btpermissions:enable_new_app_startup", true), aey0Var.b(0, 30, 7, "android-btpermissions:min_active_session_days"), aey0Var.b(0, Integer.MAX_VALUE, 3, "android-btpermissions:prompt_count_threshold"), aey0Var.b(0, Integer.MAX_VALUE, 604800, "android-btpermissions:prompt_time_threshold"), (luk) null);
            case 17:
                return new i84(aey0Var.c("android-byom-coordinatorimpl:undo_snackbar_enabled", false), null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new j84(aey0Var.b(0, 5000, 500, "android-byom-volumeimpl:duck_fade_ms"), aey0Var.b(0, 100, 15, "android-byom-volumeimpl:duck_target_volume_pct"), null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new l84(aey0Var.c("android-cal-audio-recording:log_audio_amplitude", true), null);
            case 20:
                return new o84(aey0Var.a("android-cal-rollout-service:enable_cal", m84.b), aey0Var.b(144000000, 300000000, 144000000, "android-cal-rollout-service:minimum_gearhead_version"), (tgp0) null, (luk) null);
            case 21:
                return new r84(aey0Var.a("android-campaign-routing:wrapped_routing_destination", q84.b), (luk) null);
            case 22:
                return new s84(aey0Var.c("android-campaigns-frameprofiler:enable_frame_profiler_overlay", false), null);
            case 23:
                return new t84(aey0Var.c("android-campaigns-wes:enable_facebook_messenger_text", false), null);
            case 24:
                return new w84(aey0Var.c("android-car-mobile-car-feature-availability:keep_screen_awake_enabled", true), null);
            case 25:
                return new x84(aey0Var.c("android-car-mobile-interoperability-monitor:enabled", false), (luk) null);
            case 26:
                return new y84(aey0Var.c("android-car-mobile-jumpstart:jumpstart_enabled", true), (luk) null);
            case 27:
                return new z84(aey0Var.c("android-car-mobile-wazeactivesessionbanner:active_session_banner_enabled", true), (luk) null);
            case 28:
                return new b94(aey0Var.c("android-checkout:clear_stale_cookies", true), (luk) null);
            default:
                return new k94((j94) aey0Var.a("android-collection-content-impl:mark_as_played_endpoint_options", j94.LEGACY), null);
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
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
            case 27:
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
        b94 b94Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (l54) b94Var, l54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/audiofocus/coreinternal/rc/AndroidAudioFocusCoreinternalProperties;", 0);
            case 1:
                return new tv30(1, (m54) b94Var, m54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAudioFocusServicesImplProperties;", 0);
            case 2:
                return new tv30(1, (n54) b94Var, n54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/audiobook/ccbottomsheetimpl/AndroidAudiobookCcbottomsheetProperties;", 0);
            case 3:
                return new tv30(1, (q54) b94Var, q54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/audiobook/playerlistener/AndroidAudiobookPlayerlistenerProperties;", 0);
            case 4:
                return new tv30(1, (r54) b94Var, r54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAudiobookProperties;", 0);
            case 5:
                return new tv30(1, (s54) b94Var, s54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/audiobookpremium/listeninghoursrequest/remoteconfig/AndroidAudiobookpremiumListeningHoursRequestProperties;", 0);
            case 6:
                return new tv30(1, (u54) b94Var, u54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAudiobooksOnboardingBottomSheetProperties;", 0);
            case 7:
                return new tv30(1, (w54) b94Var, w54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAuthenticationLogin5UnauthProperties;", 0);
            case 8:
                return new tv30(1, (x54) b94Var, x54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/authentication/logoutserviceimpl/rc/AndroidAuthenticationLogoutServiceImplProperties;", 0);
            case 9:
                return new tv30(1, (o74) b94Var, o74.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/betamax/audiolanguagepageimpl/rc/AndroidBetamaxAudioLanguagePageImplProperties;", 0);
            case 10:
                return new tv30(1, (p74) b94Var, p74.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/betamax/contextplayercoordinator/properties/AndroidBetamaxContextPlayerProperties;", 0);
            case 11:
                return new tv30(1, (q74) b94Var, q74.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidBetamaxPlayerpoolProperties;", 0);
            case 12:
                return new tv30(1, (t74) b94Var, t74.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/connectdevicereader/AndroidBleConnectDeviceReaderProperties;", 0);
            case 13:
                return new tv30(1, (v74) b94Var, v74.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/bluetooth/flags/AndroidBleScanningProperties;", 0);
            case 14:
                return new tv30(1, (d84) b94Var, d84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/boombox/settings/gapless/impl/AndroidBoomboxSettingsGaplessProperties;", 0);
            case 15:
                return new tv30(1, (g84) b94Var, g84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/boombox/settings/crossfade/impl/AndroidBoomboxSettingsProperties;", 0);
            case 16:
                return new tv30(1, (h84) b94Var, h84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidBtpermissionsProperties;", 0);
            case 17:
                return new tv30(1, (i84) b94Var, i84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/byom/coordinatorimpl/AndroidByomCoordinatorimplProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new tv30(1, (j84) b94Var, j84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/byom/volumeimpl/AndroidByomVolumeimplProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new tv30(1, (l84) b94Var, l84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCalAudioRecordingProperties;", 0);
            case 20:
                return new tv30(1, (o84) b94Var, o84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCalRolloutServiceProperties;", 0);
            case 21:
                return new tv30(1, (r84) b94Var, r84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCampaignRoutingProperties;", 0);
            case 22:
                return new tv30(1, (s84) b94Var, s84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/campaigns/frameprofiler/rc/AndroidCampaignsFrameprofilerProperties;", 0);
            case 23:
                return new tv30(1, (t84) b94Var, t84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/wrappedshare/AndroidCampaignsWesProperties;", 0);
            case 24:
                return new tv30(1, (w84) b94Var, w84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCarMobileCarFeatureAvailabilityProperties;", 0);
            case 25:
                return new tv30(1, (x84) b94Var, x84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCarMobileInteroperabilityMonitorProperties;", 0);
            case 26:
                return new tv30(1, (y84) b94Var, y84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCarMobileJumpstartProperties;", 0);
            case 27:
                return new tv30(1, (z84) b94Var, z84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCarMobileWazeactivesessionbannerProperties;", 0);
            case 28:
                return new tv30(1, b94Var, b94.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCheckoutProperties;", 0);
            default:
                return new tv30(1, (k94) b94Var, k94.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/collection/contentimpl/AndroidCollectionContentImplProperties;", 0);
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
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
            case 27:
                break;
            case 28:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
