package p;

import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class deg1 implements zu30 {
    public final /* synthetic */ u710 X;
    public final /* synthetic */ List a;
    public final /* synthetic */ xv81 b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ et90 f;
    public final /* synthetic */ zhy g;
    public final /* synthetic */ qj0 h;
    public final /* synthetic */ ldo i;
    public final /* synthetic */ boolean t;

    public deg1(List list, xv81 xv81Var, Set set, Set set2, iu30 iu30Var, et90 et90Var, zhy zhyVar, qj0 qj0Var, ldo ldoVar, boolean z, u710 u710Var) {
        this.a = list;
        this.b = xv81Var;
        this.c = set;
        this.d = set2;
        this.e = iu30Var;
        this.f = et90Var;
        this.g = zhyVar;
        this.h = qj0Var;
        this.i = ldoVar;
        this.t = z;
        this.X = u710Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        q061 q061Var;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            jx31 jx31Var = (jx31) this.a.get(iIntValue);
            x340Var2.i0(-2095002115);
            if (jx31Var instanceof ix31) {
                x340Var2.i0(-621772359);
                ix31 ix31Var = (ix31) jx31Var;
                otw.c(this.b, new bye1(ix31Var.b, ix31Var.d, ix31Var.c, ix31Var.e), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else {
                boolean z2 = jx31Var instanceof gx31;
                iu30 iu30Var = this.e;
                if (z2) {
                    x340Var2.i0(-2094746366);
                    if (this.c.contains(Integer.valueOf(iIntValue))) {
                        q061Var = q061.a;
                    } else {
                        q061Var = this.d.contains(Integer.valueOf(iIntValue)) ? q061.b : q061.c;
                    }
                    q061 q061Var2 = q061Var;
                    gx31 gx31Var = (gx31) jx31Var;
                    String str = gx31Var.c;
                    z0e1 z0e1Var = new z0e1(gx31Var.e, gx31Var.f);
                    boolean z3 = gx31Var.d;
                    boolean zI = x340Var2.i(jx31Var) | x340Var2.g(iu30Var);
                    if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z4 = zI | z;
                    Object objT = x340Var2.T();
                    if (z4 || objT == m4cVar) {
                        objT = new ynd1(iu30Var, gx31Var, iIntValue);
                        x340Var2.s0(objT);
                    }
                    m6p1.m(str, z0e1Var, q061Var2, z3, (Function0) objT, x340Var2, 0);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                } else if (jx31Var instanceof cx31) {
                    x340Var2.i0(-621739116);
                    cx31 cx31Var = (cx31) jx31Var;
                    yr70 yr70Var = new yr70(cx31Var.a, cx31Var.b, cx31Var.c, cx31Var.d, cx31Var.e, cx31Var.f, cx31Var.g, true, cx31Var.h);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = q9f1.U0;
                        x340Var2.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT3 = x340Var2.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new ceg1(iu30Var, (byte) 0);
                        x340Var2.s0(objT3);
                    }
                    i1p1.h(yr70Var, function0, (iu30) objT3, x340Var2, 48);
                    x340Var2.r(false);
                } else if (jx31Var instanceof dx31) {
                    x340Var2.i0(-621718741);
                    dx31 dx31Var = (dx31) jx31Var;
                    otw.c(this.f, new p7f0(dx31Var.a, dx31Var.b, 0, dx31Var.c, dx31Var.d, dx31Var.e, dx31Var.f, false, 260), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else if (jx31Var instanceof zw31) {
                    x340Var2.i0(-621703548);
                    zw31 zw31Var = (zw31) jx31Var;
                    why whyVar = new why(z4p1.G(f5p1.k(x340Var2, 2131101393)), zw31Var.a, zw31Var.d, zw31Var.b, zw31Var.c, zw31Var.e, zw31Var.f, zw31Var.g, false);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    otw.c(this.g, whyVar, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7), (ipb1) null, x340Var2, 0, 8);
                    x340Var2.r(false);
                } else if (jx31Var instanceof ww31) {
                    x340Var2.i0(-621680882);
                    ww31 ww31Var = (ww31) jx31Var;
                    otw.c(this.h, new iw0(ww31Var.b, ww31Var.c, ww31Var.a, ww31Var.d, false), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else if (jx31Var instanceof ex31) {
                    x340Var2.i0(-621668677);
                    ex31 ex31Var = (ex31) jx31Var;
                    otw.c(this.i, new f2n0(ex31Var.b, ex31Var.c, ex31Var.a, ex31Var.d, ex31Var.e, false), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else if (jx31Var instanceof ax31) {
                    x340Var2.i0(-621655045);
                    if (this.t) {
                        x340Var2.i0(-2091415540);
                        ax31 ax31Var = (ax31) jx31Var;
                        otw.c(this.X, new t710(ax31Var.a, 48, ax31Var.b, ax31Var.c, true, (String) null), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-2091080678);
                        fdg1.d(x340Var2, 0);
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else if (jx31Var instanceof bx31) {
                    x340Var2.i0(-621641266);
                    fdg1.d(x340Var2, 0);
                    x340Var2.r(false);
                } else if (jx31Var instanceof hx31) {
                    x340Var2.i0(-621639675);
                    x340Var2.r(false);
                } else {
                    if (!(jx31Var instanceof yw31)) {
                        throw p3d1.k(x340Var2, -621770042, false);
                    }
                    x340Var2.i0(-621638331);
                    x340Var2.r(false);
                }
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
