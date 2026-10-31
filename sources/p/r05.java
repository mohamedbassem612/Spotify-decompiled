package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class r05 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ r05(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new s05(aey0Var.b(-1, 2592000, 3600, "android-resumption-contentresumedhat:content_resumed_snackbar_min_age_seconds"), null, aey0Var.c("android-resumption-contentresumedhat:enable_content_resumed_hat", false));
            case 1:
                return new g15(aey0Var.c("android-settings-page-parental-controls:is_page_enabled", false), (luk) null);
            case 2:
                return new h15(aey0Var.c("android-settings-section-volumecontrols:show_remote_device_subject", false), null);
            case 3:
                return new l15((k15) aey0Var.a("android-share-audio-params-test-page:audio_params_test_destinations", k15.DISABLED), null);
            case 4:
                return new m15(aey0Var.b(0, Integer.MAX_VALUE, 0, "android-share:promoted_destinations"), aey0Var.b(0, Integer.MAX_VALUE, 0, "android-share:video_clip_sharing_destinations"), null);
            case 5:
                return new o15(aey0Var.c("android-sharecard-cardproviders-musicvideosticker-impl:enable_save_to_playlist_button", false), null);
            case 6:
                return new p15(aey0Var.c("android-shareconsumers-cardproviders:enable_audio_chapter_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_audio_content_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_fandom_collectibles_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_full_content_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_music_video_sticker_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_prompted_playlist_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_text_content_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_video_chapter_provider_registration", false), aey0Var.c("android-shareconsumers-cardproviders:enable_video_timestamp_provider_registration", false), null);
            case 7:
                return new q15(aey0Var.c("android-showcase-showcase:is_showcase_mdc_enabled", false), (luk) null);
            case 8:
                return new t15(aey0Var.c("android-shuffle-settings-algorithm:settings_item_visible", false), null, null);
            case 9:
                return new u15(aey0Var.c("android-sleep-timer-nudge:enable_page_api", false), (luk) null);
            case 10:
                return new b25(aey0Var.c("android-storage-settings-cachelimit:show_cache_limit_item", false), null, null);
            case 11:
                return new c25(aey0Var.c("android-streamreporting-common-impl:enable_stream_reporting_logger_prototype", false), aey0Var.c("android-streamreporting-common-impl:enforce_stream_reporting_contract", false), (luk) null);
            case 12:
                return new d25(aey0Var.b(0, 720, 0, "android-streamreporting-runtime-consumption-trigger-impl:ng_poll_age_threshold_hours"), aey0Var.b(0, 720, 0, "android-streamreporting-runtime-consumption-trigger-impl:ng_poll_age_window_hours"), aey0Var.c("android-streamreporting-runtime-consumption-trigger-impl:ng_poll_audiobook_filtering_enabled", false), aey0Var.c("android-streamreporting-runtime-consumption-trigger-impl:ng_poll_dedup_enabled", true), aey0Var.b(0, 3600000, 0, "android-streamreporting-runtime-consumption-trigger-impl:ng_poll_min_ms_played"), aey0Var.b(0, 100, 0, "android-streamreporting-runtime-consumption-trigger-impl:ng_poll_retry_count"), aey0Var.b(0, 3600, 60, "android-streamreporting-runtime-consumption-trigger-impl:ng_poll_retry_interval_seconds"), (luk) null);
            case 13:
                return new e25(aey0Var.c("android-superconnect-pairingroutegroup:pairing_enabled", false), (luk) null);
            case 14:
                return new f25(aey0Var.c("android-system-author:standalone_author_page_enabled", false), null);
            case 15:
                return new j25(aey0Var.b(0, 3072, 512, "android-system-contentdelivery:read_ahead_batch_size_kbytes"), aey0Var.b(0, 3072, 512, "android-system-contentdelivery:read_ahead_initial_kbytes"), aey0Var.b(0, 3072, 0, "android-system-contentdelivery:read_ahead_minimum_capacity_kbytes"), aey0Var.b(0, 104857600, 0, "android-system-contentdelivery:segment_cache_max_size_bytes"), aey0Var.c("android-system-contentdelivery:use_waiting_transport_proxy", false), (luk) null);
            case 16:
                return new l25(aey0Var.c("android-system-cover-art-snake:cover_art_snake_enabled", false), (luk) null);
            case 17:
                return new m25(aey0Var.b(0, 1000, 100, "android-system-element:behavior_trampoline_delay_ms"), (luk) null, aey0Var.c("android-system-element:behavior_trampoline_enabled", false));
            case 18:
                return new n25(aey0Var.c("android-system-encore:enable_programmatic_episode_card", false), aey0Var.c("android-system-encore:enable_programmatic_play_button", false), aey0Var.c("android-system-encore:enable_programmatic_section_headings", false), aey0Var.c("android-system-encore:enable_programmatic_track_row", false), aey0Var.c("android-system-encore:tinted_secondary_buttons", false), (feh1) null);
            case 19:
                return new u25(aey0Var.c("android-system-highlightsstats:enable_highlight_sharing", false), aey0Var.c("android-system-highlightsstats:enable_messaging_entry_point", false), aey0Var.c("android-system-highlightsstats:enable_new_summary_page", false), aey0Var.c("android-system-highlightsstats:enable_user_timeline_page", false), aey0Var.c("android-system-highlightsstats:enable_v2_endpoint", false), (luk) null);
            case 20:
                return new w25(aey0Var.c("android-system-home-evopage:content_agnostic_traits_for_track_row_mostly_required", false), aey0Var.c("android-system-home-evopage:defer_submit_list_before_layout", false), aey0Var.c("android-system-home-evopage:enable_age_assurance_for_mdc", false), aey0Var.c("android-system-home-evopage:enable_anchor_view", true), aey0Var.c("android-system-home-evopage:enable_e2e_test_feed", false), aey0Var.c("android-system-home-evopage:enable_focusable_sections", false), aey0Var.c("android-system-home-evopage:enable_incremental_home_loading", false), aey0Var.c("android-system-home-evopage:enable_per_section_instrumentation", false), aey0Var.c("android-system-home-evopage:enable_prefetching_home", false), aey0Var.c("android-system-home-evopage:enable_pull_to_refresh", false), aey0Var.c("android-system-home-evopage:home_wf_carousel_redesign_killswitch_enabled", false), aey0Var.c("android-system-home-evopage:idj_show_dj_button", true), aey0Var.c("android-system-home-evopage:image_link_eager_load_enabled", false), aey0Var.c("android-system-home-evopage:image_link_use_encore_ui", false), (v25) aey0Var.a("android-system-home-evopage:interactive_entrypoint_agent_icon_color", v25.GREEN), aey0Var.c("android-system-home-evopage:interactive_entrypoint_beta_tag_enabled", false), aey0Var.c("android-system-home-evopage:interactive_entrypoint_element_enabled", false), aey0Var.c("android-system-home-evopage:interactive_entrypoint_floating_chat_enabled", false), aey0Var.c("android-system-home-evopage:interactive_entrypoint_martini_enabled", false), aey0Var.c("android-system-home-evopage:interactive_entrypoint_mic_enabled", false), aey0Var.b(0, 44, 20, "android-system-home-evopage:interactive_entrypoint_top_spacing_dp"), aey0Var.c("android-system-home-evopage:interactive_entrypoint_voice_recording_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_concerts_carousel_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_immersive_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_medium_promo_card_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_medium_promo_carousel_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_mediumassociatedpreview_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_play_link_card_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_preview_card_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_preview_carousel_enabled", false), aey0Var.c("android-system-home-evopage:kodiak_recents_shelf_enabled", false), aey0Var.c("android-system-home-evopage:light_track_row_enabled", false), aey0Var.b(0, 20, 10, "android-system-home-evopage:loading_timeout"), aey0Var.c("android-system-home-evopage:media_prefetch_enabled", false), aey0Var.c("android-system-home-evopage:metadata_load_failure_reporting_enabled", false), aey0Var.c("android-system-home-evopage:pre_release_card_enabled", false), aey0Var.c("android-system-home-evopage:prevent_background_focus", false), aey0Var.c("android-system-home-evopage:reactive_instrumentation_environment_enabled", false), aey0Var.c("android-system-home-evopage:recents_card_compose_enabled", false), aey0Var.c("android-system-home-evopage:reload_on_video_settings_changed", false), aey0Var.c("android-system-home-evopage:send_is_tablet", false), aey0Var.c("android-system-home-evopage:show_audiobook_access_info_signifier", false), aey0Var.c("android-system-home-evopage:show_audiobook_genre_tag", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_audiobooks_feed", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_default_feed", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_music_feed", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_podcasts_feed", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_rh_picker_feed", false), aey0Var.c("android-system-home-evopage:slot_based_loading_enabled_on_rh_tango_feed", false), aey0Var.c("android-system-home-evopage:sponsorship_label_enabled", false), aey0Var.c("android-system-home-evopage:synchronous_page_loader_delivery_enabled", false), aey0Var.c("android-system-home-evopage:top_story_feed_card_image_enabled", false), aey0Var.c("android-system-home-evopage:track_release_row_data_element_enabled", false), aey0Var.c("android-system-home-evopage:track_rows_use_backend_playlist_context", false), aey0Var.c("android-system-home-evopage:use_attention_api_only", false), aey0Var.c("android-system-home-evopage:use_curation_as_primary_action_on_track_retrieval_rows", false), aey0Var.c("android-system-home-evopage:use_focus_attention_tracker", false), aey0Var.c("android-system-home-evopage:use_page_bound_attention_tracker", false), aey0Var.c("android-system-home-evopage:use_page_bound_data_loader", false), aey0Var.c("android-system-home-evopage:use_resumption_platform", false), aey0Var.c("android-system-home-evopage:use_stable_section_ids", true), aey0Var.b(0, 60, 5, "android-system-home-evopage:video_settings_reload_debounce_seconds"), aey0Var.b(0, 100, 67, "android-system-home-evopage:visibility_threshold_percentage"), (luk) null);
            case 21:
                return new x25(aey0Var.c("android-system-home-followfeed:enable_animation", false), aey0Var.c("android-system-home-followfeed:enable_compose_release_row_element", false), aey0Var.c("android-system-home-followfeed:enable_episode_imagery", false), aey0Var.c("android-system-home-followfeed:enable_prompted_playlists", false), aey0Var.c("android-system-home-followfeed:enable_video_thumbnail", false), (luk) null);
            case 22:
                return new b35(aey0Var.c("android-system-home-funkispage:enable_always_highlight_last_chip", false), aey0Var.c("android-system-home-funkispage:enable_assign_focus_on_scroll", false), aey0Var.c("android-system-home-funkispage:enable_left_aligned_selected_filter_chip_scrolling", false), aey0Var.c("android-system-home-funkispage:enable_page_presentation_update", false), aey0Var.c("android-system-home-funkispage:is_rive_animations_are_enabled_for_filter_chips", true), aey0Var.b(0, 50, 0, "android-system-home-funkispage:override_highlighted_chip_position"), aey0Var.a("android-system-home-funkispage:override_highlighted_chip_style", y25.b), (z25) aey0Var.a("android-system-home-funkispage:override_highlighted_chip_treatment", z25.DISABLED), aey0Var.a("android-system-home-funkispage:root_page_top_offset_adjustment", a35.b), (luk) null);
            case 23:
                return new c35(aey0Var.c("android-system-home-hidefromhome:is_hide_from_audiobook_shortcuts_enabled", false), aey0Var.c("android-system-home-hidefromhome:is_hide_from_podcast_anchors_enabled", false), aey0Var.c("android-system-home-hidefromhome:is_hide_from_recents_enabled", false), aey0Var.c("android-system-home-hidefromhome:is_hide_from_shortcuts_enabled", false), aey0Var.c("android-system-home-hidefromhome:is_hide_from_wrapped_shortcuts_enabled", false), (luk) null);
            case 24:
                return new d35(aey0Var.b(1000, 2500, 1300, "android-system-inappuserfeedback:shake_detector_gravity_threshold"), (luk) null, aey0Var.c("android-system-inappuserfeedback:flow_available", false), aey0Var.c("android-system-inappuserfeedback:user_feedback_enabled", false));
            case 25:
                return new e35(aey0Var.c("android-system-list-ux-platform-consumers-contextual-flair:enable_contextual_flair", true), (luk) null);
            case 26:
                return new f35(aey0Var.c("android-system-multiplayer-devicestateprovider:disable_auto_preview_when_active_npv", false), (luk) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new g35(aey0Var.c("android-system-offline-data-sources-impl:liked_songs_decoration_enabled", true), (luk) null);
            case 28:
                return new h35(aey0Var.b(0, 100000, 350, "android-system-offline-playablecacheimpl:max_number_of_tracks"), (luk) null);
            default:
                return new i35(aey0Var.c("android-system-playback-notifications:cache_stable_intents", false), aey0Var.c("android-system-playback-notifications:media_action_api_enabled", false), aey0Var.c("android-system-playback-notifications:notification_dsl_enabled", false), aey0Var.c("android-system-playback-notifications:should_use_vit", false), (luk) null);
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
        i35 i35Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (s05) i35Var, s05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/resumption/contentresumedhat/rc/AndroidResumptionContentresumedhatProperties;", 0);
            case 1:
                return new tv30(1, (g15) i35Var, g15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/settings/page/parentalcontrols/AndroidSettingsPageParentalControlsProperties;", 0);
            case 2:
                return new tv30(1, (h15) i35Var, h15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/settings/sections/volumecontrols/AndroidSettingsSectionVolumecontrolsProperties;", 0);
            case 3:
                return new tv30(1, (l15) i35Var, l15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/share/audioparamstestpage/AndroidShareAudioParamsTestPageProperties;", 0);
            case 4:
                return new tv30(1, (m15) i35Var, m15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/share/properties/bitmask/sharedestinations/impl/rc/AndroidShareProperties;", 0);
            case 5:
                return new tv30(1, (o15) i35Var, o15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/sharecard/cardproviders/musicvideosticker/impl/rc/AndroidSharecardCardprovidersMusicvideostickerImplProperties;", 0);
            case 6:
                return new tv30(1, (p15) i35Var, p15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/shareconsumers/cardproviders/rc/AndroidShareconsumersCardprovidersProperties;", 0);
            case 7:
                return new tv30(1, (q15) i35Var, q15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/showcase/showcase/rc/AndroidShowcaseShowcaseProperties;", 0);
            case 8:
                return new tv30(1, (t15) i35Var, t15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/shuffle/settings/algorithm/impl/AndroidShuffleSettingsAlgorithmProperties;", 0);
            case 9:
                return new tv30(1, (u15) i35Var, u15.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/sleep_timer_nudge/AndroidSleepTimerNudgeProperties;", 0);
            case 10:
                return new tv30(1, (b25) i35Var, b25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidStorageSettingsCachelimitProperties;", 0);
            case 11:
                return new tv30(1, (c25) i35Var, c25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidStreamreportingCommonImplProperties;", 0);
            case 12:
                return new tv30(1, (d25) i35Var, d25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidStreamreportingRuntimeConsumptionTriggerImplProperties;", 0);
            case 13:
                return new tv30(1, (e25) i35Var, e25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/superconnect/pairingroutegroup/rc/AndroidSuperconnectPairingroutegroupProperties;", 0);
            case 14:
                return new tv30(1, (f25) i35Var, f25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemAuthorProperties;", 0);
            case 15:
                return new tv30(1, (j25) i35Var, j25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/contentdelivery/downloadimpl/AndroidSystemContentdeliveryProperties;", 0);
            case 16:
                return new tv30(1, (l25) i35Var, l25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemCoverArtSnakeProperties;", 0);
            case 17:
                return new tv30(1, (m25) i35Var, m25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/element/AndroidSystemElementProperties;", 0);
            case 18:
                return new tv30(1, (n25) i35Var, n25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/encore/tooling/featureflagsservice/AndroidSystemEncoreUnauthProperties;", 0);
            case 19:
                return new tv30(1, (u25) i35Var, u25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemHighlightsstatsProperties;", 0);
            case 20:
                return new tv30(1, (w25) i35Var, w25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemHomeEvopageProperties;", 0);
            case 21:
                return new tv30(1, (x25) i35Var, x25.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemHomeFollowfeedProperties;", 0);
            case 22:
                return new tv30(1, (b35) i35Var, b35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemHomeFunkispageProperties;", 0);
            case 23:
                return new tv30(1, (c35) i35Var, c35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/home/hidefromhomeimpl/AndroidSystemHomeHidefromhomeProperties;", 0);
            case 24:
                return new tv30(1, (d35) i35Var, d35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/userfeedbackbottomsheet/AndroidSystemInappuserfeedbackProperties;", 0);
            case 25:
                return new tv30(1, (e35) i35Var, e35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemListUxPlatformConsumersContextualFlairProperties;", 0);
            case 26:
                return new tv30(1, (f35) i35Var, f35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemMultiplayerDevicestateproviderProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (g35) i35Var, g35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemOfflineDataSourcesImplProperties;", 0);
            case 28:
                return new tv30(1, (h35) i35Var, h35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemOfflinePlayablecacheimplProperties;", 0);
            default:
                return new tv30(1, i35Var, i35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemPlaybackNotificationsProperties;", 0);
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
