package p;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(mxr mxrVar, jwm1 jwm1Var, qim0 qim0Var, vzq0 vzq0Var, upb0 upb0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 23;
        this.b = mxrVar;
        this.c = jwm1Var;
        this.g = qim0Var;
        this.d = vzq0Var;
        this.e = upb0Var;
        this.f = iu30Var;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = ((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            float f2 = 16.0f;
            if (f > 1.0f) {
                x340Var2.i0(1348871731);
                yoo1.z(x340Var2);
                f2 = 16.0f * f;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1348958314);
                yoo1.z(x340Var2);
                x340Var2.r(false);
            }
            poo1.e((gbx) this.d, pex.b, yoo1.z(x340Var2), u291.r(nim0.a, ((tlc1) this.b).M0(((q5t0) this.c).X())), 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) this.e, (ga80) null, false, (vzq0) null, apo.r(-484544936, new gf(f2, (hux) this.f, (jsl) this.g, (byte) 5), x340Var2), x340Var2, 48, 3072, 7664);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    private final Object d(Object obj, Object obj2) {
        boolean z;
        boolean zI;
        Object objT;
        boolean zI2;
        muo muoVar;
        Object objT2;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        a5y a5yVar = (a5y) this.d;
        c5y c5yVar = (c5y) this.c;
        boolean zD = false;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            l5y l5yVar = (l5y) this.b;
            l5y l5yVar2 = new l5y(l5yVar.a, l5yVar.b, l5yVar.c, l5yVar.d, l5yVar.e && ((Boolean) ((ven0) this.g).getValue()).booleanValue());
            otu otuVar = c5yVar.c;
            bpu bpuVar = a5yVar.a;
            if (bpuVar == null) {
                zD = c5yVar.f.a.d();
            } else {
                if (bpuVar instanceof apu) {
                    z = true;
                } else if (!(bpuVar instanceof zou)) {
                    eg.o();
                    return null;
                }
                iu30 iu30Var = (iu30) this.f;
                zI = x340Var2.i(c5yVar);
                objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new v7v(c5yVar, (byte) 26);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                Object obj3 = this.e;
                muo muoVar2 = (muo) obj3;
                zI2 = x340Var2.i(muoVar2) | x340Var2.i(a5yVar);
                muoVar = (muo) obj3;
                objT2 = x340Var2.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new w3w(muoVar, a5yVar, (byte) 17);
                    x340Var2.s0(objT2);
                }
                rwq0.c(l5yVar2, iu30Var, otuVar, function0, (qim0) null, muoVar2, (iu30) objT2, z, x340Var2, 0);
            }
            z = zD;
            iu30 iu30Var2 = (iu30) this.f;
            zI = x340Var2.i(c5yVar);
            objT = x340Var2.T();
            if (zI) {
                objT = new v7v(c5yVar, (byte) 26);
                x340Var2.s0(objT);
            } else {
                objT = new v7v(c5yVar, (byte) 26);
                x340Var2.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            Object obj4 = this.e;
            muo muoVar3 = (muo) obj4;
            zI2 = x340Var2.i(muoVar3) | x340Var2.i(a5yVar);
            muoVar = (muo) obj4;
            objT2 = x340Var2.T();
            if (zI2) {
                objT2 = new w3w(muoVar, a5yVar, (byte) 17);
                x340Var2.s0(objT2);
            } else {
                objT2 = new w3w(muoVar, a5yVar, (byte) 17);
                x340Var2.s0(objT2);
            }
            rwq0.c(l5yVar2, iu30Var2, otuVar, function1, (qim0) null, muoVar3, (iu30) objT2, z, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    private final Object e(Object obj, Object obj2) {
        boolean z;
        kpc kpcVar = (kpc) obj;
        sqy sqyVar = (sqy) this.b;
        boolean z2 = sqyVar.r;
        Object obj3 = this.c;
        if (z2) {
            Set set = s4b1.f;
            if (uic.g((String) obj3, blc0.M3)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        kpc.e(kpcVar, "", new jqy(z, sqyVar, (String) obj3, (mr20) this.d, (lzn0) this.e, (String) this.f, (d0r) this.g), 6);
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0Var;
        gfn0 gfn0VarA;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Object obj3 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.b;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vyo1.a((e40) obj6, (xho) obj3, (hft0) obj4, (xgx0) obj8, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(4161));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarF = u291.f(anm1.N("add-account-type-selection-column-test-tag", qim0Var2), 1.0f);
                    kiv kivVar = xce0.a;
                    qim0 qim0VarH = l6o1.H(zr7.i(qim0VarF, gce0.c), l6o1.C(0, 0, 1, x340Var2), false, 14);
                    u85 u85Var = (erl1) x340Var2.k(szf0.b);
                    if (u85Var == null) {
                        x340Var2.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var2).g;
                    } else {
                        x340Var2.i0(-241885792);
                    }
                    x340Var2.r(false);
                    qim0 qim0VarY = too1.y(qim0VarH, new bgc0(u85Var, 32));
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarY, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    uk81 uk81Var = (uk81) obj6;
                    t71 t71Var = (t71) obj3;
                    kse0 kse0Var = (kse0) obj4;
                    spv spvVar = (spv) obj8;
                    fgg0 fgg0Var = (fgg0) obj7;
                    f9t0 f9t0Var = (f9t0) obj5;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    jto1.b((qim0) null, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, u3i.a, x340Var2, 0, 196608, 32767);
                    otw.c(uk81Var, new tk81(t71Var.f), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    otw.c(kse0Var, jse0.a, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    List list = t71Var.a;
                    y8t0 y8t0Var = (y8t0) o7h.X0(list);
                    if (u890.j(y8t0Var != null ? y8t0Var.b : null, t71Var.g)) {
                        list = null;
                    }
                    if (list == null) {
                        x340Var2.i0(-1949340843);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1949340842);
                        int i = 0;
                        for (Object obj9 : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw null;
                            }
                            y8t0 y8t0Var2 = (y8t0) obj9;
                            otw.c(f9t0Var, new c9t0(y8t0Var2.a, y8t0Var2.b, y8t0Var2.c, y8t0Var2.d, y8t0Var2.e, i), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                            i = i2;
                        }
                        x340Var2.r(false);
                    }
                    if (t71Var.e) {
                        x340Var2.i0(-1948853274);
                        rpv rpvVar = new rpv(true);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        qim0Var = qim0Var2;
                        otw.c(spvVar, rpvVar, uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var2, 0, 8);
                        x340Var2.r(false);
                    } else {
                        qim0Var = qim0Var2;
                        x340Var2.i0(-1948641854);
                        x340Var2.r(false);
                    }
                    if (t71Var.b) {
                        x340Var2.i0(-1948588813);
                        egg0 egg0Var = new egg0(t71Var.d, true);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        otw.c(fgg0Var, egg0Var, uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var2, 0, 8);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1948236126);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                b5p1.a((bb1) obj6, (iu30) obj7, (em0) obj3, (d0r) obj4, (g5l0) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                u7n0.o((String) obj6, (String) obj3, (iu30) obj7, (Function0) obj4, (Function0) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                fq7.c((zen0) obj6, (qim0) obj5, (bby) obj3, (ln00) obj4, (String) obj8, (j2i) obj7, (b0k) obj, czo1.p(1572871));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                l6o1.b((ac6) obj6, (kko) obj3, (rzo) obj4, (gw70) obj8, (iu30) obj7, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                c21 c21Var = (c21) obj8;
                tob1 tob1Var = (tob1) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uh6 uh6Var = (uh6) obj6;
                    uh6 uh6Var2 = (uh6) obj3;
                    boolean zG = x340Var4.g(tob1Var) | x340Var4.g(c21Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new cc2(tob1Var, c21Var, (byte) 29);
                        x340Var4.s0(objT);
                    }
                    qim0 qim0VarC = i541.C(nim0Var, (iu30) objT);
                    zho1.b(uh6Var, uh6Var2, ((Boolean) ((ven0) obj5).getValue()).booleanValue() ? s161.a(qim0VarC, ag6.f) : s161.b(qim0VarC, true, new lg6((w0d) obj7, (byte) 1)), x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) obj5;
                ven0 ven0Var = (ven0) obj7;
                vy71 vy71Var = (vy71) obj8;
                c9n c9nVar = (c9n) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = (String) obj6;
                    ArrayList arrayList = (ArrayList) obj3;
                    boolean zI = x340Var6.i(c9nVar) | x340Var6.i(vy71Var) | x340Var6.i(ven0Var) | x340Var6.g(vu30Var);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new wb6(c9nVar, vy71Var, vu30Var, ven0Var, (byte) 7);
                        x340Var6.s0(objT2);
                    }
                    mmo1.h(str, arrayList, (vu30) objT2, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                u2p1.c((wn9) obj6, (j2i) obj3, (j2i) obj4, (j2i) obj8, (Function0) obj7, (qim0) obj5, (b0k) obj, czo1.p(3505));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                w2b.b((String) obj6, (euc1) obj3, (it8) obj4, (vu30) obj8, (Function0) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                rqg0.d((String) obj6, (String) obj3, (String) obj4, (String) obj8, (k4m) obj7, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((cp31) obj6).l((o5e0) obj3, (xpw) obj4, (g9c) obj8, (qim0) obj5, (j2i) obj7, (b0k) obj, czo1.p(25089));
                return rih1Var;
            case 12:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarD, cbx.a(x340Var8).a.c, d4o1.a);
                    WeakHashMap weakHashMap2 = osl1.x;
                    qim0 qim0VarY2 = too1.y(qim0VarF2, new mih1(lhc.g(x340Var8).l, lhc.g(x340Var8).c));
                    y7e1 y7e1Var = (y7e1) obj6;
                    xtb0 xtb0Var = (xtb0) obj3;
                    List list2 = (List) obj4;
                    m0d m0dVar = (m0d) obj8;
                    iu30 iu30Var = (iu30) obj7;
                    Function0 function0 = (Function0) obj5;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var8, 0);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarY2);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA2, x340Var8, y580.O0);
                    nko1.H(xos0VarM2, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, y580.Y);
                    ti5.a(lai.a, (qim0) null, apo.r(-1156709168, new wm(function0, (byte) 16), x340Var8), (xu30) null, 0.0f, (erl1) null, kkn.C(u7h.j, 0L, 0L, 0L, 0L, x340Var8, 62), x340Var8, 390, 186);
                    rwo1.b(y7e1Var, uyn1.y(u291.f(nim0Var, 1.0f), 16.0f, 8.0f), (max) null, cwl1.o0(x340Var8, 2131961513), lai.b, (vu30) null, false, false, (dk80) null, (lee1) null, new kua0(0, (Boolean) null, 0, 3, 119), (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, (zxx) null, x340Var8, 24576, 0, 2092004);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zI2 = x340Var8.i(list2) | x340Var8.i(m0dVar) | x340Var8.g(iu30Var);
                    Object objT3 = x340Var8.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new o0d(list2, m0dVar, iu30Var, (byte) 0);
                        x340Var8.s0(objT3);
                    }
                    ujo1.d(qim0VarD2, xtb0Var, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, x340Var8, 0, 508);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                irn1.f((x5d) obj6, (l2t) obj3, (tym0) obj4, (lk31) obj8, (qim0) obj5, (iu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                kre kreVar = (kre) obj4;
                iu30 iu30Var2 = (iu30) obj7;
                wre wreVar = (wre) obj3;
                ugf ugfVar = wreVar.b;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    s0f s0fVar = (s0f) obj6;
                    whf whfVar = new whf(wreVar.a, ugfVar, wreVar.c, false, 0);
                    boolean zG2 = x340Var10.g(iu30Var2);
                    Object objT4 = x340Var10.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new gob(iu30Var2, (byte) 14);
                        x340Var10.s0(objT4);
                    }
                    voo1.b(s0fVar, whfVar, (Function0) objT4, (qim0) null, ((qq4) kreVar.e.get()).i(), ugfVar == ugf.b && (!wreVar.c || ((Boolean) ((ven0) obj8).getValue()).booleanValue()), apo.r(-1013401900, new swc(wreVar, kreVar, iu30Var2, (tob1) obj5), x340Var10), x340Var10, 1572864);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                c4p1.e((g2c) obj6, (String) obj3, (String) obj4, (String) obj8, (sxq0) obj7, (List) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c4p1.e((i2c) obj6, (String) obj3, (String) obj4, (String) obj8, (sxq0) obj7, (List) obj5, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((ajq0) obj6).g((qcb1) obj3, (iu30) obj7, (jha1) obj4, (iu30) obj8, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qsw.c(new obk1((BehaviorRetainingAppBarLayout) ((tbk) obj6).c.b), apo.r(-753420588, new sxj((gw70) obj3, (tob1) obj4, (tob1) obj8, (lbs) obj7, (d0r) obj5, (byte) 3), x340Var14), x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                v8r.d((fbh0) obj6, (xnk) obj3, (Function0) obj4, (Function0) obj8, (Function0) obj7, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((asn) obj6).a((evb1) obj3, (lvb1) obj4, (s0s) obj8, (mvb1) obj5, (iu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                vzq0 vzq0Var = (vzq0) obj6;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    View view = (View) x340Var16.k(AndroidCompositionLocals_androidKt.f);
                    wat watVar = (wat) x340Var16.k(t4k.h);
                    boolean zG3 = x340Var16.g(view);
                    Object objT5 = x340Var16.T();
                    if (zG3 || objT5 == m4cVar) {
                        objT5 = szf0.b(view);
                        x340Var16.s0(objT5);
                    }
                    rzf0 rzf0Var = (rzf0) objT5;
                    float fA = vzq0Var.a();
                    float f = zjy.p(0.0f, new p3v(((rzf0Var == null || (gfn0VarA = rzf0Var.a()) == null) ? fA : watVar.M0(gfn0VarA.d(watVar))) - fA)).a;
                    qim0 qim0VarD3 = u291.d(too1.i(uyn1.w((qim0) obj5, vzq0Var), vzq0Var), 1.0f);
                    qzr qzrVar = (qzr) obj3;
                    h230 h230Var = (h230) obj4;
                    List list3 = h230Var.g;
                    upb0 upb0Var = (upb0) obj8;
                    iu30 iu30Var3 = (iu30) obj7;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM3 = x340Var16.m();
                    qim0 qim0VarE3 = zr7.E(x340Var16, qim0VarD3);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC, x340Var16, y580.O0);
                    nko1.H(xos0VarM3, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE3, x340Var16, y580.Y);
                    Object objT6 = x340Var16.T();
                    if (objT6 == m4cVar) {
                        objT6 = v8r.q(Boolean.FALSE);
                        x340Var16.s0(objT6);
                    }
                    ven0 ven0Var2 = (ven0) objT6;
                    oqn1.f(list3, h230Var.f, upb0Var, anm1.N("your_library_list_test_tag", u291.d(nim0Var, 1.0f)), iu30Var3, uyn1.j(0.0f, 0.0f, 0.0f, f, 7), null, ((Boolean) ven0Var2.getValue()).booleanValue(), qzrVar.c, x340Var16, 3072, 64);
                    Object objT7 = x340Var16.T();
                    if (objT7 == m4cVar) {
                        objT7 = yv91.a(new ppk(upb0Var, (byte) 1));
                        x340Var16.s0(objT7);
                    }
                    tob1 tob1Var2 = (tob1) objT7;
                    Object objT8 = x340Var16.T();
                    if (objT8 == m4cVar) {
                        objT8 = v8r.q("");
                        x340Var16.s0(objT8);
                    }
                    ven0 ven0Var3 = (ven0) objT8;
                    Integer numValueOf = Integer.valueOf(((Number) tob1Var2.getValue()).intValue());
                    boolean zI3 = x340Var16.i(h230Var) | x340Var16.i(qzrVar);
                    Object objT9 = x340Var16.T();
                    if (zI3 || objT9 == m4cVar) {
                        objT9 = new sr1(h230Var, tob1Var2, qzrVar, ven0Var3, (lnm) null, (byte) 11);
                        x340Var16.s0(objT9);
                    }
                    qxd0.s(numValueOf, list3, (vu30) objT9, x340Var16);
                    if (h230Var.b > 30) {
                        x340Var16.i0(-1286150911);
                        String str2 = (String) ven0Var3.getValue();
                        boolean zI4 = x340Var16.i(qzrVar);
                        Object objT10 = x340Var16.T();
                        if (zI4 || objT10 == m4cVar) {
                            objT10 = new l1k(0, qzrVar, qzr.class, "currentTimeProvider", "currentTimeProvider()J", 0, (byte) 22);
                            x340Var16.s0(objT10);
                        }
                        int i3 = h230Var.h;
                        qim0 qim0VarB2 = uyn1.B(h2c.a.a(nim0Var, een.f), 0.0f, 0.0f, 0.0f, f, 7);
                        Function0 function1 = (nla0) objT10;
                        Object objT11 = x340Var16.T();
                        if (objT11 == m4cVar) {
                            objT11 = new bzm(ven0Var2, (byte) 23);
                            x340Var16.s0(objT11);
                        }
                        zko1.h(upb0Var, str2, function1, qim0VarB2, i3, (iu30) objT11, x340Var16, 1572870);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(-1285705348);
                        x340Var16.r(false);
                    }
                    x340Var16.r(true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwr uwrVar5 = cbx.a;
                    qim0 qim0VarK = up30.k(((vex) zex.a.e).d, nim0Var);
                    h1t h1tVar = (h1t) obj6;
                    ovm1 ovm1Var = (ovm1) obj3;
                    q160 q160Var = (q160) obj4;
                    l6s l6sVar = (l6s) obj8;
                    iu30 iu30Var4 = (iu30) obj7;
                    vu30 vu30Var2 = (vu30) obj5;
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var18, 0);
                    int iHashCode4 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM4 = x340Var18.m();
                    qim0 qim0VarE4 = zr7.E(x340Var18, qim0VarK);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(mbhVarA3, x340Var18, y580.O0);
                    nko1.H(xos0VarM4, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE4, x340Var18, y580.Y);
                    otw.c(h1tVar, ovm1Var, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    if (q160Var.a) {
                        x340Var18.i0(465714648);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(464949692);
                        w2g0.c(u291.f(nim0Var, 1.0f), null, apo.r(2005967897, new k8(l6sVar, q160Var, iu30Var4, vu30Var2, (byte) 23), x340Var18), x340Var18, 3078, 6);
                        x340Var18.r(false);
                    }
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                vzq0 vzq0Var2 = (vzq0) obj4;
                jwm1 jwm1Var = (jwm1) obj3;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    oqn1.f(jwm1Var.f, jwm1Var.e, (upb0) obj8, anm1.N("search_compose_list", u291.d(too1.i(uyn1.w((qim0) obj5, vzq0Var2), vzq0Var2), 1.0f)), (iu30) obj7, null, null, false, (tvb0) ((mxr) obj6).b, x340Var20, 0, 224);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 24:
                ptw ptwVar = (ptw) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                ven0 ven0Var4 = (ven0) obj8;
                if (!((guj) ven0Var4.getValue()).b.b) {
                    Object value = ((ven0) obj5).getValue();
                    guj gujVar = (guj) ven0Var4.getValue();
                    Object obj10 = ((q811) obj6).a;
                    if (obj10 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    otw.f(value, gujVar, iIntValue11, (ztw) obj10, (op80) ((q811) obj3).a, (String) obj4, (iu30) obj7);
                    xcn0 xcn0Var = ptwVar.a;
                    tka0 tka0Var = otw.b;
                    if (xcn0Var.c.containsKey(tka0Var)) {
                        xcn0Var.c(tka0Var, new usw(iIntValue11));
                    }
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xcn0 xcn0Var2 = ((d75) obj4).c.a;
                    Function0 function2 = (Function0) ((ven0) obj8).getValue();
                    function2.getClass();
                    String str3 = (String) ((ven0) obj5).getValue();
                    str3.getClass();
                    ((jsw) obj6).a(0, this.c, x340Var22, new ksw(xcn0Var2, function2, str3, (ipb1) null), (iu30) obj7);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 26:
                return a(obj, obj2);
            case 27:
                return d(obj, obj2);
            case 28:
                return e(obj, obj2);
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                q1d0 q1d0Var = (q1d0) obj8;
                iu30 iu30Var5 = (iu30) obj7;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean z = ((rty) obj6).b;
                    qim0 qim0VarF3 = u291.f((qim0) obj5, 1.0f);
                    xtb0 xtb0Var2 = (xtb0) obj3;
                    vzq0 vzq0Var3 = (vzq0) obj4;
                    boolean zG4 = x340Var24.g(iu30Var5) | x340Var24.i(q1d0Var);
                    Object objT12 = x340Var24.T();
                    if (zG4 || objT12 == fkj0.X) {
                        objT12 = new w3w(iu30Var5, q1d0Var, (byte) 29);
                        x340Var24.s0(objT12);
                    }
                    ujo1.d(qim0VarF3, xtb0Var2, vzq0Var3, false, (g36) null, (nl3) null, (iq20) null, z, (hxq0) null, (iu30) objT12, x340Var24, 0, 376);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
        this.f = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(Object obj, Object obj2, iu30 iu30Var, Object obj3, cv30 cv30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = iu30Var;
        this.d = obj3;
        this.e = cv30Var;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(Object obj, Object obj2, iu30 iu30Var, Object obj3, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = iu30Var;
        this.d = obj3;
        this.e = ven0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(bb1 bb1Var, iu30 iu30Var, em0 em0Var, d0r d0rVar, g5l0 g5l0Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = bb1Var;
        this.f = iu30Var;
        this.c = em0Var;
        this.d = d0rVar;
        this.e = g5l0Var;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(h1t h1tVar, ovm1 ovm1Var, q160 q160Var, l6s l6sVar, iu30 iu30Var, vu30 vu30Var) {
        super(2);
        this.a = (byte) 22;
        this.b = h1tVar;
        this.c = ovm1Var;
        this.d = q160Var;
        this.e = l6sVar;
        this.f = iu30Var;
        this.g = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(l5y l5yVar, c5y c5yVar, a5y a5yVar, iu30 iu30Var, muo muoVar, ven0 ven0Var) {
        super(2);
        this.a = (byte) 27;
        this.b = l5yVar;
        this.c = c5yVar;
        this.d = a5yVar;
        this.f = iu30Var;
        this.e = muoVar;
        this.g = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(rty rtyVar, qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, iu30 iu30Var, q1d0 q1d0Var) {
        super(2);
        this.a = (byte) 29;
        this.b = rtyVar;
        this.g = qim0Var;
        this.c = xtb0Var;
        this.d = vzq0Var;
        this.f = iu30Var;
        this.e = q1d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(zen0 zen0Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 4;
        this.b = zen0Var;
        this.g = qim0Var;
        this.c = bbyVar;
        this.d = ln00Var;
        this.e = str;
        this.f = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(vzq0 vzq0Var, qim0 qim0Var, qzr qzrVar, h230 h230Var, upb0 upb0Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 21;
        this.b = vzq0Var;
        this.g = qim0Var;
        this.c = qzrVar;
        this.d = h230Var;
        this.e = upb0Var;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(q811 q811Var, q811 q811Var2, String str, iu30 iu30Var, int i, ven0 ven0Var, ven0 ven0Var2) {
        super(2);
        this.a = (byte) 24;
        this.b = q811Var;
        this.c = q811Var2;
        this.d = str;
        this.f = iu30Var;
        this.e = ven0Var;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(uk81 uk81Var, t71 t71Var, kse0 kse0Var, spv spvVar, fgg0 fgg0Var, f9t0 f9t0Var) {
        super(2);
        this.a = (byte) 1;
        this.b = uk81Var;
        this.c = t71Var;
        this.d = kse0Var;
        this.e = spvVar;
        this.f = fgg0Var;
        this.g = f9t0Var;
    }
}
