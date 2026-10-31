package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ick1 implements c931, sck1 {
    public final gga1 a;
    public final rck1 b = new rck1();
    public final xbk1 c;
    public final kdn0 d;

    public ick1(gga1 gga1Var) {
        this.a = gga1Var;
        hce1 hce1Var = new hce1(o(), new znw(this, (byte) 2), n9p1.s(this));
        tka0 tka0VarB = rc11.a.b(xbk1.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
        this.c = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        this.d = new kdn0(l3r.c);
    }

    @Override // p.c931
    public final void c(Bundle bundle) {
        b031 b031Var = this.c;
        b031 b031Var2 = b031Var instanceof b031 ? b031Var : null;
        if (b031Var2 != null) {
            b031Var2.a(bundle);
        }
    }

    @Override // p.c931
    public final void clear() {
        this.b.a();
    }

    public final ymd0 getState() {
        return this.d;
    }

    public final rck1 o() {
        return this.b;
    }

    public final Bundle serialize() {
        b031 b031Var = this.c;
        b031 b031Var2 = b031Var instanceof b031 ? b031Var : null;
        if (b031Var2 != null) {
            return b031Var2.serialize();
        }
        return null;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
