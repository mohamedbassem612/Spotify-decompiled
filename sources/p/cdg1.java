package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cdg1 implements zu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ u710 Y;
    public final /* synthetic */ List a;
    public final /* synthetic */ xv81 b;
    public final /* synthetic */ yxb0 c;
    public final /* synthetic */ wcg1 d;
    public final /* synthetic */ ng20 e;
    public final /* synthetic */ et90 f;
    public final /* synthetic */ ou8 g;
    public final /* synthetic */ zhy h;
    public final /* synthetic */ qj0 i;
    public final /* synthetic */ ldo t;

    public cdg1(List list, xv81 xv81Var, yxb0 yxb0Var, wcg1 wcg1Var, ng20 ng20Var, et90 et90Var, ou8 ou8Var, zhy zhyVar, qj0 qj0Var, ldo ldoVar, boolean z, u710 u710Var) {
        this.a = list;
        this.b = xv81Var;
        this.c = yxb0Var;
        this.d = wcg1Var;
        this.e = ng20Var;
        this.f = et90Var;
        this.g = ou8Var;
        this.h = zhyVar;
        this.i = qj0Var;
        this.t = ldoVar;
        this.X = z;
        this.Y = u710Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        ku8 ku8Var;
        int i2;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            jx31 jx31Var = (jx31) this.a.get(iIntValue);
            x340Var2.i0(-1463570152);
            if (jx31Var instanceof ix31) {
                x340Var2.i0(-601403850);
                ix31 ix31Var = (ix31) jx31Var;
                otw.c(this.b, new bye1(ix31Var.b, ix31Var.d, ix31Var.c, ix31Var.e), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof hx31) {
                x340Var2.i0(-601392270);
                String str = this.d.f;
                hx31 hx31Var = (hx31) jx31Var;
                String str2 = hx31Var.a;
                int i3 = hx31Var.b;
                int i4 = hx31Var.c;
                String str3 = hx31Var.d;
                z0e1 z0e1Var = new z0e1(hx31Var.e, hx31Var.f);
                boolean z = hx31Var.g;
                boolean z2 = hx31Var.h;
                int iOrdinal = hx31Var.i.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else if (iOrdinal == 1) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                otw.c(this.c, new sde1(str, str2, i3, i4, str3, z0e1Var, z, z2, i2, hx31Var.t), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof cx31) {
                x340Var2.i0(-601369273);
                cx31 cx31Var = (cx31) jx31Var;
                otw.c(this.e, new xr70(cx31Var.a, cx31Var.b, cx31Var.c, cx31Var.d, cx31Var.e, cx31Var.f, cx31Var.g, cx31Var.h), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof dx31) {
                x340Var2.i0(-601350451);
                dx31 dx31Var = (dx31) jx31Var;
                otw.c(this.f, new p7f0(dx31Var.a, dx31Var.b, 0, dx31Var.c, dx31Var.d, dx31Var.e, dx31Var.f, true, 260), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof yw31) {
                x340Var2.i0(-601334672);
                int iC = l1d.C(((yw31) jx31Var).a);
                if (iC == 2) {
                    ku8Var = ku8.b;
                } else if (iC != 3) {
                    ku8Var = iC != 4 ? ku8.a : ku8.d;
                } else {
                    ku8Var = ku8.c;
                }
                otw.c(this.g, new lu8(ku8Var), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof zw31) {
                x340Var2.i0(-601327412);
                zw31 zw31Var = (zw31) jx31Var;
                why whyVar = new why(z4p1.G(f5p1.k(x340Var2, 2131101393)), zw31Var.a, zw31Var.d, zw31Var.b, zw31Var.c, zw31Var.e, zw31Var.f, zw31Var.g, true);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                otw.c(this.h, whyVar, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7), (ipb1) null, x340Var2, 0, 8);
                x340Var2.r(false);
            } else if (jx31Var instanceof ww31) {
                x340Var2.i0(-601303668);
                ww31 ww31Var = (ww31) jx31Var;
                otw.c(this.i, new iw0(ww31Var.b, ww31Var.c, ww31Var.a, ww31Var.d, true), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof ex31) {
                x340Var2.i0(-601290679);
                ex31 ex31Var = (ex31) jx31Var;
                otw.c(this.t, new f2n0(ex31Var.b, ex31Var.c, ex31Var.a, ex31Var.d, ex31Var.e, ex31Var.f), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else if (jx31Var instanceof ax31) {
                x340Var2.i0(-601275776);
                if (this.X) {
                    x340Var2.i0(-1459658325);
                    ax31 ax31Var = (ax31) jx31Var;
                    otw.c(this.Y, new t710(ax31Var.a, 48, ax31Var.b, ax31Var.c, true, (String) null), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1459302197);
                    fdg1.d(x340Var2, 0);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else if (jx31Var instanceof bx31) {
                x340Var2.i0(-601261095);
                fdg1.d(x340Var2, 0);
                x340Var2.r(false);
            } else {
                if (!(jx31Var instanceof gx31)) {
                    throw p3d1.k(x340Var2, -601401269, false);
                }
                x340Var2.i0(-601256912);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
