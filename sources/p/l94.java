package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class l94 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ l94(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new m94(aey0Var.b(0, 100, 24, "android-collection-offlinesyncnotification:diagnostics_detail_log_limit"), null);
            case 1:
                return new n94(aey0Var.c("android-collectionartist-collection-artist:age_assurance_check_enabled", false), null);
            case 2:
                return new o94(aey0Var.c("android-companion-content-loader-impl:clear_cache_on_trim_enabled", false), (luk) null);
            case 3:
                return new za4(aey0Var.b(10, 120, 30, "android-connect-appletv:connect_discovery_timeout_seconds"), aey0Var.b(10, 120, 30, "android-connect-appletv:pin_submission_timeout_seconds"), null);
            case 4:
                return new ab4(aey0Var.c("android-connectivity-connectiontypeflags:net_capabilities_oem_paid_support_enabled", false), aey0Var.c("android-connectivity-connectiontypeflags:should_use_single_thread", false), aey0Var.c("android-connectivity-connectiontypeflags:unauth_net_capabilities_validated_disregarded_enabled", false), (xz11) null);
            case 5:
                return new bb4(aey0Var.c("android-connectivity-cosmosauthtoken:token_exchanger_timekeeper_enabled", false), (luk) null);
            case 6:
                return new db4(aey0Var.c("android-connectivity-productstateesperanto:observe_on_computation_scheduler", false), aey0Var.c("android-connectivity-productstateesperanto:use_presession_product_state_client", false), null);
            case 7:
                return new hb4(aey0Var.b(0, 30000, 0, "android-connectivity:client_token_failure_cache_millis"), aey0Var.c("android-connectivity:decorator_zero_hop", false), aey0Var.c("android-connectivity:disable_broken_cache_detector", false), aey0Var.c("android-connectivity:disable_decorator_scheduling", false), aey0Var.c("android-connectivity:disable_webgate_token_cache", false), aey0Var.c("android-connectivity:evict_connection_pools_on_reachability_change_enabled", false), aey0Var.c("android-connectivity:evict_connection_pools_on_trim_enabled", false), aey0Var.c("android-connectivity:global_routing_default_enabled", false), aey0Var.b(0, 600000, 0, "android-connectivity:plain_instance_call_timeout_millis"), aey0Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 600000, 10000, "android-connectivity:plain_instance_connect_timeout_millis"), aey0Var.b(1, 1440, 5, "android-connectivity:plain_instance_connection_pool_keep_alive_duration_minutes"), aey0Var.b(1, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 40, "android-connectivity:plain_instance_connection_pool_max_idle_connections"), aey0Var.b(1, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 250, "android-connectivity:plain_instance_max_requests"), aey0Var.b(1, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 50, "android-connectivity:plain_instance_max_requests_per_host"), aey0Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 600000, 10000, "android-connectivity:plain_instance_read_timeout_millis"), aey0Var.c("android-connectivity:plain_instance_retry_on_connection_failure", true), aey0Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 600000, 10000, "android-connectivity:plain_instance_write_timeout_millis"), aey0Var.c("android-connectivity:pre_warm_connections", false), aey0Var.c("android-connectivity:short_circuit_all_offline_states", false), (tgp0) null, (luk) null);
            case 8:
                return new ib4(aey0Var.c("android-connectivity:forbidden_certificates_check", true), aey0Var.c("android-connectivity:shared_ssl_socket_factory", false), null);
            case 9:
                return new jb4((eb4) aey0Var.a("android-connectivity:http_engine", eb4.OKHTTP), (luk) null);
            case 10:
                return new rb4(aey0Var.c("android-content-windowing-flags:enable_3_day_countdown_override", false), aey0Var.c("android-content-windowing-flags:enable_content_windowing_experience", false), aey0Var.c("android-content-windowing-flags:enable_track_preview_upsell", false), (luk) null);
            case 11:
                return new sb4(aey0Var.c("android-contentdelivery-prefetchimpl:media_prefetch_data_saver_enabled", false), (luk) null);
            case 12:
                return new tb4(aey0Var.c("android-context-menu:premium_upsell_panel_enabled", false), (luk) null);
            case 13:
                return new ub4(aey0Var.c("android-contextual-attributes-manager:output_device_enabled", false), (luk) null);
            case 14:
                return new vb4(aey0Var.c("android-crash-reporting-anr-watchdog:enabled", false), aey0Var.b(1, 30, 10, "android-crash-reporting-anr-watchdog:max_stalls_per_hour"), aey0Var.b(500, 2000, 500, "android-crash-reporting-anr-watchdog:poll_interval_ms"), aey0Var.b(500, 10000, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "android-crash-reporting-anr-watchdog:stall_threshold_ms"), null);
            case 15:
                return new xb4(aey0Var.c("android-crash-reporting-process-load-monitor:enabled", false), aey0Var.b(1, 600, 3, "android-crash-reporting-process-load-monitor:importance_sampling_frequency"), aey0Var.b(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 600000, 10000, "android-crash-reporting-process-load-monitor:resource_sampling_interval_ms"), aey0Var.b(100, 60000, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "android-crash-reporting-process-load-monitor:stall_sampling_interval_ms"), (lw21) null);
            case 16:
                return new yb4(aey0Var.b(0, 60000, 250, "android-crash-reporting-process-state-summary:debounce_interval_ms"), null);
            case 17:
                return new zb4(aey0Var.c("android-creative-work-encore-dialogs:enabled", false), null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ac4(aey0Var.c("android-creativework-elements-description:expandable_description_enabled", false), (luk) null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new bc4(aey0Var.c("android-creativeworkelements-shareimpl:disable_share_while_eligibility_pending", true), null);
            case 20:
                return new lc4(aey0Var.c("android-datasaver-connectionquality-impl:connection_quality_data_saver_enabled", false), aey0Var.c("android-datasaver-connectionquality-impl:event_logging_enabled", false), (luk) null);
            case 21:
                return new mc4(aey0Var.c("android-datasaver-limitedexperienceindicator:enabled", false), (luk) null);
            case 22:
                return new nc4(aey0Var.c("android-datasavermode:dynamic_data_saver_stream_quality", false), (luk) null);
            case 23:
                return new oc4(aey0Var.c("android-decipher:enhanced_search_back_navigation_mirroring_enabled", false), aey0Var.b(0, 3600, 60, "android-decipher:enhanced_search_grace_period_seconds"), aey0Var.c("android-decipher:enhanced_search_query_mirroring_enabled", true), aey0Var.c("android-decipher:feature_enabled", false), (luk) null);
            case 24:
                return new qc4(aey0Var.a("android-deeplink-branchintegrationimpl:branch_error_level", pc4.b), aey0Var.c("android-deeplink-branchintegrationimpl:is_clearing_intent_lock", false), (luk) null);
            case 25:
                return new uc4(aey0Var.c("android-device-info-device-report-impl:gpu_probe_enabled", true), (luk) null);
            case 26:
                return new xc4(aey0Var.b(0, 30000, 20000, "android-device-predictability-app-startup-trigger:device_wait_timeout_ms"), aey0Var.c("android-device-predictability-app-startup-trigger:enable", false), aey0Var.a("android-device-predictability-app-startup-trigger:minimum_displayable_confidence_score", vc4.d), aey0Var.b(0, 60000, 8000, "android-device-predictability-app-startup-trigger:smart_control_nudge_auto_dismiss_timeout_ms"), aey0Var.a("android-device-predictability-app-startup-trigger:target_surface", wc4.b), (luk) null);
            case 27:
                return new yc4(aey0Var.c("android-device-predictability-lifecycle:enable_suggestion_framework", false), aey0Var.c("android-device-predictability-lifecycle:enable_suggestion_lifecycle_logging", false), (luk) null);
            case 28:
                return new zc4(aey0Var.b(0, 86400000, 1200000, "android-device-predictability-nudge:cooldown_ms"), (luk) null);
            default:
                return new cd4(aey0Var.c("android-device-predictability-playback-trigger:enable", false), aey0Var.a("android-device-predictability-playback-trigger:minimum_displayable_confidence_score", ad4.d), aey0Var.b(0, 60000, 8000, "android-device-predictability-playback-trigger:smart_control_nudge_auto_dismiss_timeout_ms"), aey0Var.a("android-device-predictability-playback-trigger:target_surface", bd4.b), aey0Var.b(0, 30000, 4000, "android-device-predictability-playback-trigger:trigger_delay_ms"), (luk) null);
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
        cd4 cd4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (m94) cd4Var, m94.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/collection/offlinesyncnotification/rc/AndroidCollectionOfflinesyncnotificationProperties;", 0);
            case 1:
                return new tv30(1, (n94) cd4Var, n94.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/collectionartist/properties/AndroidCollectionartistCollectionArtistProperties;", 0);
            case 2:
                return new tv30(1, (o94) cd4Var, o94.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/companioncontent/loaderimpl/rc/AndroidCompanionContentLoaderImplProperties;", 0);
            case 3:
                return new tv30(1, (za4) cd4Var, za4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connect/appletv/rc/AndroidConnectAppletvProperties;", 0);
            case 4:
                return new tv30(1, (ab4) cd4Var, ab4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidConnectivityConnectiontypeflagsUnauthProperties;", 0);
            case 5:
                return new tv30(1, (bb4) cd4Var, bb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidConnectivityCosmosauthtokenProperties;", 0);
            case 6:
                return new tv30(1, (db4) cd4Var, db4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/productstateesperanto/rc/AndroidConnectivityProductstateesperantoProperties;", 0);
            case 7:
                return new tv30(1, (hb4) cd4Var, hb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/httpimpl/AndroidConnectivityProperties;", 0);
            case 8:
                return new tv30(1, (ib4) cd4Var, ib4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/httpsslsocketfactory/AndroidConnectivityProperties;", 0);
            case 9:
                return new tv30(1, (jb4) cd4Var, jb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/connectivity/httpconnectionproperties/AndroidConnectivityProperties;", 0);
            case 10:
                return new tv30(1, (rb4) cd4Var, rb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/upsell/contentwindowing/flagsimpl/rc/AndroidContentWindowingFlagsProperties;", 0);
            case 11:
                return new tv30(1, (sb4) cd4Var, sb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/contentdelivery/prefetchimpl/rc/AndroidContentdeliveryPrefetchimplProperties;", 0);
            case 12:
                return new tv30(1, (tb4) cd4Var, tb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidContextMenuProperties;", 0);
            case 13:
                return new tv30(1, (ub4) cd4Var, ub4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidContextualAttributesManagerProperties;", 0);
            case 14:
                return new tv30(1, (vb4) cd4Var, vb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/crashreporting/anrwatchdog/anrwatchdogruntime/rc/AndroidCrashReportingAnrWatchdogProperties;", 0);
            case 15:
                return new tv30(1, (xb4) cd4Var, xb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/crashreporting/processloadmonitor/rc/AndroidCrashReportingProcessLoadMonitorProperties;", 0);
            case 16:
                return new tv30(1, (yb4) cd4Var, yb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/crashreporting/processstatesummary/rc/AndroidCrashReportingProcessStateSummaryProperties;", 0);
            case 17:
                return new tv30(1, (zb4) cd4Var, zb4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/creativeworkplatform/encoredialogs/rc/AndroidCreativeWorkEncoreDialogsProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new tv30(1, (ac4) cd4Var, ac4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/creativeworkelements/description/rc/AndroidCreativeworkElementsDescriptionProperties;", 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new tv30(1, (bc4) cd4Var, bc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/creativeworkelements/shareimpl/rc/AndroidCreativeworkelementsShareimplProperties;", 0);
            case 20:
                return new tv30(1, (lc4) cd4Var, lc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDatasaverConnectionqualityImplProperties;", 0);
            case 21:
                return new tv30(1, (mc4) cd4Var, mc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDatasaverLimitedexperienceindicatorProperties;", 0);
            case 22:
                return new tv30(1, (nc4) cd4Var, nc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDatasavermodeProperties;", 0);
            case 23:
                return new tv30(1, (oc4) cd4Var, oc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDecipherProperties;", 0);
            case 24:
                return new tv30(1, (qc4) cd4Var, qc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidDeeplinkBranchintegrationimplProperties;", 0);
            case 25:
                return new tv30(1, (uc4) cd4Var, uc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/deviceinfo/devicereportimpl/rc/AndroidDeviceInfoDeviceReportImplProperties;", 0);
            case 26:
                return new tv30(1, (xc4) cd4Var, xc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/devicepredictabilityappstartuptrigger/AndroidDevicePredictabilityAppStartupTriggerProperties;", 0);
            case 27:
                return new tv30(1, (yc4) cd4Var, yc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/devicepredictabilitylifecycle/AndroidDevicePredictabilityLifecycleProperties;", 0);
            case 28:
                return new tv30(1, (zc4) cd4Var, zc4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/devicepredictabilitynudge/AndroidDevicePredictabilityNudgeProperties;", 0);
            default:
                return new tv30(1, cd4Var, cd4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/devicepredictabilityplaybacktrigger/AndroidDevicePredictabilityPlaybackTriggerProperties;", 0);
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
