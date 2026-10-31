package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak4 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ bk4 c;

    public /* synthetic */ ak4(SingleEmitter singleEmitter, bk4 bk4Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = bk4Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        bk4 bk4Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-account-creation:parental_consent_flow_enabled", false)));
                break;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-account-creation:parental_controls_transition_entry_point_enabled", false)));
                break;
        }
        return bk4Var;
    }
}
