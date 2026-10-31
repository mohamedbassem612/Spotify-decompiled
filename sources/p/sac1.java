package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sac1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ewn0 b;

    public /* synthetic */ sac1(ewn0 ewn0Var, byte b) {
        this.a = b;
        this.b = ewn0Var;
    }

    public final void run() {
        byte b = this.a;
        ewn0 ewn0Var = this.b;
        switch (b) {
            case 0:
                ewn0Var.f(kas0.a);
                break;
            default:
                ewn0Var.f(kas0.b);
                break;
        }
    }
}
