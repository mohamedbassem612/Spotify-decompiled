package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dxg implements yy70 {
    public final /* synthetic */ SingleEmitter a;

    public dxg(SingleEmitter singleEmitter) {
        this.a = singleEmitter;
    }

    public final void c(zy70 zy70Var, viz vizVar) {
        Object obj = zy70Var.b;
        Throwable th = vizVar.c;
        this.a.tryOnError(new RuntimeException("Error getting bitmap for " + obj + " with message " + th.getMessage(), th.getCause()));
    }
}
