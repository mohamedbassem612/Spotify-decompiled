package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class na2 implements h0r0 {
    public final qyj a;
    public final sa2 b;
    public final ycc1 c;
    public final Flowable d;
    public final dg0 e;
    public final o7r0 f;
    public final xxo g;
    public final f1n0 h;
    public final kly0 i;
    public final ien0 j;
    public final cbr0 k;

    public na2(qyj qyjVar, sa2 sa2Var, ycc1 ycc1Var, Flowable flowable, dg0 dg0Var, o7r0 o7r0Var, xxo xxoVar, f1n0 f1n0Var, fwo fwoVar) {
        this.a = qyjVar;
        this.b = sa2Var;
        this.c = ycc1Var;
        this.d = flowable;
        this.e = dg0Var;
        this.f = o7r0Var;
        this.g = xxoVar;
        this.h = f1n0Var;
        this.i = fwoVar;
        ien0 ien0Var = new ien0((Object) null);
        this.j = ien0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.k = new cbr0(new dbr0[]{new bn70(yon1.G(), nik1.V6, (nar0) null), new a6o0(ien0Var), new q6b(Collections.singleton("/account/parental-consent"), true), new t1r0(true), new s9h1(14, true, false, false), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.k;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(-867944635, new la2(this, (byte) 4), true));
    }

    public final void c(b0k b0kVar, int i) {
        na2 na2Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-741940672);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(this) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d4(this, ven0Var, (byte) 28);
                x340Var.s0(objT2);
            }
            qxd0.i(this.d, (iu30) objT2, x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = xto.t((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = xto.t((Object) null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT5);
            }
            c9n c9nVar = (c9n) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = this.g.a(c9nVar, new ma0(ven0Var2, (byte) 10), new ma0(ven0Var3, (byte) 11));
                x340Var.s0(objT6);
            }
            ra2 ra2Var = (ra2) objT6;
            if (ven0Var.getValue() != null) {
                x340Var.i0(-1251925884);
                Object objT7 = x340Var.T();
                sa2 sa2Var = this.b;
                if (objT7 == m4cVar) {
                    String strB = sa2Var.b();
                    Bundle bundleA = sa2Var.a();
                    if (bundleA != null) {
                        bundleA.putBoolean("block_navigation", false);
                    } else {
                        bundleA = null;
                    }
                    qe2 qe2Var = new qe2(strB, bundleA);
                    x340Var.s0(qe2Var);
                    objT7 = qe2Var;
                }
                bab1 bab1VarR = prn1.r((re2) objT7, x340Var, 0);
                boolean zI2 = x340Var.i(ven0Var2) | x340Var.i(bab1VarR);
                Object objT8 = x340Var.T();
                if (zI2 || objT8 == m4cVar) {
                    objT8 = new ja2(bab1VarR, ven0Var2, (lnm) null, (byte) 0);
                    x340Var.s0(objT8);
                }
                qxd0.t(bab1VarR, x340Var, (vu30) objT8);
                Object objK = x340Var.k(mce0.a());
                dg30 dg30Var = objK instanceof dg30 ? (dg30) objK : null;
                Bundle bundleA2 = sa2Var.a();
                String string = bundleA2 != null ? bundleA2.getString("pending_deeplink_uri") : null;
                boolean zG = x340Var.g(string) | x340Var.i(bab1VarR);
                Object objT9 = x340Var.T();
                if (zG || objT9 == m4cVar) {
                    objT9 = new k2(string, bab1VarR, (lnm) null, (byte) 13);
                    x340Var.s0(objT9);
                }
                qxd0.t(string, x340Var, (vu30) objT9);
                boolean zI3 = x340Var.i(bab1VarR) | x340Var.i(dg30Var);
                Object objT10 = x340Var.T();
                if (zI3 || objT10 == m4cVar) {
                    objT10 = new d4(dg30Var, bab1VarR, (byte) 29);
                    x340Var.s0(objT10);
                }
                qxd0.h(dg30Var, bab1VarR, (iu30) objT10, x340Var);
                mwq0 mwq0VarG = cgj1.G(x340Var);
                boolean zI4 = x340Var.i(ven0Var3) | x340Var.i(mwq0VarG);
                Object objT11 = x340Var.T();
                if (zI4 || objT11 == m4cVar) {
                    objT11 = new k2(mwq0VarG, ven0Var3, (lnm) null, (byte) 14);
                    x340Var.s0(objT11);
                }
                qxd0.t(mwq0VarG, x340Var, (vu30) objT11);
                Object objT12 = x340Var.T();
                if (objT12 == m4cVar) {
                    objT12 = new ma2(ra2Var, this, c9nVar);
                    x340Var.s0(objT12);
                }
                na2Var = this;
                mod.b(oce0.a().a((ma2) objT12), apo.r(1811350149, new m(mwq0VarG, bab1VarR, ven0Var, ra2Var, na2Var, (byte) 7), x340Var), x340Var, 56);
                x340Var.r(false);
            } else {
                na2Var = this;
                x340Var.i0(-1246361694);
                x340Var.r(false);
            }
        } else {
            na2Var = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new la2(na2Var, i);
        }
    }
}
