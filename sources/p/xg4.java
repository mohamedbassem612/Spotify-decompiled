package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class xg4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ xg4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new yg4(aey0Var.c("android-feature-notificationsettings:enable_categories_page", false), aey0Var.c("android-feature-notificationsettings:enable_category_details_page", false), aey0Var.c("android-feature-notificationsettings:enable_group_categories_page", false), aey0Var.c("android-feature-notificationsettings:enable_language_selection_row", false), aey0Var.c("android-feature-notificationsettings:enable_podcast_nen_settings_page", false), aey0Var.c("android-feature-notificationsettings:flatten_social_notification_preferences", false), aey0Var.c("android-feature-notificationsettings:is_permission_card_enabled", false), aey0Var.c("android-feature-notificationsettings:is_permission_dialog_enabled", false), aey0Var.b(0, 11, 11, "android-feature-notificationsettings:nen_opt_in_position"), aey0Var.c("android-feature-notificationsettings:preferences_show_comments_category", false), (luk) null);
            case 1:
                return new zg4(aey0Var.c("android-feature-notificationssdk:enable_device_state_sync", false), aey0Var.c("android-feature-notificationssdk:enable_per_message_worker_name", false), aey0Var.c("android-feature-notificationssdk:enable_push_token_sync_worker", false), aey0Var.c("android-feature-notificationssdk:is_messages_channel_enabled", false), aey0Var.b(0, 6, 3, "android-feature-notificationssdk:log_device_settings_flex_interval"), aey0Var.b(1, 72, 24, "android-feature-notificationssdk:log_device_settings_timer"), aey0Var.c("android-feature-notificationssdk:push_handler_sync", false), aey0Var.b(0, 100, 0, "android-feature-notificationssdk:push_handler_timekeeper_sample_rate"), aey0Var.b(1000, 30000, 10000, "android-feature-notificationssdk:push_image_load_timeout_ms"), aey0Var.b(1000, 60000, 10000, "android-feature-notificationssdk:robin_log_initial_delay_ms"), aey0Var.b(0, 3, 1, "android-feature-notificationssdk:robin_log_max_retries"), aey0Var.c("android-feature-notificationssdk:validate_jam_notifications", false), (luk) null);
            case 2:
                return new ah4(aey0Var.c("android-feature-nowplaying:enable_display_mode_state", false), aey0Var.c("android-feature-nowplaying:extended_lifecycle", false), null);
            case 3:
                return new eh4(aey0Var.a("android-feature-nowplaying-queue-bottom-sheet:enable_group_matches_session_modifier", bh4.b), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_mft_plus_queue", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_mixing_metadata", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_play_next_in_context_menus", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_player_state_restrictions", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_queue_traits", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_reshuffle", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:enable_track_row_element", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:is_queue_peek_persistent_enabled", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:is_swipe_to_play_next_in_queue_enabled", false), aey0Var.c("android-feature-nowplaying-queue-bottom-sheet:use_resolved_subtitles", false), (tgp0) null, (luk) null);
            case 4:
                return new fh4(aey0Var.c("android-feature-nowplaying-queue-navigation:enable_queue_peek_on_add", false), null);
            case 5:
                return new gh4(aey0Var.c("android-feature-nowplayingbar:default_size_remove_video_padding", false), aey0Var.c("android-feature-nowplayingbar:enable_resize_gesture", false), aey0Var.c("android-feature-nowplayingbar:hide_add_to_element", false), aey0Var.c("android-feature-nowplayingbar:is_npb_promo_indicator_enabled", false), aey0Var.c("android-feature-nowplayingbar:large_size_remove_video_padding", false), aey0Var.c("android-feature-nowplayingbar:larger_npb_video_on_by_default", false), aey0Var.c("android-feature-nowplayingbar:larger_npb_video_setting_visible", false), aey0Var.c("android-feature-nowplayingbar:npb_visibility_gating", false), aey0Var.c("android-feature-nowplayingbar:render_video_surface_as_overlay", true), aey0Var.c("android-feature-nowplayingbar:use_video_element", false), (luk) null);
            case 6:
                return new hh4(aey0Var.b(0, 30, 0, "android-feature-on-demand-new-releases:days_after_release_with_unrestricted_playback"), (luk) null);
            case 7:
                return new ih4(aey0Var.c("android-feature-pip:enable_early_pip_fragment_install", true), aey0Var.c("android-feature-pip:pip_end_message", false), aey0Var.c("android-feature-pip:pip_start_message", false), (luk) null);
            case 8:
                return new jh4(aey0Var.c("android-feature-playlist-creation-flags:custom_resolver_enabled", false), aey0Var.c("android-feature-playlist-creation-flags:euterpe_enable_pagination", false), aey0Var.b(0, 2, 2, "android-feature-playlist-creation-flags:euterpe_menu_option_position"), aey0Var.b(0, Integer.MAX_VALUE, 3000, "android-feature-playlist-creation-flags:euterpe_message_preference_update_debounce"), aey0Var.c("android-feature-playlist-creation-flags:euterpe_re_edit_flow_enabled", false), aey0Var.b(0, Integer.MAX_VALUE, AudioEpisode.SHOW_URI_FIELD_NUMBER, "android-feature-playlist-creation-flags:euterpe_status_update_throttle"), aey0Var.c("android-feature-playlist-creation-flags:link_with_prepopulated_prompt_enabled", true), aey0Var.c("android-feature-playlist-creation-flags:us_disclaimer_enabled", false), (luk) null);
            case 9:
                return new kh4(aey0Var.c("android-feature-podcast-entity:about_tab_trailer_in_header", false), aey0Var.c("android-feature-podcast-entity:enable_about_tab", false), aey0Var.c("android-feature-podcast-entity:enable_greenroom_extension", true), aey0Var.c("android-feature-podcast-entity:enable_pepar_resumption_progress_api", false), aey0Var.c("android-feature-podcast-entity:enable_share_icon", false), aey0Var.c("android-feature-podcast-entity:gated_podcast_subscriber_indicator_enabled", false), aey0Var.c("android-feature-podcast-entity:is_audiobook_specifics_enabled", true), aey0Var.c("android-feature-podcast-entity:is_cwt_ab_test_header_enabled", false), aey0Var.c("android-feature-podcast-entity:reduce_showpage_pagination_size", false), aey0Var.c("android-feature-podcast-entity:show_header_play_button_enabled", false), aey0Var.c("android-feature-podcast-entity:show_page_trailer_module_enabled", false), aey0Var.c("android-feature-podcast-entity:show_publisher_as_button_enabled", false), aey0Var.c("android-feature-podcast-entity:show_watch_feed_explore_button_enabled", false), aey0Var.c("android-feature-podcast-entity:video_thumbnail", false), null);
            case 10:
                return new lh4(aey0Var.c("android-feature-podcast-episode-cwp:context_menu_in_toolbar_trailing_action_episode", false), aey0Var.c("android-feature-podcast-episode-cwp:enable_creative_work_full_slice_plugins_on_episode", true), aey0Var.c("android-feature-podcast-episode-cwp:media_prefetch_enabled", false), aey0Var.c("android-feature-podcast-episode-cwp:media_prefetch_resume_position_enabled", false), aey0Var.c("android-feature-podcast-episode-cwp:music_contributor_attribution_enabled", false), (luk) null);
            case 11:
                return new mh4(aey0Var.c("android-feature-podcast-episode:enable_about_podcast", false), aey0Var.c("android-feature-podcast-episode:enable_age_assurance_verification", false), aey0Var.c("android-feature-podcast-episode:enable_byom_episode_entry", false), aey0Var.c("android-feature-podcast-episode:enable_comments_card", false), aey0Var.c("android-feature-podcast-episode:enable_guest_chips_element", false), aey0Var.c("android-feature-podcast-episode:enable_page_bound_ubi_logger", false), aey0Var.c("android-feature-podcast-episode:fewer_ads_label_enabled", false), aey0Var.c("android-feature-podcast-episode:hide_chapter_download_button", true), aey0Var.c("android-feature-podcast-episode:is_audiobook_playback_enabled", true), aey0Var.c("android-feature-podcast-episode:popularity_indicator_enabled", false), aey0Var.c("android-feature-podcast-episode:see_all_episodes_element_enabled", false), aey0Var.c("android-feature-podcast-episode:unified_signifier_enabled", false), aey0Var.c("android-feature-podcast-episode:video_label_enabled", false), aey0Var.c("android-feature-podcast-episode:video_thumbnail", false), aey0Var.c("android-feature-podcast-episode:vodcast_auto_opens_npv", false), null);
            case 12:
                return new nh4(aey0Var.c("android-feature-podcast-show-cosmos:esperanto_enabled", false), null);
            case 13:
                return new oh4(aey0Var.c("android-feature-premium-account-management:addon_consideration_page_enabled", false), aey0Var.c("android-feature-premium-account-management:allocation_request_dialog_enabled", false), aey0Var.c("android-feature-premium-account-management:allocations_enabled", false), aey0Var.c("android-feature-premium-account-management:available_plans_svs_enabled", false), aey0Var.c("android-feature-premium-account-management:consumption_enabled", false), aey0Var.c("android-feature-premium-account-management:enable_account_current_plan_card", false), aey0Var.c("android-feature-premium-account-management:enable_aom", false), aey0Var.c("android-feature-premium-account-management:enable_member_audiobook_management", false), aey0Var.c("android-feature-premium-account-management:enable_nemo_available_plans_new_badge", false), aey0Var.c("android-feature-premium-account-management:enable_nemo_plan_consideration", false), aey0Var.c("android-feature-premium-account-management:enable_tiered_family_plan_overview", false), aey0Var.c("android-feature-premium-account-management:enable_your_plan_sidedrawer", false), aey0Var.c("android-feature-premium-account-management:impression_v2_logging_available_plans_enabled", false), aey0Var.c("android-feature-premium-account-management:impression_v2_logging_billing_enabled", false), aey0Var.c("android-feature-premium-account-management:impression_v2_logging_plan_details_enabled", false), aey0Var.c("android-feature-premium-account-management:impression_v2_logging_plan_overview_enabled", false), aey0Var.c("android-feature-premium-account-management:impression_v2_logging_your_premium_enabled", false), aey0Var.c("android-feature-premium-account-management:managedaccount_details_page_enabled", false), aey0Var.c("android-feature-premium-account-management:multi_subs_enabled", false), aey0Var.c("android-feature-premium-account-management:mup_entry_card_v2_enabled", false), aey0Var.c("android-feature-premium-account-management:music_videos_toggle_visible", false), aey0Var.b(0, Integer.MAX_VALUE, 0, "android-feature-premium-account-management:nemo_available_plans_version"), aey0Var.c("android-feature-premium-account-management:pam_all_plans_disclaimer_nav_enabled", false), aey0Var.c("android-feature-premium-account-management:pam_billing_sample_data_enabled", false), aey0Var.c("android-feature-premium-account-management:pam_member_invite_page_v2_enabled", false), aey0Var.c("android-feature-premium-account-management:pam_phase2_enabled", false), aey0Var.c("android-feature-premium-account-management:pam_show_billing_enabled", false), aey0Var.c("android-feature-premium-account-management:plan_card_cta_enabled", false), aey0Var.c("android-feature-premium-account-management:plan_card_current_plan_click_disabled", false), aey0Var.c("android-feature-premium-account-management:plan_verification_entry_enabled", false), aey0Var.c("android-feature-premium-account-management:regularsub_details_page_enabled", false), aey0Var.c("android-feature-premium-account-management:show_value_your_premium_enabled", false), aey0Var.c("android-feature-premium-account-management:unboxing_entry_point", false), aey0Var.c("android-feature-premium-account-management:use_long_plan_names_enabled", false), aey0Var.c("android-feature-premium-account-management:video_settings_row_visible", false), aey0Var.c("android-feature-premium-account-management:your_premium_benefits_entry_point", false), (luk) null);
            case 14:
                return new qh4(aey0Var.c("android-feature-premium-banner:enable_premium_banner", false), (ph4) aey0Var.a("android-feature-premium-banner:layout_variant", ph4.TOP_BANNER), null);
            case 15:
                return new rh4(aey0Var.c("android-feature-prerelease:listening_party_card_enabled", false), aey0Var.c("android-feature-prerelease:push_permission_alert_cdp_album_enabled", false), aey0Var.c("android-feature-prerelease:toolbar_context_menu_enabled", false), aey0Var.c("android-feature-prerelease:use_album_uri_for_presave", false), null);
            case 16:
                return new th4(aey0Var.c("android-feature-profile:account_id_uri_enabled", false), aey0Var.c("android-feature-profile:add_friend_button_enabled", false), aey0Var.c("android-feature-profile:bio_enabled", false), aey0Var.c("android-feature-profile:can_edit_location", false), aey0Var.c("android-feature-profile:can_edit_pronouns", false), aey0Var.c("android-feature-profile:can_edit_show_birthdate", false), aey0Var.c("android-feature-profile:can_view_birthdate", false), aey0Var.c("android-feature-profile:can_view_location", false), aey0Var.c("android-feature-profile:can_view_pronouns", false), aey0Var.c("android-feature-profile:compose_profile_page_enabled", false), aey0Var.c("android-feature-profile:follow_back_button_enabled", false), aey0Var.c("android-feature-profile:following_tabs_enabled", false), aey0Var.c("android-feature-profile:friend_invite_qr_code_enabled", false), aey0Var.c("android-feature-profile:profile_completion_sheet_using_page_api_enabled", false), aey0Var.c("android-feature-profile:profile_invite_button_enabled", false), aey0Var.c("android-feature-profile:settings_username_social_handle_enabled", false), aey0Var.c("android-feature-profile:share_account_id_uri_enabled", false), aey0Var.c("android-feature-profile:social_handle_enabled", false), aey0Var.c("android-feature-profile:suggested_friends_enabled", false), (luk) null);
            case 17:
                return uh4.i(aey0Var);
            case 18:
                return new vh4(aey0Var.b(0, 30000, 0, "android-feature-recents-config:decorator_timeout_override_ms"), (luk) null, aey0Var.c("android-feature-recents-config:artificial_delay_enabled", false), aey0Var.c("android-feature-recents-config:force_music_episode_content_type", false), aey0Var.c("android-feature-recents-config:sponsorship_label_enabled", false), aey0Var.c("android-feature-recents-config:swipe_to_queue_enabled", false));
            case 19:
                return new wh4(aey0Var.c("android-feature-reporting:enable_album_reporting", false), aey0Var.c("android-feature-reporting:enable_artist_reporting", false), aey0Var.c("android-feature-reporting:enable_audiobook_chapter_reporting", false), aey0Var.c("android-feature-reporting:enable_author_reporting", false), aey0Var.c("android-feature-reporting:enable_canvas_track_reporting", true), aey0Var.c("android-feature-reporting:enable_episode_reporting", false), aey0Var.c("android-feature-reporting:enable_hybrid_report_flow", false), aey0Var.c("android-feature-reporting:enable_promo_episode_reporting", false), aey0Var.c("android-feature-reporting:enable_show_reporting", false), aey0Var.c("android-feature-reporting:enable_track_reporting", false), aey0Var.c("android-feature-reporting:enable_user_reporting", true), (luk) null);
            case 20:
                return new di4(aey0Var.c("android-feature-search:age_restricted_dialog_on_not_on_demand_enabled", false), aey0Var.c("android-feature-search:ai_persona_badge_enabled", false), aey0Var.c("android-feature-search:album_presave_second_step_enabled", false), aey0Var.c("android-feature-search:chaptered_track_navigation_enabled", false), aey0Var.c("android-feature-search:concerts_enabled", false), aey0Var.c("android-feature-search:content_agnostic_enabled", false), aey0Var.c("android-feature-search:conversation_starters_enabled", false), aey0Var.c("android-feature-search:cross_content_section_enabled", false), aey0Var.c("android-feature-search:crossword_overview_chat_entry_point_mic_icon_enabled", false), aey0Var.c("android-feature-search:crossword_overview_component_enabled", false), aey0Var.c("android-feature-search:crossword_overview_feedback_enabled", false), aey0Var.c("android-feature-search:crossword_overview_progressive_loading_enabled", false), aey0Var.c("android-feature-search:crossword_overview_search_to_chat_entry_point_enabled", false), (xh4) aey0Var.a("android-feature-search:crossword_overview_treatment", xh4.UNKNOWN), aey0Var.c("android-feature-search:crossword_send_conversation_id_enabled", false), aey0Var.c("android-feature-search:enable_autocomplete_improvement_no_back_circle", false), aey0Var.c("android-feature-search:enable_autocomplete_improvement_two_lines", false), aey0Var.c("android-feature-search:enable_autocomplete_improvement_updated_sizes", false), aey0Var.c("android-feature-search:enable_context_menu_complex_rows", false), aey0Var.c("android-feature-search:enable_editorial_on_demand_playback", false), aey0Var.c("android-feature-search:enable_expanding_complex_episode_row_description", false), aey0Var.c("android-feature-search:enable_instant_mix_section", false), aey0Var.c("android-feature-search:enable_local_concert_rows", false), aey0Var.c("android-feature-search:enable_optimized_instant_mix_section", false), aey0Var.c("android-feature-search:enable_recent_searches_sync_on_navigation", false), aey0Var.c("android-feature-search:enable_recommended_queries_section", false), aey0Var.c("android-feature-search:enable_search_client_native", false), aey0Var.c("android-feature-search:enable_search_compose_body", false), aey0Var.c("android-feature-search:enable_search_compose_page", false), aey0Var.c("android-feature-search:enable_search_compose_page_v2", false), aey0Var.c("android-feature-search:enable_search_rich_row_test2_audiobook_ratings", false), aey0Var.c("android-feature-search:enable_track_videos", false), aey0Var.c("android-feature-search:enable_video_interceptor", false), aey0Var.c("android-feature-search:first_step_concerts_enabled", false), aey0Var.c("android-feature-search:gated_content_custom_upsell_enabled", false), aey0Var.c("android-feature-search:http_caching_second_step_enabled", false), aey0Var.c("android-feature-search:instant_mix_ux_in_serp_enabled", false), aey0Var.c("android-feature-search:kallax_enabled", false), aey0Var.c("android-feature-search:kallax_metadata_enabled", false), aey0Var.c("android-feature-search:likely_ai_persona_badge_enabled", false), aey0Var.c("android-feature-search:live_events_filter_enabled", false), aey0Var.c("android-feature-search:multitrack_search_enabled", false), aey0Var.c("android-feature-search:music_audio_episode_track_row_enabled", false), aey0Var.c("android-feature-search:new_artist_verified_badge_enabled", false), aey0Var.c("android-feature-search:new_recent_filter_enabled", false), aey0Var.c("android-feature-search:prompted_playlist_merchandizing_enabled", false), aey0Var.c("android-feature-search:related_searches_enabled", false), aey0Var.a("android-feature-search:s2p_byline_kind", yh4.b), aey0Var.c("android-feature-search:save_actions_first_step_enabled", false), aey0Var.b(10, 60, 10, "android-feature-search:search_second_step_long_timeout"), aey0Var.c("android-feature-search:simplified_instant_mix_row_enabled", false), aey0Var.c("android-feature-search:smart_filters_enabled", false), aey0Var.c("android-feature-search:social_proof_plays_in_search_enabled", false), aey0Var.c("android-feature-search:sponsorship_label_enabled", false), aey0Var.c("android-feature-search:step_1_artist_follow_button_enabled", false), aey0Var.c("android-feature-search:step_1_author_follow_button_enabled", false), aey0Var.a("android-feature-search:step_1_entity_highlight_mode", zh4.b), aey0Var.a("android-feature-search:step_1_entity_highlight_style", ai4.b), aey0Var.c("android-feature-search:tentpole_music_videos_enabled", false), aey0Var.c("android-feature-search:updated_hierarchy_episodes_enabled", false), aey0Var.c("android-feature-search:updated_offline_header_titles_enabled", false), aey0Var.c("android-feature-search:updated_search_bar_enabled", false), aey0Var.c("android-feature-search:use_chat_playlist_generation", false), aey0Var.c("android-feature-search:use_mdc_carousel", false), aey0Var.c("android-feature-search:venues_enabled", false), aey0Var.c("android-feature-search:verified_shows_enabled", false), aey0Var.c("android-feature-search:video_carousel_section_enabled", false), aey0Var.c("android-feature-search:video_indicator_track_enabled", false), aey0Var.a("android-feature-search:video_metadata_episode_enabled", bi4.b), aey0Var.a("android-feature-search:video_metadata_track_enabled", ci4.b), (luk) null);
            case 21:
                return new ei4(aey0Var.c("android-feature-settings:language_settings", false), (luk) null);
            case 22:
                return new gi4(aey0Var.c("android-feature-show-page-cwp:community_tab_enabled", false), aey0Var.c("android-feature-show-page-cwp:context_aware_show_page_enabled", false), aey0Var.c("android-feature-show-page-cwp:context_menu_in_toolbar_trailing_action_show", false), aey0Var.c("android-feature-show-page-cwp:creative_work_best_place_to_start_enabled", false), aey0Var.c("android-feature-show-page-cwp:enable_age_assurance_verification", false), aey0Var.c("android-feature-show-page-cwp:enable_override_progress_api", false), aey0Var.c("android-feature-show-page-cwp:enable_rating_target", false), aey0Var.c("android-feature-show-page-cwp:hide_podcast_trailer", false), aey0Var.c("android-feature-show-page-cwp:host_recommendations_enabled", false), aey0Var.c("android-feature-show-page-cwp:media_prefetch_enabled", false), aey0Var.c("android-feature-show-page-cwp:member_button_enabled", false), aey0Var.c("android-feature-show-page-cwp:no_initial_show_cosmos_sub", false), (fi4) aey0Var.a("android-feature-show-page-cwp:provided_sort_lens", fi4.DISABLED), aey0Var.c("android-feature-show-page-cwp:share_in_action_row_enabled_show", false), aey0Var.c("android-feature-show-page-cwp:should_use_compose_encore_list_row", false), aey0Var.c("android-feature-show-page-cwp:use_kodiak_releaserow", false), null);
            case 23:
                return new ii4((hi4) aey0Var.a("android-feature-sidedrawer:header_variant", hi4.ROW), null);
            case 24:
                return new ji4(aey0Var.c("android-feature-song-dna:enable_auto_create_playlist", false), aey0Var.c("android-feature-song-dna:enable_contributor_sheet", false), aey0Var.c("android-feature-song-dna:enable_go_to_blend_playlist", false), aey0Var.c("android-feature-song-dna:enable_go_to_covers_playlist", false), aey0Var.c("android-feature-song-dna:enable_sample_chain", false), aey0Var.c("android-feature-song-dna:enable_search", false), aey0Var.c("android-feature-song-dna:enable_song_dna", false), aey0Var.c("android-feature-song-dna:enable_song_dna_share", false), (luk) null);
            case 25:
                return new ki4(aey0Var.c("android-feature-spotify-go:spotify_go_access_control", true), aey0Var.c("android-feature-spotify-go:spotify_go_auvi_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_bose_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_bragi_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_connected_tts_enabled", false), aey0Var.c("android-feature-spotify-go:spotify_go_debug_toasts_enabled", false), aey0Var.c("android-feature-spotify-go:spotify_go_facebook_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_feature_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_ikea_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_jabra_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_jbl_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_jbl_new_enabled", false), aey0Var.c("android-feature-spotify-go:spotify_go_marshall_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_marshall_legacy_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_microsoft_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_microsoft_legacy_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_oppo_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_skullcandy_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_sony_auto_play_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_sony_headphones_enabled", true), aey0Var.c("android-feature-spotify-go:spotify_go_stop_service_on_task_removed_enabled", false), aey0Var.c("android-feature-spotify-go:spotify_go_user_logged_out_tts_enabled", false), aey0Var.c("android-feature-spotify-go:spotify_go_xiaomi_enabled", false), (luk) null);
            case 26:
                return new li4(aey0Var.c("android-feature-spoton:spoton_feature_enabled", true), null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new mi4(aey0Var.c("android-feature-stickers:enable_enhanced_share_card", false), aey0Var.c("android-feature-stickers:enable_lyrics_sticker_creation", false), aey0Var.c("android-feature-stickers:local_search_enabled", false), (luk) null);
            case 28:
                return new ni4(aey0Var.c("android-feature-taste-profile-side-drawer:side_drawer_entry_point_enabled", false), null);
            default:
                return new oi4(aey0Var.c("android-feature-track-row-configuration-builder:track_video_indicator_enabled", false), (luk) null);
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
        oi4 oi4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (yg4) oi4Var, yg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/notifications/notificationsettings/AndroidFeatureNotificationsettingsProperties;", 0);
            case 1:
                return new tv30(1, (zg4) oi4Var, zg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/notifications/notificationssdk/AndroidFeatureNotificationssdkProperties;", 0);
            case 2:
                return new tv30(1, (ah4) oi4Var, ah4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNowplayingProperties;", 0);
            case 3:
                return new tv30(1, (eh4) oi4Var, eh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNowplayingQueueBottomSheetProperties;", 0);
            case 4:
                return new tv30(1, (fh4) oi4Var, fh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNowplayingQueueNavigationProperties;", 0);
            case 5:
                return new tv30(1, (gh4) oi4Var, gh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNowplayingbarProperties;", 0);
            case 6:
                return new tv30(1, (hh4) oi4Var, hh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureOnDemandNewReleasesProperties;", 0);
            case 7:
                return new tv30(1, (ih4) oi4Var, ih4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePipProperties;", 0);
            case 8:
                return new tv30(1, (jh4) oi4Var, jh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/playlistcreation/flagsimpl/AndroidFeaturePlaylistCreationFlagsProperties;", 0);
            case 9:
                return new tv30(1, (kh4) oi4Var, kh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePodcastEntityProperties;", 0);
            case 10:
                return new tv30(1, (lh4) oi4Var, lh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePodcastEpisodeCwpProperties;", 0);
            case 11:
                return new tv30(1, (mh4) oi4Var, mh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePodcastEpisodeProperties;", 0);
            case 12:
                return new tv30(1, (nh4) oi4Var, nh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePodcastShowCosmosProperties;", 0);
            case 13:
                return new tv30(1, (oh4) oi4Var, oh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePremiumAccountManagementProperties;", 0);
            case 14:
                return new tv30(1, (qh4) oi4Var, qh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/premiumdestination/experiments/premiumbanner/AndroidFeaturePremiumBannerProperties;", 0);
            case 15:
                return new tv30(1, (rh4) oi4Var, rh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePrereleaseProperties;", 0);
            case 16:
                return new tv30(1, (th4) oi4Var, th4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureProfileProperties;", 0);
            case 17:
                return new tv30(1, (uh4) oi4Var, uh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeaturePromptedPlaylistsProperties;", 0);
            case 18:
                return new tv30(1, (vh4) oi4Var, vh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureRecentsConfigProperties;", 0);
            case 19:
                return new tv30(1, (wh4) oi4Var, wh4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureReportingProperties;", 0);
            case 20:
                return new tv30(1, (di4) oi4Var, di4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureSearchProperties;", 0);
            case 21:
                return new tv30(1, (ei4) oi4Var, ei4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/language/musiclanguage/AndroidFeatureSettingsProperties;", 0);
            case 22:
                return new tv30(1, (gi4) oi4Var, gi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/showpagecwp/AndroidFeatureShowPageCwpProperties;", 0);
            case 23:
                return new tv30(1, (ii4) oi4Var, ii4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/sidedrawer/propertiesimpl/AndroidFeatureSidedrawerProperties;", 0);
            case 24:
                return new tv30(1, (ji4) oi4Var, ji4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureSongDnaProperties;", 0);
            case 25:
                return new tv30(1, (ki4) oi4Var, ki4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureSpotifyGoProperties;", 0);
            case 26:
                return new tv30(1, (li4) oi4Var, li4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureSpotonProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (mi4) oi4Var, mi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/stickers/propertiesimpl/AndroidFeatureStickersProperties;", 0);
            case 28:
                return new tv30(1, (ni4) oi4Var, ni4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureTasteProfileSideDrawerProperties;", 0);
            default:
                return new tv30(1, oi4Var, oi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/track/trackreleaserowbuilder/AndroidFeatureTrackRowConfigurationBuilderProperties;", 0);
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
