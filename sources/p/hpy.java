package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hpy extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpy(Set set, String str, boolean z, boolean z2, fgx0 fgx0Var, n4b n4bVar) {
        super(3);
        this.d = set;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = fgx0Var;
        this.g = n4bVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Set set = (Set) obj7;
                    String str = (String) obj6;
                    fgx0 fgx0Var = (fgx0) obj5;
                    n4b n4bVar = (n4b) obj4;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    j9k1.d(set, str, (qim0) null, z2 ? 2 : 1, x340Var2, 0, 4);
                    if (z) {
                        x340Var2.i0(-1646427401);
                        sgc1.q(fgx0Var, n4bVar, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1646349560);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                float f = ((p3v) obj).a;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.d(f) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    qim0 qim0VarL = bmq0.L(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), (d6o0) obj7, (g6o0) null);
                    era eraVar = een.Q0;
                    xv60 xv60Var = (xv60) obj6;
                    sv60 sv60Var = (sv60) obj5;
                    ls60 ls60Var = sv60Var.c;
                    iu30 iu30Var = (iu30) obj4;
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarL);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    lw60 lw60Var = (lw60) ((a680) xv60Var.f.a.c).a;
                    c8o.l((c9c0) lw60Var.d.get());
                    Context context = (Context) lw60Var.e.get();
                    c8o.l(context);
                    vu60 vu60Var = (vu60) lw60Var.f.get();
                    c8o.l(vu60Var);
                    otw.c(new ng20(context, vu60Var), tto1.t(ls60Var), uyn1.y(u291.f(nim0Var, 1.0f), 8.0f, z2 ? 8.0f : 4.0f), (ipb1) null, x340Var4, 0, 8);
                    if (z) {
                        x340Var4.i0(-309051082);
                        boolean zG = x340Var4.g(iu30Var);
                        Object objT = x340Var4.T();
                        if (zG || objT == m4cVar) {
                            objT = new u460(iu30Var, (byte) 11);
                            x340Var4.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean zG2 = x340Var4.g(iu30Var);
                        Object objT2 = x340Var4.T();
                        if (zG2 || objT2 == m4cVar) {
                            objT2 = new u460(iu30Var, (byte) 12);
                            x340Var4.s0(objT2);
                        }
                        sto1.g(function0, (Function0) objT2, (qim0) null, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-308827448);
                        ojp ojpVar = xv60Var.g;
                        lbl0 lbl0Var = xv60Var.d;
                        a680 a680Var = (a680) ojpVar.a.c;
                        vu60 vu60Var2 = (vu60) ((lw60) a680Var.a).f.get();
                        c8o.l(vu60Var2);
                        smp0 smp0Var = new smp0(vu60Var2, (pjp) ((jly0) a680Var.c).get(), lbl0Var);
                        vr60 vr60Var = new vr60(sv60Var.b);
                        ArrayList<js60> arrayList = ls60Var.b.a;
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (js60 js60Var : arrayList) {
                            ps60 ps60Var = js60Var.a;
                            arrayList2.add(new qgs0(ps60Var != null ? new pgs0(ps60Var.a, ps60Var.b, ps60Var.c) : null, js60Var.b, js60Var.e));
                        }
                        otw.c(smp0Var, new rgs0(f, arrayList2, vr60Var), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var4, 0, 8);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    pl80 pl80Var = (pl80) obj7;
                    iu30 iu30Var2 = (iu30) obj6;
                    iu30 iu30Var3 = (iu30) obj5;
                    kl80 kl80Var = (kl80) obj4;
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var6, 0);
                    int iHashCode3 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM3 = x340Var6.m();
                    qim0 qim0VarE3 = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA3, x340Var6, y580.O0);
                    nko1.H(xos0VarM3, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE3, x340Var6, y580.Y);
                    fq7.b(pbh.a, this.b, (qim0) null, xay.d((ni20) null, (fra) null, 15), xay.l(15, (ni20) null), (String) null, apo.r(84366277, new hh1(this.c, pl80Var, iu30Var2, iu30Var3, kl80Var), x340Var6), x340Var6, 1600518, 18);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    x0d.s(nim0Var, 8.0f, x340Var6, true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpy(d6o0 d6o0Var, xv60 xv60Var, sv60 sv60Var, boolean z, boolean z2, iu30 iu30Var) {
        super(3);
        this.d = d6o0Var;
        this.e = xv60Var;
        this.f = sv60Var;
        this.b = z;
        this.c = z2;
        this.g = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpy(boolean z, boolean z2, pl80 pl80Var, iu30 iu30Var, iu30 iu30Var2, kl80 kl80Var) {
        super(3);
        this.b = z;
        this.c = z2;
        this.d = pl80Var;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = kl80Var;
    }
}
