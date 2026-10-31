package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nwn implements fqw {
    public final /* synthetic */ c21 a;
    public final /* synthetic */ cp11 b;

    public nwn(c21 c21Var, cp11 cp11Var) {
        this.a = c21Var;
        this.b = cp11Var;
    }

    @Override // p.fqw
    public final laa a(fai0 fai0Var) {
        ymd0 kdn0Var;
        fai0 fai0VarF;
        ey50 ey50Var;
        fai0 fai0VarQ = w6d1.q(fai0Var, eln.d1);
        cp11 cp11Var = this.b;
        String str = cp11Var.a;
        String str2 = cp11Var.g;
        c21 c21Var = this.a;
        vp11 vp11Var = (vp11) c21Var.e;
        my50 my50Var = vp11Var.a;
        iu30 iu30Var = my50Var.e;
        w2c1 w2c1Var = (y1c1) c21Var.g;
        dx50 dx50Var = ((fx50) iu30Var.invoke(w2c1Var)).b;
        lls0 lls0Var = (dx50Var == null || (ey50Var = dx50Var.a) == null) ? null : new lls0(ey50Var.a, (laa) ey50Var.b.invoke(w2c1Var, (iac0) c21Var.f), (byte) 17);
        xfx xfxVar = (xfx) c21Var.b;
        qp11 qp11Var = (qp11) c21Var.c;
        asn asnVar = (asn) c21Var.d;
        iac0 iac0Var = (iac0) c21Var.f;
        Function0 function0 = my50Var.c;
        ymd0 ymd0Var = function0 != null ? (ymd0) function0.invoke() : null;
        Function0 function1 = my50Var.d;
        if (function1 == null || (kdn0Var = (ymd0) function1.invoke()) == null) {
            kdn0Var = new kdn0();
        }
        quc0 quc0Var = (quc0) c21Var.h;
        d0r d0rVar = (d0r) c21Var.i;
        nx50 nx50Var = my50Var.r;
        boolean zA = ((jus) c21Var.t).a();
        if (vp11Var.m) {
            mmr0 mmr0VarV = w2c1Var.V(tb2.class);
            fai0VarF = wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b);
        } else {
            fai0VarF = null;
        }
        return new wzq(new kun(lls0Var, xfxVar, qp11Var, asnVar, iac0Var, ymd0Var, kdn0Var, fai0VarQ, quc0Var, d0rVar, str, str2, nx50Var, fai0VarF, zA), new fnn(cp11Var, (byte) 3));
    }
}
