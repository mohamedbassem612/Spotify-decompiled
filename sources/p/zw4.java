package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zw4 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ ax4 c;

    public /* synthetic */ zw4(SingleEmitter singleEmitter, ax4 ax4Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = ax4Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        ax4 ax4Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-perf-tracking:jank_coordinator_enabled", false)));
                break;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-perf-tracking:observability_platform_enabled", false)));
                break;
        }
        return ax4Var;
    }
}
