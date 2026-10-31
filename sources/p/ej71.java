package p;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ej71 {
    public final ug71 a;
    public final zpq b;

    public ej71(ug71 ug71Var, ixp ixpVar, zpq zpqVar) {
        this.a = ug71Var;
        this.b = zpqVar;
    }

    public final void a(b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1475045020);
        int i2 = i | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new mar0(cir0Var);
                x340Var.s0(objT);
            }
            mar0 mar0Var = (mar0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                pug pugVar = (pug) this.b.a.c;
                nw2 nw2Var = new nw2(u1n0.z((q7r0) pugVar.t));
                gw70 gw70VarB = ((ryj) pugVar.g).b();
                c8o.l(gw70VarB);
                ug71 ug71Var = (ug71) ((jly0) pugVar.b).get();
                ya71 ya71Var = (ya71) ((jly0) pugVar.m).get();
                fj71 fj71Var = (fj71) pugVar.u;
                woa woaVar = (woa) fj71Var.f5p.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) fj71Var.r.get();
                c8o.l(kmaVar);
                yqg yqgVar = (yqg) fj71Var.b.get();
                c8o.l(yqgVar);
                twb twbVar = new twb((byte) 24);
                zxa zxaVarB = pugVar.b();
                wh71 wh71Var = (wh71) ((jly0) pugVar.d).get();
                qqq qqqVar = (qqq) ((jly0) pugVar.n).get();
                mqq mqqVar = (mqq) qqqVar.b.get();
                nqq nqqVar = (nqq) qqqVar.c.get();
                oqq oqqVar = (oqq) qqqVar.d.get();
                jd11 jd11Var = rc11.a;
                ij01 ij01Var = new ij01(new dc31(sqg0.J(new mmr0[]{new mmr0(jd11Var.b(mqq.class), mqqVar), new mmr0(jd11Var.b(nqq.class), nqqVar), new mmr0(jd11Var.b(oqq.class), oqqVar)}), (LinkedHashMap) qqqVar.a.d, (byte) 26), (byte) 26);
                ubc ubcVarC = yx61.C(pugVar.o());
                yx61.B(pugVar.o());
                objT2 = new mh71(nw2Var, new sm71(gw70VarB, ug71Var, ya71Var, woaVar, kmaVar, yqgVar, twbVar, zxaVarB, wh71Var, ij01Var, new nbc(new v9c(ubcVarC, (byte) 24), (byte) 24)), (aqq) ((jly0) pugVar.s).get(), mar0Var);
                x340Var.s0(objT2);
            }
            mh71 mh71Var = (mh71) objT2;
            ipb1 ipb1VarC = wpb1.C("destinationSheet", mh71Var, this.a, x340Var, 6, 8);
            qim0 qim0VarL = bmq0.L(u291.z(nim0.a, (fra) null, 3), k1o1.q(x340Var), (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            otw.c(mh71Var, this.a, anm1.N("share.sheet.page", too1.y(qim0VarL, new bgc0(lhc.g(x340Var).g, 32))), ipb1VarC, x340Var, 0, 0);
            x340Var = x340Var;
            boolean zI = x340Var.i(mar0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new lar0(mar0Var, (byte) 1);
                x340Var.s0(objT3);
            }
            b = 0;
            hhr0.a((iu30) objT3, x340Var, 0);
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, b);
        }
    }
}
