package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e44 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ pdy0 c;

    public /* synthetic */ e44(SingleEmitter singleEmitter, pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = pdy0Var;
    }

    @Override // p.ydy0
    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        f44 f44Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-address:show_address_settings_item", false)));
                return f44Var;
            case 1:
                singleEmitter.onSuccess((m84) aey0Var.a("android-cal-rollout-service:enable_cal", m84.DISABLED));
                return (o84) f44Var;
            case 2:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-media-session:media3_enabled", false)));
                return (at4) f44Var;
            case 3:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(0, 10000, 10, "android-perf-tracking:ads_fetch_oops_sampling_bps")));
                return (ax4) f44Var;
            default:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(1, 1000, 100, "apps-music-libs-eventsender:max_batch_size")));
                return (m26) f44Var;
        }
    }
}
