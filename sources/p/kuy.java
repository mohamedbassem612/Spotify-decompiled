package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kuy implements xpw {
    public final rqw X;
    public final /* synthetic */ byte a;
    public final boolean b;
    public final boolean c;
    public final js20 d;
    public final psw e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public kuy(Flowable flowable, a1r0 a1r0Var, uvy uvyVar, boolean z, boolean z2, q8n q8nVar, wu4 wu4Var) {
        this.a = (byte) 0;
        this.f = flowable;
        this.g = a1r0Var;
        this.h = uvyVar;
        this.b = z;
        this.c = z2;
        this.i = q8nVar;
        this.t = wu4Var;
        this.d = x3p1.n(new juy(this, (byte) 0), new juy(this, (byte) 1), yty.c, (o8n) null, new juy(this, (byte) 2), 8);
        j2i j2iVar = new j2i(921742258, new yhy(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.X = n3o1.q(this).a(c9x.c1, c9x.d1);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.X;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public void e(bez0 bez0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2103382480);
        int i2 = (b0kVar2.i(bez0Var) ? 4 : 2) | i | (b0kVar2.i(this) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            y441 y441Var = (y441) this.i;
            gu61 gu61Var = bez0Var.a;
            boolean zI = b0kVar2.i(bez0Var);
            Object objT = b0kVar2.T();
            if (zI || objT == fkj0.X) {
                objT = new fbz0(bez0Var, (byte) 6);
                b0kVar2.s0(objT);
            }
            y441Var.b(gu61Var, (iu30) objT, b0kVar2, 512);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, bez0Var, i, (byte) 11);
        }
    }

    public void f(xpw xpwVar, b0k b0kVar, int i) {
        xpw xpwVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(981564350);
        int i2 = (x340Var.i(xpwVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            rih1 rih1Var = rih1.a;
            xpwVar2 = xpwVar;
            otw.c(xpwVar2, rih1Var, (qim0) null, wpb1.D(String.valueOf(rc11.a.b(xpwVar.getClass()).o()), xpwVar, rih1Var, x340Var, ((i2 << 3) & 112) | 384), x340Var, (i2 & 14) | 48, 4);
        } else {
            xpwVar2 = xpwVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, xpwVar2, i, (byte) 12);
        }
    }

    public void g(gu61 gu61Var, aez0 aez0Var, jgb1 jgb1Var, igb1 igb1Var, xpw xpwVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2093922394);
        int i2 = i | (b0kVar3.g(gu61Var) ? 4 : 2) | (b0kVar3.i(aez0Var) ? 32 : 16) | (b0kVar3.g(jgb1Var) ? 256 : 128) | (b0kVar3.g(igb1Var) ? 2048 : 1024) | (b0kVar3.i(xpwVar) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            jp61 jp61Var = new jp61(gu61Var, jgb1Var, igb1Var, new eez0(aez0Var.b), (y441) this.i);
            b0kVar2 = b0kVar3;
            otw.c(xpwVar, jp61Var, (qim0) null, wpb1.D(xcg1.i(rc11.a.b(xpwVar.getClass()).r(), ".", jgb1Var.a), xpwVar, jp61Var, b0kVar3, ((i3 >> 9) & 112) | 512), b0kVar2, ((i3 >> 12) & 14) | 64, 4);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((Object) this, (Object) gu61Var, (Object) aez0Var, (Object) jgb1Var, (Object) igb1Var, (Object) xpwVar, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public void h(iez0 iez0Var, aez0 aez0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1263129479);
        int i2 = i | (x340Var.i(iez0Var) ? 4 : 2) | (x340Var.i(aez0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            bez0 bez0Var = iez0Var.a;
            if (bez0Var == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hez0(this, iez0Var, aez0Var, i, (byte) 1);
                    return;
                }
                return;
            }
            gu61 gu61Var = bez0Var.a;
            sq61 sq61Var = aez0Var.a;
            boolean z = sq61Var instanceof jgb1;
            jgb1 jgb1Var = z ? (jgb1) sq61Var : null;
            igb1 igb1Var = jgb1Var != null ? jgb1Var.m : null;
            if (z && (igb1Var instanceof ibd1)) {
                x340Var.i0(-1608306063);
                g(gu61Var, aez0Var, (jgb1) sq61Var, igb1Var, (xpw) ((ynb0) this.h).get(), x340Var, ((i2 << 9) & 458752) | (i2 & 112));
                x340Var.r(false);
            } else {
                igb1 igb1Var2 = igb1Var;
                if (z && (igb1Var2 instanceof xxm0) && ((xxm0) igb1Var2).e != null) {
                    x340Var.i0(-1608300135);
                    g(gu61Var, aez0Var, (jgb1) sq61Var, igb1Var2, (xpw) ((ynb0) this.t).get(), x340Var, (i2 & 112) | ((i2 << 9) & 458752));
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1608296547);
                    iko1.m(cnx.c, cwl1.o0(x340Var, 2131962134), (qim0) null, false, (String) null, new gax((Integer) null, cwl1.o0(x340Var, 2131962134)), (gbx) null, (iu30) null, x340Var, cnx.d, 220);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new hez0(this, iez0Var, aez0Var, i, (byte) 0);
        }
    }

    public kuy(dez0 dez0Var, ynb0 ynb0Var, ynb0 ynb0Var2, y441 y441Var, ynb0 ynb0Var3, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.f = dez0Var;
        this.g = ynb0Var;
        this.h = ynb0Var2;
        this.i = y441Var;
        this.t = ynb0Var3;
        this.b = z;
        this.c = z2;
        this.d = x3p1.n(new fbz0(this, (byte) 7), lcz0.h, j8y0.X0, (o8n) null, (iu30) null, 24);
        this.X = new eih1();
        j2i j2iVar = new j2i(1939875442, new zyy0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
