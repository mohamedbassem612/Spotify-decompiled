package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class if4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ if4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return jf4.A(aey0Var);
            case 1:
                return new kf4(aey0Var.c("android-feature-browse-clientnative:ad_auto_dismiss", true), aey0Var.c("android-feature-browse-clientnative:compose_browse_content_enabled", false), aey0Var.c("android-feature-browse-clientnative:enable_e2e_test_feed", false), aey0Var.c("android-feature-browse-clientnative:kodiak_play_link_card_enabled", false), aey0Var.c("android-feature-browse-clientnative:send_is_tablet", false), aey0Var.c("android-feature-browse-clientnative:show_audiobook_access_info_signifier", false), (luk) null);
            case 2:
                return new mf4(aey0Var.c("android-feature-browse:audio_recognition_enabled", false), aey0Var.c("android-feature-browse:enable_wrapped_title_density", false), aey0Var.a("android-feature-browse:root_page_top_offset_adjustment", lf4.b), (luk) null);
            case 3:
                return new nf4(aey0Var.c("android-feature-cache-fifo-cache-manager:clear_cache_on_trim_enabled", false), (luk) null);
            case 4:
                return new pf4(aey0Var.b(60000, 3600000, 60000, "android-feature-campfire-notification-nudges:affirmation_snackbar_time_window_ms"), aey0Var.c("android-feature-campfire-notification-nudges:disable_non_essential_push_on_nudge_interaction", false), aey0Var.c("android-feature-campfire-notification-nudges:enable_dismiss_button_on_nudge", false), aey0Var.c("android-feature-campfire-notification-nudges:enable_notifications_opt_in_nudge_on_chat_list", false), aey0Var.c("android-feature-campfire-notification-nudges:enable_notifications_opt_in_nudge_on_chat_page", false), aey0Var.c("android-feature-campfire-notification-nudges:enable_notifications_opt_in_nudge_on_side_drawer", false), aey0Var.b(0, 100, 0, "android-feature-campfire-notification-nudges:max_nudge_dismiss_count"), aey0Var.b(0, 100, 0, "android-feature-campfire-notification-nudges:max_nudge_interaction_count"), aey0Var.a("android-feature-campfire-notification-nudges:notifications_opt_in_nudge_flow", of4.b), aey0Var.b(1, 100, 1, "android-feature-campfire-notification-nudges:nudge_storage_version"), (luk) null);
            case 5:
                return new qf4(aey0Var.c("android-feature-campfire:age_assurance_banner_in_share_sheet", false), aey0Var.c("android-feature-campfire:age_assurance_required_icon_on_chat_rows", false), aey0Var.c("android-feature-campfire:agent_online_state_enabled", false), aey0Var.c("android-feature-campfire:agent_support_enabled", false), aey0Var.c("android-feature-campfire:agent_thinking_state_enabled", false), aey0Var.b(0, 60000, 0, "android-feature-campfire:app_start_loading_delay"), aey0Var.c("android-feature-campfire:autoplay_receipt_enabled", false), aey0Var.c("android-feature-campfire:campfire_feature_enabled", false), aey0Var.c("android-feature-campfire:chat_deletion_improvements_enabled", false), aey0Var.c("android-feature-campfire:chat_details_page_context_menu_enabled", false), aey0Var.c("android-feature-campfire:chat_disclaimer_page_enabled", false), aey0Var.c("android-feature-campfire:chat_settings_page_enabled", false), aey0Var.b(1, 2000, 150, "android-feature-campfire:chat_video_max_file_size_mb"), aey0Var.c("android-feature-campfire:christmas_easter_egg_enabled", false), aey0Var.c("android-feature-campfire:consolidated_share_entrypoint_enabled", false), aey0Var.c("android-feature-campfire:custom_media_picker_enabled", false), aey0Var.c("android-feature-campfire:delete_contribution_page_context_menu_enabled", false), aey0Var.c("android-feature-campfire:draft_persistence_enabled", false), aey0Var.c("android-feature-campfire:filter_active_chats_enabled", false), aey0Var.c("android-feature-campfire:group_details_page_context_menu_enabled", false), aey0Var.c("android-feature-campfire:group_image_enabled", false), aey0Var.c("android-feature-campfire:group_naming_enabled", false), aey0Var.c("android-feature-campfire:group_reporting_enabled", false), aey0Var.c("android-feature-campfire:holistic_permission_dialog_copy_enabled", false), aey0Var.c("android-feature-campfire:image_upload_enabled", false), aey0Var.c("android-feature-campfire:insights_tab_enabled", false), aey0Var.c("android-feature-campfire:invite_sheet_enabled", false), aey0Var.c("android-feature-campfire:is_friends_nearby_enabled", true), aey0Var.c("android-feature-campfire:is_wrapped_instance_share_reroute_enabled", true), aey0Var.c("android-feature-campfire:listening_activity_prompt_enabled", false), aey0Var.c("android-feature-campfire:listening_activity_prompt_group_chats_enabled", false), aey0Var.b(0, 100, 0, "android-feature-campfire:listening_activity_prompt_max_dismiss_count"), aey0Var.c("android-feature-campfire:lyrics_stickers_picker_enabled", false), aey0Var.b(1, 100, 15, "android-feature-campfire:max_persisted_drafts"), aey0Var.c("android-feature-campfire:media_upload_to_super_connect_enabled", false), aey0Var.c("android-feature-campfire:message_deleted_placeholder_deletion_enabled", false), aey0Var.c("android-feature-campfire:messages_linkify_enabled", false), aey0Var.c("android-feature-campfire:messaging_availability_gate_enabled", false), aey0Var.c("android-feature-campfire:music_linked_gifs_enabled", false), aey0Var.c("android-feature-campfire:nav_header_listening_activity_enabled", false), aey0Var.b(1, 3600, 300, "android-feature-campfire:played_receipt_episode_threshold_seconds"), aey0Var.b(1, 3600, 10, "android-feature-campfire:played_receipt_track_threshold_seconds"), aey0Var.c("android-feature-campfire:played_receipt_tracking_enabled", false), aey0Var.c("android-feature-campfire:playing_receipt_indicator_enabled", false), aey0Var.c("android-feature-campfire:pre_upload_media_enabled", false), aey0Var.c("android-feature-campfire:reactions_sheet_page_enabled", false), aey0Var.c("android-feature-campfire:receipt_indicator_enabled", false), aey0Var.c("android-feature-campfire:receipt_sending_enabled", false), aey0Var.c("android-feature-campfire:receipt_settings_enabled", false), aey0Var.c("android-feature-campfire:redirection_enabled", false), aey0Var.c("android-feature-campfire:report_shared_lyrics_enabled", false), aey0Var.c("android-feature-campfire:rich_media_content_ugc_enabled", false), aey0Var.c("android-feature-campfire:rive_share_cards_enabled", true), aey0Var.c("android-feature-campfire:seen_receipt_indicator_enabled", false), aey0Var.c("android-feature-campfire:seen_receipt_setting_enabled", false), aey0Var.c("android-feature-campfire:share_card_factory_enabled", false), aey0Var.c("android-feature-campfire:shared_by_chip_enabled", false), aey0Var.c("android-feature-campfire:shares_tab_enabled", false), aey0Var.c("android-feature-campfire:sharing_to_super_connect_enabled", false), aey0Var.b(1, 20, 4, "android-feature-campfire:side_drawer_max_chats_count"), aey0Var.c("android-feature-campfire:sticker_chat_preview_enabled", false), aey0Var.c("android-feature-campfire:sticker_suggestions_enabled", false), aey0Var.c("android-feature-campfire:stickers_to_super_connect_enabled", false), aey0Var.c("android-feature-campfire:super_connect_pairing_enabled", false), aey0Var.c("android-feature-campfire:tabbed_chat_header_enabled", false), aey0Var.b(0, 50, 0, "android-feature-campfire:video_upload_chunk_size_mb"), aey0Var.c("android-feature-campfire:video_upload_enabled", false), (luk) null);
            case 6:
                return new rf4(aey0Var.c("android-feature-churn-locked-state:custom_back_behaviour", false), aey0Var.c("android-feature-churn-locked-state:use_payment_cancellation_endpoint", false), (luk) null);
            case 7:
                return new sf4(aey0Var.c("android-feature-container-root-page:enable_work_page", false), aey0Var.c("android-feature-container-root-page:rich_series_page_enabled", false), (luk) null);
            case 8:
                return new tf4(aey0Var.c("android-feature-content-filtering:enable_content_filtering", false), (luk) null);
            case 9:
                return new vf4(aey0Var.a("android-feature-create-menu:create_menu_icon_placement", uf4.b), aey0Var.c("android-feature-create-menu:use_sectioned_create_menu", false), (luk) null);
            case 10:
                return new wf4(aey0Var.c("android-feature-creativeworkplatform:enable_metadata_row_data_element", false), aey0Var.c("android-feature-creativeworkplatform:include_banned_artist_items_for_managed_account", false), aey0Var.c("android-feature-creativeworkplatform:multithreaded_metadata_datasource", false), (luk) null);
            case 11:
                return new xf4(aey0Var.c("android-feature-creator-page:age_assurance_permission_enabled", false), aey0Var.c("android-feature-creator-page:context_menu_in_toolbar_trailing_action_artist", false), aey0Var.c("android-feature-creator-page:context_menu_in_toolbar_trailing_action_author", false), aey0Var.c("android-feature-creator-page:contributor_subtitle_page_enabled", false), aey0Var.c("android-feature-creator-page:enable_about_card_data_element", false), aey0Var.c("android-feature-creator-page:enable_artist_facts_in_bottom_sheet", false), aey0Var.c("android-feature-creator-page:enable_artist_facts_on_bio_page", false), aey0Var.c("android-feature-creator-page:enable_categorized_video_list", false), aey0Var.c("android-feature-creator-page:enable_clips_grid_layout", false), aey0Var.c("android-feature-creator-page:enable_data_element_migration", false), aey0Var.c("android-feature-creator-page:enable_multiplayer_and_attention_api", false), aey0Var.c("android-feature-creator-page:enable_new_video_section", false), aey0Var.c("android-feature-creator-page:enable_offline_available_songs", false), aey0Var.c("android-feature-creator-page:enable_popular_releases_filters", false), aey0Var.c("android-feature-creator-page:enable_popular_releases_loading_skeletons", false), aey0Var.c("android-feature-creator-page:enable_release_row_data_element", false), aey0Var.c("android-feature-creator-page:enable_unmapped_artist_music_videos", false), aey0Var.c("android-feature-creator-page:enable_verified_badge_data_element", false), aey0Var.c("android-feature-creator-page:enable_video_tab", false), aey0Var.c("android-feature-creator-page:is_ai_persona_badge_enabled", false), aey0Var.c("android-feature-creator-page:is_likely_ai_persona_badge_enabled", false), aey0Var.c("android-feature-creator-page:is_new_verified_badge_enabled", false), aey0Var.c("android-feature-creator-page:is_top_collaborators_enabled", false), aey0Var.c("android-feature-creator-page:pre_release_card_enabled", false), aey0Var.c("android-feature-creator-page:reduce_header_height_medium_size_artist", false), aey0Var.c("android-feature-creator-page:reduce_header_height_medium_size_author", false), aey0Var.c("android-feature-creator-page:share_in_action_row_enabled_artist", false), aey0Var.c("android-feature-creator-page:use_mdc_carousel", false), (luk) null);
            case 12:
                return new yf4(aey0Var.c("android-feature-creator-root-page:enable_composer_page", false), (luk) null);
            case 13:
                return new ag4(aey0Var.c("android-feature-dsa:personalized_recommendations_redirect_enabled", false), aey0Var.a("android-feature-dsa:personalized_recommendations_sheets_copy", zf4.b), aey0Var.c("android-feature-dsa:personalized_recommendations_toggle_enabled", false), aey0Var.c("android-feature-dsa:should_display_empty_state", true), (luk) null);
            case 14:
                return new bg4(aey0Var.c("android-feature-episode-subtitle-builder:experimental_episode_consumption_state_label_enabled", false), (luk) null);
            case 15:
                return new dg4(aey0Var.c("android-feature-free-tier-track:enable_artist_page_navigation", false), aey0Var.c("android-feature-free-tier-track:enable_free_tier_track_page", false), aey0Var.c("android-feature-free-tier-track:enable_play_track_as_a_list", false), (luk) null);
            case 16:
                return new eg4(aey0Var.c("android-feature-freeondemand:enable_free_on_demand_experiment", false), (luk) null);
            case 17:
                return new hg4(aey0Var.c("android-feature-kidsmode:debug_is_in_kids_mode", false), aey0Var.c("android-feature-kidsmode:kids_mode_enabled", false), (tgp0) null, (luk) null);
            case 18:
                return new ig4(aey0Var.b(0, Integer.MAX_VALUE, 0, "android-feature-limited-experience-indicator:announcement_cooldown_minutes"), (luk) null, aey0Var.c("android-feature-limited-experience-indicator:exit_announcements_enabled", true));
            case 19:
                return new jg4(aey0Var.c("android-feature-lockstate-detection:server_driven_lock_requires_local_churn_lock_check", true), aey0Var.c("android-feature-lockstate-detection:use_server_driven_lock_state", false), (luk) null);
            case 20:
                return new lg4(aey0Var.a("android-feature-login:enable_post_signup_premium_upsell_v1", kg4.b), (ez11) null);
            case 21:
                return new og4(aey0Var.c("android-feature-login:aa_test_property", false), aey0Var.c("android-feature-login:brazil_phone_number_placeholder_enabled", false), aey0Var.c("android-feature-login:direct_auth_event_publish_enabled", false), aey0Var.c("android-feature-login:disable_compose_autofill", false), aey0Var.c("android-feature-login:disable_credential_manager", false), aey0Var.c("android-feature-login:email_otp_login_enabled", false), aey0Var.c("android-feature-login:email_otp_signup_enabled", false), aey0Var.c("android-feature-login:enable_age_confirmation_dialog", false), aey0Var.c("android-feature-login:enable_allow_duplicate_recaptcha_tokens", false), aey0Var.c("android-feature-login:enable_autofill_manager", false), aey0Var.c("android-feature-login:enable_credential_manager_google_sign_in", false), aey0Var.c("android-feature-login:enable_direct_managed_account_signup", false), aey0Var.c("android-feature-login:enable_email_method_chooser_dialog", false), aey0Var.c("android-feature-login:enable_identityless_login", false), aey0Var.c("android-feature-login:enable_logged_out_page_flow", false), aey0Var.c("android-feature-login:enable_magiclink_as_default_fallback_method", false), aey0Var.c("android-feature-login:enable_new_age_entry_page", false), aey0Var.c("android-feature-login:enable_passkey_registration", false), aey0Var.c("android-feature-login:enable_passkeys_authentication", false), aey0Var.c("android-feature-login:enable_recaptcha_email_login", true), aey0Var.c("android-feature-login:enable_recaptcha_email_otp_login", false), aey0Var.c("android-feature-login:enable_recaptcha_email_signup", false), aey0Var.c("android-feature-login:enable_recaptcha_google_login", false), aey0Var.c("android-feature-login:enable_recaptcha_google_signup", false), aey0Var.c("android-feature-login:enable_recaptcha_magiclink_generation", false), aey0Var.c("android-feature-login:enable_recaptcha_magiclink_login", false), aey0Var.c("android-feature-login:enable_recaptcha_non_blocking_all_auth", true), aey0Var.c("android-feature-login:enable_recaptcha_phone_signup", false), aey0Var.c("android-feature-login:enable_recaptcha_sdk", false), aey0Var.c("android-feature-login:enable_recaptcha_sdk_v2", true), aey0Var.c("android-feature-login:enable_recaptcha_sms_login_grace_period", false), aey0Var.c("android-feature-login:enable_signup_step_info", false), aey0Var.c("android-feature-login:enable_whatsapp_otp_autofill", false), aey0Var.c("android-feature-login:fma_upgrade_dialog_enabled", false), aey0Var.a("android-feature-login:info_button", mg4.b), aey0Var.a("android-feature-login:intent_inline_form", ng4.b), aey0Var.c("android-feature-login:prefer_welcome_screen_credential_manager", false), aey0Var.b(0, 60000, 5000, "android-feature-login:recaptcha_email_otp_login_grace_period_millis"), aey0Var.b(0, 60000, 5000, "android-feature-login:recaptcha_google_login_grace_period_millis"), aey0Var.b(0, 60000, 5000, "android-feature-login:recaptcha_magiclink_login_grace_period_millis"), aey0Var.b(0, 60000, 5000, "android-feature-login:recaptcha_sms_login_grace_period_millis"), aey0Var.b(0, 60000, 5000, "android-feature-login:recaptcha_token_timeout_millis"), aey0Var.c("android-feature-login:username_login_hint_enabled", false), (xz11) null);
            case 22:
                return new pg4(aey0Var.c("android-feature-lyrics-npvelements:enable_lyrics_multilanguage", false), aey0Var.c("android-feature-lyrics-npvelements:enable_music_videos_lyrics", false), aey0Var.c("android-feature-lyrics-npvelements:hide_lyrics_on_mixing_transition", false), aey0Var.c("android-feature-lyrics-npvelements:lifecycle_aware_lyrics_fetch_enabled", false), aey0Var.c("android-feature-lyrics-npvelements:lyrics_entry_point_button_v2_enabled", false), aey0Var.c("android-feature-lyrics-npvelements:lyrics_entry_point_enabled", false), aey0Var.c("android-feature-lyrics-npvelements:lyrics_on_car_player_enabled", false), aey0Var.c("android-feature-lyrics-npvelements:shared_npv_lyrics_loading_enabled", false), null);
            case 23:
                return new qg4(aey0Var.c("android-feature-lyrics-repository:clear_cache_on_trim_enabled", false), aey0Var.c("android-feature-lyrics-repository:enable_dynamic_colors", false), aey0Var.c("android-feature-lyrics-repository:enable_has_lyrics_check_bypass", false), aey0Var.c("android-feature-lyrics-repository:enable_translated_lyrics_request_sharing", false), (luk) null);
            case 24:
                return rg4.j(aey0Var);
            case 25:
                return new sg4(aey0Var.c("android-feature-main-layout:compose_enabled", false), aey0Var.c("android-feature-main-layout:large_screen_layout_npv_mode_persistent", false), aey0Var.c("android-feature-main-layout:overlay_page_plugin_enabled", false), (luk) null);
            case 26:
                return new tg4(aey0Var.c("android-feature-main-layout:album_prerelease_full_width_limitation_enabled", false), aey0Var.c("android-feature-main-layout:browse_full_width", true), aey0Var.c("android-feature-main-layout:creator_full_width", true), aey0Var.c("android-feature-main-layout:cwp_full_width", false), aey0Var.c("android-feature-main-layout:home_full_width", true), aey0Var.c("android-feature-main-layout:releases_page_full_width_limitation_enabled", false), (luk) null);
            case 27:
                return new ug4(aey0Var.b(100, 30000, 3000, "android-feature-music-video-prerelease:music_video_prerelease_timeout_ms"), null, aey0Var.c("android-feature-music-video-prerelease:music_video_prerelease_enabled", false));
            case 28:
                return new vg4(aey0Var.c("android-feature-new-episodes:continue_listening_section_enabled", true), (luk) null);
            default:
                return new wg4(aey0Var.c("android-feature-notifications-permissions:enable_reinstall_notifications_prompt", false), aey0Var.c("android-feature-notifications-permissions:navigate_to_os_settings_only", false), (luk) null);
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
        wg4 wg4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (jf4) wg4Var, jf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBluejayProperties;", 0);
            case 1:
                return new tv30(1, (kf4) wg4Var, kf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBrowseClientnativeProperties;", 0);
            case 2:
                return new tv30(1, (mf4) wg4Var, mf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBrowseProperties;", 0);
            case 3:
                return new tv30(1, (nf4) wg4Var, nf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/featurecache/fifocachemanager/AndroidFeatureCacheFifoCacheManagerProperties;", 0);
            case 4:
                return new tv30(1, (pf4) wg4Var, pf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/campfire/notificationnudges/impl/AndroidFeatureCampfireNotificationNudgesProperties;", 0);
            case 5:
                return new tv30(1, (qf4) wg4Var, qf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureCampfireProperties;", 0);
            case 6:
                return new tv30(1, (rf4) wg4Var, rf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/churnlock/AndroidFeatureChurnLockedStateProperties;", 0);
            case 7:
                return new tv30(1, (sf4) wg4Var, sf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureContainerRootPageProperties;", 0);
            case 8:
                return new tv30(1, (tf4) wg4Var, tf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureContentFilteringProperties;", 0);
            case 9:
                return new tv30(1, (vf4) wg4Var, vf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/createmenu/properties/AndroidFeatureCreateMenuProperties;", 0);
            case 10:
                return new tv30(1, (wf4) wg4Var, wf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/creativeworkplatform/AndroidFeatureCreativeworkplatformProperties;", 0);
            case 11:
                return new tv30(1, (xf4) wg4Var, xf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureCreatorPageProperties;", 0);
            case 12:
                return new tv30(1, (yf4) wg4Var, yf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureCreatorRootPageProperties;", 0);
            case 13:
                return new tv30(1, (ag4) wg4Var, ag4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureDsaProperties;", 0);
            case 14:
                return new tv30(1, (bg4) wg4Var, bg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureEpisodeSubtitleBuilderProperties;", 0);
            case 15:
                return new tv30(1, (dg4) wg4Var, dg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureFreeTierTrackProperties;", 0);
            case 16:
                return new tv30(1, (eg4) wg4Var, eg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/premiumdestination/experiments/freeondemandimpl/AndroidFeatureFreeondemandProperties;", 0);
            case 17:
                return new tv30(1, (hg4) wg4Var, hg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/kidsmode/properties/AndroidFeatureKidsmodeProperties;", 0);
            case 18:
                return new tv30(1, (ig4) wg4Var, ig4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/limitedexperienceindicator/properties/AndroidFeatureLimitedExperienceIndicatorProperties;", 0);
            case 19:
                return new tv30(1, (jg4) wg4Var, jg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lockstate/detectionimpl/AndroidFeatureLockstateDetectionProperties;", 0);
            case 20:
                return new tv30(1, (lg4) wg4Var, lg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/login/loginflowremoteproperty/AndroidFeatureLoginProperties;", 0);
            case 21:
                return new tv30(1, (og4) wg4Var, og4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/login/loginflowremoteproperty/AndroidFeatureLoginUnauthProperties;", 0);
            case 22:
                return new tv30(1, (pg4) wg4Var, pg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureLyricsNpvelementsProperties;", 0);
            case 23:
                return new tv30(1, (qg4) wg4Var, qg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureLyricsRepositoryProperties;", 0);
            case 24:
                return new tv30(1, (rg4) wg4Var, rg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureMagpieProperties;", 0);
            case 25:
                return new tv30(1, (sg4) wg4Var, sg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/mainlayout/properties/AndroidFeatureMainLayoutProperties;", 0);
            case 26:
                return new tv30(1, (tg4) wg4Var, tg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/app/music/adaptivelayoutproperties/AndroidFeatureMainLayoutProperties;", 0);
            case 27:
                return new tv30(1, (ug4) wg4Var, ug4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureMusicVideoPrereleaseProperties;", 0);
            case 28:
                return new tv30(1, (vg4) wg4Var, vg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNewEpisodesProperties;", 0);
            default:
                return new tv30(1, wg4Var, wg4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureNotificationsPermissionsProperties;", 0);
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
