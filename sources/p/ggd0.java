package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ggd0 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ hgd0 c;

    public /* synthetic */ ggd0(SingleEmitter singleEmitter, hgd0 hgd0Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = hgd0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        hgd0 hgd0Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("listening-activity:visibility_indicator_enabled", false)));
                break;
            default:
                singleEmitter.onSuccess(aey0Var.a("listening-activity:visibility_indicator_treatment", fgd0.b));
                break;
        }
        return hgd0Var;
    }
}
