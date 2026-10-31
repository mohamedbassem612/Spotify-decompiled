package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i87 implements xpw {
    public final f87 a;
    public final ksk0 b;
    public final ljm0 c = h7w.B(new n5(1, this, i87.class, "stateFromProps", "stateFromProps(Lcom/spotify/assistedcuration/page/elements/AssistedCurationChipRowElement$Props;)Lcom/spotify/assistedcuration/page/elements/AssistedCurationChipRowElement$State;", 0, (byte) 17), (o8n) null, (iu30) null, new yxl1(this, (byte) 29), 6);
    public final ia00 d = n3o1.q(this).a(new v72(this, 21), d27.f);
    public final psw e;

    public i87(f87 f87Var, ksk0 ksk0Var) {
        this.a = f87Var;
        this.b = ksk0Var;
        j2i j2iVar = new j2i(2038969609, new i43(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static h87 f(g87 g87Var) {
        c380<yrd> c380Var = g87Var.a;
        String str = g87Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (yrd yrdVar : c380Var) {
            arrayList.add(new d87(yrdVar, str, new z77(g87Var, yrdVar, (byte) 1)));
        }
        return new h87(c380Var, arrayList, str);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(String str, xtb0 xtb0Var, c380 c380Var, b0k b0kVar, int i) {
        String str2;
        xtb0 xtb0Var2;
        c380 c380Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(584914376);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(xtb0Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = ((i2 & 896) == 256) | ((i2 & 14) == 4) | x340Var.i(xtb0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                str2 = str;
                xtb0Var2 = xtb0Var;
                c380Var2 = c380Var;
                wc5 wc5Var = new wc5(c380Var2, xtb0Var2, str2, (lnm) null, (byte) 7);
                x340Var.s0(wc5Var);
                objT = wc5Var;
            } else {
                str2 = str;
                xtb0Var2 = xtb0Var;
                c380Var2 = c380Var;
            }
            qxd0.s(str2, c380Var2, (vu30) objT, x340Var);
        } else {
            str2 = str;
            xtb0Var2 = xtb0Var;
            c380Var2 = c380Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, this, str2, xtb0Var2, c380Var2, (byte) 14);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
