package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dg2 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg2 b;

    public /* synthetic */ dg2(gg2 gg2Var, byte b) {
        this.a = b;
        this.b = gg2Var;
    }

    public final void run() {
        byte b = this.a;
        gg2 gg2Var = this.b;
        switch (b) {
            case 0:
                gg2Var.a.V0.onNext(new vp81(f0r0.a));
                break;
            default:
                gg2Var.f.c.b(zjt.a);
                break;
        }
    }
}
