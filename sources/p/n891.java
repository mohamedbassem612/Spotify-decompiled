package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.player.model.PlayOrigin;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n891 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n891(aua auaVar, iu30 iu30Var, ffe1 ffe1Var) {
        super(3);
        this.a = (byte) 28;
        this.b = auaVar;
        this.c = iu30Var;
        this.d = ffe1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.a, 0.0f, 2, qim0VarF);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            rl1 rl1Var = (rl1) ((ve8) this.b).b;
            tob1 tob1Var = (tob1) this.c;
            tob1 tob1Var2 = (tob1) this.d;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            vnr0 vnr0Var = (vnr0) ((qe8) rl1Var.c).invoke(x340Var2, 0);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            boolean zG = x340Var2.g(tob1Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new lq2(tob1Var, (byte) 10);
                x340Var2.s0(objT);
            }
            qgo1.f(vnr0Var, i541.C(qim0VarF2, (iu30) objT), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
            vnr0 vnr0Var2 = (vnr0) ((qe8) rl1Var.d).invoke(x340Var2, 0);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            boolean zG2 = x340Var2.g(tob1Var2);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new lq2(tob1Var2, (byte) 11);
                x340Var2.s0(objT2);
            }
            qgo1.f(vnr0Var2, i541.C(qim0VarF3, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var2, 8, 56);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        goj0 goj0VarA;
        mdz mdzVar;
        int i2;
        goj0 goj0VarA2;
        b9v0 b9v0Var;
        goj0 goj0VarA3;
        den denVar;
        goj0 goj0VarA4;
        n4v0 n4v0Var;
        String str = (String) obj;
        String str2 = (String) obj2;
        ioj0 ioj0Var = (ioj0) obj3;
        hoj0 hoj0VarC = ioj0Var.c(mdz.class, str);
        hoj0 hoj0VarC2 = ioj0Var.c(b9v0.class, str);
        hoj0 hoj0VarC3 = ioj0Var.c(n4v0.class, str2);
        String str3 = (hoj0VarC3 == null || (goj0VarA4 = hoj0VarC3.a()) == null || (n4v0Var = (n4v0) goj0VarA4.a) == null) ? null : n4v0Var.b;
        Context context = (Context) this.b;
        if (str3 != null) {
            i = 2131952724;
        } else {
            i = ((d281) this.c) == d281.c ? 2131952725 : 2131952726;
        }
        String string = context.getString(i);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (mdzVar = (mdz) goj0VarA.a) == null) {
            return r6g1.a;
        }
        yqg yqgVar = (yqg) this.d;
        kdz kdzVar = mdzVar.d;
        String str4 = kdzVar != null ? kdzVar.a : null;
        if (str4 == null) {
            str4 = "";
        }
        hoj0 hoj0VarC4 = ioj0Var.c(den.class, str2);
        xn70 xn70Var = new xn70(str4, (hoj0VarC4 == null || (goj0VarA3 = hoj0VarC4.a()) == null || (denVar = (den) goj0VarA3.a) == null) ? null : denVar.a, 4, (String) null);
        String str5 = mdzVar.c;
        wqo wqoVar = new wqo(string);
        kyl kylVar = mdzVar.a().contains(jdz.b) ? kyl.a : null;
        jyl jylVar = jyl.a;
        if (!mdzVar.a().contains(jdz.a)) {
            jylVar = null;
        }
        u380 u380VarC = mqo1.C(dm61.B0(new lyl[]{kylVar, jylVar}));
        String str6 = mdzVar.m;
        o5a1 o5a1Var = new o5a1((Long) null);
        sz6 sz6Var = new sz6(mdzVar.e.b);
        long time = mdzVar.o.a(yqgVar.d()).getTime();
        long j = mdzVar.n;
        if (mdzVar.l) {
            i2 = 0;
        } else {
            int i3 = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null || (b9v0Var = (b9v0) goj0VarA2.a) == null) ? 0 : b9v0Var.c;
            int i4 = i3 == 0 ? -1 : ema.a[l1d.C(i3)];
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        return new q6g1(xn70Var, new bv11(str5, str6, Long.valueOf(time), Long.valueOf(j), u380VarC, i2, true, oqn1.q(mdzVar), (h540) null, (vno1) null, (c380) null, sz6Var, false, (String) null, (Long) null, 0L, o5a1Var, wqoVar, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 66909952));
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        pdp1.d((aua) this.b, (iu30) this.c, (ffe1) this.d, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 12) & 57344);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        qim0 qim0VarD;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Object obj14 = null;
        rih1 rih1Var = rih1.a;
        Object obj15 = this.d;
        Object obj16 = this.b;
        Object obj17 = this.c;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                bke1 bke1Var = (bke1) obj17;
                r891 r891Var = (r891) obj16;
                if (r891Var instanceof p891) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-2105836945);
                    wat watVar = (wat) x340Var2.k(t4k.h);
                    float fX0 = watVar.X0(i2cVar.d());
                    float fX1 = watVar.X0(i2cVar.c());
                    float f = fX0 > fX1 ? ((p891) r891Var).a : 0.68f;
                    float f2 = fX1 * 0.75f;
                    if (fX0 / f2 < f) {
                        f2 = fX0 / f;
                    } else {
                        fX0 = f2 * f;
                    }
                    qim0VarD = i2cVar.a(u291.s(nim0Var, watVar.N0(fX0), watVar.N0(f2)), een.h);
                    x340Var2.r(false);
                } else {
                    if (!(r891Var instanceof q891)) {
                        throw p3d1.k(x340Var, -1037763301, false);
                    }
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1037726731);
                    x340Var3.r(false);
                    qim0VarD = u291.d(nim0Var, 1.0f);
                }
                if (!(bke1Var instanceof bke1)) {
                    throw p3d1.k(x340Var, -1037724300, false);
                }
                x340 x340Var4 = x340Var;
                x340Var4.i0(-1037721636);
                Function0 function0 = bke1Var.a;
                long j = bke1Var.b;
                uwr uwrVar = cbx.a;
                xpv0 xpv0Var = cbx.c(x340Var4).c;
                cke1 cke1Var = new cke1(function0, j, xpv0.b());
                x340Var4.r(false);
                qim0 qim0VarThen = qim0VarD.then(cke1Var);
                j2i j2iVar = (j2i) obj15;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
                hzj.A.getClass();
                x340 x340Var5 = x340Var;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(x340Var, 0);
                x340Var5.r(true);
                return rih1Var;
            case 1:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gto1.a(((wz31) obj16).d, (n041) obj17, x340Var7, 0);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var7).b;
                    qim0 qim0VarX = uyn1.x(qim0VarD2, 12.0f);
                    p041 p041Var = (p041) obj15;
                    n041 n041Var = (n041) obj17;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var7, 0);
                    int iHashCode2 = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM2 = x340Var7.m();
                    qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(mbhVarA, x340Var7, y580.O0);
                    nko1.H(xos0VarM2, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE2, x340Var7, y580.Y);
                    gto1.e(p041Var, n041Var, x340Var7, 0);
                    kk0.s(1.0f, true, x340Var7);
                    vz31.c(p041Var.d, n041Var, o8.a(x340Var7).d, (qim0) null, x340Var7, 0);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                Function0 function1 = (Function0) obj16;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zG = x340Var9.g(function1);
                    Object objT = x340Var9.T();
                    if (zG || objT == fkj0.X) {
                        obj4 = objT;
                        y1 y1Var = new y1(function1, (byte) 4);
                        x340Var9.s0(y1Var);
                        obj4 = y1Var;
                    }
                    obj4 = objT;
                    foo1.c(new gbx(z50.c, (Function0) obj4), jdx.c, anm1.N("account-details-action-row-button", nim0Var), (max) obj17, yla.s(x340Var9), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1174352990, new nl((String) obj15, (byte) 0), x340Var9), x340Var9, 432, 48, 1992);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 3:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                jkr0 jkr0Var = (jkr0) obj16;
                uwr uwrVar3 = cbx.a;
                float f3 = cbx.b(x340Var10).b.a;
                float fD = (i2cVar2.d() - i2cVar2.c()) / 2.0f;
                if (p3v.b(fD, f3) < 0) {
                    fD = f3;
                }
                hk0 hk0Var = new hk0(i2cVar2, f3);
                zzq0 zzq0VarH = uyn1.h(2, fD, 0.0f);
                float fC = p3v.b(i2cVar2.d(), i2cVar2.c()) > 0 ? i2cVar2.c() : i2cVar2.d();
                cvx cvxVar2 = cbx.b(x340Var10).b;
                float f4 = 8.0f - (fC * 0.05f);
                qim0 qim0VarN = anm1.N(vyd1.b, nim0Var);
                x340 x340Var11 = x340Var10;
                boolean zI = x340Var11.i(jkr0Var);
                Object objT2 = x340Var11.T();
                if (zI || objT2 == fkj0.X) {
                    obj5 = objT2;
                    fk0 fk0Var = new fk0(jkr0Var, (byte) 0);
                    x340Var11.s0(fk0Var);
                    obj5 = fk0Var;
                }
                obj5 = objT2;
                jkr0 jkr0Var2 = (jkr0) obj16;
                w0h1.c(jkr0Var2, s161.b(qim0VarN, false, (iu30) obj5), zzq0VarH, hk0Var, 0, f4, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-386863723, new gk0((jk0) obj17, jkr0Var2, (iu30) obj15, (byte) 0), x340Var11), x340Var11, 0, 16336);
                return rih1Var;
            case 4:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var12 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var12.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l4p1.a((spv) obj16, (t71) obj17, (iu30) obj15, uyn1.w(nim0Var, vzq0Var), x340Var13, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 5:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var14.g(vzq0Var2) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var15).b;
                    cvx cvxVar4 = cbx.b(x340Var15).b;
                    cvx cvxVar5 = cbx.b(x340Var15).b;
                    z4p1.a(f5p1.p((bb1) obj16), (iu30) obj17, (em0) obj15, lnn1.n(vzq0Var2, uyn1.j(16.0f, 16.0f, 16.0f, 0.0f, 8)), u291.d(nim0Var, 1.0f), x340Var15, 0);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 6:
                int iIntValue5 = ((Number) obj3).intValue();
                lf1 lf1Var = (lf1) obj16;
                lf1Var.getClass();
                i6p1.a(lf1Var, (qim0) null, (vzq0) obj, (iu30) obj17, ((nf1) obj15).d, (b0k) obj2, (iIntValue5 << 6) & 896);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                String str = ((umc0) obj16).a;
                iu30 iu30Var = (iu30) obj17;
                x340 x340Var16 = (b0k) obj2;
                lf1 lf1Var2 = (lf1) obj15;
                boolean zG2 = x340Var16.g(iu30Var) | x340Var16.g(lf1Var2);
                Object objT3 = x340Var16.T();
                if (zG2 || objT3 == fkj0.X) {
                    obj6 = objT3;
                    of1 of1Var = new of1(iu30Var, lf1Var2, (byte) 1);
                    x340Var16.s0(of1Var);
                    obj6 = of1Var;
                }
                obj6 = objT3;
                af5 af5VarA = huj.a(str, (iu30) obj6);
                uwr uwrVar5 = cbx.a;
                uwo1.d(af5VarA, cbx.a(x340Var16).b.b, uyn1.B(nim0.a, 24.0f, 0.0f, 24.0f, 16.0f, 2), cbx.d(x340Var16).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var16, 0, 0, 4080);
                return rih1Var;
            case 8:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj15;
                m4c m4cVar = fkj0.X;
                los losVar = (los) obj17;
                ven0 ven0Var2 = (ven0) obj16;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var17.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x340Var18.b0();
                } else if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    x340Var18.i0(-1892317499);
                    vu30Var.invoke(x340Var18, Integer.valueOf(iIntValue6 & 14));
                    boolean zI2 = x340Var18.i(ven0Var) | x340Var18.i(losVar);
                    Object objT4 = x340Var18.T();
                    if (zI2 || objT4 == m4cVar) {
                        obj7 = objT4;
                        k2 k2Var = new k2(losVar, ven0Var, (lnm) null, (byte) 8);
                        x340Var18.s0(k2Var);
                        obj7 = k2Var;
                    }
                    qxd0.t(losVar, x340Var18, (vu30) obj7);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-1892406748);
                    boolean zI3 = x340Var18.i(ven0Var2);
                    Object objT5 = x340Var18.T();
                    if (zI3 || objT5 == m4cVar) {
                        obj8 = objT5;
                        xj0 xj0Var = new xj0(ven0Var2, (byte) 5);
                        x340Var18.s0(xj0Var);
                        obj8 = xj0Var;
                    }
                    op71.g(x340Var18, irn1.g0(nim0Var, (iu30) obj8));
                    x340Var18.r(false);
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    g9p1.h(((c380) obj17).size() + ((c380) obj16).size() + 1, (ow1) obj15, (qim0) null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                int iIntValue8 = ((Number) obj).intValue();
                ot1 ot1Var = (ot1) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                av1 av1Var = (av1) obj17;
                String str2 = ot1Var.a;
                if (!zBooleanValue) {
                    boolean z = ot1Var.e;
                    wt1 wt1Var = (wt1) obj16;
                    String str3 = wt1Var.c;
                    gpk0 gpk0Var = wt1Var.b;
                    i8h1 i8h1Var = wt1Var.a;
                    List list = av1Var.d;
                    if (z) {
                        String str4 = (String) o7h.s0(list);
                        if (str4 == null) {
                            str4 = "";
                        }
                        Integer numValueOf = Integer.valueOf(iIntValue8);
                        x6h1 x6h1VarC = gpk0Var.a.c();
                        x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, str2, str3));
                        x6h1VarC.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str4)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else {
                        String str5 = (String) o7h.s0(list);
                        if (str5 == null) {
                            str5 = "";
                        }
                        Integer numValueOf2 = Integer.valueOf(iIntValue8);
                        x6h1 x6h1VarC2 = gpk0Var.a.c();
                        x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf2, str2, str3));
                        x6h1VarC2.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str5)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                ((xj0) obj15).invoke(new ss1(ot1Var));
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                lzh lzhVar = (lzh) obj16;
                ebr0 ebr0Var = lzhVar.a;
                Parcelable parcelable = lzhVar.b;
                b6r0 b6r0Var = (b6r0) obj17;
                x340 x340Var21 = (b0k) obj2;
                ecr0 ecr0VarE = b6r0Var.e((xnn0) x340Var21.k(aon0.a));
                phi0 phi0Var = b6r0Var.l;
                ezc ezcVar = b6r0Var.m;
                Function0 function2 = b6r0Var.e;
                na2 na2Var = (na2) obj15;
                boolean zI4 = x340Var21.i(na2Var);
                Object objT6 = x340Var21.T();
                if (zI4 || objT6 == fkj0.X) {
                    obj9 = objT6;
                    la2 la2Var = new la2(na2Var, (byte) 0);
                    x340Var21.s0(la2Var);
                    obj9 = la2Var;
                }
                obj9 = objT6;
                fc11.d(ebr0Var, parcelable, ecr0VarE, phi0Var, ezcVar, function2, (qim0) null, (vu30) obj9, x340Var21, 1572864);
                return rih1Var;
            case 12:
                re2 re2Var = (re2) obj;
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                ven0 ven0Var3 = (ven0) obj16;
                na2 na2Var2 = (na2) obj15;
                qe2 qe2Var = re2Var instanceof qe2 ? (qe2) re2Var : null;
                if (qe2Var != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(qe2Var.a));
                    Bundle bundle = qe2Var.b;
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                    x340 x340Var23 = x340Var22;
                    boolean zG3 = x340Var23.g((th61) ven0Var3.getValue()) | x340Var23.g(intent);
                    Object objT7 = x340Var23.T();
                    Object obj18 = objT7;
                    if (zG3 || objT7 == m4cVar2) {
                        ycc1 ycc1Var = na2Var2.c;
                        Object value = ven0Var3.getValue();
                        value.getClass();
                        lzh lzhVarK = ycc1Var.k(intent, (th61) value);
                        x340Var23.s0(lzhVarK);
                        obj18 = lzhVarK;
                    }
                    lzh lzhVar2 = (lzh) obj18;
                    b6r0 b6r0VarR = pdp1.r((ra2) obj17, na2Var2.f, na2Var2.e, na2Var2.i, x340Var23);
                    ebr0 ebr0Var2 = lzhVar2.a;
                    Parcelable parcelable2 = lzhVar2.b;
                    ecr0 ecr0VarE2 = b6r0VarR.e((xnn0) x340Var23.k(aon0.a));
                    phi0 phi0Var2 = b6r0VarR.l;
                    ezc ezcVar2 = b6r0VarR.m;
                    Function0 function3 = b6r0VarR.e;
                    boolean zI5 = x340Var23.i(na2Var2);
                    Object objT8 = x340Var23.T();
                    Object obj19 = objT8;
                    if (zI5 || objT8 == m4cVar2) {
                        la2 la2Var2 = new la2(na2Var2, (byte) 1);
                        x340Var23.s0(la2Var2);
                        obj19 = la2Var2;
                    }
                    fc11.d(ebr0Var2, parcelable2, ecr0VarE2, phi0Var2, ezcVar2, function3, (qim0) null, (vu30) obj19, x340Var23, 1572864);
                }
                return rih1Var;
            case 13:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                String str6 = (String) obj3;
                ((ven0) obj17).setValue(bool);
                ((ven0) obj15).setValue(str6);
                ((xu30) obj16).invoke((String) obj, bool, str6);
                return rih1Var;
            case 14:
                x06 x06Var = (x06) obj;
                afh0 afh0Var = (afh0) obj2;
                long j2 = ((hjl) obj3).a;
                int iIntValue9 = ((Number) ((v3t) obj16).a(Integer.valueOf((int) (x06Var.v0() & 4294967295L)), (c9n) obj17, (n8b1) obj15)).intValue();
                int iV0 = (int) (x06Var.v0() >> 32);
                if (!((iV0 >= 0) & (iIntValue9 >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                q5t0 q5t0VarH = afh0Var.H(jjl.h(iV0, iV0, iIntValue9, iIntValue9));
                return x06Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new f2(q5t0VarH, (byte) 5));
            case 15:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    gfx.b(18, apo.r(-1468261924, new oj2((pz50) obj16, (qd5) obj17, (ven0) obj15, (byte) 15), x340Var25), x340Var25, 54);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                l96 l96Var = (l96) obj16;
                x340 x340Var26 = (b0k) obj2;
                z3i1 z3i1Var = (z3i1) obj17;
                fa6 fa6Var = (fa6) obj15;
                boolean zI6 = x340Var26.i(fa6Var) | x340Var26.i(l96Var) | x340Var26.i(z3i1Var);
                Object objT9 = x340Var26.T();
                if (zI6 || objT9 == fkj0.X) {
                    obj10 = objT9;
                    f96 f96Var = new f96(l96Var, z3i1Var, fa6Var, (byte) 0);
                    x340Var26.s0(f96Var);
                    obj10 = f96Var;
                }
                obj10 = objT9;
                rwq.a(0, (Function0) obj10, x340Var26, (qim0) null);
                return rih1Var;
            case 17:
                x340 x340Var27 = (b0k) obj2;
                ((Number) obj3).intValue();
                zm7 zm7Var = (zm7) obj16;
                int iC = l1d.C(zm7Var.e);
                if (iC == 0) {
                    x340 x340Var28 = x340Var27;
                    x340Var28.i0(1570943409);
                    l6o1.f(zm7Var.a, (kko) obj17, (rzo) obj15, (qim0) null, x340Var28, 0);
                    x340Var28.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var27, -780610793, false);
                    }
                    x340 x340Var29 = x340Var27;
                    x340Var29.i0(1571075438);
                    l6o1.a(zm7Var.a, (kko) obj17, (qim0) null, x340Var29, 0);
                    x340Var29.r(false);
                }
                return rih1Var;
            case 18:
                x340 x340Var30 = (b0k) obj2;
                ((Number) obj3).intValue();
                yae1 yae1VarQ = d5p1.q(0, x340Var30, 1);
                x340 x340Var31 = x340Var30;
                wat watVar2 = (wat) x340Var31.k(t4k.h);
                uwr uwrVar6 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var31).j;
                zma1 zma1Var = lee1Var.a;
                zsc zscVar = zex.a;
                Integer num = (Integer) obj15;
                uwo1.f(bqn1.v((af5) obj16, zma1.a(zma1Var, ((vex) zscVar.e).m, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534), zma1.a(cbx.d(x340Var31).k.a, cbx.a(x340Var31).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534), zma1.a(cbx.d(x340Var31).k.a, cbx.a(x340Var31).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534), (Function0) obj17, yae1VarQ, lee1Var, (int) watVar2.X0(((i2c) obj).d()), num.intValue(), false, x340Var31, 0, 512), (qim0) null, lee1.a(lee1Var, ((vex) zscVar.e).m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (x9h) null, (a0e1) null, (iu30) null, 1, false, new cjc0(num.intValue()), 0, (qx8) null, (cqs0) null, x340Var31, 0, 0, 3770);
                return rih1Var;
            case 19:
                x340 x340Var32 = (b0k) obj2;
                ((Number) obj3).intValue();
                ven0 ven0VarK = f4p1.k(((bv6) obj).t, (iac0) null, x340Var32, 7);
                yv6 yv6Var = (yv6) obj16;
                bqk0 bqk0Var = yv6Var.t;
                x340 x340Var33 = x340Var32;
                boolean zI7 = x340Var33.i(yv6Var);
                Object objT10 = x340Var33.T();
                if (zI7 || objT10 == fkj0.X) {
                    obj11 = objT10;
                    xv6 xv6Var = new xv6(yv6Var, (byte) 1);
                    x340Var33.s0(xv6Var);
                    obj11 = xv6Var;
                }
                obj11 = objT10;
                dgo1.c(bqk0Var, (iu30) obj11, apo.r(1808191852, new wb6(yv6Var, (vv6) obj17, (PlayOrigin) obj15, ven0VarK, (byte) 13), x340Var33), x340Var33, 384);
                return rih1Var;
            case 20:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                zzq0 zzq0VarH2 = uyn1.h(2, (((i2c) obj).d() - 142.0f) / 2.0f, 0.0f);
                uwr uwrVar7 = cbx.a;
                cvx cvxVar6 = cbx.b(b0kVar).b;
                c380 c380Var = (c380) obj16;
                jkr0 jkr0Var3 = (jkr0) obj17;
                w0h1.c(jkr0Var3, (qim0) null, zzq0VarH2, new fdr0(142.0f), 0, 2.0f, (pl3) null, (ru91) null, c380Var.size() > 1, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-376434220, new gk0(jkr0Var3, c380Var, (c9n) obj15), b0kVar), b0kVar, 0, 16082);
                return rih1Var;
            case 21:
                vzq0 vzq0Var3 = (vzq0) obj;
                x340 x340Var34 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                q87 q87Var = (q87) obj17;
                rb7 rb7Var = (rb7) obj16;
                c9 c9Var = rb7Var.f;
                if (c9Var.isEmpty()) {
                    x340 x340Var35 = x340Var34;
                    x340Var35.i0(-1181784611);
                    q87Var.a(rb7Var, vzq0Var3, x340Var35, (iIntValue11 << 3) & 112);
                    x340Var35.r(false);
                } else {
                    x340 x340Var36 = x340Var34;
                    x340Var36.i0(2019485335);
                    ListIterator listIterator = c9Var.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        if (u890.j(((yrd) next).e, rb7Var.c)) {
                            obj14 = next;
                            x340Var36.i0(2019984745);
                            q87Var.c(rb7Var, (iu30) obj15, nmn1.m(vzq0Var3, (p3v) null, new p3v(0.0f), (p3v) null, (p3v) null, 13), uyn1.w(nim0Var, nmn1.m(vzq0Var3, new p3v(0.0f), (p3v) null, new p3v(0.0f), new p3v(0.0f), 2)), x340Var36, 0);
                            x340Var36.r(false);
                            x340Var36.r(false);
                        }
                    }
                    x340Var36.i0(2019984745);
                    q87Var.c(rb7Var, (iu30) obj15, nmn1.m(vzq0Var3, (p3v) null, new p3v(0.0f), (p3v) null, (p3v) null, 13), uyn1.w(nim0Var, nmn1.m(vzq0Var3, new p3v(0.0f), (p3v) null, new p3v(0.0f), new p3v(0.0f), 2)), x340Var36, 0);
                    x340Var36.r(false);
                    x340Var36.r(false);
                }
                return rih1Var;
            case 22:
                int iIntValue12 = ((Number) obj3).intValue();
                o88 o88Var = (o88) obj16;
                o88Var.getClass();
                suo1.a(o88Var, (qim0) null, (vzq0) obj, (iu30) obj17, ((q88) obj15).d, (b0k) obj2, (iIntValue12 << 6) & 896);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                h72 h72Var = (h72) obj16;
                qlb qlbVar = (qlb) h72Var.h;
                zuc0 zuc0Var = (zuc0) obj17;
                String str7 = zuc0Var.c;
                String str8 = zuc0Var.i;
                x340 x340Var37 = (b0k) obj2;
                hwq hwqVar = (hwq) obj15;
                boolean zI8 = x340Var37.i(h72Var) | x340Var37.i(hwqVar) | x340Var37.i(zuc0Var);
                Object objT11 = x340Var37.T();
                if (zI8 || objT11 == fkj0.X) {
                    obj12 = objT11;
                    oo6 oo6Var = new oo6(h72Var, hwqVar, zuc0Var, (byte) 4);
                    x340Var37.s0(oo6Var);
                    obj12 = oo6Var;
                }
                obj12 = objT11;
                otw.c(qlbVar, new lem(str7, str8, (iu30) obj12), (qim0) null, (ipb1) null, x340Var37, 0, 12);
                return rih1Var;
            case 24:
                return a(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var38 = (b0k) obj2;
                ((Number) obj3).intValue();
                wk9 wk9Var = (wk9) obj16;
                Function0 function4 = (Function0) obj17;
                xho xhoVar = (xho) obj15;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var38, 0);
                x340 x340Var39 = x340Var38;
                int iHashCode3 = Long.hashCode(x340Var39.T);
                xos0 xos0VarM3 = x340Var39.m();
                qim0 qim0VarE3 = zr7.E(x340Var38, nim0Var);
                hzj.A.getClass();
                x340 x340Var40 = x340Var38;
                if (x340Var40.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var40.m0();
                if (x340Var40.S) {
                    x340Var40.l(n4kVar);
                } else {
                    x340Var40.v0();
                }
                nko1.H(jw31VarA, x340Var38, y580.O0);
                nko1.H(xos0VarM3, x340Var38, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var38, y580.R0);
                nko1.F(x340Var38);
                nko1.H(qim0VarE3, x340Var38, y580.Y);
                String strN0 = cwl1.n0(2131953052, new Object[]{wk9Var.b}, x340Var38);
                boolean zG4 = x340Var40.g(function4);
                Object objT12 = x340Var40.T();
                if (zG4 || objT12 == fkj0.X) {
                    obj13 = objT12;
                    pj8 pj8Var = new pj8(function4, (byte) 2);
                    x340Var40.s0(pj8Var);
                    obj13 = pj8Var;
                }
                obj13 = objT12;
                wro1.h(new gbx(new y50(strN0), (Function0) obj13), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, n8i.a, x340Var38, 0, 6, 1020);
                otw.c(xhoVar, new uho(wk9Var.a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), (qim0) null, (ipb1) null, x340Var38, 8, 12);
                x340Var40.r(true);
                return rih1Var;
            case 26:
                return yoi1.g(yoi1.i(((oo70) obj16).b, o6x.a).map(new yu3((tif1) obj17, (dn41) obj3, (l3n1) obj, (kly0) obj15, (byte) 26)));
            case 27:
                return d(obj, obj2, obj3);
            case 28:
                return e(obj, obj2, obj3);
            default:
                m0d m0dVar = (m0d) obj;
                ((iu30) obj16).invoke(new lg80((at80) obj17, md80.c, 2, (eg80) obj3));
                ((iu30) obj15).invoke(new kdb(m0dVar.a, m0dVar.b, (String) obj2));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n891(bb1 bb1Var, iu30 iu30Var, em0 em0Var) {
        super(3);
        this.a = (byte) 5;
        this.b = bb1Var;
        this.c = iu30Var;
        this.d = em0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n891(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
