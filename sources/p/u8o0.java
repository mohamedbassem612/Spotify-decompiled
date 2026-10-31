package p;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u8o0 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ v8o0 c;

    public u8o0(v8o0 v8o0Var, zir zirVar, Executor executor) {
        this.c = v8o0Var;
        this.a = new WeakReference(zirVar);
        this.b = executor;
    }
}
