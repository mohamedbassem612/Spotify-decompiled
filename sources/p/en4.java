package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class en4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ en4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new fn4(aey0Var.c("android-libs-nowplaying-elements-mixingtransitionelement:should_use_vit", false), null);
            case 1:
                return new gn4(aey0Var.c("android-libs-nowplaying-elements-playbackcontrolswitcher:lazy_child_elements_enabled", false), null);
            case 2:
                return new in4(aey0Var.c("android-libs-nowplaying-elements-playpause:ariana_petal_play_button_easter_egg", false), aey0Var.c("android-libs-nowplaying-elements-playpause:color_change_variant_a", false), aey0Var.c("android-libs-nowplaying-elements-playpause:color_change_variant_b", false), aey0Var.c("android-libs-nowplaying-elements-playpause:harry_potter_play_button_surround_easter_egg", false), (luk) null);
            case 3:
                return new jn4(aey0Var.c("android-libs-nowplaying-elements-seekbar:is_hello_kitty_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_pokemon_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_sanremo_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_stranger_things_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_super_mario_luma_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_super_mario_star_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_wednesday_official_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_wicked_easter_egg_enabled", false), aey0Var.c("android-libs-nowplaying-elements-seekbar:is_world_cup_easter_egg_enabled", false), (luk) null);
            case 4:
                return new kn4(aey0Var.c("android-libs-nowplaying-elements-skiptonextchapter:skip_to_next_chapter_enabled", false), null);
            case 5:
                return new ln4(aey0Var.c("android-libs-nowplaying-elements-trackinfo:enable_queued_badge", false), null);
            case 6:
                return new nn4((mn4) aey0Var.a("android-libs-nowplaying-elements-videoqualityselection:persistence_mode", mn4.VIDEO_ONLY), null);
            case 7:
                return new on4(aey0Var.c("android-libs-nowplaying-endless-feed-mode:scope_carousel_holders_to_mode_page", true), null);
            case 8:
                return new pn4(aey0Var.c("android-libs-nowplaying-free-tier-mode:enable_playback_control_switcher", false), aey0Var.c("android-libs-nowplaying-free-tier-mode:use_element_api", false), null);
            case 9:
                return new qn4(aey0Var.c("android-libs-nowplaying-reinvent-free-mode:enable_playback_control_switcher", false), aey0Var.c("android-libs-nowplaying-reinvent-free-mode:skip_next_feedback_enabled", false), null);
            case 10:
                return new rn4(aey0Var.c("android-libs-nowplaying-scroll-widgets-podcast-sponsors:music_npv_leavebehinds_enabled", false), null);
            case 11:
                return new sn4(aey0Var.c("android-libs-nowplaying-uiusecases:enable_media_type_carousel_acceptance", false), aey0Var.c("android-libs-nowplaying-uiusecases:enable_multitap_seek_horizontal_video", false), aey0Var.c("android-libs-nowplaying-uiusecases:enable_multitap_seek_square_cover_art", false), aey0Var.c("android-libs-nowplaying-uiusecases:enable_multitap_seek_transcript", false), aey0Var.c("android-libs-nowplaying-uiusecases:scope_carousel_holders_to_mode_page", true), aey0Var.c("android-libs-nowplaying-uiusecases:should_use_vit", false), aey0Var.c("android-libs-nowplaying-uiusecases:should_use_vit_to_show_thumbnail", false), (luk) null);
            case 12:
                return new un4(aey0Var.c("android-libs-nowplaying-video-first-mode:enable_contextual_shuffle_upsell", true), aey0Var.c("android-libs-nowplaying-video-first-mode:enable_media_mode_acceptance", false), aey0Var.c("android-libs-nowplaying-video-first-mode:enable_swipe_to_collapse", false), aey0Var.c("android-libs-nowplaying-video-first-mode:enable_video_interceptor_overlay", false), aey0Var.c("android-libs-nowplaying-video-first-mode:mftplus_show_upsell_skip_next_limit", false), (tn4) aey0Var.a("android-libs-nowplaying-video-first-mode:video_behaviour", tn4.STICKY_VIDEO_ONLY), null);
            case 13:
                return new vn4(aey0Var.c("android-libs-on-demand-sharing:enable_on_demand_sharing", false), null);
            case 14:
                return new wn4(aey0Var.b(0, 100, 3, "android-libs-on-demand-trials:trial_message_period_active_days"), aey0Var.b(0, 100, 14, "android-libs-on-demand-trials:trial_message_period_total_days"), (luk) null, aey0Var.c("android-libs-on-demand-trials:automatically_opt_in_after_message_period", false), aey0Var.c("android-libs-on-demand-trials:enable_mini_trial", false), aey0Var.c("android-libs-on-demand-trials:enable_one_day_trial_end_message", false), aey0Var.c("android-libs-on-demand-trials:enable_opt_in_trials", false), aey0Var.c("android-libs-on-demand-trials:enable_trial_signifier_for_audio_quality", false), aey0Var.c("android-libs-on-demand-trials:enable_trial_signifiers", false));
            case 15:
                return new xn4(aey0Var.c("android-libs-on-demand-trials:enable_call_trials_facade", false), (luk) null);
            case 16:
                return new yn4(aey0Var.c("android-libs-playlist-endpoints:always_show_windowed_tracks_in_playlists", false), aey0Var.c("android-libs-playlist-endpoints:use_traits_mapping", false), (luk) null);
            case 17:
                return new ao4(aey0Var.c("android-libs-playlist-entity-configuration:do_not_exclude_banned_artists_for_managed_account", false), aey0Var.c("android-libs-playlist-entity-configuration:respect_shows_collection_flag_in_playlist_for_including_episodes", true), (luk) null);
            case 18:
                return new bo4(aey0Var.c("android-libs-playlist-entity-modes-blend:lenses_filter_chips_enabled", true), aey0Var.c("android-libs-playlist-entity-modes-blend:referrals_entrypoint_section_enabled", false), aey0Var.c("android-libs-playlist-entity-modes-blend:row_slots_enabled", false), (luk) null);
            case 19:
                return new co4(aey0Var.c("android-libs-podcast-ads:enable_gabito_error_logging", false), aey0Var.c("android-libs-podcast-ads:enable_mock_endpoint", false), aey0Var.c("android-libs-podcast-ads:npb_cta_button_shown", true), (luk) null);
            case 20:
                return new do4(aey0Var.c("android-libs-podcast-entity-adapter-delegate:hide_chapter_download_button", true), aey0Var.c("android-libs-podcast-entity-adapter-delegate:is_audiobook_playback_enabled", true), aey0Var.c("android-libs-podcast-entity-adapter-delegate:is_video_label_enabled", false), null);
            case 21:
                return new eo4(aey0Var.c("android-libs-podcast-episode-row:use_queue_on_free", false), aey0Var.c("android-libs-podcast-episode-row:vodcast_auto_opens_npv", false), (luk) null);
            case 22:
                return new fo4(aey0Var.c("android-libs-podcast-interactivity-common:enable_comments_membership_badge", false), aey0Var.c("android-libs-podcast-interactivity-common:show_updated_ui", false), aey0Var.c("android-libs-podcast-interactivity-common:use_page_api", false), (luk) null);
            case 23:
                return new go4(aey0Var.c("android-libs-podcast-interactivity-polls:enable_podcast_poll_reporting", false), aey0Var.c("android-libs-podcast-interactivity-polls:enable_report_flow", false), aey0Var.c("android-libs-podcast-interactivity-polls:should_show_polls_feature_in_episode_page", false), null);
            case 24:
                return new io4(aey0Var.a("android-libs-quickplay:quickplay_mix", ho4.b), (luk) null);
            case 25:
                return new jo4(aey0Var.c("android-libs-singalong:enable_vocal_removal", false), (luk) null);
            case 26:
                return new no4(aey0Var.c("android-libs-social-listening:allow_nearby_invitation_when_user_has_inactive_jam", false), aey0Var.c("android-libs-social-listening:auto_dismiss_nearby_join_sheets", true), aey0Var.b(0, 3000, 1500, "android-libs-social-listening:bluetooth_permission_sheet_delay_millis_when_joining_jam"), aey0Var.c("android-libs-social-listening:clean_device_alias_when_matching", false), aey0Var.b(-1, 3600, 60, "android-libs-social-listening:discovered_sessions_foreground_refresh_interval_seconds"), aey0Var.c("android-libs-social-listening:enable_album_group_session_context_menu_item", true), aey0Var.c("android-libs-social-listening:enable_artist_group_session_context_menu_item", true), aey0Var.c("android-libs-social-listening:enable_available_jam_token_filtering", false), aey0Var.c("android-libs-social-listening:enable_bluetooth_permission_flow_when_joining_jam", true), aey0Var.c("android-libs-social-listening:enable_chat_listening_activity_join_integration", true), aey0Var.c("android-libs-social-listening:enable_chat_toolbar_jam_label", false), aey0Var.c("android-libs-social-listening:enable_chat_toolbar_join_integration", true), aey0Var.c("android-libs-social-listening:enable_desync_jam_hat", false), aey0Var.c("android-libs-social-listening:enable_free_user_jam_hosting", false), aey0Var.c("android-libs-social-listening:enable_free_user_shuffle_upsell_sheet", false), aey0Var.c("android-libs-social-listening:enable_free_user_skip_upsell_sheet", false), aey0Var.c("android-libs-social-listening:enable_group_session_now_playing_bar_anchor", true), aey0Var.c("android-libs-social-listening:enable_group_session_snackbar_messaging_service", true), aey0Var.c("android-libs-social-listening:enable_guest_controls_queue_header_entry_point", false), aey0Var.c("android-libs-social-listening:enable_host_approval_learn_more_row", true), aey0Var.c("android-libs-social-listening:enable_host_permission_controls", false), aey0Var.c("android-libs-social-listening:enable_jam_ads_disclaimer_sheet", false), aey0Var.c("android-libs-social-listening:enable_jam_capped_premium_queue_banner", false), aey0Var.c("android-libs-social-listening:enable_jam_survey", false), aey0Var.c("android-libs-social-listening:enable_jam_upsell_in_context_menu_item", true), aey0Var.c("android-libs-social-listening:enable_join_nearby_settings_item", true), aey0Var.c("android-libs-social-listening:enable_listen_along_feature", false), aey0Var.c("android-libs-social-listening:enable_listen_along_queue_header", false), aey0Var.c("android-libs-social-listening:enable_listen_mode", false), aey0Var.c("android-libs-social-listening:enable_listen_mode_ui", false), aey0Var.c("android-libs-social-listening:enable_logging_broadcast_start_failures", false), aey0Var.c("android-libs-social-listening:enable_mdns_available_jams", true), aey0Var.c("android-libs-social-listening:enable_network_error_snackbar_messages", true), aey0Var.c("android-libs-social-listening:enable_new_free_tier_experience", true), aey0Var.c("android-libs-social-listening:enable_new_queue_jam_header_settings_tooltip", true), aey0Var.c("android-libs-social-listening:enable_nowplayingview_group_session_queue_entry_point", true), aey0Var.c("android-libs-social-listening:enable_permissions_restriction_toggle", true), aey0Var.c("android-libs-social-listening:enable_product_composer_for_jam_capabilities", false), aey0Var.c("android-libs-social-listening:enable_profile_resolution_for_available_jams", false), aey0Var.c("android-libs-social-listening:enable_profile_resolution_for_current_jam", false), aey0Var.c("android-libs-social-listening:enable_readable_jam_token_characteristic", false), aey0Var.c("android-libs-social-listening:enable_social_radar", true), aey0Var.c("android-libs-social-listening:enable_social_radar_sender_suggested_failures", false), aey0Var.c("android-libs-social-listening:enable_ui_sync_suggested_broadcast_failure", false), aey0Var.c("android-libs-social-listening:free_hosted_jams_upsell_enabled", false), aey0Var.c("android-libs-social-listening:get_device_info_from_backend_when_loading_dialogs", true), aey0Var.c("android-libs-social-listening:ignore_tap_jam_invites", false), aey0Var.b(0, 3000, 1000, "android-libs-social-listening:invitation_flow_presentation_delay_ms"), aey0Var.c("android-libs-social-listening:ipl_participant_onboarding_slate_enabled", false), aey0Var.b(0, 100000, 1000, "android-libs-social-listening:jam_awareness_received_tokens_eviction_interval_millis"), aey0Var.b(0, 100000, 6000, "android-libs-social-listening:jam_awareness_received_tokens_expiration_threshold_millis"), aey0Var.c("android-libs-social-listening:jam_invites_in_car_enabled", true), aey0Var.b(0, 100000, 5000, "android-libs-social-listening:jam_resolution_request_aggregator_timer_duration_millis"), aey0Var.b(0, 100, 5, "android-libs-social-listening:jam_social_radar_sender_connected_devices_buffer_time_seconds"), aey0Var.b(0, 600000, 60000, "android-libs-social-listening:join_nearby_popup_max_age_ms"), aey0Var.c("android-libs-social-listening:join_sheet_from_join_options_enabled", false), aey0Var.c("android-libs-social-listening:merge_jam_rows_with_incarnation", false), aey0Var.b(50, 600, 300, "android-libs-social-listening:nearby_candidate_threshold_distance_close"), aey0Var.b(1, 100, 80, "android-libs-social-listening:nearby_candidate_threshold_distance_immediate"), aey0Var.a("android-libs-social-listening:onboarding_host_shown_key", ko4.b), aey0Var.b(0, 60, 5, "android-libs-social-listening:periodic_jams_polling_interval_seconds"), aey0Var.b(10, 50, 35, "android-libs-social-listening:ple_value"), aey0Var.b(0, 36000000, 1800000, "android-libs-social-listening:push_notification_timeout_duration_in_milliseconds"), aey0Var.b(1, 60, 30, "android-libs-social-listening:push_notification_uri_validation_timeout_duration_in_seconds"), aey0Var.a("android-libs-social-listening:resolve_token_request_tagger", lo4.b), aey0Var.b(-100, -10, -39, "android-libs-social-listening:rx_power_android"), aey0Var.b(-100, -10, -30, "android-libs-social-listening:rx_power_android_automotive"), aey0Var.b(-100, -10, -30, "android-libs-social-listening:rx_power_android_tv"), aey0Var.b(-100, -10, -30, "android-libs-social-listening:rx_power_desktop_mac_os"), aey0Var.b(-100, -10, -30, "android-libs-social-listening:rx_power_desktop_windows"), aey0Var.b(-100, -10, -47, "android-libs-social-listening:rx_power_ios"), aey0Var.b(-100, -10, -30, "android-libs-social-listening:rx_power_unknown"), aey0Var.c("android-libs-social-listening:show_jam_debug_information", false), aey0Var.c("android-libs-social-listening:show_social_radar_status_indicator", false), aey0Var.c("android-libs-social-listening:skip_resolve_in_background", false), aey0Var.c("android-libs-social-listening:suppress_add_to_queue_snackbar_for_free_hosted_jams", false), aey0Var.c("android-libs-social-listening:suppress_add_to_queue_snackbar_for_listen_along", false), (mo4) aey0Var.a("android-libs-social-listening:tv_social_radar_mode", mo4.OFF), aey0Var.c("android-libs-social-listening:use_connect_incarnations_for_token_resolving", false), (luk) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new oo4(aey0Var.c("android-libs-social-radar:enable_debug_logging", false), (luk) null);
            case 28:
                return new ro4(aey0Var.c("android-libs-your-episodes-flags:content_filter_stacking_enabled", false), aey0Var.c("android-libs-your-episodes-flags:enable_inline_sort_order", false), aey0Var.c("android-libs-your-episodes-flags:enable_sortby_recently_played", false), aey0Var.c("android-libs-your-episodes-flags:enable_sortby_show_name", false), aey0Var.c("android-libs-your-episodes-flags:remove_played_hint_card_enabled", false), aey0Var.c("android-libs-your-episodes-flags:remove_unplayed_settings_enabled", false), aey0Var.c("android-libs-your-episodes-flags:reordering_enabled", false), aey0Var.c("android-libs-your-episodes-flags:sort_order_enabled", false), aey0Var.c("android-libs-your-episodes-flags:text_filter_and_sort_options_enabled", false), (luk) null);
            default:
                return new so4(aey0Var.b(1000, 120000, 30000, "android-list-entity-music-page:initial_timeout_milliseconds"), null, aey0Var.c("android-list-entity-music-page:use_show_condition_for_rows", false));
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
        ro4 ro4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (fn4) ro4Var, fn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsMixingtransitionelementProperties;", 0);
            case 1:
                return new tv30(1, (gn4) ro4Var, gn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsPlaybackcontrolswitcherProperties;", 0);
            case 2:
                return new tv30(1, (in4) ro4Var, in4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsPlaypauseProperties;", 0);
            case 3:
                return new tv30(1, (jn4) ro4Var, jn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsSeekbarProperties;", 0);
            case 4:
                return new tv30(1, (kn4) ro4Var, kn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsSkiptonextchapterProperties;", 0);
            case 5:
                return new tv30(1, (ln4) ro4Var, ln4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsTrackinfoProperties;", 0);
            case 6:
                return new tv30(1, (nn4) ro4Var, nn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingElementsVideoqualityselectionProperties;", 0);
            case 7:
                return new tv30(1, (on4) ro4Var, on4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingEndlessFeedModeProperties;", 0);
            case 8:
                return new tv30(1, (pn4) ro4Var, pn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingFreeTierModeProperties;", 0);
            case 9:
                return new tv30(1, (qn4) ro4Var, qn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingReinventFreeModeProperties;", 0);
            case 10:
                return new tv30(1, (rn4) ro4Var, rn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingScrollWidgetsPodcastSponsorsProperties;", 0);
            case 11:
                return new tv30(1, (sn4) ro4Var, sn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingUiusecasesProperties;", 0);
            case 12:
                return new tv30(1, (un4) ro4Var, un4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsNowplayingVideoFirstModeProperties;", 0);
            case 13:
                return new tv30(1, (vn4) ro4Var, vn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsOnDemandSharingProperties;", 0);
            case 14:
                return new tv30(1, (wn4) ro4Var, wn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsOnDemandTrialsProperties;", 0);
            case 15:
                return new tv30(1, (xn4) ro4Var, xn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ondemandtrials/bootstrap/AndroidLibsOnDemandTrialsProperties;", 0);
            case 16:
                return new tv30(1, (yn4) ro4Var, yn4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPlaylistEndpointsProperties;", 0);
            case 17:
                return new tv30(1, (ao4) ro4Var, ao4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPlaylistEntityConfigurationProperties;", 0);
            case 18:
                return new tv30(1, (bo4) ro4Var, bo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPlaylistEntityModesBlendProperties;", 0);
            case 19:
                return new tv30(1, (co4) ro4Var, co4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPodcastAdsProperties;", 0);
            case 20:
                return new tv30(1, (do4) ro4Var, do4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPodcastEntityAdapterDelegateProperties;", 0);
            case 21:
                return new tv30(1, (eo4) ro4Var, eo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastuiplatform/episoderowimpl/AndroidLibsPodcastEpisodeRowProperties;", 0);
            case 22:
                return new tv30(1, (fo4) ro4Var, fo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastinteractivity/common/AndroidLibsPodcastInteractivityCommonProperties;", 0);
            case 23:
                return new tv30(1, (go4) ro4Var, go4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsPodcastInteractivityPollsProperties;", 0);
            case 24:
                return new tv30(1, (io4) ro4Var, io4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsQuickplayProperties;", 0);
            case 25:
                return new tv30(1, (jo4) ro4Var, jo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/serviceretrofit/AndroidLibsSingalongProperties;", 0);
            case 26:
                return new tv30(1, (no4) ro4Var, no4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsSocialListeningProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (oo4) ro4Var, oo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/bluetooth/flags/AndroidLibsSocialRadarProperties;", 0);
            case 28:
                return new tv30(1, ro4Var, ro4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsYourEpisodesFlagsProperties;", 0);
            default:
                return new tv30(1, (so4) ro4Var, so4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listentitymusic/page/AndroidListEntityMusicPageProperties;", 0);
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
