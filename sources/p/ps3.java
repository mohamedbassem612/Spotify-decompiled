package p;

import android.app.Activity;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ps3 implements h0r0 {
    public final hvj a;
    public final ns3 b;
    public final hs3 c;
    public final lzn0 d;
    public final Activity e;
    public final kly0 f;
    public final mly0 g;
    public final em3 h;
    public final o7r0 i;
    public final dg0 j;
    public final kly0 k;
    public final ien0 l;
    public final cbr0 m;

    public ps3(hvj hvjVar, rs3 rs3Var, ns3 ns3Var, hs3 hs3Var, lzn0 lzn0Var, Activity activity, fwo fwoVar, mly0 mly0Var, em3 em3Var, o7r0 o7r0Var, dg0 dg0Var, fwo fwoVar2, q7r0 q7r0Var) {
        this.a = hvjVar;
        this.b = ns3Var;
        this.c = hs3Var;
        this.d = lzn0Var;
        this.e = activity;
        this.f = fwoVar;
        this.g = mly0Var;
        this.h = em3Var;
        this.i = o7r0Var;
        this.j = dg0Var;
        this.k = fwoVar2;
        x8c0 lifecycle = q7r0Var.d.c.getLifecycle();
        lifecycle.a(new zh0(lifecycle, hs3Var, (byte) 1));
        ien0 ien0Var = new ien0((Object) null);
        this.l = ien0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarM = yon1.M();
        Parcelable.Creator creator = lik1.CREATOR;
        this.m = new cbr0(new dbr0[]{new bn70(p6r0VarM, oap1.i("spotify:internal:allboarding:origin:" + rs3Var.a().getUriSegment()), (nar0) null), new a6o0(ien0Var), new q6b(2, !rs3Var.a().getCanExit()), new qnr0(new pnr0(onr0.a, 3)), new hgr0(egr0.a, 0, 2), new pu00(true), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.m;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g(this.b), apo.j(1903174872, new ub3(this, (byte) 2), true));
    }

    public final void c(b0k b0kVar, int i) {
        h311 h311VarV;
        os3 os3Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(117610919);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ks3 ks3Var = this.c;
            ven0 ven0VarJ = xto.j(ks3Var.c(), x340Var);
            ven0 ven0VarJ2 = xto.j(ks3Var.b(), x340Var);
            fs3 fs3Var = (fs3) ven0VarJ2.getValue();
            boolean zI = x340Var.i(ven0VarJ2) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new k2(this, ven0VarJ2, (lnm) null, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.t(fs3Var, x340Var, (vu30) objT);
            boolean zI2 = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new g82(this, (byte) 16);
                x340Var.s0(objT2);
            }
            q3p1.b(0, 1, (Function0) objT2, x340Var, false);
            if (((ls3) ven0VarJ.getValue()).a().b() instanceof vo41) {
                x340Var.i0(-945861684);
                rqg0.i(x340Var, 0);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    os3Var = new os3(this, i, (byte) 0);
                }
            } else {
                x340Var.i0(-945816517);
                x340Var.r(false);
                if (((ls3) ven0VarJ.getValue()).a().b() instanceof yo41) {
                    x340Var.i0(-945758795);
                    boolean zI3 = x340Var.i(this);
                    Object objT3 = x340Var.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new kk(this, (lnm) null, (byte) 8);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        os3Var = new os3(this, i, (byte) 1);
                    }
                } else {
                    x340Var.i0(-945660773);
                    x340Var.r(false);
                    bab1 bab1VarR = prn1.r(rqg0.u(((ls3) ven0VarJ.getValue()).a()), x340Var, 0);
                    gu3 gu3VarU = rqg0.u(((ls3) ven0VarJ.getValue()).a());
                    boolean zI4 = x340Var.i(bab1VarR) | x340Var.g(gu3VarU);
                    Object objT4 = x340Var.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new k2(bab1VarR, gu3VarU, (lnm) null, (byte) 21);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(gu3VarU, x340Var, (vu30) objT4);
                    w9b1.a(bab1VarR, (qim0) null, apo.r(43889320, new wf(gu3VarU, this, (byte) 15), x340Var), x340Var, 384, 2);
                }
            }
            h311VarV.d = os3Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            os3Var = new os3(this, i, (byte) 3);
            h311VarV.d = os3Var;
        }
    }
}
