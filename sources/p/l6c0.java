package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6c0 implements sg60 {
    public final r6c0 a;

    public l6c0(r6c0 r6c0Var) {
        this.a = r6c0Var;
    }

    @Override // p.sg60
    public final void a(mfu mfuVar) {
        if (mfuVar instanceof gfu) {
            this.a.d = ((gfu) mfuVar).a;
        }
    }

    @Override // p.sg60
    public final Observable b(tg60 tg60Var) {
        r6c0 r6c0Var = this.a;
        return yoi1.i(new x880(rqt0.u(new xs4(r6c0Var.a.a, "library-import-transfer-results-banner-visible", (byte) 6)), r6c0Var, (byte) 19), o6x.a).map(d710.t);
    }
}
