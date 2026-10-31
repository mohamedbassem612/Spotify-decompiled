package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class c44 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ c44(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    @Override // p.ydy0
    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return f44.b(aey0Var);
            case 1:
                return k84.s(aey0Var);
            case 2:
                return se4.c(aey0Var);
            case 3:
                return new xj4(aey0Var.c("android-gating:dry_run_enabled", false), aey0Var.c("android-gating:kill_switch_enabled", false), null);
            case 4:
                return qm4.c(aey0Var);
            case 5:
                return new po4(aey0Var.b(0, 15, 15, "android-libs-storage:number_of_retries"), null, aey0Var.c("android-libs-storage:touch_dirs_on_background", true), aey0Var.c("android-libs-storage:wait_for_mounted_storage", false));
            case 6:
                return qo4.c(aey0Var);
            case 7:
                return new gu4(aey0Var.b(0, 1500, 0, "android-musicapp-ubi:recurring_ping_interval"), null, aey0Var.c("android-musicapp-ubi:send_page_error_reports", false));
            case 8:
                return new n15(aey0Var.c("android-share:enable_client_side_playlist_sticker", false), aey0Var.c("android-share:enable_sts_sharing_as_music", false), aey0Var.c("android-share:is_clip_sharing_enhancements_enabled", false), aey0Var.c("android-share:is_idaho_videos_enabled", false), aey0Var.c("android-share:is_lyrics_edit_from_carousel_enabled", false), aey0Var.c("android-share:is_on_platform_local_share_preview_enabled", false), aey0Var.c("android-share:is_share_card_config_upload_enabled", false), aey0Var.c("android-share:is_share_sheet_time_measurement_enabled", false), aey0Var.c("android-share:is_track_uri_to_facebook_feed_enabled", false), aey0Var.c("android-share:is_track_uri_to_facebook_stories_enabled", false), aey0Var.c("android-share:is_track_uri_to_instagram_stories_enabled", false), aey0Var.c("android-share:is_track_uri_to_snapchat_enabled", false), aey0Var.c("android-share:is_track_uri_to_whatsapp_status_enabled", false), aey0Var.c("android-share:is_whatsapp_status_videos_enabled", false), aey0Var.c("android-share:kallax_chat_preview_enabled", false), aey0Var.b(1, 60, 20, "android-share:max_shared_video_duration"), aey0Var.b(-1, Integer.MAX_VALUE, -1, "android-share:minimum_instagram_notes_version"), aey0Var.b(-1, Integer.MAX_VALUE, -1, "android-share:required_threads_version"), null);
            case 9:
                return new y45(aey0Var.c("android-tome-insets:enable_debug_view_overlay", false), null);
            case 10:
                return new dhb(aey0Var.c("bluetooth-flags:advertiser_async_write_delivery_enabled", false), aey0Var.c("bluetooth-flags:android_device_type_enabled", false), aey0Var.b(1, 10, 1, "bluetooth-flags:background_report_delay_multiplier"), aey0Var.b(60000, 1800000, 900000, "bluetooth-flags:ble_discovery_snapshot_interval_millis"), aey0Var.b(1, 50, 10, "bluetooth-flags:ble_discovery_snapshot_rssi_equality_threshold"), aey0Var.c("bluetooth-flags:ble_enabled", true), aey0Var.b(0, 3600000, 2500, "bluetooth-flags:ble_operations_timeout_ms"), aey0Var.b(60, 10800, 300, "bluetooth-flags:characteristic_operation_logging_throttle_interval_seconds"), aey0Var.c("bluetooth-flags:deliver_power_state_broadcasts_in_background", false), aey0Var.b(0, 60000, 1000, "bluetooth-flags:discovered_device_reader_emission_debounce_millis"), aey0Var.b(0, 600000, 60000, "bluetooth-flags:discovered_device_reader_eviction_interval_millis"), aey0Var.b(0, 600000, 300000, "bluetooth-flags:discovered_device_reader_inactivity_timeout_millis"), aey0Var.c("bluetooth-flags:enable_ble_characteristic_operation_logging", false), aey0Var.c("bluetooth-flags:enable_ble_discovery_snapshot", false), aey0Var.c("bluetooth-flags:enable_debug_metrics", false), aey0Var.c("bluetooth-flags:enable_low_power_on_background", false), aey0Var.c("bluetooth-flags:enable_mtu_negotiation", false), aey0Var.c("bluetooth-flags:gatt_read_offsets_enabled", false), aey0Var.c("bluetooth-flags:include_additional_data_in_advertisement", false), aey0Var.c("bluetooth-flags:pre_connection_capabilities_filtering_enabled", false), aey0Var.b(23, 512, 512, "bluetooth-flags:preferred_mtu"), aey0Var.c("bluetooth-flags:queued_writes_enabled", false), aey0Var.b(1, 8, 2, "bluetooth-flags:queued_writes_max_concurrent_connections"), aey0Var.b(500, 60000, 1000, "bluetooth-flags:remote_rssi_request_interval"), aey0Var.b(1, 30, 2, "bluetooth-flags:required_samples"), aey0Var.b(500, 300000, 30000, "bluetooth-flags:sample_max_age_ms"), aey0Var.a("bluetooth-flags:scan_mode", chb.b), aey0Var.c("bluetooth-flags:serialize_connection_events_enabled", false), aey0Var.c("bluetooth-flags:strip_tagged_legacy_write_payloads", false), aey0Var.c("bluetooth-flags:tap_over_ble_enabled", false), aey0Var.c("bluetooth-flags:tap_over_ble_peripheral_enabled", false), aey0Var.c("bluetooth-flags:unified_writable_characteristic_enabled", true), (luk) null);
            case 11:
                return new p3l(aey0Var.c("connect-flags:apple_tv_feature_enabled", false), aey0Var.c("connect-flags:artisanal_cast_enabled", false), aey0Var.c("connect-flags:available_bluetooth_picker_entries", false), aey0Var.c("connect-flags:call_audio_manager_volume_in_background_thread", false), aey0Var.c("connect-flags:cast_app_id_config_debug", false), aey0Var.a("connect-flags:cast_integration_mode", l3l.b), aey0Var.c("connect-flags:cast_transfer_recovery", false), aey0Var.c("connect-flags:connect_nudge", true), aey0Var.b(1, 180, 5, "connect-flags:device_discovery_snapshot_minutes_between_updates"), aey0Var.c("connect-flags:disable_connect_activation_for_external_output", false), aey0Var.c("connect-flags:disable_connect_entry_points_for_gen_alpha", false), aey0Var.c("connect-flags:enable_cast_sdk_async_init", false), aey0Var.c("connect-flags:enable_connect_activation_follow_up", false), aey0Var.c("connect-flags:enable_cross_device_install_prompt", false), aey0Var.c("connect-flags:enable_default_volume_steps", false), aey0Var.c("connect-flags:enable_device_grouping", false), aey0Var.c("connect-flags:enable_device_grouping_fake", false), aey0Var.c("connect-flags:enable_dodo", false), aey0Var.c("connect-flags:enable_gos_debug_toast", false), aey0Var.c("connect-flags:enable_wired_connection_type_audio_route_change", false), aey0Var.a("connect-flags:entry_point_icon", m3l.b), aey0Var.c("connect-flags:gos_cast_transfer_fix", false), aey0Var.c("connect-flags:hide_cast_device_info", false), aey0Var.c("connect-flags:include_user_match_unauthenticated_devices", false), aey0Var.c("connect-flags:is_tv_adoption_enabled", false), aey0Var.c("connect-flags:lazy_load_playback_status_provider", false), aey0Var.c("connect-flags:local_audio_playback_interceptor_flag", false), aey0Var.b(0, 365, 30, "connect-flags:message_box_min_days_after_dismissed"), aey0Var.c("connect-flags:new_jam_toggle_text", false), aey0Var.c("connect-flags:new_volume_slider", false), aey0Var.c("connect-flags:off_network_nudge", false), aey0Var.c("connect-flags:off_network_push_notification", false), aey0Var.c("connect-flags:off_network_smart_control", false), aey0Var.a("connect-flags:output_switcher_mode", n3l.c), aey0Var.c("connect-flags:remove_cast_devices_when_disconnected", false), aey0Var.c("connect-flags:remove_fgs_android_12_checks", false), aey0Var.b(0, 10000, 0, "connect-flags:route_await_timeout_ms"), aey0Var.c("connect-flags:set_flag_suggested_route_listing_preference", false), aey0Var.c("connect-flags:show_device_suggestion_in_umo", false), aey0Var.c("connect-flags:show_logout_device_only_on_another_network", false), aey0Var.a("connect-flags:smart_control_icon_mode", o3l.b), aey0Var.c("connect-flags:smart_control_off_network_shimmer_enabled", false), aey0Var.b(1000, 10000, 3000, "connect-flags:smart_control_volume_timeout_ms"), aey0Var.c("connect-flags:support_for_external_cast_session_start", false), aey0Var.c("connect-flags:use_audio_route_forwarding", false), aey0Var.c("connect-flags:volume_smart_control_enabled", false), (luk) null);
            case 12:
                return new hgd0(aey0Var.c("listening-activity:activity_sharing_with_followers_setting_available", false), aey0Var.c("listening-activity:activity_sheet_preview_play_enabled", false), aey0Var.c("listening-activity:activity_sheet_show_play_context", false), aey0Var.c("listening-activity:carousel_enabled", false), aey0Var.c("listening-activity:custom_reactions_enabled", false), aey0Var.c("listening-activity:enable_text_input_detail_sheet", false), aey0Var.c("listening-activity:following_reactions_enabled", false), aey0Var.c("listening-activity:hide_user_activity_enabled", false), aey0Var.c("listening-activity:invite_first_in_carousel_enabled", false), aey0Var.c("listening-activity:kodiak_indicators_enabled", false), aey0Var.c("listening-activity:listen_along_copy_enabled", false), aey0Var.c("listening-activity:listening_activity_enabled", false), aey0Var.c("listening-activity:listening_activity_new_settings_copy_enabled", false), aey0Var.c("listening-activity:listening_activity_show_onboarding_from_side_drawer", false), aey0Var.b(1000, 30000, 6000, "listening-activity:poll_interval_ms"), aey0Var.c("listening-activity:show_view_others_listening_activity_setting", false), aey0Var.c("listening-activity:visibility_indicator_enabled", false), aey0Var.a("listening-activity:visibility_indicator_treatment", fgd0.b), null, null);
            case 13:
                return qaq0.d(aey0Var);
            case 14:
                return w8r0.b(aey0Var);
            case 15:
                return ppy0.c(aey0Var);
            case 16:
                return new evm1(aey0Var.c("your-library:album_new_release_icon_enabled", false), aey0Var.c("your-library:consider_fast_scrolling_for_edge_approaching_calculations", true), aey0Var.c("your-library:context_menu_accessory", false), aey0Var.c("your-library:create_playlist_assistant_card_enabled", true), aey0Var.c("your-library:denser_rows_enabled", false), aey0Var.c("your-library:enable_also_available_offline", false), aey0Var.c("your-library:enable_concert_campaigns", false), aey0Var.c("your-library:enable_euterpe_tooltip", true), aey0Var.c("your-library:enable_hint_providers", false), aey0Var.c("your-library:enable_step_quick_scroll", false), aey0Var.c("your-library:enable_venues", false), aey0Var.c("your-library:enable_your_episodes_with_continue_listening", false), aey0Var.c("your-library:follow_podcast_assistant_card_enabled", true), aey0Var.c("your-library:global_search_from_library_enabled", false), aey0Var.c("your-library:import_music_entry_point_enabled", false), aey0Var.c("your-library:import_progress_enabled", false), aey0Var.c("your-library:inline_card_message_per_filter_enabled", false), aey0Var.c("your-library:library_import_match_result_banner_enabled", false), aey0Var.b(1, 4, 2, "your-library:max_selected_filters"), aey0Var.b(1, Integer.MAX_VALUE, 200, "your-library:page_size"), aey0Var.b(0, Integer.MAX_VALUE, 40, "your-library:page_threshold"), aey0Var.b(1, 20, 1, "your-library:playlist_synchronizer_batch_size"), aey0Var.b(10, 200, 200, "your-library:playlist_synchronizer_throttle_time"), aey0Var.c("your-library:podcast_follow_education_card_enabled", false), aey0Var.c("your-library:recently_updated_artists_sort_enabled", false), aey0Var.c("your-library:recently_updated_playlists_sort_enabled", false), aey0Var.c("your-library:recents_enabled", false), aey0Var.c("your-library:recents_sort_order_enabled", false), aey0Var.c("your-library:release_date_sort_order_for_albums_enabled", false), (cvm1) aey0Var.a("your-library:root_page_top_offset_adjustment", cvm1.LARGE), aey0Var.c("your-library:saved_content_by_artist_enabled", false), aey0Var.c("your-library:show_new_episodes_offboarding_card", false), null);
            default:
                return new fvm1(aey0Var.c("your-library:cold_start_enabled", false), aey0Var.a("your-library:default_pins_section_layout", avm1.b), aey0Var.c("your-library:default_save_location_context_menu_enabled", false), aey0Var.c("your-library:default_save_location_settings_enabled", false), aey0Var.c("your-library:download_center_icon_enabled", false), aey0Var.c("your-library:filter_reordering_enabled", false), aey0Var.c("your-library:layout_settings_sheet_enabled", false), aey0Var.c("your-library:library_settings_enabled", false), aey0Var.c("your-library:liked_songs_platform_context_menu_enabled", true), aey0Var.c("your-library:pins_section_enabled", false), aey0Var.c("your-library:remember_filter_state_enabled", false), aey0Var.c("your-library:select_items_enabled", false), aey0Var.c("your-library:tags_bypass_eligibility_checks", false), aey0Var.c("your-library:use_dsl_selection_page", false), aey0Var.c("your-library:your_episodes_platform_context_menu_enabled", true), null);
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
            default:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        ppy0 ppy0Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (f44) ppy0Var, f44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAddressProperties;", 0);
            case 1:
                return new tv30(1, (k84) ppy0Var, k84.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidCalAppProperties;", 0);
            case 2:
                return new tv30(1, (se4) ppy0Var, se4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEreaderProperties;", 0);
            case 3:
                return new tv30(1, (xj4) ppy0Var, xj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGatingProperties;", 0);
            case 4:
                return new tv30(1, (qm4) ppy0Var, qm4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsHugsProperties;", 0);
            case 5:
                return new tv30(1, (po4) ppy0Var, po4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsStorageProperties;", 0);
            case 6:
                return new tv30(1, (qo4) ppy0Var, qo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsWazeProperties;", 0);
            case 7:
                return new tv30(1, (gu4) ppy0Var, gu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMusicappUbiProperties;", 0);
            case 8:
                return new tv30(1, (n15) ppy0Var, n15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidShareProperties;", 0);
            case 9:
                return new tv30(1, (y45) ppy0Var, y45.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/tome/insets/AndroidTomeInsetsProperties;", 0);
            case 10:
                return new tv30(1, (dhb) ppy0Var, dhb.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/bluetooth/flags/BluetoothFlagsProperties;", 0);
            case 11:
                return new tv30(1, (p3l) ppy0Var, p3l.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connect/flags/ConnectFlagsProperties;", 0);
            case 12:
                return new tv30(1, (hgd0) ppy0Var, hgd0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listeningactivity/properties/ListeningActivityProperties;", 0);
            case 13:
                return new tv30(1, (qaq0) ppy0Var, qaq0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ontour/configuration/OnTourProperties;", 0);
            case 14:
                return new tv30(1, (w8r0) ppy0Var, w8r0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/pagematch/properties/PageMatchProperties;", 0);
            case 15:
                return new tv30(1, ppy0Var, ppy0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/PuffinCoreProperties;", 0);
            case 16:
                return new tv30(1, (evm1) ppy0Var, evm1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/yourlibrary/yourlibraryx/YourLibraryProperties;", 0);
            default:
                return new tv30(1, (fvm1) ppy0Var, fvm1.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/YourLibraryProperties;", 0);
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
        }
        return getFunctionDelegate().hashCode();
    }
}
