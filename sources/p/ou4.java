package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ou4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ ou4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new pu4(aey0Var.c("android-newepisodes-newepisodes:enable_new_episodes_page", false), (luk) null);
            case 1:
                return new tu4(aey0Var.c("android-nowplaying-connectables:initially_hide_overlay_in_auto_hide_mode", false), null);
            case 2:
                return new uu4(aey0Var.c("android-nowplaying-contextmenusettings:enable_playback_settings", false), null);
            case 3:
                return new vu4(aey0Var.c("android-nowplaying-core:destroy_page_lifecycle_on_mode_switch_enabled", false), aey0Var.c("android-nowplaying-core:mode_switch_without_fade_enabled", false), aey0Var.c("android-nowplaying-core:slower_progress_updates_enabled", false), null);
            case 4:
                return new wu4(aey0Var.c("android-nowplaying-elements-entitysegments:enable_for_all_chaptered_content_types", false), null);
            case 5:
                return new xu4(aey0Var.c("android-nowplaying-elements-promotionalindicator:is_promo_indicator_enabled", false), null);
            case 6:
                return new yu4(aey0Var.c("android-nowplaying-elements-seekburst:burst_skip_enabled", false), (luk) null);
            case 7:
                return new zu4(aey0Var.c("android-nowplaying-elements-segmentedseekbar:fix_seek_gesture_event_ordering", false), null);
            case 8:
                return new av4(aey0Var.c("android-nowplaying-elements-share:require_current_share_eligibility", false), null);
            case 9:
                return new bv4(aey0Var.c("android-nowplaying-elements-video:should_use_vit_to_show_thumbnail", false), null);
            case 10:
                return new cv4(aey0Var.c("android-nowplaying-elements-videointerceptor:is_video_interceptor_enabled", false), null);
            case 11:
                return new dv4(aey0Var.c("android-nowplaying-mini-uicomponents:should_use_video_thumbnail", false), aey0Var.c("android-nowplaying-mini-uicomponents:should_use_vit", false), null);
            case 12:
                return new ev4(aey0Var.c("android-nowplaying-modes-agnosticmode:enable_agnostic_mode", false), aey0Var.c("android-nowplaying-modes-agnosticmode:show_debug_info", false), null);
            case 13:
                return new gv4(aey0Var.c("android-nowplaying-musicinstallation:enable_npv_page_load_reporting", false), aey0Var.c("android-nowplaying-musicinstallation:enable_page_api_npv", false), null);
            case 14:
                return new hv4(aey0Var.c("android-nowplaying-navcontext:book_progress_in_npv_header_enabled", false), aey0Var.c("android-nowplaying-navcontext:book_progress_in_playlist_context_header_enabled", false), aey0Var.c("android-nowplaying-navcontext:show_artist_title_from_search_enabled", false), (luk) null);
            case 15:
                return new iv4(aey0Var.b(0, 30000, 5000, "android-nowplaying-pagetemplate:scroll_setup_readiness_timeout_ms"), null, aey0Var.c("android-nowplaying-pagetemplate:defer_scroll_setup_until_playback_duration_available_enabled", false), aey0Var.c("android-nowplaying-pagetemplate:floating_skip_ahead_button", false), aey0Var.c("android-nowplaying-pagetemplate:mixing_transition_enabled", false), aey0Var.c("android-nowplaying-pagetemplate:podcast_video_captions_button_enabled", false));
            case 16:
                return new jv4(aey0Var.b(10, 5000, 2000, "android-nowplaying-scroll:widget_async_acc_policy_timeout_ms"), null);
            case 17:
                return new lv4(aey0Var.c("android-nowplaying-scroll-registration:enable_about_card_data_element", false), aey0Var.c("android-nowplaying-scroll-registration:enable_hyde_scroll_card", false), aey0Var.c("android-nowplaying-scroll-registration:enable_membership_upsell_in_about_card", false), aey0Var.c("android-nowplaying-scroll-registration:enable_on_tour_data_element", false), aey0Var.c("android-nowplaying-scroll-registration:enable_paid_podcast_banner_npv_card", false), aey0Var.c("android-nowplaying-scroll-registration:enable_read_along_data_element", false), aey0Var.c("android-nowplaying-scroll-registration:enable_related_content_recommendations_carousel", false), aey0Var.c("android-nowplaying-scroll-registration:enable_song_dna_data_element", false), aey0Var.c("android-nowplaying-scroll-registration:enable_video_carousel_scrollsita_integration", false), (kv4) aey0Var.a("android-nowplaying-scroll-registration:scrollsita_injection_policy_internal", kv4.NONE), aey0Var.c("android-nowplaying-scroll-registration:unified_leavebehind_npv_scroll_music_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:unified_leavebehind_npv_scroll_podcast_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_add_to_queue_button_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_duration_label_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_in_line_release_date_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_save_button_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_two_line_title_for_podcasts_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_two_line_title_music_video_tracks_enabled", false), aey0Var.c("android-nowplaying-scroll-registration:video_carousel_video_preview_when_playing_video_disabled", false), null);
            case 18:
                return new mv4(aey0Var.b(0, 500, 40, "android-nowplaying-scrollsection:reorder_engagement_threshold_dp"), null, aey0Var.c("android-nowplaying-scrollsection:enable_video_layer_refetch", false), aey0Var.c("android-nowplaying-scrollsection:is_new_artist_verified_badge_enabled", false), aey0Var.c("android-nowplaying-scrollsection:is_reorder_engagement_gating_enabled", false), aey0Var.c("android-nowplaying-scrollsection:is_time_based_reorder_enabled", false));
            case 19:
                return new nv4(aey0Var.c("android-nowplaying-video-settings:enable_audio_language_setting", false), aey0Var.c("android-nowplaying-video-settings:enable_larger_npb_setting", false), aey0Var.c("android-nowplaying-video-settings:enable_pip_setting", false), aey0Var.c("android-nowplaying-video-settings:enable_playback_settings", false), aey0Var.c("android-nowplaying-video-settings:enable_video_quality_setting", false), null);
            case 20:
                return new ov4(aey0Var.c("android-nowplayingbar-attachmentscontainer:flush_npb_attachments", false), null);
            case 21:
                return new pv4(aey0Var.c("android-nowplayingmini-adsmode:mini_npv_enabled", false), null);
            case 22:
                return new qv4(aey0Var.c("android-nowplayingmini-defaultmode:enable_playback_control_switcher", false), null);
            case 23:
                return new rv4(aey0Var.c("android-nowplayingmini-reinventfreemode:enable_playback_control_switcher", false), null);
            case 24:
                return new sv4(aey0Var.c("android-npv-martini-card:enable_card_in_npv", false), (luk) null);
            case 25:
                return new zv4(aey0Var.c("android-oem-integrations-samsung:disable_samsung_now_brief", false), aey0Var.c("android-oem-integrations-samsung:samsung_now_brief_use_ai_partner_api", false), aey0Var.c("android-oem-integrations-samsung:samsung_s_finder_use_ai_partner_api", false), null);
            case 26:
                return new aw4(aey0Var.c("android-oem-integrations-samsung-unauth-properties-service:force_s_finder_to_use_hydrogen_search", false), aey0Var.c("android-oem-integrations-samsung-unauth-properties-service:s_finder_enable_unauth_search", true), null);
            case 27:
                return new bw4(aey0Var.c("android-oem-integrations-systemui:personalised_home_in_system_ui", true), (luk) null);
            case 28:
                return new cw4(aey0Var.c("android-oem-integrations-xiaomi-unauth-properties-service:allow_unauthenticated_search", true), null);
            default:
                return new dw4(aey0Var.c("android-offline-plugin-support-service:reference_plugin_enabled", false), aey0Var.c("android-offline-plugin-support-service:shutdown_awareness_enabled", true), (luk) null);
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
        dw4 dw4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (pu4) dw4Var, pu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/newepisodes/newepisodes/rc/AndroidNewepisodesNewepisodesProperties;", 0);
            case 1:
                return new tv30(1, (tu4) dw4Var, tu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingConnectablesProperties;", 0);
            case 2:
                return new tv30(1, (uu4) dw4Var, uu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingContextmenusettingsProperties;", 0);
            case 3:
                return new tv30(1, (vu4) dw4Var, vu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingCoreProperties;", 0);
            case 4:
                return new tv30(1, (wu4) dw4Var, wu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingElementsEntitysegmentsProperties;", 0);
            case 5:
                return new tv30(1, (xu4) dw4Var, xu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingElementsPromotionalindicatorProperties;", 0);
            case 6:
                return new tv30(1, (yu4) dw4Var, yu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingElementsSeekburstProperties;", 0);
            case 7:
                return new tv30(1, (zu4) dw4Var, zu4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/nowplaying/elements/segmentedseekbar/rc/AndroidNowplayingElementsSegmentedseekbarProperties;", 0);
            case 8:
                return new tv30(1, (av4) dw4Var, av4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/nowplaying/elements/share/rc/AndroidNowplayingElementsShareProperties;", 0);
            case 9:
                return new tv30(1, (bv4) dw4Var, bv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingElementsVideoProperties;", 0);
            case 10:
                return new tv30(1, (cv4) dw4Var, cv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/nowplaying/elements/videointerceptor/AndroidNowplayingElementsVideointerceptorProperties;", 0);
            case 11:
                return new tv30(1, (dv4) dw4Var, dv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingMiniUicomponentsProperties;", 0);
            case 12:
                return new tv30(1, (ev4) dw4Var, ev4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/nowplayingmodes/agnosticmode/rc/AndroidNowplayingModesAgnosticmodeProperties;", 0);
            case 13:
                return new tv30(1, (gv4) dw4Var, gv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingMusicinstallationProperties;", 0);
            case 14:
                return new tv30(1, (hv4) dw4Var, hv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingNavcontextProperties;", 0);
            case 15:
                return new tv30(1, (iv4) dw4Var, iv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingPagetemplateProperties;", 0);
            case 16:
                return new tv30(1, (jv4) dw4Var, jv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingScrollProperties;", 0);
            case 17:
                return new tv30(1, (lv4) dw4Var, lv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingScrollRegistrationProperties;", 0);
            case 18:
                return new tv30(1, (mv4) dw4Var, mv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingScrollsectionProperties;", 0);
            case 19:
                return new tv30(1, (nv4) dw4Var, nv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingVideoSettingsProperties;", 0);
            case 20:
                return new tv30(1, (ov4) dw4Var, ov4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/nowplayingbar/attachmentscontainer/rc/AndroidNowplayingbarAttachmentscontainerProperties;", 0);
            case 21:
                return new tv30(1, (pv4) dw4Var, pv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingminiAdsmodeProperties;", 0);
            case 22:
                return new tv30(1, (qv4) dw4Var, qv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingminiDefaultmodeProperties;", 0);
            case 23:
                return new tv30(1, (rv4) dw4Var, rv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNowplayingminiReinventfreemodeProperties;", 0);
            case 24:
                return new tv30(1, (sv4) dw4Var, sv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidNpvMartiniCardProperties;", 0);
            case 25:
                return new tv30(1, (zv4) dw4Var, zv4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidOemIntegrationsSamsungProperties;", 0);
            case 26:
                return new tv30(1, (aw4) dw4Var, aw4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidOemIntegrationsSamsungUnauthPropertiesServiceUnauthProperties;", 0);
            case 27:
                return new tv30(1, (bw4) dw4Var, bw4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidOemIntegrationsSystemuiProperties;", 0);
            case 28:
                return new tv30(1, (cw4) dw4Var, cw4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidOemIntegrationsXiaomiUnauthPropertiesServiceUnauthProperties;", 0);
            default:
                return new tv30(1, dw4Var, dw4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidOfflinePluginSupportServiceProperties;", 0);
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
