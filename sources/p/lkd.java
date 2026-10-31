package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lkd {
    public final bjd a;
    public final l7m0 b;
    public final zr00 c;
    public final g26 d;

    public lkd(bjd bjdVar, l7m0 l7m0Var, zr00 zr00Var, g26 g26Var) {
        this.a = bjdVar;
        this.b = l7m0Var;
        this.c = zr00Var;
        this.d = g26Var;
    }

    public final boolean a(ContextTrack contextTrack, g390 g390Var) {
        String str;
        if (g390Var == g390.c || (str = (String) contextTrack.metadata().get("canvas.id")) == null || str.length() == 0) {
            return false;
        }
        return (g390Var == g390.b && this.b.f(contextTrack)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public final mr20 b() {
        huz huzVarB;
        bjd bjdVar = this.a;
        if (xoi1.b(bjdVar.b)) {
            g26 g26Var = bjdVar.d;
            if (g26Var.b() || g26Var.c() || g26Var.d()) {
                huzVarB = bjdVar.b();
            } else {
                huzVarB = h4p1.m(Boolean.FALSE);
            }
        } else {
            huzVarB = bjdVar.b();
        }
        return rqt0.u(hu20.e(huzVarB, new b7c((lnm) null, this, (byte) 3)));
    }

    public final vd0 c(ContextTrack contextTrack) {
        return new vd0(b(), this, contextTrack, (byte) 16);
    }
}
