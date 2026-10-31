package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class nr4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ nr4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new or4(aey0Var.c("android-martini-page:dj_conversation_starter_enabled", true), aey0Var.c("android-martini-page:report_bug_badge_enabled", false), (luk) null);
            case 1:
                return new pr4(aey0Var.c("android-media-browser-service:enable_auth_for_mbs", false), aey0Var.c("android-media-browser-service:ensure_connected_on_session_connect", false), null);
            case 2:
                return new xr4(aey0Var.c("android-media-session-image-loader:bounded_sync_loads", false), aey0Var.c("android-media-session-image-loader:log_image_loading_failures", true), aey0Var.a("android-media-session-image-loader:quasar_loader", wr4.b), (luk) null);
            case 3:
                return new at4(aey0Var.c("android-media-session:burst_skip_enabled", false), aey0Var.c("android-media-session:canvas_in_media_session_enabled", false), aey0Var.c("android-media-session:enable_chaptered_content_experience", false), aey0Var.c("android-media-session:enable_cold_boot_defaults", false), aey0Var.c("android-media-session:enable_lossless_signifiers_when_car_is_connected", false), aey0Var.c("android-media-session:media3_enabled", false), aey0Var.c("android-media-session:playback_takeover_enabled", true), aey0Var.c("android-media-session:restrict_playing_state_when_connect_car_is_active", false), aey0Var.c("android-media-session:should_use_vit", false), aey0Var.c("android-media-session:skip_to_next_chapter_enabled", false), (tgp0) null, (luk) null);
            case 4:
                return new bt4(aey0Var.c("android-mediatrimmer-mediatrimmerpage:autoplay_and_looping_enabled", false), aey0Var.c("android-mediatrimmer-mediatrimmerpage:is_range_recommendation_enabled", false), null);
            case 5:
                return new ct4(aey0Var.c("android-membership-upsell:membership_upsell_enabled", false), aey0Var.c("android-membership-upsell:membership_welcome_clip_enabled", false), aey0Var.c("android-membership-upsell:show_membership_badge_dialog_enabled", false), null);
            case 6:
                return new ht4(aey0Var.b(0, 86400, 3600, "android-messaging-clientmessagingplatform-clientmessagingplatformproperties:cache_refresh_interval"), (luk) null, aey0Var.c("android-messaging-clientmessagingplatform-clientmessagingplatformproperties:is_back_online_trigger_enabled", false), aey0Var.c("android-messaging-clientmessagingplatform-clientmessagingplatformproperties:is_click_action_enum_enabled", false));
            case 7:
                return new it4(aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_account_switching_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_episode_chapters_share_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_live_events_concert_notifications_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_live_events_event_entity_safe_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_live_events_event_entity_venuename_header_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_profile_completion_bottom_sheet", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_puffin_nudge_end_optimization", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_puffin_nudge_unoptimised_b_t_headphones", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_reinvent_free_n_p_v_suggestions_upsell", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_smart_shuffle_helper_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_watch_feed_entity_explorer_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enable_message_your_library_ai_playlist_creation_tooltip", true), aey0Var.c("android-messaging-reduceinterventions-impl:enabled", false), aey0Var.b(1, 3650, 30, "android-messaging-reduceinterventions-impl:max_account_age_days"), (luk) null);
            case 8:
                return new kt4(aey0Var.c("android-metric-keeper:enable_page_monitor_plugin", false), aey0Var.c("android-metric-keeper:enable_touch_qualified_scroll_windows", false), (luk) null);
            case 9:
                return new lt4(aey0Var.c("android-microsoft-continuity-service:enable_service", false), (luk) null);
            case 10:
                return new mt4(aey0Var.b(1000, 30000, 3000, "android-ml-based-device-suggestions:google_callback_timeout_ms"), aey0Var.b(1000, 60000, 10000, "android-ml-based-device-suggestions:where_to_play_timeout_ms"), null);
            case 11:
                return new nt4(aey0Var.c("android-multi-user-plan-verification-verification-code-onboarding:mup_onboarding_v2_enabled", false), null);
            case 12:
                return new ot4(aey0Var.c("android-multi-user-plan-verification-verification-code-start:mup_start_page_v2_enabled", false), aey0Var.c("android-multi-user-plan-verification-verification-code-start:qr_capture_protection_enabled", false), null);
            case 13:
                return new pt4(aey0Var.c("android-multi-user-plan-verification-verification-notification-banner:mup_notification_v2_enabled", false), null);
            case 14:
                return new rt4(aey0Var.c("android-multiplayer:player_reuse_enabled", false), aey0Var.a("android-multiplayer:stream_reporting_mode", qt4.b), (luk) null);
            case 15:
                return new tt4(aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_chaptered_content_fetch_enabled", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_chaptered_content_render_enabled", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_go_to_album_hidden_for_multi_song_tracks", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_mft_plus_entity_segments_disable_enabled", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_mft_rules_preserved_for_multi_song_content", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_multi_song_row_enabled", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:is_multi_song_track_reroute_enabled", false), aey0Var.c("android-multitrackmusicvideo-configurationimpl:override_chaptered_content_type_as_talk", true), (luk) null);
            case 16:
                return new ut4(aey0Var.b(0, 30, 5, "android-music-app-platform-app-readiness:settlement_notification_delay_seconds"), null);
            case 17:
                return new vt4(aey0Var.c("android-music-app-platform-possessive-copy-properties:remove_possessive_your", false), null);
            case 18:
                return new wt4(aey0Var.c("android-music-guesser:enable_entrypoint_section", true), null);
            case 19:
                return new xt4(aey0Var.c("android-music-libs-player:track_player_state_subscriptions", false), (luk) null);
            case 20:
                return new yt4(aey0Var.b(0, 100, 15, "android-music-libs-po-session-counter:po_max_sessions"), (luk) null, aey0Var.c("android-music-libs-po-session-counter:po_banner_enabled", false));
            case 21:
                return new au4(aey0Var.c("android-music-libs-voice-assistant-flags:speakeasy_polling_ready_state_enabled", false), (zt4) aey0Var.a("android-music-libs-voice-assistant-flags:third_party_utterance_banner", zt4.NEVER), aey0Var.c("android-music-libs-voice-assistant-flags:voice_assistants_alexa_dialog_enabled", false), aey0Var.c("android-music-libs-voice-assistant-flags:voice_assistants_settings_enabled", false), null);
            case 22:
                return new cu4(aey0Var.c("android-music-quiz-card-element-impl:is_updated_card_ui_enabled", false), (bu4) aey0Var.a("android-music-quiz-card-element-impl:tag_value", bu4.BETA), null);
            case 23:
                return new du4(aey0Var.c("android-music-videos-artist:see_all_button", false), null);
            case 24:
                return new eu4(aey0Var.c("android-music-videos-flags:add_to_button_saves_association", false), aey0Var.c("android-music-videos-flags:artist_autoplay_enabled", false), aey0Var.c("android-music-videos-flags:auto_play_silent_failure_check", false), aey0Var.c("android-music-videos-flags:deeplink_georestricted_play_association", false), aey0Var.c("android-music-videos-flags:disable_all_previews", false), aey0Var.c("android-music-videos-flags:disable_playback_over_connect_speakers", false), aey0Var.c("android-music-videos-flags:enable_download_header_on_music_video_playlist", false), aey0Var.c("android-music-videos-flags:enable_download_state_manager", false), aey0Var.c("android-music-videos-flags:enable_individual_music_video_download", false), aey0Var.c("android-music-videos-flags:enable_video_download_state_data_source", false), aey0Var.c("android-music-videos-flags:enable_video_selection_sheet", false), aey0Var.c("android-music-videos-flags:heart_button_saves_association", false), aey0Var.c("android-music-videos-flags:music_video_deeplink_new_routing_enabled", true), aey0Var.c("android-music-videos-flags:music_video_deeplink_on_free_enabled", false), aey0Var.c("android-music-videos-flags:new_autoplay_api_enabled", false), aey0Var.c("android-music-videos-flags:npv_autoplay_enabled", false), (luk) null);
            case 25:
                return new fu4(aey0Var.c("android-music-videos-widget-impl:music_video_enabled", false), aey0Var.c("android-music-videos-widget-impl:podcast_video_enabled", false), null);
            case 26:
                return new hu4(aey0Var.b(0, 200, 100, "android-musicappplatform-navigation:max_same_intent_handle_count_threshold"), (luk) null, aey0Var.c("android-musicappplatform-navigation:use_cloned_intent_for_routing_and_handling", false));
            case 27:
                return new iu4(aey0Var.c("android-musicappplatform-offlineerrors:enable_offline_listening_device_limit_text", false), null);
            case 28:
                return new ju4(aey0Var.c("android-musicvideos-listvideofirst:is_video_first_standard_experience_enabled", false), null);
            default:
                return new nu4(aey0Var.c("android-newepisodes-newepisodepushremoval:clear_new_episode_push_on_play", false), null);
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
        hu4 hu4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (or4) hu4Var, or4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMartiniPageProperties;", 0);
            case 1:
                return new tv30(1, (pr4) hu4Var, pr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMediaBrowserServiceProperties;", 0);
            case 2:
                return new tv30(1, (xr4) hu4Var, xr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMediaSessionImageLoaderProperties;", 0);
            case 3:
                return new tv30(1, (at4) hu4Var, at4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMediaSessionProperties;", 0);
            case 4:
                return new tv30(1, (bt4) hu4Var, bt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/mediatrimmer/mediatrimmerpage/rc/AndroidMediatrimmerMediatrimmerpageProperties;", 0);
            case 5:
                return new tv30(1, (ct4) hu4Var, ct4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/contentaccess/membershipsinternal/AndroidMembershipUpsellProperties;", 0);
            case 6:
                return new tv30(1, (ht4) hu4Var, ht4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMessagingClientmessagingplatformClientmessagingplatformpropertiesProperties;", 0);
            case 7:
                return new tv30(1, (it4) hu4Var, it4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMessagingReduceinterventionsImplProperties;", 0);
            case 8:
                return new tv30(1, (kt4) hu4Var, kt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/performancesdk/AndroidMetricKeeperProperties;", 0);
            case 9:
                return new tv30(1, (lt4) hu4Var, lt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/continuityservice/AndroidMicrosoftContinuityServiceProperties;", 0);
            case 10:
                return new tv30(1, (mt4) hu4Var, mt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/mlbaseddevicesuggestions/AndroidMlBasedDeviceSuggestionsProperties;", 0);
            case 11:
                return new tv30(1, (nt4) hu4Var, nt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/multiuserplanverification/verificationcodeonboarding/rc/AndroidMultiUserPlanVerificationVerificationCodeOnboardingProperties;", 0);
            case 12:
                return new tv30(1, (ot4) hu4Var, ot4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/multiuserplanverification/verificationcodestart/rc/AndroidMultiUserPlanVerificationVerificationCodeStartProperties;", 0);
            case 13:
                return new tv30(1, (pt4) hu4Var, pt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/multiuserplanverification/verificationnotificationbanner/rc/AndroidMultiUserPlanVerificationVerificationNotificationBannerProperties;", 0);
            case 14:
                return new tv30(1, (rt4) hu4Var, rt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/multiplayer/multiplayer/AndroidMultiplayerProperties;", 0);
            case 15:
                return new tv30(1, (tt4) hu4Var, tt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/multitrackmusicvideo/configurationimpl/AndroidMultitrackmusicvideoConfigurationimplProperties;", 0);
            case 16:
                return new tv30(1, (ut4) hu4Var, ut4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicappplatform/appreadiness/impl/rc/AndroidMusicAppPlatformAppReadinessProperties;", 0);
            case 17:
                return new tv30(1, (vt4) hu4Var, vt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicappplatform/possessivecopyproperties/rc/AndroidMusicAppPlatformPossessiveCopyPropertiesProperties;", 0);
            case 18:
                return new tv30(1, (wt4) hu4Var, wt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicGuesserProperties;", 0);
            case 19:
                return new tv30(1, (xt4) hu4Var, xt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicLibsPlayerProperties;", 0);
            case 20:
                return new tv30(1, (yt4) hu4Var, yt4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicLibsPoSessionCounterProperties;", 0);
            case 21:
                return new tv30(1, (au4) hu4Var, au4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicLibsVoiceAssistantFlagsProperties;", 0);
            case 22:
                return new tv30(1, (cu4) hu4Var, cu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicQuizCardElementImplProperties;", 0);
            case 23:
                return new tv30(1, (du4) hu4Var, du4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicvideos/artist/AndroidMusicVideosArtistProperties;", 0);
            case 24:
                return new tv30(1, (eu4) hu4Var, eu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicVideosFlagsProperties;", 0);
            case 25:
                return new tv30(1, (fu4) hu4Var, fu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicvideos/uiusecases/relatedvideocarousel/AndroidMusicVideosWidgetImplProperties;", 0);
            case 26:
                return new tv30(1, hu4Var, hu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicappplatformNavigationProperties;", 0);
            case 27:
                return new tv30(1, (iu4) hu4Var, iu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicappplatformOfflineerrorsProperties;", 0);
            case 28:
                return new tv30(1, (ju4) hu4Var, ju4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/musicvideos/listvideofirst/AndroidMusicvideosListvideofirstProperties;", 0);
            default:
                return new tv30(1, (nu4) hu4Var, nu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/newepisodes/newepisodepushremoval/rc/AndroidNewepisodesNewepisodepushremovalProperties;", 0);
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
            case 27:
                break;
            case 28:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
