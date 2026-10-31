package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class omn1 implements Callable {
    public final /* synthetic */ gsa a;
    public final /* synthetic */ zgz0 b;

    public /* synthetic */ omn1(gsa gsaVar, zgz0 zgz0Var) {
        this.a = gsaVar;
        this.b = zgz0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        gsa.a0(this.a, this.b);
        return null;
    }
}
