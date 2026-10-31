package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fv71 implements f961 {
    public final ev71 a;
    public final a9l b;

    public fv71(tz4 tz4Var, jxp jxpVar, jxp jxpVar2) {
        if (tz4Var.a()) {
            this.a = (ev71) jxpVar.get();
            this.b = (a9l) jxpVar2.get();
        } else {
            this.a = null;
            this.b = null;
        }
    }

    public final void shutdown() {
        a9l a9lVar = this.b;
        if (a9lVar != null) {
            smo1.p(a9lVar.f, (CancellationException) null);
        }
        ev71 ev71Var = this.a;
        if (ev71Var != null) {
            smo1.p(ev71Var.a, (CancellationException) null);
        }
    }

    public final Object getApi() {
        return this;
    }
}
