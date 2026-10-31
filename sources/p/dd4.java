package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class dd4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ dd4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new ed4(aey0Var.c("android-device-predictability:enable_debug_source_icon", false), (luk) null);
            case 1:
                return new fd4(aey0Var.b(0, 2000, 0, "android-device-predictability-surfaces-smartcontrolnudge:container_ready_timeout_ms"), (luk) null);
            case 2:
                return new jd4(aey0Var.b(0, 10000, 500, "android-device-suggestion-provider:device_stabilization_debounce_ms"), aey0Var.c("android-device-suggestion-provider:enable_mobius_loop", false), aey0Var.c("android-device-suggestion-provider:enable_proactive_ml_requests", false), aey0Var.b(1000, 60000, 20000, "android-device-suggestion-provider:explicit_request_device_wait_timeout_ms"), aey0Var.b(0, 86400000, 300000, "android-device-suggestion-provider:external_audio_output_temporary_hiding_duration_ms"), aey0Var.a("android-device-suggestion-provider:ml_based_device_suggestion_source", id4.c), aey0Var.b(0, 10000, 500, "android-device-suggestion-provider:ml_request_debounce_window_ms"), aey0Var.b(0, 86400000, 60000, "android-device-suggestion-provider:ml_request_throttle_window_ms"), aey0Var.b(0, 86400000, 300000, "android-device-suggestion-provider:moved_away_from_device_temporary_hiding_duration_ms"), aey0Var.b(0, 86400000, 300000, "android-device-suggestion-provider:non_suggested_other_device_temporary_hiding_duration_ms"), (luk) null);
            case 3:
                return new kd4(aey0Var.c("android-devicelocation-consent-impl:settings_enabled", false), (luk) null);
            case 4:
                return new md4(aey0Var.a("android-devicelocation-locationrefresh:foreground_refresh_frequency", ld4.b), (luk) null);
            case 5:
                return new nd4(aey0Var.c("android-deviceproxy-registrar:registration_enabled", false), null);
            case 6:
                return new vd4(aey0Var.c("android-djcard-flags:beta_badge_enabled", true), (luk) null);
            case 7:
                return new de4(aey0Var.c("android-editorprofile-remoteconfiguration:editor_profile_enabled", false), (luk) null);
            case 8:
                return new ge4(aey0Var.c("android-embeddedadplaylist:ad_auto_dismiss", true), aey0Var.a("android-embeddedadplaylist:embedded_ad_placement", ee4.b), aey0Var.a("android-embeddedadplaylist:embedded_ad_within_tracklist_placement", fe4.b), aey0Var.c("android-embeddedadplaylist:filter_albums", false), aey0Var.b(0, 9999999, 5000, "android-embeddedadplaylist:playlist_leavebehind_fetch_deadline"), aey0Var.c("android-embeddedadplaylist:prioritize_embeddedad", false), aey0Var.c("android-embeddedadplaylist:skip_sponsored_playlist_ad_refetch", false), aey0Var.c("android-embeddedadplaylist:unified_leavebehind_episode_page_enabled", false), aey0Var.c("android-embeddedadplaylist:unified_leavebehind_show_page_enabled", false), aey0Var.c("android-embeddedadplaylist:use_unified_leavebehind_fetch", false), aey0Var.c("android-embeddedadplaylist:use_video_ad_element_v2", false), (luk) null);
            case 9:
                return new ie4(aey0Var.a("android-endless-sillywalk-commentaryplayerimpl:player_implementation", he4.b), (luk) null);
            case 10:
                return new je4(aey0Var.c("android-engagesdk-engagecontinuationcluster:enable_continuation_cluster", false), aey0Var.c("android-engagesdk-engagecontinuationcluster:observe_recently_played", false), aey0Var.c("android-engagesdk-engagecontinuationcluster:schedule_on_start", false), (luk) null);
            case 11:
                return new ke4(aey0Var.b(1, 24, 12, "android-engagesdk-engagerecommendationscluster:publish_cadence_hours"), (luk) null, aey0Var.c("android-engagesdk-engagerecommendationscluster:enable_recommendations_cluster", false), aey0Var.c("android-engagesdk-engagerecommendationscluster:schedule_on_start", false));
            case 12:
                return new le4(aey0Var.c("android-engagesdk-engagesigninrequest:enable_signin_request", false), (xz11) null);
            case 13:
                return new me4(aey0Var.c("android-entity-segments:audiobook_clips_enabled", false), aey0Var.c("android-entity-segments:canonical_timeline_enabled", false), aey0Var.c("android-entity-segments:clip_detail_sections_via_list_endpoint_enabled", false), aey0Var.c("android-entity-segments:clip_notes_enabled", false), aey0Var.c("android-entity-segments:enable_chapter_aware_episode_rows", false), aey0Var.c("android-entity-segments:enable_content_experience_trait_on_entity_page", false), aey0Var.c("android-entity-segments:enable_track_uris_for_episode_rows", false), aey0Var.c("android-entity-segments:is_clip_editing_enabled", false), aey0Var.c("android-entity-segments:music_clips_enabled", false), (luk) null);
            case 14:
                return new oe4(aey0Var.a("android-entitypages-shuffleonfreeimpl:experiment", ne4.b), aey0Var.c("android-entitypages-shuffleonfreeimpl:smart_shuffle_hide_new_badge_on_premium_when_upsell_was_seen_on_free", false), (luk) null);
            case 15:
                return new qe4(aey0Var.c("android-episode-page-cwppagetemplate:use_share_data_element", false), null);
            case 16:
                return new re4(aey0Var.c("android-episode-player:enable_autoplay_restriction_from_show", false), aey0Var.c("android-episode-player:use_show_esperanto_endpoint", false), null);
            case 17:
                return new ue4(aey0Var.c("android-external-integration-loaders:show_locked_audiobook_strings_enabled", true), aey0Var.c("android-external-integration-loaders:use_episode_access_for_paywall_filtering", false), aey0Var.c("android-external-integration-loaders:use_kotlin_list_loader", false), (luk) null);
            case 18:
                return new ve4(aey0Var.c("android-external-integration-service:allow_widget_providers_media_provider_access", true), (luk) null);
            case 19:
                return new we4(aey0Var.c("android-external-integration-service:allow_cdn_domain_access", false), (xz11) null);
            case 20:
                return new xe4(aey0Var.b(0, 100, 16, "android-feature-age-verification:social_age_threshold"), (luk) null, aey0Var.c("android-feature-age-verification:is_age_assurance_reroute_enabled", false));
            case 21:
                return new ye4(aey0Var.c("android-feature-age-verification:app_launch_dialog_enabled", false), aey0Var.c("android-feature-age-verification:blocking_host_page_enabled", false), aey0Var.c("android-feature-age-verification:episode_play_command_interceptor_enabled", false), aey0Var.c("android-feature-age-verification:ignore_product_state_for_entry_points", false), aey0Var.c("android-feature-age-verification:request_parental_consent_button_enabled", false), aey0Var.c("android-feature-age-verification:settings_note_enabled", false), aey0Var.c("android-feature-age-verification:side_drawer_entry_point_enabled", false), aey0Var.c("android-feature-age-verification:unmapped_music_video_play_command_interceptor_enabled", false), (luk) null);
            case 22:
                return new ze4(aey0Var.c("android-feature-agent-row:enable_ai_attribution", false), null);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new bf4(aey0Var.c("android-feature-ai-playlist-configuration:create_menu_entry_point_enabled", true), aey0Var.c("android-feature-ai-playlist-configuration:instant_playlist_copy_enabled", false), aey0Var.c("android-feature-ai-playlist-configuration:show_beta_tag", true), (luk) null);
            case 24:
                return new cf4(aey0Var.c("android-feature-album-context-menu:use_visual_identity_trait", false), null);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new df4(aey0Var.c("android-feature-album-page:age_assurance_permission_enabled", false), aey0Var.c("android-feature-album-page:context_menu_in_toolbar_trailing_action", false), aey0Var.c("android-feature-album-page:enable_omni_play_button", false), aey0Var.c("android-feature-album-page:preload_watch_feed_cdp", false), aey0Var.c("android-feature-album-page:prerelease_in_cwp_enabled", false), aey0Var.b(0, 3000, 500, "android-feature-album-page:redirect_to_cdp_timeout"), aey0Var.c("android-feature-album-page:share_in_action_row_enabled", false), aey0Var.c("android-feature-album-page:should_use_compose_encore_list_row", false), aey0Var.c("android-feature-album-page:use_curation_state_api_for_banned_state", false), aey0Var.c("android-feature-album-page:use_kodiak_release_row", false), aey0Var.c("android-feature-album-page:use_mdc_carousel", false), (luk) null);
            case 26:
                return new ef4(aey0Var.c("android-feature-audiobook-pre-release:context_menu_in_toolbar_trailing_action", false), aey0Var.c("android-feature-audiobook-pre-release:is_permission_dialog_on_presave_enabled", false), aey0Var.c("android-feature-audiobook-pre-release:should_display_watchfeed_entrypoint", false), (luk) null);
            case 27:
                return new ff4(aey0Var.c("android-feature-blend-invitation:group_blends_enabled", true), null);
            case 28:
                return new gf4(aey0Var.c("android-feature-blend-members:group_blends_enabled", true), (luk) null);
            default:
                return new hf4(aey0Var.c("android-feature-blend-taste-match:data_stories_enabled", true), aey0Var.c("android-feature-blend-taste-match:group_blends_enabled", true), (luk) null);
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
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 24:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
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
        hf4 hf4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (ed4) hf4Var, ed4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/devicepredictability/internal/surfaces/bottomsheet/rc/AndroidDevicePredictabilityProperties;", 0);
            case 1:
                return new tv30(1, (fd4) hf4Var, fd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/devicepredictability/internal/surfaces/smartcontrolnudge/rc/AndroidDevicePredictabilitySurfacesSmartcontrolnudgeProperties;", 0);
            case 2:
                return new tv30(1, (jd4) hf4Var, jd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/devicesuggestionprovider/AndroidDeviceSuggestionProviderProperties;", 0);
            case 3:
                return new tv30(1, (kd4) hf4Var, kd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDevicelocationConsentImplProperties;", 0);
            case 4:
                return new tv30(1, (md4) hf4Var, md4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDevicelocationLocationrefreshProperties;", 0);
            case 5:
                return new tv30(1, (nd4) hf4Var, nd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDeviceproxyRegistrarProperties;", 0);
            case 6:
                return new tv30(1, (vd4) hf4Var, vd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDjcardFlagsProperties;", 0);
            case 7:
                return new tv30(1, (de4) hf4Var, de4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEditorprofileRemoteconfigurationProperties;", 0);
            case 8:
                return new tv30(1, (ge4) hf4Var, ge4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEmbeddedadplaylistProperties;", 0);
            case 9:
                return new tv30(1, (ie4) hf4Var, ie4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEndlessSillywalkCommentaryplayerimplProperties;", 0);
            case 10:
                return new tv30(1, (je4) hf4Var, je4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEngagesdkEngagecontinuationclusterProperties;", 0);
            case 11:
                return new tv30(1, (ke4) hf4Var, ke4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEngagesdkEngagerecommendationsclusterProperties;", 0);
            case 12:
                return new tv30(1, (le4) hf4Var, le4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEngagesdkEngagesigninrequestUnauthProperties;", 0);
            case 13:
                return new tv30(1, (me4) hf4Var, me4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEntitySegmentsProperties;", 0);
            case 14:
                return new tv30(1, (oe4) hf4Var, oe4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/entitypages/shuffleonfreeimpl/AndroidEntitypagesShuffleonfreeimplProperties;", 0);
            case 15:
                return new tv30(1, (qe4) hf4Var, qe4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/episodepage/cwppagetemplate/rc/AndroidEpisodePageCwppagetemplateProperties;", 0);
            case 16:
                return new tv30(1, (re4) hf4Var, re4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidEpisodePlayerProperties;", 0);
            case 17:
                return new tv30(1, (ue4) hf4Var, ue4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidExternalIntegrationLoadersProperties;", 0);
            case 18:
                return new tv30(1, (ve4) hf4Var, ve4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/externalintegration/service/AndroidExternalIntegrationServiceProperties;", 0);
            case 19:
                return new tv30(1, (we4) hf4Var, we4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/externalintegration/service/AndroidExternalIntegrationServiceUnauthProperties;", 0);
            case 20:
                return new tv30(1, (xe4) hf4Var, xe4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/campfire/ageassurance/impl/AndroidFeatureAgeVerificationProperties;", 0);
            case 21:
                return new tv30(1, (ye4) hf4Var, ye4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ageverification/properties/AndroidFeatureAgeVerificationProperties;", 0);
            case 22:
                return new tv30(1, (ze4) hf4Var, ze4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureAgentRowProperties;", 0);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new tv30(1, (bf4) hf4Var, bf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/aiplaylist/properties/AndroidFeatureAiPlaylistConfigurationProperties;", 0);
            case 24:
                return new tv30(1, (cf4) hf4Var, cf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureAlbumContextMenuProperties;", 0);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new tv30(1, (df4) hf4Var, df4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureAlbumPageProperties;", 0);
            case 26:
                return new tv30(1, (ef4) hf4Var, ef4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureAudiobookPreReleaseProperties;", 0);
            case 27:
                return new tv30(1, (ff4) hf4Var, ff4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBlendInvitationProperties;", 0);
            case 28:
                return new tv30(1, (gf4) hf4Var, gf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBlendMembersProperties;", 0);
            default:
                return new tv30(1, hf4Var, hf4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureBlendTasteMatchProperties;", 0);
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
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
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
