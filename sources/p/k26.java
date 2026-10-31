package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k26 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ m26 c;

    public /* synthetic */ k26(SingleEmitter singleEmitter, m26 m26Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = m26Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        m26 m26Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:background_worker_send", false)));
                break;
            case 1:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:background_worker_send_on_stop", false)));
                break;
            case 2:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:enable_rate_limiter", false)));
                break;
            case 3:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:event_sending_interval_seconds")));
                break;
            case 4:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 43200, 0, "apps-music-libs-eventsender:heartbeat_interval")));
                break;
            case 5:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 3600, 30, "apps-music-libs-eventsender:heartbeat_retry_interval")));
                break;
            case 6:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(10000, 512000, 128000, "apps-music-libs-eventsender:max_batch_bytes")));
                break;
            case 7:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_events_per_time_unit")));
                break;
            case 8:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_time_unit_seconds")));
                break;
            case 9:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_events_per_time_unit")));
                break;
            case 10:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_time_unit_seconds")));
                break;
            case 11:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_events_per_time_unit")));
                break;
            case 12:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_time_unit_seconds")));
                break;
            case 13:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:retry_db_operations", false)));
                break;
            case 14:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:send_events_on_bcd_event", false)));
                break;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("apps-music-libs-eventsender:send_full_ess2", true)));
                break;
        }
        return m26Var;
    }
}
