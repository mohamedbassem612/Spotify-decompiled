package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yjs0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e5l0 b;

    public /* synthetic */ yjs0(e5l0 e5l0Var, byte b) {
        this.a = b;
        this.b = e5l0Var;
    }

    public final void run() {
        byte b = this.a;
        e5l0 e5l0Var = this.b;
        switch (b) {
            case 0:
                e5l0Var.k(4);
                break;
            default:
                e5l0Var.k(5);
                break;
        }
    }
}
