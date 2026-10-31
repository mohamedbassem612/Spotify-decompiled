package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class brb1 implements Action {
    public final /* synthetic */ crb1 a;
    public final /* synthetic */ boolean b;

    public brb1(crb1 crb1Var, boolean z) {
        this.a = crb1Var;
        this.b = z;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        crb1.b(this.a).d(this.b);
    }
}
