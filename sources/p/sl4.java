package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class sl4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ sl4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new tl4(aey0Var.c("android-libs-ads-common:ads_android_turn_on_comscore", false), aey0Var.c("android-libs-ads-common:ads_enable_one_trust_cmp_android", false), aey0Var.c("android-libs-ads-common:enable_ads_connect_state_observer", true), aey0Var.c("android-libs-ads-common:enable_image_loading_for_espresso_tests", false), (luk) null);
            case 1:
                return new ul4(aey0Var.c("android-libs-allboarding:carousel_use_elements_ui", false), aey0Var.c("android-libs-allboarding:contentpicker_use_element_ui", false), aey0Var.c("android-libs-allboarding:contextualaudio_use_element_ui", false), aey0Var.c("android-libs-allboarding:notification_permission_use_element_ui", false), aey0Var.c("android-libs-allboarding:search_use_element_ui", false), aey0Var.c("android-libs-allboarding:use_content_stack", false), aey0Var.c("android-libs-allboarding:use_page_api_flow", false), (luk) null);
            case 2:
                return new vl4(aey0Var.c("android-libs-appstorage:is_instrumentation_enabled", false), aey0Var.c("android-libs-appstorage:is_shared_preferences_instrumentation_enabled", false), (luk) null);
            case 3:
                return new wl4(aey0Var.c("android-libs-audio-record-impl:enable_bluetooth_voice_input", false), null);
            case 4:
                return new xl4(aey0Var.c("android-libs-betamax-royalty-stream-reporting:stream_reporting_tracker_debug_tracing_enabled", false), aey0Var.c("android-libs-betamax-royalty-stream-reporting:stream_reporting_tracker_non_context_player_enabled", true), (luk) null);
            case 5:
                return new am4(aey0Var.a("android-libs-betamax-video-quality:video_metered_quality", yl4.b), aey0Var.a("android-libs-betamax-video-quality:video_non_metered_quality", zl4.b), aey0Var.b(100, 10000, 720, "android-libs-betamax-video-quality:video_quality_high"), aey0Var.b(100, 10000, 240, "android-libs-betamax-video-quality:video_quality_low"), aey0Var.b(100, 10000, 480, "android-libs-betamax-video-quality:video_quality_medium"), aey0Var.b(100, Integer.MAX_VALUE, Integer.MAX_VALUE, "android-libs-betamax-video-quality:video_quality_very_high"), (luk) null);
            case 6:
                return new bm4(aey0Var.c("android-libs-blend:add_to_blend_enabled", false), aey0Var.c("android-libs-blend:hide_from_blend_enabled", false), aey0Var.c("android-libs-blend:remove_from_blend_enabled", false), aey0Var.c("android-libs-blend:social_prompting_enabled", false), (luk) null);
            case 7:
                return new cm4(aey0Var.c("android-libs-book-bouncer:enable_app_wide_bounce", false), (luk) null);
            case 8:
                return new em4(aey0Var.a("android-libs-car-detection:car_detection_is_enabled", dm4.b), (luk) null);
            case 9:
                return new fm4(aey0Var.c("android-libs-checkout-flags:auto_service_reconnect", true), aey0Var.c("android-libs-checkout-flags:gpb_enabled", false), aey0Var.c("android-libs-checkout-flags:native_choice_screen", false), aey0Var.c("android-libs-checkout-flags:native_uc_choice_screen", false), aey0Var.c("android-libs-checkout-flags:samsung_disable_gpb", false), (luk) null);
            case 10:
                return new gm4(aey0Var.c("android-libs-concerts-properties:enable_artist_concerts_context_menu", false), aey0Var.c("android-libs-concerts-properties:enable_campaign_promo_card_effects", true), aey0Var.c("android-libs-concerts-properties:enable_campaign_promo_card_tilt", true), aey0Var.c("android-libs-concerts-properties:enable_campaign_promo_card_v2", false), aey0Var.c("android-libs-concerts-properties:enable_carousel_element", false), aey0Var.c("android-libs-concerts-properties:enable_concert_campaign_platform_report", false), aey0Var.c("android-libs-concerts-properties:enable_event_bottom_sheet_page", false), aey0Var.c("android-libs-concerts-properties:enable_event_page_rotating_backgrounds", false), aey0Var.c("android-libs-concerts-properties:enable_full_width_cards", false), aey0Var.c("android-libs-concerts-properties:enable_report_bottom_sheet_page", false), aey0Var.c("android-libs-concerts-properties:enable_report_concert_issue", false), aey0Var.c("android-libs-concerts-properties:lef_mixed_carousel_content_v1", false), aey0Var.b(1, 3, 1, "android-libs-concerts-properties:notification_bottomsheet_display_frequency"), aey0Var.c("android-libs-concerts-properties:purchased_event_day_card_enabled", false), aey0Var.c("android-libs-concerts-properties:reserved_onboarding_enabled", false), aey0Var.c("android-libs-concerts-properties:reserved_share_card_nudge_enabled", false), aey0Var.c("android-libs-concerts-properties:reserved_share_enabled", false), aey0Var.c("android-libs-concerts-properties:reserved_sharing_client_rendering_enabled", false), (luk) null);
            case 11:
                return new hm4(aey0Var.c("android-libs-contribution-properties:editor_notes_npv_card_experiment_exposure", false), aey0Var.c("android-libs-contribution-properties:enable_contribution_notes_management", false), aey0Var.c("android-libs-contribution-properties:enable_notes_confirmation_snackbars", false), aey0Var.c("android-libs-contribution-properties:enable_release_row_notes", false), aey0Var.c("android-libs-contribution-properties:enable_track_notes", false), aey0Var.c("android-libs-contribution-properties:restrict_user_notes_to_music", false), aey0Var.c("android-libs-contribution-properties:show_editorial_notes", false), aey0Var.c("android-libs-contribution-properties:show_user_notes", false), (luk) null);
            case 12:
                return new im4(aey0Var.c("android-libs-encore-consumer-entrypoint:enable_haptic_feedback_on_heart", false), (luk) null);
            case 13:
                return new lm4(aey0Var.c("android-libs-endless-feed:enable_always_show_new_interaction_in_container", false), aey0Var.c("android-libs-endless-feed:enable_dj_feedback", false), aey0Var.c("android-libs-endless-feed:enable_dj_persona_v2", false), aey0Var.c("android-libs-endless-feed:enable_dj_voice_commentary_setting", false), aey0Var.c("android-libs-endless-feed:enable_interactivity_from_uri", false), aey0Var.c("android-libs-endless-feed:enable_interactivity_standalone_player", false), aey0Var.c("android-libs-endless-feed:enable_mic_permission_dialog_pause", false), aey0Var.c("android-libs-endless-feed:enable_premium_upsell_dialog", false), aey0Var.c("android-libs-endless-feed:enable_voice_improvements", false), aey0Var.a("android-libs-endless-feed:interactivity_container_dismiss_state", jm4.b), aey0Var.b(0, 60000, 30000, "android-libs-endless-feed:interactivity_timeout_ms"), aey0Var.a("android-libs-endless-feed:market_for_disclaimer", km4.b), aey0Var.c("android-libs-endless-feed:prompt_via_signal", false), (luk) null);
            case 14:
                return new mm4(aey0Var.b(0, 5000, 0, "android-libs-endless-player:interact_signal_confirmation_timeout_ms"), aey0Var.b(0, 5000, 0, "android-libs-endless-player:jump_signal_confirmation_timeout_ms"), (luk) null);
            case 15:
                return new nm4(aey0Var.c("android-libs-explicit-content:explicit_content_setting_hidden", false), (luk) null);
            case 16:
                return new pm4(aey0Var.c("android-libs-greenroom:error_dialogs_enabled", false), aey0Var.c("android-libs-greenroom:is_upcoming_state_check_enabled", false), aey0Var.c("android-libs-greenroom:list_playback_enabled", false), aey0Var.c("android-libs-greenroom:reporting_enabled", false), (luk) null);
            case 17:
                return new rm4(aey0Var.c("android-libs-lyrics:enable_bcp47_client_language", false), aey0Var.c("android-libs-lyrics:enable_common_capping", false), aey0Var.c("android-libs-lyrics:enable_v3_lyrics_endpoint", false), (luk) null);
            case 18:
                return new sm4(aey0Var.c("android-libs-lyrics:enable_fullscreen_track_change", false), (luk) null);
            case 19:
                return new tm4(aey0Var.c("android-libs-marquee:enable_compose_marquee_overlay", false), aey0Var.c("android-libs-marquee:enable_genrecs_spring2026_compliance", false), aey0Var.c("android-libs-marquee:enable_marquee", false), aey0Var.c("android-libs-marquee:is_permission_dialog_on_presave_enabled", false), (luk) null);
            case 20:
                return new um4(aey0Var.c("android-libs-music-video-playlists:enable_audio_uri_for_saves_association", false), aey0Var.c("android-libs-music-video-playlists:enable_music_video_playlist", true), aey0Var.c("android-libs-music-video-playlists:exclude_artist_music_videos", true), (luk) null);
            case 21:
                return new vm4(aey0Var.c("android-libs-newplaying-default-mode:enable_music_videos_track_reporting", false), aey0Var.c("android-libs-newplaying-default-mode:enable_playback_control_switcher", false), aey0Var.c("android-libs-newplaying-default-mode:use_element_api", false), null);
            case 22:
                return new wm4(aey0Var.c("android-libs-newplaying-feedback-mode:skip_next_trigger_enabled", false), aey0Var.c("android-libs-newplaying-feedback-mode:use_element_api", false), null);
            case 23:
                return new xm4(aey0Var.c("android-libs-newplaying-podcast-mode:audiobook_chapter_list_button_enabled", false), aey0Var.c("android-libs-newplaying-podcast-mode:use_element_api", false), null);
            case 24:
                return new ym4(aey0Var.c("android-libs-nowplaying-activity-plugins:video_manifest_prefetch_plugin_enabled", false), null);
            case 25:
                return new zm4(aey0Var.c("android-libs-nowplaying-ads-mode:compose_elements_enabled", false), aey0Var.c("android-libs-nowplaying-ads-mode:in_stream_overflow_enabled", false), aey0Var.c("android-libs-nowplaying-ads-mode:instream_feedback_v2_enabled", false), aey0Var.c("android-libs-nowplaying-ads-mode:landscape_mode_npv_enabled", false), aey0Var.c("android-libs-nowplaying-ads-mode:scope_carousel_holders_to_mode_page", true), aey0Var.c("android-libs-nowplaying-ads-mode:screenshot_detection_enabled", false), (luk) null);
            case 26:
                return new an4(aey0Var.c("android-libs-nowplaying-commonviews:playback_quality_on_context_menu", false), null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new bn4(aey0Var.c("android-libs-nowplaying-elements-artwork:should_use_vit", false), null);
            case 28:
                return new cn4(aey0Var.c("android-libs-nowplaying-elements-audiovideotransition:allow_in_free_tier", false), aey0Var.c("android-libs-nowplaying-elements-audiovideotransition:audio_switch_button_animated_for_music_videos", false), aey0Var.c("android-libs-nowplaying-elements-audiovideotransition:is_managed_account_setting_enabled", false), aey0Var.c("android-libs-nowplaying-elements-audiovideotransition:is_video_manifest_prefetch_restart_enabled", false), null);
            default:
                return new dn4(aey0Var.c("android-libs-nowplaying-elements-carousel:diff_util_enabled", true), aey0Var.c("android-libs-nowplaying-elements-carousel:identity_diffing_enabled", false), aey0Var.c("android-libs-nowplaying-elements-carousel:use_track_carousel_element", false), (luk) null);
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
        dn4 dn4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (tl4) dn4Var, tl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsAdsCommonProperties;", 0);
            case 1:
                return new tv30(1, (ul4) dn4Var, ul4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsAllboardingProperties;", 0);
            case 2:
                return new tv30(1, (vl4) dn4Var, vl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsAppstorageProperties;", 0);
            case 3:
                return new tv30(1, (wl4) dn4Var, wl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsAudioRecordImplProperties;", 0);
            case 4:
                return new tv30(1, (xl4) dn4Var, xl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsBetamaxRoyaltyStreamReportingProperties;", 0);
            case 5:
                return new tv30(1, (am4) dn4Var, am4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsBetamaxVideoQualityProperties;", 0);
            case 6:
                return new tv30(1, (bm4) dn4Var, bm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsBlendProperties;", 0);
            case 7:
                return new tv30(1, (cm4) dn4Var, cm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsBookBouncerProperties;", 0);
            case 8:
                return new tv30(1, (em4) dn4Var, em4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsCarDetectionProperties;", 0);
            case 9:
                return new tv30(1, (fm4) dn4Var, fm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsCheckoutFlagsProperties;", 0);
            case 10:
                return new tv30(1, (gm4) dn4Var, gm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsConcertsPropertiesProperties;", 0);
            case 11:
                return new tv30(1, (hm4) dn4Var, hm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsContributionPropertiesProperties;", 0);
            case 12:
                return new tv30(1, (im4) dn4Var, im4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsEncoreConsumerEntrypointProperties;", 0);
            case 13:
                return new tv30(1, (lm4) dn4Var, lm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsEndlessFeedProperties;", 0);
            case 14:
                return new tv30(1, (mm4) dn4Var, mm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsEndlessPlayerProperties;", 0);
            case 15:
                return new tv30(1, (nm4) dn4Var, nm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsExplicitContentProperties;", 0);
            case 16:
                return new tv30(1, (pm4) dn4Var, pm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsGreenroomProperties;", 0);
            case 17:
                return new tv30(1, (rm4) dn4Var, rm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/serviceretrofit/AndroidLibsLyricsProperties;", 0);
            case 18:
                return new tv30(1, (sm4) dn4Var, sm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/fullscreenview/AndroidLibsLyricsProperties;", 0);
            case 19:
                return new tv30(1, (tm4) dn4Var, tm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsMarqueeProperties;", 0);
            case 20:
                return new tv30(1, (um4) dn4Var, um4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsMusicVideoPlaylistsProperties;", 0);
            case 21:
                return new tv30(1, (vm4) dn4Var, vm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNewplayingDefaultModeProperties;", 0);
            case 22:
                return new tv30(1, (wm4) dn4Var, wm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNewplayingFeedbackModeProperties;", 0);
            case 23:
                return new tv30(1, (xm4) dn4Var, xm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNewplayingPodcastModeProperties;", 0);
            case 24:
                return new tv30(1, (ym4) dn4Var, ym4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingActivityPluginsProperties;", 0);
            case 25:
                return new tv30(1, (zm4) dn4Var, zm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingAdsModeProperties;", 0);
            case 26:
                return new tv30(1, (an4) dn4Var, an4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingCommonviewsProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (bn4) dn4Var, bn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsArtworkProperties;", 0);
            case 28:
                return new tv30(1, (cn4) dn4Var, cn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsAudiovideotransitionProperties;", 0);
            default:
                return new tv30(1, dn4Var, dn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsCarouselProperties;", 0);
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
