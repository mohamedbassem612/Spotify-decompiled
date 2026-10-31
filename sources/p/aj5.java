package p;

import com.spotify.mobius.MobiusHooks;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aj5 implements MobiusHooks.ErrorHandler {
    public final /* synthetic */ bj5 a;

    public aj5(bj5 bj5Var) {
        this.a = bj5Var;
    }

    @Override // com.spotify.mobius.MobiusHooks.ErrorHandler
    public final void a(RuntimeException runtimeException) {
        bj5 bj5Var = this.a;
        c921.y(bj5Var.R0, bj5Var.e, 0, new kk(runtimeException, (lnm) null, (byte) 12), 2);
    }
}
