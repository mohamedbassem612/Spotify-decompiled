package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zsp0 extends poz0 {
    public final /* synthetic */ byte b;

    public final void m(d441 d441Var, Object obj) {
        int i;
        int i2 = 1;
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d441Var.K(1, ((ctp0) obj).a);
                break;
            default:
                vwl1 vwl1Var = (vwl1) obj;
                String str = vwl1Var.a;
                d441Var.K(1, str);
                d441Var.r(2, cwl1.m0(vwl1Var.b));
                d441Var.K(3, vwl1Var.c);
                d441Var.K(4, vwl1Var.d);
                ewq ewqVar = ewq.b;
                d441Var.n(o0c.N(vwl1Var.e), 5);
                d441Var.n(o0c.N(vwl1Var.f), 6);
                d441Var.r(7, vwl1Var.g);
                d441Var.r(8, vwl1Var.h);
                d441Var.r(9, vwl1Var.i);
                d441Var.r(10, vwl1Var.k);
                int iOrdinal = vwl1Var.l.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    i = 1;
                }
                d441Var.r(11, i);
                d441Var.r(12, vwl1Var.m);
                d441Var.r(13, vwl1Var.n);
                d441Var.r(14, vwl1Var.o);
                d441Var.r(15, vwl1Var.p);
                d441Var.r(16, vwl1Var.q ? 1L : 0L);
                int iC = l1d.C(vwl1Var.r);
                if (iC == 0) {
                    i2 = 0;
                } else if (iC != 1) {
                    eg.o();
                }
                d441Var.r(17, i2);
                d441Var.r(18, vwl1Var.s);
                d441Var.r(19, vwl1Var.t);
                d441Var.r(20, vwl1Var.u);
                d441Var.r(21, vwl1Var.v);
                d441Var.r(22, vwl1Var.w);
                String str2 = vwl1Var.x;
                if (str2 == null) {
                    d441Var.t(23);
                } else {
                    d441Var.K(23, str2);
                }
                Boolean bool = vwl1Var.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    d441Var.t(24);
                } else {
                    d441Var.r(24, numValueOf.intValue());
                }
                gjl gjlVar = vwl1Var.j;
                d441Var.r(25, cwl1.P(gjlVar.a));
                d441Var.n(cwl1.z(gjlVar.b), 26);
                d441Var.r(27, gjlVar.c ? 1L : 0L);
                d441Var.r(28, gjlVar.d ? 1L : 0L);
                d441Var.r(29, gjlVar.e ? 1L : 0L);
                d441Var.r(30, gjlVar.f ? 1L : 0L);
                d441Var.r(31, gjlVar.g);
                d441Var.r(32, gjlVar.h);
                d441Var.n(cwl1.k0(gjlVar.i), 33);
                d441Var.K(34, str);
                break;
        }
    }

    public final String q() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "DELETE FROM `OfflineLicenseInfoEntity` WHERE `media_id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }
}
