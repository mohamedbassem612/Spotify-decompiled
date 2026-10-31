package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class j35 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ j35(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return k35.c(aey0Var);
            case 1:
                return new l35(aey0Var.c("android-system-playliststats-properties:playlist_curator_stats_enabled", false), aey0Var.c("android-system-playliststats-properties:playlist_curator_stats_fake_data_enabled", false), (luk) null);
            case 2:
                return new m35(aey0Var.c("android-system-preview-card-heading:enable_condensed_heading", false), (luk) null);
            case 3:
                return new n35(aey0Var.c("android-system-previewcard-element-transcripts-impl:enable_compose_transcript_renderer", false), (luk) null);
            case 4:
                return new o35(aey0Var.b(0, 1000, 150, "android-system-previewcard-previewcoordinator-impl:pre_acquisition_debounce_ms"), (luk) null, aey0Var.c("android-system-previewcard-previewcoordinator-impl:enable_mobius_preview_coordinator", false), aey0Var.c("android-system-previewcard-previewcoordinator-impl:enable_pre_acquisition_debounce", false));
            case 5:
                return new s35(aey0Var.b(0, Integer.MAX_VALUE, 0, "android-system-shared-preferences-size-sampler:sample_version"), (luk) null);
            case 6:
                return new t35(aey0Var.c("android-system-smart-shuffle:allow_smart_shuffle_in_jams", false), aey0Var.c("android-system-smart-shuffle:connect_fixes_always_restore_sms_after_jam", false), aey0Var.c("android-system-smart-shuffle:connect_fixes_avoid_set_options_when_not_needed", false), aey0Var.c("android-system-smart-shuffle:connect_fixes_no_update_context_when_disable_smart_shuffle_over_connect", false), aey0Var.c("android-system-smart-shuffle:connect_fixes_no_update_context_when_enable_smart_shuffle_over_connect", false), aey0Var.b(0, Integer.MAX_VALUE, 0, "android-system-smart-shuffle:connect_fixes_resilient_shuffle_state_timeout"), aey0Var.c("android-system-smart-shuffle:curation_disabled", false), aey0Var.c("android-system-smart-shuffle:delay_sending_tap_signal", false), aey0Var.c("android-system-smart-shuffle:detect_and_resolve_smart_linear", false), aey0Var.c("android-system-smart-shuffle:jam_education_snackbar_enabled", false), aey0Var.c("android-system-smart-shuffle:log_internal_operation_results", false), aey0Var.b(0, Integer.MAX_VALUE, 15, "android-system-smart-shuffle:npv_scroll_card_minimum_recs_fullscreen"), aey0Var.b(0, Integer.MAX_VALUE, 3, "android-system-smart-shuffle:npv_scroll_card_minimum_recs_widget"), aey0Var.c("android-system-smart-shuffle:re_sync_liked_songs_playlist_in_entity", true), aey0Var.c("android-system-smart-shuffle:send_reset_signal_on_session_start", true), aey0Var.c("android-system-smart-shuffle:should_disable_liked_songs_wrapper_lens", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_as_default_for_liked_songs", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_as_default_for_playlist", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_for_spotify_sets_enabled", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_for_spotify_sets_phase1_enabled", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_for_spotify_sets_phase2_enabled", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_for_spotify_sets_phase3_enabled", false), aey0Var.b(0, Integer.MAX_VALUE, 8000, "android-system-smart-shuffle:smart_shuffle_lens_timeout"), aey0Var.b(0, Integer.MAX_VALUE, 8000, "android-system-smart-shuffle:smart_shuffle_lens_timeout_over_connect"), aey0Var.b(0, Integer.MAX_VALUE, 0, "android-system-smart-shuffle:smart_shuffle_show_sheet_count"), aey0Var.c("android-system-smart-shuffle:smart_shuffle_user_created_playlists_enabled", false), aey0Var.c("android-system-smart-shuffle:smart_shuffle_using_lens_enabled", false), aey0Var.c("android-system-smart-shuffle:third_party_playlist_support", false), aey0Var.c("android-system-smart-shuffle:use_player_signals_api_for_reset_signal", false), aey0Var.c("android-system-smart-shuffle:use_player_signals_api_for_smart_shuffle", false), aey0Var.c("android-system-smart-shuffle:use_playlist_state_for_signals_availability", true), aey0Var.c("android-system-smart-shuffle:write_to_centralized_shuffle_state", false), (luk) null);
            case 7:
                return u35.l(aey0Var);
            case 8:
                return new v35(aey0Var.c("android-tap-onboarding:accessory_onboarding_enabled", false), aey0Var.c("android-tap-onboarding:jabra_elite_interactive_onboarding_enabled", false), aey0Var.c("android-tap-onboarding:oppo_headphones_onboarding_enabled", false), aey0Var.c("android-tap-onboarding:sony_headphones_onboarding_enabled", false), aey0Var.c("android-tap-onboarding:xiaomi_headphones_onboarding_enabled", false), (luk) null);
            case 9:
                return new w35(aey0Var.c("android-tasteprofile-page:enable_error_popup", false), aey0Var.c("android-tasteprofile-page:enable_first_note_bottom_sheet", false), aey0Var.c("android-tasteprofile-page:enable_notes", false), aey0Var.c("android-tasteprofile-page:enable_processing_status", false), aey0Var.b(1, 60, 10, "android-tasteprofile-page:polling_interval_seconds"), aey0Var.b(0, 100, 0, "android-tasteprofile-page:polling_max_attempts"), (luk) null);
            case 10:
                return new r45(aey0Var.c("android-the-stage-vtec:prevent_stacked_pages", true), aey0Var.b(1, 49151, 8080, "android-the-stage-vtec:rehearsal_port"), aey0Var.a("android-the-stage-vtec:rehearsal_site_override", q45.b), aey0Var.c("android-the-stage-vtec:remote_debugging_enabled", false), (luk) null);
            case 11:
                return new z45(aey0Var.c("android-tome-page-api:preemptive_compose_teardown_enabled", false), (luk) null);
            case 12:
                return new c55(aey0Var.a("android-toolbar:chip_fills_background", a55.b), aey0Var.a("android-toolbar:chip_fills_contrast", b55.b), (luk) null);
            case 13:
                return new e55(aey0Var.c("android-track-contextmenuimpl:track_context_menu_page_api_enabled", false), (luk) null);
            case 14:
                return new g55(aey0Var.b(0, 1000000, 20, "android-trafficapi-impl:connection_quality_max_concurrent_latency_bypass"), aey0Var.b(0, 60000, 100, "android-trafficapi-impl:connection_quality_max_timer_error_ms"), aey0Var.b(0, 1000, 6, "android-trafficapi-impl:connection_quality_min_p90_sample_count"), aey0Var.b(0, 60000, 500, "android-trafficapi-impl:connection_quality_poor_latency_threshold_ms"), aey0Var.b(0, 1000, 5, "android-trafficapi-impl:connection_quality_poor_timeout_count"), aey0Var.c("android-trafficapi-impl:connection_quality_report_enabled", false), aey0Var.b(0, 100, 2, "android-trafficapi-impl:debounce_good_to_poor_threshold"), aey0Var.b(0, 100, 2, "android-trafficapi-impl:debounce_poor_to_good_threshold"), aey0Var.b(0, 100, 2, "android-trafficapi-impl:debounce_unknown_to_good_threshold"), aey0Var.b(0, 100, 2, "android-trafficapi-impl:debounce_unknown_to_poor_threshold"), aey0Var.b(0, 120, 15, "android-trafficapi-impl:request_bucketing_interval"), aey0Var.b(0, 100, 0, "android-trafficapi-impl:speed_test_sample_rate_percent"), aey0Var.b(0, 10000, 0, "android-trafficapi-impl:speed_test_url_variant"), aey0Var.c("android-trafficapi-impl:traffic_bucket_aggregation_v2_enabled", false), aey0Var.c("android-trafficapi-impl:traffic_stats_enabled", false), (luk) null);
            case 15:
                return new h55(aey0Var.c("android-transcript-endpoints-impl:clear_cache_on_trim_enabled", false), (luk) null);
            case 16:
                return new i55(aey0Var.c("android-transcript-link:enable_static_transcript", false), (luk) null);
            case 17:
                return new j55(aey0Var.c("android-transcript-read-along:enable_action_chips", false), aey0Var.c("android-transcript-read-along:enable_audio_language_translation", false), aey0Var.c("android-transcript-read-along:enable_translation", false), aey0Var.c("android-transcript-read-along:use_compose_page", false), null);
            case 18:
                return new k55(aey0Var.c("android-transcript-scroll-card:enable_transcript_translation", false), aey0Var.c("android-transcript-scroll-card:use_compose_transcript_list", false), null);
            case 19:
                return new l55(aey0Var.c("android-transcript-selection:enable_translation", false), aey0Var.c("android-transcript-selection:use_compose_page", false), null);
            case 20:
                return new m55(aey0Var.c("android-ubi-dwell-time-logger-impl:is_dwell_time_logging_disabled", false), (luk) null);
            case 21:
                return new n55(aey0Var.c("android-ubi-mainthreadassertion:enable_main_thread_assertion", false), (luk) null);
            case 22:
                return new o55(aey0Var.c("android-ubi-page-bound-ubi-logger:enable_logger_coroutine", false), aey0Var.c("android-ubi-page-bound-ubi-logger:enable_page_impression_logger_ai_playlist", false), aey0Var.c("android-ubi-page-bound-ubi-logger:enable_page_impression_logger_artist_page", false), aey0Var.c("android-ubi-page-bound-ubi-logger:enable_page_impression_logger_artist_releases_page", false), (luk) null);
            case 23:
                return new p55(aey0Var.b(900, 60000, 7200, "android-ubi-page-heartbeat:heartbeat_interval_seconds"), (luk) null, aey0Var.c("android-ubi-page-heartbeat:enable_heartbeat", false));
            case 24:
                return new q55(aey0Var.c("android-ubi-page-presentation:enable_page_presentation_tracking", false), (luk) null);
            case 25:
                return new r55(aey0Var.c("android-ubi-page-view-observer:preserve_resumed_overlay_activity", false), (luk) null);
            case 26:
                return new b65(aey0Var.c("android-uilogic:display_ad_element_v2_enabled", false), aey0Var.c("android-uilogic:enable_record_visible_events", false), aey0Var.c("android-uilogic:video_ad_element_v2_enabled", false), aey0Var.c("android-uilogic:video_brand_ads_auto_dismiss_enabled", false), (luk) null);
            case 27:
                return new e65(aey0Var.c("android-upsell-offer-flags:is_direct_to_checkout_enabled", false), aey0Var.c("android-upsell-offer-flags:is_offer_cta_enabled", false), (luk) null);
            case 28:
                return new p65(aey0Var.b(0, 100000, 3000, "android-usersnearby-discoveryreceiver-impl:received_tokens_eviction_interval_millis"), aey0Var.b(0, 100000, 6000, "android-usersnearby-discoveryreceiver-impl:received_tokens_ttl_millis"), (luk) null);
            default:
                return new r65(aey0Var.a("android-usersnearby-discoverysender-impl:accepted_ble_range", q65.b), aey0Var.b(1000, 3000, 3000, "android-usersnearby-discoverysender-impl:send_token_interval_millis"), (luk) null);
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
        r65 r65Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (k35) r65Var, k35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/playlistediting/history/properties/AndroidSystemPlaylistEditingHistoryProperties;", 0);
            case 1:
                return new tv30(1, (l35) r65Var, l35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/playliststats/properties/AndroidSystemPlayliststatsPropertiesProperties;", 0);
            case 2:
                return new tv30(1, (m35) r65Var, m35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemPreviewCardHeadingProperties;", 0);
            case 3:
                return new tv30(1, (n35) r65Var, n35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemPreviewcardElementTranscriptsImplProperties;", 0);
            case 4:
                return new tv30(1, (o35) r65Var, o35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/previewcard/previewcoordinator/impl/rc/AndroidSystemPreviewcardPreviewcoordinatorImplProperties;", 0);
            case 5:
                return new tv30(1, (s35) r65Var, s35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/sharedpreferencessizesampler/rc/AndroidSystemSharedPreferencesSizeSamplerProperties;", 0);
            case 6:
                return new tv30(1, (t35) r65Var, t35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidSystemSmartShuffleProperties;", 0);
            case 7:
                return new tv30(1, (u35) r65Var, u35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/sts/properties/AndroidSystemStsProperties;", 0);
            case 8:
                return new tv30(1, (v35) r65Var, v35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidTapOnboardingProperties;", 0);
            case 9:
                return new tv30(1, (w35) r65Var, w35.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/tasteprofile/tasteprofilepage/AndroidTasteprofilePageProperties;", 0);
            case 10:
                return new tv30(1, (r45) r65Var, r45.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidTheStageVtecProperties;", 0);
            case 11:
                return new tv30(1, (z45) r65Var, z45.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidTomePageApiProperties;", 0);
            case 12:
                return new tv30(1, (c55) r65Var, c55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/toolbar/properties/AndroidToolbarProperties;", 0);
            case 13:
                return new tv30(1, (e55) r65Var, e55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/track/contextmenuimpl/remoteconfig/AndroidTrackContextmenuimplProperties;", 0);
            case 14:
                return new tv30(1, (g55) r65Var, g55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/trafficimpl/AndroidTrafficapiImplProperties;", 0);
            case 15:
                return new tv30(1, (h55) r65Var, h55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/endpointsimpl/rc/AndroidTranscriptEndpointsImplProperties;", 0);
            case 16:
                return new tv30(1, (i55) r65Var, i55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/remoteconfig/AndroidTranscriptLinkProperties;", 0);
            case 17:
                return new tv30(1, (j55) r65Var, j55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/remoteconfig/AndroidTranscriptReadAlongProperties;", 0);
            case 18:
                return new tv30(1, (k55) r65Var, k55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/remoteconfig/AndroidTranscriptScrollCardProperties;", 0);
            case 19:
                return new tv30(1, (l55) r65Var, l55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/selectionpage/rc/AndroidTranscriptSelectionProperties;", 0);
            case 20:
                return new tv30(1, (m55) r65Var, m55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidUbiDwellTimeLoggerImplProperties;", 0);
            case 21:
                return new tv30(1, (n55) r65Var, n55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidUbiMainthreadassertionProperties;", 0);
            case 22:
                return new tv30(1, (o55) r65Var, o55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ubi/pageboundubilogger/AndroidUbiPageBoundUbiLoggerProperties;", 0);
            case 23:
                return new tv30(1, (p55) r65Var, p55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidUbiPageHeartbeatProperties;", 0);
            case 24:
                return new tv30(1, (q55) r65Var, q55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ubi/pageboundubilogger/AndroidUbiPagePresentationProperties;", 0);
            case 25:
                return new tv30(1, (r55) r65Var, r55.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ubi/pageviewobserver/rc/AndroidUbiPageViewObserverProperties;", 0);
            case 26:
                return new tv30(1, (b65) r65Var, b65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/uilogic/AndroidUilogicProperties;", 0);
            case 27:
                return new tv30(1, (e65) r65Var, e65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidUpsellOfferFlagsProperties;", 0);
            case 28:
                return new tv30(1, (p65) r65Var, p65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/usersnearby/discoveryreceiver/impl/rc/AndroidUsersnearbyDiscoveryreceiverImplProperties;", 0);
            default:
                return new tv30(1, r65Var, r65.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/usersnearby/discoverysender/impl/rc/AndroidUsersnearbyDiscoverysenderImplProperties;", 0);
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
