package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e510 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ g510 b;
    public final /* synthetic */ String c;

    public e510(boolean z, g510 g510Var, String str) {
        this.a = z;
        this.b = g510Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        uqk0 uqk0Var = this.b.h;
        String str = this.c;
        return this.a ? uqk0Var.k(str) : uqk0Var.p(str);
    }
}
