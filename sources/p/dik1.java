package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dik1 implements AutoCloseable {
    public final /* synthetic */ gik1 a;
    public final /* synthetic */ eik1 b;
    public final /* synthetic */ vik1 c;
    public final /* synthetic */ View d;
    public final /* synthetic */ fik1 e;

    public dik1(gik1 gik1Var, eik1 eik1Var, vik1 vik1Var, View view, fik1 fik1Var) {
        this.a = gik1Var;
        this.b = eik1Var;
        this.c = vik1Var;
        this.d = view;
        this.e = fik1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.a.getLifecycle().d(this.b);
        this.c.b();
        this.d.removeOnLayoutChangeListener(this.e);
    }
}
