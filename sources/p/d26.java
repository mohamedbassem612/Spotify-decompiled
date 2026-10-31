package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class d26 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ d26(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new e26(aey0Var.c("apps-music-features-widget:material_you_enabled", false), aey0Var.c("apps-music-features-widget:promote_new_widget", false), (luk) null);
            case 1:
                return new f26(aey0Var.c("apps-music-features-widget:widget_enabled", true), null);
            case 2:
                return new g26(aey0Var.c("apps-music-libs-canvas:canvas_enabled", true), aey0Var.c("apps-music-libs-canvas:canvas_on_tablets_enabled", false), aey0Var.c("apps-music-libs-canvas:canvas_on_tablets_landscape_enabled", false), aey0Var.c("apps-music-libs-canvas:canvas_on_tablets_portrait_enabled", false), aey0Var.c("apps-music-libs-canvas:dim_canvas_on_mixing_transition", false), aey0Var.c("apps-music-libs-canvas:explicit_canvas_enabled", false), aey0Var.c("apps-music-libs-canvas:gate_canvas_surface_on_first_frame", false), aey0Var.c("apps-music-libs-canvas:pause_offscreen_canvas_playback_enabled", false), aey0Var.c("apps-music-libs-canvas:scope_canvas_holders_to_mode_page", true), aey0Var.c("apps-music-libs-canvas:stable_canvas_backdrop", false), aey0Var.c("apps-music-libs-canvas:use_multiplayer_for_canvas_video", false), (luk) null);
            case 3:
                return new m26(aey0Var.c("apps-music-libs-eventsender:background_worker_send", false), aey0Var.c("apps-music-libs-eventsender:background_worker_send_on_stop", false), aey0Var.c("apps-music-libs-eventsender:enable_rate_limiter", false), aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:event_sending_interval_seconds"), aey0Var.b(0, 43200, 0, "apps-music-libs-eventsender:heartbeat_interval"), aey0Var.b(0, 3600, 30, "apps-music-libs-eventsender:heartbeat_retry_interval"), aey0Var.b(10000, 512000, 128000, "apps-music-libs-eventsender:max_batch_bytes"), aey0Var.b(1, 1000, 100, "apps-music-libs-eventsender:max_batch_size"), aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_events_per_time_unit"), aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_time_unit_seconds"), aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_events_per_time_unit"), aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_time_unit_seconds"), aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_events_per_time_unit"), aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_time_unit_seconds"), aey0Var.c("apps-music-libs-eventsender:retry_db_operations", false), aey0Var.c("apps-music-libs-eventsender:send_events_on_bcd_event", false), aey0Var.c("apps-music-libs-eventsender:send_full_ess2", true), (tgp0) null, (luk) null);
            case 4:
                return new kpb(aey0Var.c("boombox-settings:enable_otfn", false), (luk) null);
            case 5:
                return new ufc(aey0Var.c("byom-flags:ducking_enabled", false), (luk) null);
            case 6:
                return new f3h(aey0Var.c("collection-downloaded:filter_book_chapters_enabled", true), (luk) null);
            case 7:
                return new ujh(aey0Var.b(0, 1440, 60, "comments-data-impl:card_cache_ttl_minutes"), (luk) null);
            case 8:
                return new wjh(aey0Var.b(100, 10000, 5000, "comments-data:passthrough_timestamp_mapping_timeout_ms"), (luk) null, aey0Var.c("comments-data:enable_timestamps_for_episodes", false), aey0Var.c("comments-data:enable_timestamps_for_passthrough_episodes", false));
            case 9:
                return new aqh(aey0Var.c("comments-sheet:enable_comments_deep_linking", false), (luk) null);
            case 10:
                return new kqh(aey0Var.c("comments-widget:enable_comments_npv_widget", false), (luk) null);
            case 11:
                return new ynk((xnk) aey0Var.a("concert-friend-matcher:concert_friends_entrypoint_type", xnk.SHARE), null);
            case 12:
                return new e5n(aey0Var.c("core-full-session-service-music:enable_anr_shutdown_watchdog", false), (luk) null);
            case 13:
                return new w7r(aey0Var.c("daylist-playlist:daylist_snapshot_enabled", true), aey0Var.c("daylist-playlist:is_description_plugin_enabled", true), aey0Var.c("daylist-playlist:is_discover_section_plugin_enabled", true), aey0Var.c("daylist-playlist:is_metadata_plugin_enabled", true), aey0Var.c("daylist-playlist:is_pretitle_plugin_enabled", true), aey0Var.c("daylist-playlist:is_share_header_action_plugin_enabled", true), aey0Var.c("daylist-playlist:share_on_screenshot_enabled", true), null);
            case 14:
                return new l8r(aey0Var.a("debug-feature:unauth_color", k8r.b), (xz11) null);
            case 15:
                return new cgx(aey0Var.c("encore-consumer-mobile:monitoring_plugin_enabled", false), (luk) null);
            case 16:
                return new gfz(aey0Var.c("equalizer:always_use_equalizer", false), aey0Var.c("equalizer:enable_equalizer", true), (luk) null);
            case 17:
                return new ms00(aey0Var.c("explicitfeedback:is_not_interested_followup_enabled", false), aey0Var.c("explicitfeedback:is_not_interested_on_shelves_enabled", false), aey0Var.c("explicitfeedback:is_trigger_enabled", false), (luk) null);
            case 18:
                return new m020(aey0Var.c("fetch-settings:enable_offline_listening_toggle", false), (luk) null);
            case 19:
                return new t7f0(aey0Var.c("lossless-bulk-redownloads:enabled", false), (luk) null);
            case 20:
                return new l9f0(aey0Var.b(0, 100, 2, "lossless-remote-device-message-box:maximum_shows_per_device"), null, aey0Var.c("lossless-remote-device-message-box:is_enabled", false));
            case 21:
                return new x9f0(aey0Var.c("lossless-streaming:use_unboxing_onboarding_tour", false), (luk) null);
            case 22:
                return new abf0(aey0Var.c("lossless-troubleshooting:lossless_24_bit_unavailable_card_enabled", false), null);
            case 23:
                return new atg0(aey0Var.c("markasplayedpage:use_show_esperanto_endpoint", false), (luk) null);
            case 24:
                return new dai0(aey0Var.c("mediarouterx-flags:skip_remove_on_transition", false), (luk) null);
            case 25:
                return new q3n0(aey0Var.a("music-libs-pageloader-for-music:page_loader_scope_policy", p3n0.b), aey0Var.c("music-libs-pageloader-for-music:reset_load_state", false), (luk) null);
            case 26:
                return new x3n0(aey0Var.c("music-libs-video:unified_subtitles_selection_enabled", false), (luk) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new y3n0(aey0Var.c("music-libs-video:live_video_internal_enabled", false), (luk) null);
            case 28:
                return new z3n0(aey0Var.c("music-libs-video:adaptive_caching_enabled", false), aey0Var.c("music-libs-video:adaptive_track_selector_v2_enabled", false), aey0Var.c("music-libs-video:adaptive_video_quality_less_or_equal_to_size_in_feeds_enabled", false), aey0Var.a("music-libs-video:av1_decoding_enabled", r3n0.b), aey0Var.b(-1, 100, -1, "music-libs-video:av1_priority"), aey0Var.c("music-libs-video:av1_software_decoding_allowed", false), aey0Var.b(0, 60000, 0, "music-libs-video:back_buffer_size"), aey0Var.b(1, 8, 4, "music-libs-video:batch_image_transcode_max_concurrent"), aey0Var.b(1, 8, 2, "music-libs-video:batch_video_transcode_max_concurrent"), aey0Var.a("music-libs-video:boombox_audiosink", s3n0.b), aey0Var.a("music-libs-video:boombox_audiosink_jni", t3n0.b), aey0Var.b(500, 10000, AudioEpisode.SHOW_URI_FIELD_NUMBER, "music-libs-video:buffer_for_playback_after_rebuffer_ms"), aey0Var.c("music-libs-video:buffer_reevaluations_forwarded_to_chunk_sources_enabled", true), aey0Var.c("music-libs-video:canonical_segment_cache_key_enabled", false), aey0Var.c("music-libs-video:codec_priority_enabled", false), aey0Var.c("music-libs-video:disable_video_on_seek_enabled", false), aey0Var.c("music-libs-video:downcast_multi_key_manifests_to_single_key", false), aey0Var.c("music-libs-video:drm_recordability_alignment_enabled", false), aey0Var.b(0, 60000, 60000, "music-libs-video:dynamic_buffering_history_max_age_ms"), aey0Var.b(0, 2500, 2500, "music-libs-video:dynamic_buffering_max_startup_buffer_ms"), aey0Var.c("music-libs-video:edit_list_trim_enabled", true), aey0Var.c("music-libs-video:encoded_segment_url_query_enabled", true), aey0Var.c("music-libs-video:event_based_reporting_enabled", false), aey0Var.c("music-libs-video:exo_background_thread_enabled", false), aey0Var.c("music-libs-video:exo_dispatcher_player_enabled", false), aey0Var.c("music-libs-video:exoplayer_subtitle_view_styling_enabled", false), aey0Var.c("music-libs-video:feature_type_enabled", true), aey0Var.b(0, 60000, 5000, "music-libs-video:feed_audio_buffer_size"), aey0Var.b(0, 60000, 8000, "music-libs-video:feed_video_buffer_size"), aey0Var.b(250, 3000, 1500, "music-libs-video:feeds_playback_start_buffer_size"), aey0Var.c("music-libs-video:fetch_batched_segment_cache_check_enabled", false), aey0Var.c("music-libs-video:fetch_transfer_cache_check_enabled", false), aey0Var.b(-1, 100, 1, "music-libs-video:h264_priority"), aey0Var.a("music-libs-video:h265_decoding_enabled", u3n0.b), aey0Var.b(-1, 100, -1, "music-libs-video:h265_priority"), aey0Var.c("music-libs-video:h265_software_decoding_allowed", false), aey0Var.c("music-libs-video:hls_manifest_cache_bypass_enabled", true), aey0Var.c("music-libs-video:http_cache_enabled", true), aey0Var.c("music-libs-video:kill_switch_enabled", false), aey0Var.c("music-libs-video:media_processor_core_optimization_enabled", false), aey0Var.a("music-libs-video:media_processor_enabled", v3n0.b), aey0Var.c("music-libs-video:offline_broken_manifest_discarding_enabled", false), aey0Var.c("music-libs-video:offline_media_processor_enabled", false), aey0Var.c("music-libs-video:offline_metadata_track_selection_disabled", true), aey0Var.c("music-libs-video:on_track_selected_custom_logic_enabled", false), aey0Var.c("music-libs-video:prefer_av1_for_offlining_enabled", false), aey0Var.c("music-libs-video:prefer_cached_segments_enabled", false), aey0Var.b(0, 120, 5, "music-libs-video:seconds_to_wait_on_video_reenable_before_stall"), aey0Var.c("music-libs-video:seek_frames_enabled", false), aey0Var.a("music-libs-video:seeking_frames_prefetching_strategy", w3n0.b), aey0Var.c("music-libs-video:seeking_thumbnail_reduce_image_quality", false), aey0Var.b(1, 60000, 30000, "music-libs-video:short_form_content_size_limit"), aey0Var.c("music-libs-video:short_form_content_size_limit_enabled", false), aey0Var.b(0, 60000, 4000, "music-libs-video:shorter_initial_buffer_duration"), aey0Var.c("music-libs-video:shorter_initial_buffer_enabled", false), aey0Var.b(1000, 60000, 1000, "music-libs-video:shorter_initial_buffer_size"), aey0Var.c("music-libs-video:spotify_video_hls_enabled", false), aey0Var.b(250, 3000, 1500, "music-libs-video:standalone_playback_start_buffer_size"), aey0Var.b(1500, 60000, 20000, "music-libs-video:standalone_video_buffer_size"), aey0Var.c("music-libs-video:subtitles_enabled", true), aey0Var.c("music-libs-video:suppress_callbacks_after_playback_ended_enabled", false), aey0Var.c("music-libs-video:surface_visibility_tracking_enabled", false), aey0Var.c("music-libs-video:time_keeper_enabled", true), aey0Var.b(1, 250, 1, "music-libs-video:timekeeper_sampling_rate"), aey0Var.c("music-libs-video:use_hardware_accelerated_audio_processing", false), aey0Var.c("music-libs-video:use_lazy_resolution_switch", false), aey0Var.c("music-libs-video:use_surface_view", false), aey0Var.c("music-libs-video:video_bandwidth_seed_enabled", false), aey0Var.c("music-libs-video:video_decoder_fallback_enabled", false), aey0Var.c("music-libs-video:vp9_filtering_enabled", false), aey0Var.b(-1, 100, -1, "music-libs-video:vp9_priority"), (luk) null);
            default:
                return new b4n0(aey0Var.c("music-navigation:coroutine_command_queue_enabled", true), aey0Var.c("music-navigation:enable_async_fragment_commits", false), aey0Var.c("music-navigation:enable_overlay_animations", true), aey0Var.c("music-navigation:nav_events_enabled", false), (luk) null);
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
        b4n0 b4n0Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (e26) b4n0Var, e26.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AppsMusicFeaturesWidgetProperties;", 0);
            case 1:
                return new tv30(1, (f26) b4n0Var, f26.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AppsMusicFeaturesWidgetUnauthProperties;", 0);
            case 2:
                return new tv30(1, (g26) b4n0Var, g26.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AppsMusicLibsCanvasProperties;", 0);
            case 3:
                return new tv30(1, (m26) b4n0Var, m26.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AppsMusicLibsEventsenderProperties;", 0);
            case 4:
                return new tv30(1, (kpb) b4n0Var, kpb.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/boombox/settings/dynamicnormalizer/impl/BoomboxSettingsProperties;", 0);
            case 5:
                return new tv30(1, (ufc) b4n0Var, ufc.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/byom/volumeimpl/ByomFlagsProperties;", 0);
            case 6:
                return new tv30(1, (f3h) b4n0Var, f3h.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/collection/downloaded/CollectionDownloadedProperties;", 0);
            case 7:
                return new tv30(1, (ujh) b4n0Var, ujh.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastinteractivity/commentsdataimpl/CommentsDataImplProperties;", 0);
            case 8:
                return new tv30(1, (wjh) b4n0Var, wjh.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastinteractivity/commentsdata/CommentsDataProperties;", 0);
            case 9:
                return new tv30(1, (aqh) b4n0Var, aqh.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastinteractivity/commentssheetimpl/CommentsSheetProperties;", 0);
            case 10:
                return new tv30(1, (kqh) b4n0Var, kqh.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/podcastinteractivity/commentsdataloader/CommentsWidgetProperties;", 0);
            case 11:
                return new tv30(1, (ynk) b4n0Var, ynk.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/ConcertFriendMatcherProperties;", 0);
            case 12:
                return new tv30(1, (e5n) b4n0Var, e5n.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/core/corefullsessionservice/CoreFullSessionServiceMusicProperties;", 0);
            case 13:
                return new tv30(1, (w7r) b4n0Var, w7r.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/daylist/playlist/DaylistPlaylistProperties;", 0);
            case 14:
                return new tv30(1, (l8r) b4n0Var, l8r.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/debugfeature/DebugFeatureUnauthProperties;", 0);
            case 15:
                return new tv30(1, (cgx) b4n0Var, cgx.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/encoreconsumermobile/monitoringpluginimpl/EncoreConsumerMobileProperties;", 0);
            case 16:
                return new tv30(1, (gfz) b4n0Var, gfz.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/equalizer/navigationimpl/EqualizerProperties;", 0);
            case 17:
                return new tv30(1, (ms00) b4n0Var, ms00.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/home/explicitfeedbackimpl/ExplicitfeedbackProperties;", 0);
            case 18:
                return new tv30(1, (m020) b4n0Var, m020.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/FetchSettingsProperties;", 0);
            case 19:
                return new tv30(1, (t7f0) b4n0Var, t7f0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/LosslessBulkRedownloadsProperties;", 0);
            case 20:
                return new tv30(1, (l9f0) b4n0Var, l9f0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/LosslessRemoteDeviceMessageBoxProperties;", 0);
            case 21:
                return new tv30(1, (x9f0) b4n0Var, x9f0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/LosslessStreamingProperties;", 0);
            case 22:
                return new tv30(1, (abf0) b4n0Var, abf0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/LosslessTroubleshootingProperties;", 0);
            case 23:
                return new tv30(1, (atg0) b4n0Var, atg0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/markasplayed/markasplayedpage/MarkasplayedpageProperties;", 0);
            case 24:
                return new tv30(1, (dai0) b4n0Var, dai0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/MediarouterxFlagsProperties;", 0);
            case 25:
                return new tv30(1, (q3n0) b4n0Var, q3n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/MusicLibsPageloaderForMusicProperties;", 0);
            case 26:
                return new tv30(1, (x3n0) b4n0Var, x3n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/betamax/subtitlesimpl/rc/MusicLibsVideoProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (y3n0) b4n0Var, y3n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/music/libs/video/live/MusicLibsVideoProperties;", 0);
            case 28:
                return new tv30(1, (z3n0) b4n0Var, z3n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/betamax/playerproperties/MusicLibsVideoProperties;", 0);
            default:
                return new tv30(1, b4n0Var, b4n0.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/MusicNavigationProperties;", 0);
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
