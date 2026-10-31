package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class pi4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ pi4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new qi4(aey0Var.c("android-feature-transcript-companion-content:enable_media_session", false), aey0Var.c("android-feature-transcript-companion-content:enable_player_transformer", false), (luk) null);
            case 1:
                return new ri4(aey0Var.c("android-feature-transcript-npv:enable_external_link", false), aey0Var.c("android-feature-transcript-npv:enable_passthrough", false), aey0Var.c("android-feature-transcript-npv:enable_transcript_npv", false), aey0Var.c("android-feature-transcript-npv:enable_translation", false), (luk) null);
            case 2:
                return new si4(aey0Var.c("android-feature-unboxing-availability-impl:campaign_enabled", true), aey0Var.c("android-feature-unboxing-availability-impl:marques_icon_enabled", true), aey0Var.c("android-feature-unboxing-availability-impl:premium_entry_banner", false), aey0Var.c("android-feature-unboxing-availability-impl:premium_entry_modal", false), (luk) null);
            case 3:
                return new ti4(aey0Var.c("android-feature-unboxing-hub-impl:enable_multi_pane", false), (luk) null);
            case 4:
                return new ui4(aey0Var.c("android-feature-unboxing-hub:auto_open_on_first_eligible", false), (luk) null);
            case 5:
                return new wi4(aey0Var.c("android-feature-upcoming-releases-hub:is_page_enabled", false), aey0Var.a("android-feature-upcoming-releases-hub:prerelease_card_presave_content", vi4.b), (luk) null);
            case 6:
                return new yi4(aey0Var.a("android-feature-version-sunsetting:data_source_behavior", xi4.b), aey0Var.c("android-feature-version-sunsetting:dialog_can_be_blocking", true), aey0Var.c("android-feature-version-sunsetting:dialog_enabled", false), aey0Var.c("android-feature-version-sunsetting:player_observer_enabled", false), (luk) null);
            case 7:
                return new aj4(aey0Var.c("android-feature-video:adaptive_buffering_enabled", false), aey0Var.c("android-feature-video:core_fetch_data_source_enabled", true), aey0Var.c("android-feature-video:core_fetch_data_source_enabled_for_audio_browse", false), aey0Var.c("android-feature-video:core_fetch_data_source_enabled_for_canvas", false), aey0Var.c("android-feature-video:core_fetch_data_source_enabled_for_watch_feed", false), aey0Var.a("android-feature-video:core_segmented_fetch_data_source_enabled", zi4.b), aey0Var.c("android-feature-video:playback_trait_offline_enabled", false), aey0Var.c("android-feature-video:release_all_players_on_shutdown", false), aey0Var.b(0, 4000000, 640000, "android-feature-video:video_ad_target_bitrate"), aey0Var.b(200000, 3000000, 800000, "android-feature-video:video_download_bitrate"), aey0Var.b(0, 2160, 0, "android-feature-video:video_download_max_resolution"), aey0Var.b(0, 3650, 30, "android-feature-video:video_offline_license_redownload_threshold_days"), aey0Var.c("android-feature-video:video_sai_enabled", false), (luk) null);
            case 8:
                return new bj4(aey0Var.c("android-feature-voice-assistant:disable_loading_content", false), (luk) null);
            case 9:
                return fj4.e(aey0Var);
            case 10:
                return new hj4(aey0Var.a("android-fitness-settings-page:pace_zones_variant", gj4.b), (luk) null);
            case 11:
                return new uj4(aey0Var.c("android-free-day-employee:explanation_banner_enabled", false), (luk) null);
            case 12:
                return new vj4(aey0Var.c("android-freetier-experiments:should_show_premium_badge", false), (luk) null);
            case 13:
                return new wj4(aey0Var.c("android-gated-content-flags:enable_play_full_song_context_menu_item", false), (luk) null);
            case 14:
                return new bk4(aey0Var.c("android-gen-alpha-account-creation:child_email_collection_enabled", false), aey0Var.c("android-gen-alpha-account-creation:child_login_options_page_enabled", false), aey0Var.c("android-gen-alpha-account-creation:enable_compose", false), aey0Var.c("android-gen-alpha-account-creation:invite_members_parental_consent_flow_enabled", false), aey0Var.c("android-gen-alpha-account-creation:is_member_details_parent_consent_flow_enabled", false), aey0Var.c("android-gen-alpha-account-creation:parent_initiated_link_enabled", false), aey0Var.c("android-gen-alpha-account-creation:parental_consent_flow_enabled", false), aey0Var.c("android-gen-alpha-account-creation:parental_controls_transition_entry_point_enabled", false), aey0Var.c("android-gen-alpha-account-creation:teen_initiated_link_enabled", false), aey0Var.c("android-gen-alpha-account-creation:teen_link_enabled", false), (tgp0) null, (luk) null);
            case 15:
                return ek4.j(aey0Var);
            case 16:
                return new hk4(aey0Var.c("android-gen-alpha:enable_login_qr_code_url_decoration", false), aey0Var.c("android-gen-alpha:fma_upgrade_dialog_enabled", false), aey0Var.c("android-gen-alpha:is_graduation_banner_in_notifications_section_enabled", false), aey0Var.c("android-gen-alpha:is_managed_account_details_v2_page_enabled", false), aey0Var.c("android-gen-alpha:is_managed_teen_account_parent_controls_enabled", false), aey0Var.c("android-gen-alpha:is_teen_graduation_enabled", false), aey0Var.c("android-gen-alpha:parent_details_enabled", false), aey0Var.c("android-gen-alpha:use_kids_view_get_children", false), (tgp0) null, (luk) null);
            case 17:
                return new jk4(aey0Var.c("android-genalpha-limitedexperienceindicator:enabled", false), (tgp0) null, (luk) null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new kk4(aey0Var.c("android-genui-chromeless:bridge_collection_enabled", true), aey0Var.c("android-genui-chromeless:bridge_location_enabled", true), aey0Var.c("android-genui-chromeless:bridge_navigation_enabled", true), aey0Var.c("android-genui-chromeless:bridge_playback_enabled", true), aey0Var.c("android-genui-chromeless:bridge_video_playback_enabled", true), aey0Var.c("android-genui-chromeless:is_enabled", true), (luk) null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new mk4(aey0Var.b(0, 30000, 10000, "android-google-device-suggestions:coroutine_timeout_period_ms"), aey0Var.c("android-google-device-suggestions:enable_feature", false), aey0Var.c("android-google-device-suggestions:enable_google_device_suggestions_source", false), aey0Var.a("android-google-device-suggestions:minimum_displayable_confidence_score", lk4.b), aey0Var.b(0, 600000, 10000, "android-google-device-suggestions:suggestion_cache_ttl_ms"), aey0Var.b(0, 50000, 2000, "android-google-device-suggestions:suggestion_request_timeout_ms"), aey0Var.c("android-google-device-suggestions:use_spotify_device_suggestion_as_fallback", false), (luk) null);
            case 20:
                return new rk4(aey0Var.c("android-homeia-settings:kids_family_exclude_visible", false), aey0Var.c("android-homeia-settings:managed_account_prompt_enabled", false), (luk) null);
            case 21:
                return new zk4(aey0Var.c("android-image-loader:clear_memory_cache_on_trim_enabled", false), aey0Var.b(0, 100, 0, "android-image-loader:image_load_instrumentation_sampling_percentage"), aey0Var.b(0, 100, 100, "android-image-loader:memory_cache_percent_while_in_background"), (luk) null);
            case 22:
                return new el4(aey0Var.c("android-integrity:employee_validation_enabled", false), aey0Var.c("android-integrity:time_tracking_enabled", false), aey0Var.c("android-integrity:validation_enabled", true), (luk) null);
            case 23:
                return new fl4(aey0Var.c("android-inter-app-service:allow_list_access_policy_enabled", false), (luk) null);
            case 24:
                return new jl4(aey0Var.c("android-learning-music-quiz-gameplay:is_quiz_question_reporting_enabled", true), (luk) null);
            case 25:
                return new nl4(aey0Var.c("android-legacy-related-track-card:enable_related_card_in_npv", false), (luk) null);
            case 26:
                return new ol4(aey0Var.c("android-lib-aligned-curation-flags:curate_transitions_in_ac", false), aey0Var.c("android-lib-aligned-curation-flags:curation_platform_enabled", false), aey0Var.c("android-lib-aligned-curation-flags:default_save_location_curation_enabled", false), aey0Var.c("android-lib-aligned-curation-flags:episode_curation_trait_enabled", false), aey0Var.c("android-lib-aligned-curation-flags:track_curation_trait_enabled", false), (luk) null);
            case 27:
                return new pl4(aey0Var.c("android-lib-assisted-curation:episode_preview_enabled", true), aey0Var.c("android-lib-assisted-curation:episode_search_preview_enabled", true), aey0Var.c("android-lib-assisted-curation:preview_enabled", true), aey0Var.c("android-lib-assisted-curation:search_preview_enabled", true), aey0Var.c("android-lib-assisted-curation:use_improved_cards_sort_order", false), (luk) null);
            case 28:
                return new ql4(aey0Var.c("android-libraryimport-settings-impl:settings_entry_point_enabled", false), (luk) null);
            default:
                return new rl4(aey0Var.c("android-libs-ads-browser:enable_safe_search", false), (luk) null);
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
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
        rl4 rl4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (qi4) rl4Var, qi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/companioncontent/remoteconfig/AndroidFeatureTranscriptCompanionContentProperties;", 0);
            case 1:
                return new tv30(1, (ri4) rl4Var, ri4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/remoteconfig/AndroidFeatureTranscriptNpvProperties;", 0);
            case 2:
                return new tv30(1, (si4) rl4Var, si4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureUnboxingAvailabilityImplProperties;", 0);
            case 3:
                return new tv30(1, (ti4) rl4Var, ti4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureUnboxingHubImplProperties;", 0);
            case 4:
                return new tv30(1, (ui4) rl4Var, ui4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureUnboxingHubProperties;", 0);
            case 5:
                return new tv30(1, (wi4) rl4Var, wi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureUpcomingReleasesHubProperties;", 0);
            case 6:
                return new tv30(1, (yi4) rl4Var, yi4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/versionsunsetting/properties/AndroidFeatureVersionSunsettingProperties;", 0);
            case 7:
                return new tv30(1, (aj4) rl4Var, aj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureVideoProperties;", 0);
            case 8:
                return new tv30(1, (bj4) rl4Var, bj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFeatureVoiceAssistantProperties;", 0);
            case 9:
                return new tv30(1, (fj4) rl4Var, fj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/fitness/configurationimpl/AndroidFitnessProperties;", 0);
            case 10:
                return new tv30(1, (hj4) rl4Var, hj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/fitness/settingspage/rc/AndroidFitnessSettingsPageProperties;", 0);
            case 11:
                return new tv30(1, (uj4) rl4Var, uj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/freeemployeeday/AndroidFreeDayEmployeeProperties;", 0);
            case 12:
                return new tv30(1, (vj4) rl4Var, vj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidFreetierExperimentsProperties;", 0);
            case 13:
                return new tv30(1, (wj4) rl4Var, wj4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGatedContentFlagsProperties;", 0);
            case 14:
                return new tv30(1, (bk4) rl4Var, bk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGenAlphaAccountCreationProperties;", 0);
            case 15:
                return new tv30(1, (ek4) rl4Var, ek4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGenAlphaBlockingProperties;", 0);
            case 16:
                return new tv30(1, (hk4) rl4Var, hk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGenAlphaProperties;", 0);
            case 17:
                return new tv30(1, (jk4) rl4Var, jk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/genalpha/limitedexperienceindicator/AndroidGenalphaLimitedexperienceindicatorProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new tv30(1, (kk4) rl4Var, kk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidGenuiChromelessProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new tv30(1, (mk4) rl4Var, mk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/googledevicesuggestions/AndroidGoogleDeviceSuggestionsProperties;", 0);
            case 20:
                return new tv30(1, (rk4) rl4Var, rk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidHomeiaSettingsProperties;", 0);
            case 21:
                return new tv30(1, (zk4) rl4Var, zk4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidImageLoaderProperties;", 0);
            case 22:
                return new tv30(1, (el4) rl4Var, el4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/integrity/integrityimpl/AndroidIntegrityProperties;", 0);
            case 23:
                return new tv30(1, (fl4) rl4Var, fl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/interapp/service/AndroidInterAppServiceProperties;", 0);
            case 24:
                return new tv30(1, (jl4) rl4Var, jl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLearningMusicQuizGameplayProperties;", 0);
            case 25:
                return new tv30(1, (nl4) rl4Var, nl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLegacyRelatedTrackCardProperties;", 0);
            case 26:
                return new tv30(1, (ol4) rl4Var, ol4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibAlignedCurationFlagsProperties;", 0);
            case 27:
                return new tv30(1, (pl4) rl4Var, pl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibAssistedCurationProperties;", 0);
            case 28:
                return new tv30(1, (ql4) rl4Var, ql4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/libraryimport/settings/impl/rc/AndroidLibraryimportSettingsImplProperties;", 0);
            default:
                return new tv30(1, rl4Var, rl4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLibsAdsBrowserProperties;", 0);
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
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
