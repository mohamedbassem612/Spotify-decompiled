package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class uy4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ uy4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new vy4(aey0Var.c("android-premium-value:enable_premium_value", false), (luk) null);
            case 1:
                return new wy4(aey0Var.c("android-premiumdestination-settings-gopremium-impl:use_compact_upsell", false), (luk) null);
            case 2:
                return new xy4(aey0Var.c("android-prerelease-card-now-playing-widget:enable_permission_dialog_on_presave", false), (luk) null);
            case 3:
                return new yy4(aey0Var.c("android-preview-card-medium:enable_content_experience_trait", false), aey0Var.c("android-preview-card-medium:enable_extended_linger_time", false), aey0Var.c("android-preview-card-medium:enable_podcast_chapter_transcripts", true), aey0Var.c("android-preview-card-medium:enable_user_initiated_play", false), aey0Var.c("android-preview-card-medium:enable_video_promo_recsplanation_header_in_main_feed", false), aey0Var.c("android-preview-card-medium:full_length_music_video_and_tentpole_enabled", false), aey0Var.c("android-preview-card-medium:unify_mdc_section_carousel", false), (luk) null);
            case 4:
                return new cz4(aey0Var.c("android-progress-resumption-lib:enable_resumption_progress_api", false), (luk) null);
            case 5:
                return new dz4(aey0Var.c("android-promo-disclosure-page:enable_promo_disclosure_webview_page", false), (luk) null);
            case 6:
                return new ez4(aey0Var.c("android-promptedplaylists-ai-disclosure-sheet:contextual_page_enabled", false), (luk) null);
            case 7:
                return new gz4(aey0Var.b(0, 86400000, 60000, "android-proximity-detector:device_proximity_time_threshold_ms"), aey0Var.c("android-proximity-detector:enable_feature", false), aey0Var.c("android-proximity-detector:include_user_match_unauthenticated_devices", false), aey0Var.b(0, 86400000, 30000, "android-proximity-detector:on_foregrounded_rediscovery_time_threshold_ms"), aey0Var.c("android-proximity-detector:write_pull_playback_notification_ble_characteristic", false), aey0Var.b(0, 86400000, 60000, "android-proximity-detector:write_pull_playback_notification_ble_characteristic_interval_ms"), aey0Var.a("android-proximity-detector:write_pull_playback_notification_min_proximity_indicator", fz4.b), (luk) null);
            case 8:
                return new hz4(aey0Var.b(0, Integer.MAX_VALUE, 0, "android-puffin-auto-updating:update_version"), (luk) null);
            case 9:
                return new kz4(aey0Var.c("android-quality-settings:gbb_upsells_enabled", false), aey0Var.c("android-quality-settings:petrel_ui_enabled", false), aey0Var.c("android-quality-settings:use_playback_settings_audio_quality", false), (luk) null);
            case 10:
                return new mz4(aey0Var.c("android-quickstart-pivot:enable_tts_lens", false), (luk) null);
            case 11:
                return new oz4(aey0Var.c("android-ratings-ratingsandreviews:unreported_consumption_enabled", false), (luk) null);
            case 12:
                return new pz4(aey0Var.c("android-ratings-ratingsandreviewspage:compose_ratings_page_enabled", false), (luk) null);
            case 13:
                return new tz4(aey0Var.c("android-reachability:use_shared_reachability", false), (luk) null);
            case 14:
                return new vz4(aey0Var.c("android-read-along-list:enable_external_link", false), aey0Var.c("android-read-along-list:enable_transcript_translation", false), (luk) null);
            case 15:
                return new wz4(aey0Var.c("android-recaps:button_highlight_border_enabled", false), (luk) null);
            case 16:
                return new xz4(aey0Var.c("android-recommendations-contextmenuimpl:show_track_exclude_menu_item", false), (luk) null);
            case 17:
                return new yz4(aey0Var.c("android-recommendations-interactors:enable_ignore_in_recs", false), (luk) null);
            case 18:
                return new zz4(aey0Var.c("android-referrals-jam:enabled", false), (luk) null);
            case 19:
                return new b05(aey0Var.c("android-referrals-settings:premium_referrals_settings_item_enabled", false), aey0Var.c("android-referrals-settings:referral_settings_row_hidden", false), aey0Var.a("android-referrals-settings:settings_sub_header_copy", a05.b), (luk) null);
            case 20:
                return new c05(aey0Var.c("android-reinvent-free-ad-unlock-eligibility-impl:ad_unlocked_on_demand_enabled", false), (luk) null);
            case 21:
                return new d05(aey0Var.c("android-reinvent-free-download-upsell:is_contextual_page_enabled", false), (luk) null);
            case 22:
                return new e05(aey0Var.c("android-reinvent-free-flags:mftplus_enable_backskip", false), aey0Var.c("android-reinvent-free-flags:mftplus_enable_repeat", false), aey0Var.c("android-reinvent-free-flags:mftplus_enable_seeking", false), aey0Var.c("android-reinvent-free-flags:show_tooltip_on_skip_to_error", false), (luk) null);
            case 23:
                return new g05(aey0Var.c("android-reinvent-free-time-cap-upsell:show_track_artwork", false), aey0Var.a("android-reinvent-free-time-cap-upsell:time_cap_upsell_copy_variant", f05.b), (luk) null);
            case 24:
                return new h05(aey0Var.c("android-reinventfree-nowplayingapi:shadow_load_skip_next_enabled", false), (luk) null);
            case 25:
                return new i05(aey0Var.c("android-reinventfree-smartshufflerecommednationsimpl:use_product_composer", false), aey0Var.c("android-reinventfree-smartshufflerecommednationsimpl:use_unbrand_smart_shuffle_recs_copy_in_external_integration", false), (luk) null);
            case 26:
                return new j05(aey0Var.c("android-reinventfree-timecappivot-impl:enabled", false), aey0Var.c("android-reinventfree-timecappivot-impl:route_search_upsell_to_track_selected", false), (luk) null);
            case 27:
                return new k05(aey0Var.c("android-remotedownloads-contextmenu:enable_remote_downloads", false), (luk) null);
            case 28:
                return new l05(aey0Var.c("android-remotedownloads-onboarding:enable_remote_downloads_onboarding", false), (luk) null);
            default:
                return new m05(aey0Var.c("android-remotedownloads-page:enable_notifying_wearos_watch", false), (luk) null);
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
        m05 m05Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (vy4) m05Var, vy4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/premiumvalue/flagsimpl/AndroidPremiumValueProperties;", 0);
            case 1:
                return new tv30(1, (wy4) m05Var, wy4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/premiumdestination/settings/gopremium/impl/rc/AndroidPremiumdestinationSettingsGopremiumImplProperties;", 0);
            case 2:
                return new tv30(1, (xy4) m05Var, xy4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/prerelease/prereleasescrollcardimpl/AndroidPrereleaseCardNowPlayingWidgetProperties;", 0);
            case 3:
                return new tv30(1, (yy4) m05Var, yy4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidPreviewCardMediumProperties;", 0);
            case 4:
                return new tv30(1, (cz4) m05Var, cz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidProgressResumptionLibProperties;", 0);
            case 5:
                return new tv30(1, (dz4) m05Var, dz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/promodisclosure/page/AndroidPromoDisclosurePageProperties;", 0);
            case 6:
                return new tv30(1, (ez4) m05Var, ez4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/promptedplaylists/aidisclosuresheet/rc/AndroidPromptedplaylistsAiDisclosureSheetProperties;", 0);
            case 7:
                return new tv30(1, (gz4) m05Var, gz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/proximitydetector/AndroidProximityDetectorProperties;", 0);
            case 8:
                return new tv30(1, (hz4) m05Var, hz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidPuffinAutoUpdatingProperties;", 0);
            case 9:
                return new tv30(1, (kz4) m05Var, kz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidQualitySettingsProperties;", 0);
            case 10:
                return new tv30(1, (mz4) m05Var, mz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidQuickstartPivotProperties;", 0);
            case 11:
                return new tv30(1, (oz4) m05Var, oz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ratings/ratingsandreviews/rc/AndroidRatingsRatingsandreviewsProperties;", 0);
            case 12:
                return new tv30(1, (pz4) m05Var, pz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ratings/ratingsandreviewspage/rc/AndroidRatingsRatingsandreviewspageProperties;", 0);
            case 13:
                return new tv30(1, (tz4) m05Var, tz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/reachabilitysetupservice/AndroidReachabilityProperties;", 0);
            case 14:
                return new tv30(1, (vz4) m05Var, vz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/transcript/remoteconfig/AndroidReadAlongListProperties;", 0);
            case 15:
                return new tv30(1, (wz4) m05Var, wz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/recaps/properties/AndroidRecapsProperties;", 0);
            case 16:
                return new tv30(1, (xz4) m05Var, xz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidRecommendationsContextmenuimplProperties;", 0);
            case 17:
                return new tv30(1, (yz4) m05Var, yz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidRecommendationsInteractorsProperties;", 0);
            case 18:
                return new tv30(1, (zz4) m05Var, zz4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/referrals/jam/AndroidReferralsJamProperties;", 0);
            case 19:
                return new tv30(1, (b05) m05Var, b05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/referrals/settings/AndroidReferralsSettingsProperties;", 0);
            case 20:
                return new tv30(1, (c05) m05Var, c05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidReinventFreeAdUnlockEligibilityImplProperties;", 0);
            case 21:
                return new tv30(1, (d05) m05Var, d05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/downloadupsell/rc/AndroidReinventFreeDownloadUpsellProperties;", 0);
            case 22:
                return new tv30(1, (e05) m05Var, e05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidReinventFreeFlagsProperties;", 0);
            case 23:
                return new tv30(1, (g05) m05Var, g05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/timecapupsell/rc/AndroidReinventFreeTimeCapUpsellProperties;", 0);
            case 24:
                return new tv30(1, (h05) m05Var, h05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/nowplayingapi/rc/AndroidReinventfreeNowplayingapiProperties;", 0);
            case 25:
                return new tv30(1, (i05) m05Var, i05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/smartshufflerecommendationsimpl/AndroidReinventfreeSmartshufflerecommednationsimplProperties;", 0);
            case 26:
                return new tv30(1, (j05) m05Var, j05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/reinventfree/timecappivotimpl/AndroidReinventfreeTimecappivotImplProperties;", 0);
            case 27:
                return new tv30(1, (k05) m05Var, k05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidRemotedownloadsContextmenuProperties;", 0);
            case 28:
                return new tv30(1, (l05) m05Var, l05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remotedownloads/onboarding/AndroidRemotedownloadsOnboardingProperties;", 0);
            default:
                return new tv30(1, m05Var, m05.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidRemotedownloadsPageProperties;", 0);
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
