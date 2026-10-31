package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q7n implements gfh0 {
    public final /* synthetic */ r1c0 a;
    public final /* synthetic */ x6e1 b;
    public final /* synthetic */ crl1 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ c8e1 f;
    public final /* synthetic */ hyp0 g;
    public final /* synthetic */ wat h;
    public final /* synthetic */ j5c i;
    public final /* synthetic */ int j;

    public q7n(r1c0 r1c0Var, x6e1 x6e1Var, crl1 crl1Var, c9n c9nVar, iu30 iu30Var, c8e1 c8e1Var, hyp0 hyp0Var, wat watVar, j5c j5cVar, int i) {
        this.a = r1c0Var;
        this.b = x6e1Var;
        this.c = crl1Var;
        this.d = c9nVar;
        this.e = iu30Var;
        this.f = c8e1Var;
        this.g = hyp0Var;
        this.h = watVar;
        this.i = j5cVar;
        this.j = i;
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        r1c0 r1c0Var = this.a;
        r1c0Var.a.q(p890Var.getLayoutDirection());
        wp20 wp20Var = (wp20) r1c0Var.a.g;
        if (wp20Var != null) {
            return r2p1.h(wp20Var.d());
        }
        eg.m("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ba  */
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m670measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        y9e1 y9e1Var;
        int iK;
        wp20 wp20Var;
        y9e1 y9e1Var2;
        y9e1 y9e1Var3;
        wp20 wp20Var2;
        q7n q7nVar;
        r1c0 r1c0Var;
        r1c0 r1c0Var2 = this.a;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            z9e1 z9e1VarD = r1c0Var2.d();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            y9e1 y9e1Var4 = z9e1VarD != null ? z9e1VarD.a : null;
            uu0 uu0Var = r1c0Var2.a;
            flb0 layoutDirection = ifh0Var.getLayoutDirection();
            boolean z = uu0Var.a;
            int iP = Alert.DURATION_SHOW_INDEFINITELY;
            if (y9e1Var4 != null) {
                zrm0 zrm0Var = y9e1Var4.b;
                x9e1 x9e1Var = y9e1Var4.a;
                af5 af5Var = (af5) uu0Var.b;
                lee1 lee1Var = (lee1) uu0Var.c;
                List list2 = (List) uu0Var.f;
                wat watVar = (wat) uu0Var.d;
                f930 f930Var = (f930) uu0Var.e;
                if (zrm0Var.a.a()) {
                    y9e1Var = y9e1Var4;
                } else {
                    af5 af5Var2 = x9e1Var.a;
                    y9e1 y9e1Var5 = y9e1Var4;
                    long j2 = x9e1Var.j;
                    if (u890.j(af5Var2, af5Var) && x9e1Var.b.d(lee1Var) && u890.j(x9e1Var.c, list2) && x9e1Var.d == Integer.MAX_VALUE && x9e1Var.e == z && x9e1Var.f == 1 && u890.j(x9e1Var.g, watVar) && x9e1Var.h == layoutDirection && u890.j(x9e1Var.i, f930Var) && hjl.k(j) == hjl.k(j2) && (!z || (hjl.i(j) == hjl.i(j2) && hjl.h(j) == hjl.h(j2)))) {
                        y9e1Var3 = new y9e1(new x9e1(x9e1Var.a, (lee1) uu0Var.c, x9e1Var.c, x9e1Var.d, x9e1Var.e, x9e1Var.f, x9e1Var.g, x9e1Var.h, x9e1Var.i, j), zrm0Var, jjl.d(j, (((long) r2p1.h(zrm0Var.e)) & 4294967295L) | (((long) r2p1.h(zrm0Var.d)) << 32)));
                        y9e1Var2 = y9e1Var5;
                    } else {
                        y9e1Var = y9e1Var5;
                    }
                }
                uu0Var.q(layoutDirection);
                iK = hjl.k(j);
                if (z && hjl.e(j)) {
                    iP = hjl.i(j);
                }
                if (iK != iP) {
                    wp20Var2 = (wp20) uu0Var.g;
                    if (wp20Var2 != null) {
                        eg.m("layoutIntrinsics must be called first");
                        return null;
                    }
                    iP = yoi1.p(r2p1.h(wp20Var2.d()), iK, iP);
                }
                wp20Var = (wp20) uu0Var.g;
                if (wp20Var != null) {
                    eg.m("layoutIntrinsics must be called first");
                    return null;
                }
                zrm0 zrm0Var2 = new zrm0(wp20Var, m5n1.v(0, iP, 0, hjl.h(j)), Alert.DURATION_SHOW_INDEFINITELY, 1);
                y9e1Var2 = y9e1Var;
                y9e1Var3 = new y9e1(new x9e1((af5) uu0Var.b, (lee1) uu0Var.c, (List) uu0Var.f, Alert.DURATION_SHOW_INDEFINITELY, uu0Var.a, 1, (wat) uu0Var.d, layoutDirection, (f930) uu0Var.e, j), zrm0Var2, jjl.d(j, (((long) r2p1.h(zrm0Var2.d)) << 32) | (((long) r2p1.h(zrm0Var2.e)) & 4294967295L)));
            } else {
                y9e1Var = y9e1Var4;
                uu0Var.q(layoutDirection);
                iK = hjl.k(j);
                if (z) {
                    iP = hjl.i(j);
                }
                if (iK != iP) {
                    wp20Var2 = (wp20) uu0Var.g;
                    if (wp20Var2 != null) {
                        eg.m("layoutIntrinsics must be called first");
                        return null;
                    }
                    iP = yoi1.p(r2p1.h(wp20Var2.d()), iK, iP);
                }
                wp20Var = (wp20) uu0Var.g;
                if (wp20Var != null) {
                    eg.m("layoutIntrinsics must be called first");
                    return null;
                }
                zrm0 zrm0Var3 = new zrm0(wp20Var, m5n1.v(0, iP, 0, hjl.h(j)), Alert.DURATION_SHOW_INDEFINITELY, 1);
                y9e1Var2 = y9e1Var;
                y9e1Var3 = new y9e1(new x9e1((af5) uu0Var.b, (lee1) uu0Var.c, (List) uu0Var.f, Alert.DURATION_SHOW_INDEFINITELY, uu0Var.a, 1, (wat) uu0Var.d, layoutDirection, (f930) uu0Var.e, j), zrm0Var3, jjl.d(j, (((long) r2p1.h(zrm0Var3.d)) << 32) | (((long) r2p1.h(zrm0Var3.e)) & 4294967295L)));
            }
            long j3 = y9e1Var3.c;
            Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            zrm0 zrm0Var4 = y9e1Var3.b;
            zrm0Var4.a.a();
            y9e1 y9e1Var6 = y9e1Var2;
            if (u890.j(y9e1Var6, y9e1Var3)) {
                q7nVar = this;
                r1c0Var = r1c0Var2;
            } else {
                r1c0Var = r1c0Var2;
                r1c0Var.i.setValue(new z9e1(y9e1Var3, z9e1VarD != 0 ? z9e1VarD.c : null));
                r1c0Var.f124p = false;
                q7nVar = this;
                x6e1 x6e1Var = q7nVar.b;
                if (x6e1Var.i() && x6e1Var.h() && q7nVar.c.b() && nbe1.d(((nbe1) r1c0Var.A.getValue()).a) && nbe1.d(((nbe1) r1c0Var.B.getValue()).a) && r1c0Var.b()) {
                    if (!u890.j(y9e1Var6 != null ? y9e1Var6.a.a : null, y9e1Var3.a.a)) {
                        fn31.T(q7nVar.d, null, 0, new cuk(x6e1Var, q7nVar.i, (lnm) null, (byte) 21), 3);
                    }
                }
                q7nVar.e.invoke(y9e1Var3);
                eko1.B(r1c0Var, q7nVar.f, q7nVar.g);
            }
            r1c0Var.g.setValue(new p3v(q7nVar.h.M0(q7nVar.j == 1 ? r2p1.h(zrm0Var4.b(0)) : 0)));
            return ifh0Var.S(iIntValue, iIntValue2, sqg0.J(new mmr0[]{new mmr0(xl3.a, Integer.valueOf(Math.round(y9e1Var3.d))), new mmr0(xl3.b, Integer.valueOf(Math.round(y9e1Var3.e)))}), new u1c((byte) 12));
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }
}
