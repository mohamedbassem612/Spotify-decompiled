package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(String str, Boolean bool, boolean z, jlz0 jlz0Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.c = str;
        this.e = bool;
        this.b = z;
        this.f = jlz0Var;
        this.g = function0;
        this.h = iu30Var;
        this.d = qim0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.vu30 */
    /* JADX WARN: Code duplicated, block: B:57:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0309  */
    /* JADX WARN: Code duplicated, block: B:67:0x0326  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    public final Object invoke(Object obj, Object obj2) throws vu30 {
        ?? r6;
        Function0 function0;
        vu30 vu30Var;
        int i;
        x340 x340Var;
        ihl ihlVarK;
        boolean zE;
        Object objT;
        boolean zE2;
        Object objT2;
        lee1 lee1Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        boolean z = this.b;
        qim0 qim0VarC = nim0.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.c;
        Object obj8 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var2 = (b0k) obj;
                xhl xhlVar = (xhl) obj6;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    x340 x340Var3 = x340Var2;
                    if (x340Var3.H()) {
                        x340Var3.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj8).setValue(rih1Var);
                int i2 = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var4 = x340Var2;
                x340Var4.i0(-976504715);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                ihl ihlVarK2 = xhlVar2.k();
                ihl ihlVarK3 = xhlVar2.k();
                ihl ihlVarK4 = xhlVar2.k();
                Object objT3 = x340Var4.T();
                m4c m4cVar = fkj0.X;
                if (objT3 == m4cVar) {
                    objT3 = ft.f;
                    x340Var4.s0(objT3);
                }
                qim0 qim0VarJ = xhl.j(qim0VarC, ihlVarK2, (iu30) objT3);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarJ);
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
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                dv20.l(0, (j2i) obj4, x340Var4, true);
                if (z) {
                    x340Var4.i0(-976284182);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    boolean zI = x340Var4.i(ihlVarK2) | x340Var4.d(-8.0f) | x340Var4.d(-4.0f);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == m4cVar) {
                        r6 = 0;
                        objT4 = new pu(ihlVarK2, (byte) 0);
                        x340Var4.s0(objT4);
                    } else {
                        r6 = 0;
                    }
                    wu.e(lrn1.x(xhl.j(qim0VarC, ihlVarK3, (iu30) objT4), 1.0f), x340Var4, r6);
                    x340Var4.r((boolean) r6);
                } else {
                    x340Var4.i0(-975673947);
                    x340Var4.r(false);
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var4).b;
                String str = (String) obj7;
                qim0 qim0Var = (qim0) obj3;
                boolean zI2 = x340Var4.i(ihlVarK2) | x340Var4.d(8.0f);
                Object objT5 = x340Var4.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new pu(ihlVarK2, (byte) 1);
                    x340Var4.s0(objT5);
                }
                wu.d(0, str, x340Var4, xhl.j(qim0Var, ihlVarK4, (iu30) objT5));
                x340Var4.r(false);
                if (((uhl) xhlVar).b == i2) {
                    return rih1Var;
                }
                qxd0.S((su) obj5, x340Var4);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                wpo1.d((z0j0) obj8, this.b, (String) obj7, (c380) obj6, (ctf) obj5, (bqm) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var = (iu30) obj8;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z2 = !z;
                    if (z) {
                        x340Var6.i0(-435879864);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-435831039);
                        boolean zG = x340Var6.g(iu30Var);
                        Object objT6 = x340Var6.T();
                        if (zG || objT6 == m4cVar2) {
                            objT6 = new frf(iu30Var, (byte) 0);
                            x340Var6.s0(objT6);
                        }
                        Function0 function1 = (Function0) objT6;
                        boolean zG2 = x340Var6.g(iu30Var);
                        Object objT7 = x340Var6.T();
                        if (zG2 || objT7 == m4cVar2) {
                            objT7 = new frf(iu30Var, (byte) 1);
                            x340Var6.s0(objT7);
                        }
                        Function0 function2 = (Function0) objT7;
                        qim0VarC = f8d1.c(qim0VarC, function1, function2, new nrf(function2, function1, (byte) 0));
                        x340Var6.r(false);
                    }
                    qim0 qim0Var2 = qim0VarC;
                    if (z) {
                        x340Var6.i0(-435563571);
                        boolean zG3 = x340Var6.g(iu30Var);
                        Object objT8 = x340Var6.T();
                        if (zG3 || objT8 == m4cVar2) {
                            objT8 = new frf(iu30Var, (byte) 2);
                            x340Var6.s0(objT8);
                        }
                        x340Var6.r(false);
                        function0 = (Function0) objT8;
                    } else {
                        x340Var6.i0(-435524791);
                        x340Var6.r(false);
                        function0 = null;
                    }
                    boolean z3 = this.b;
                    Function0 function3 = z3 ? (Function0) obj6 : null;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    wwo1.b((String) obj7, (w4i1) obj5, (c380) obj3, z2, z3, (vu30) obj4, function0, function3, qim0Var2, x340Var6, 0, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                p8p1.b((List) obj8, (String) obj7, (oih) obj6, (xtb0) obj5, (iu30) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                pto1.e((w460) obj8, (dvp) obj6, (kko) obj5, (String) obj7, (c380) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ouo1.j((String) obj7, (String) obj8, (String) obj6, (String) obj5, (String) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                rpo1.c((vnr0) obj8, (List) obj6, (qsq) obj5, (smc0) obj7, (rsq) obj4, this.b, (qim0) obj3, (b0k) obj, czo1.p(4105));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                k1p1.d((Bitmap) obj8, (Function0) obj6, (Function0) obj5, (Function0) obj7, this.b, (qim0) obj3, (i3) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                i2p1.e((Context) obj8, (t3z0) obj6, (Bitmap) obj5, (Bitmap) obj7, (u380) obj4, (qim0) obj3, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                yzo1.f(this.b, (String) obj7, (String) obj8, (String) obj6, (String) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                s1p1.k(this.b, (Function0) obj8, (Function0) obj6, (jgx) obj5, (qim0) obj3, (pgx) obj7, (vu30) obj4, (b0k) obj, czo1.p(1573249));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var7 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2i j2iVar = (vu30) obj8;
                    if (j2iVar == null) {
                        j2iVar = l5j.a;
                    }
                    bzn1.f(j2iVar, (Function0) obj6, null, this.b, (vu30) obj5, (ngr0) obj7, (ygr0) obj3, (Function0) obj4, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                x1p1.b(this.b, (j2i) obj4, (j2i) obj8, (j2i) obj6, (j2i) obj5, (j2i) obj7, (j2i) obj3, (b0k) obj, czo1.p(1797553));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                mmo1.n((String) obj7, (Boolean) obj8, this.b, (jlz0) obj6, (Function0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                y2o1.j((fwz0) obj8, this.b, (iyr0) obj6, (d0r) obj5, (sjq0) obj7, (vb1) obj3, (dc80) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                y2o1.k((ewz0) obj8, this.b, (iyr0) obj6, (d0r) obj5, (sjq0) obj7, (vb1) obj3, (dc80) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                x340 x340Var9 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                o95 o95Var = (o95) obj5;
                List list = (List) obj6;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar = cbx.b(x340Var10).f;
                    boolean z4 = ((rb61) obj8) == rb61.a;
                    boolean zG4 = x340Var10.g(list) | x340Var10.i(o95Var) | x340Var10.d(16.0f);
                    Object objT9 = x340Var10.T();
                    if (zG4 || objT9 == m4cVar3) {
                        objT9 = new nb61(list, o95Var, (byte) 0);
                        x340Var10.s0(objT9);
                    }
                    iu30 iu30Var2 = (iu30) objT9;
                    if (z4) {
                        qim0VarC = (qim0) iu30Var2.invoke(qim0VarC);
                    }
                    Function0 function4 = (Function0) obj3;
                    String str2 = (String) obj7;
                    hux huxVar = (hux) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarC);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var10, y580.O0);
                    nko1.H(xos0VarM2, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE2, x340Var10, y580.Y);
                    gbx gbxVar = (gbx) function4.invoke();
                    Object objT10 = x340Var10.T();
                    if (objT10 == m4cVar3) {
                        objT10 = qr51.P0;
                        x340Var10.s0(objT10);
                    }
                    oex oexVar = new oex(0, (vu30) null, (vu30) objT10, (vu30) null, 11);
                    lex lexVarZ = yoo1.z(x340Var10);
                    if (huxVar == null || z) {
                        huxVar = null;
                    }
                    if (huxVar == null) {
                        x340Var10.i0(-1940899035);
                        x340Var10.r(false);
                        vu30Var = null;
                    } else {
                        x340Var10.i0(-1940899034);
                        vu30 vu30VarR = apo.r(-1678535368, new f90(huxVar, (byte) 16), x340Var10);
                        x340Var10.r(false);
                        vu30Var = vu30VarR;
                    }
                    poo1.e(gbxVar, oexVar, lexVarZ, null, 0, str2, jax.a, vu30Var, null, null, null, false, new zzq0(12.0f, 4.0f, 12.0f, 4.0f), apo.r(-1459706969, new mv8(str2, z, (byte) 12), x340Var10), x340Var10, 0, 3072, 3864);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var11 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarD = sgc1.D(1, u291.f(qim0VarC, 1.0f));
                    pt ptVar = (pt) obj8;
                    ti81 ti81Var = (ti81) obj6;
                    pv71 pv71Var = (pv71) obj5;
                    wa5 wa5Var = (wa5) obj7;
                    Function0 function5 = (Function0) obj3;
                    Function0 function6 = (Function0) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var12, 0);
                    int iHashCode3 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM3 = x340Var12.m();
                    qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM3, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    ptVar.q(ti81Var, kk0.q(x340Var12, qim0VarE3, y580.Y, 1.0f, true), pv71.e(pv71Var, pv71.d("side_drawer_profile_card_title", x340Var12), wa5Var), z ? function5 : null, !z ? ti81Var.g : null, x340Var12, 32776, 0);
                    if (ti81Var.h == null) {
                        x340Var12.i0(835718684);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(835718685);
                        ptVar.f(ti81Var.e, function6, u291.c(qim0VarC, 1.0f), pv71.e(pv71Var, pv71.d("side_drawer_profile_card_accessory_toggle", x340Var12), wa5Var), (idn0) null, x340Var12, 0, 16);
                        x340Var12.r(false);
                    }
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                unb0 unb0Var = (unb0) obj3;
                xhl xhlVar3 = (xhl) obj6;
                if ((iIntValue5 & 11) == 2) {
                    x340 x340Var14 = x340Var13;
                    if (x340Var14.H()) {
                        x340Var14.b0();
                    } else {
                        ((ven0) obj8).setValue(rih1Var);
                        i = ((uhl) xhlVar3).b;
                        xhlVar3.m();
                        x340Var = x340Var13;
                        x340Var.i0(-168051179);
                        xhl xhlVar4 = (xhl) xhlVar3.l().b;
                        ihl ihlVarK5 = xhlVar4.k();
                        ihlVarK = xhlVar4.k();
                        String str3 = (String) obj7;
                        zE = x340Var.e(unb0Var.ordinal());
                        objT = x340Var.T();
                        if (zE || objT == m4cVar4) {
                            objT = new dr91(unb0Var, (byte) 3);
                            x340Var.s0(objT);
                        }
                        d1u.t(0, str3, x340Var, xhl.j(qim0VarC, ihlVarK, (iu30) objT), z);
                        zE2 = x340Var.e(unb0Var.ordinal()) | x340Var.i(ihlVarK);
                        objT2 = x340Var.T();
                        if (zE2 || objT2 == m4cVar4) {
                            objT2 = new iv81(unb0Var, ihlVarK, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        d1u.z(unb0Var, xhl.j(qim0VarC, ihlVarK5, (iu30) objT2), (Function0) obj4, x340Var, 0);
                        x340Var.r(false);
                        if (((uhl) xhlVar3).b != i) {
                            qxd0.S((su) obj5, x340Var);
                        }
                    }
                } else {
                    ((ven0) obj8).setValue(rih1Var);
                    i = ((uhl) xhlVar3).b;
                    xhlVar3.m();
                    x340Var = x340Var13;
                    x340Var.i0(-168051179);
                    xhl xhlVar5 = (xhl) xhlVar3.l().b;
                    ihl ihlVarK6 = xhlVar5.k();
                    ihlVarK = xhlVar5.k();
                    String str4 = (String) obj7;
                    zE = x340Var.e(unb0Var.ordinal());
                    objT = x340Var.T();
                    if (zE) {
                        objT = new dr91(unb0Var, (byte) 3);
                        x340Var.s0(objT);
                    } else {
                        objT = new dr91(unb0Var, (byte) 3);
                        x340Var.s0(objT);
                    }
                    d1u.t(0, str4, x340Var, xhl.j(qim0VarC, ihlVarK, (iu30) objT), z);
                    zE2 = x340Var.e(unb0Var.ordinal()) | x340Var.i(ihlVarK);
                    objT2 = x340Var.T();
                    if (zE2) {
                        objT2 = new iv81(unb0Var, ihlVarK, (byte) 8);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new iv81(unb0Var, ihlVarK, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    d1u.z(unb0Var, xhl.j(qim0VarC, ihlVarK6, (iu30) objT2), (Function0) obj4, x340Var, 0);
                    x340Var.r(false);
                    if (((uhl) xhlVar3).b != i) {
                        qxd0.S((su) obj5, x340Var);
                    }
                }
                return rih1Var;
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                icr0 icr0Var = (icr0) obj6;
                az20 az20Var = (az20) obj8;
                Object obj9 = fkj0.X;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarY = voo1.y(u291.d(qim0VarC, 1.0f), voo1.f);
                    boolean zI3 = x340Var16.i(az20Var);
                    Object objT11 = x340Var16.T();
                    if (zI3 || objT11 == obj9) {
                        objT11 = new lgf(az20Var, b2);
                        x340Var16.s0(objT11);
                    }
                    qim0 qim0VarB = f8d1.b(qim0VarY, rih1Var, (PointerInputEventHandler) objT11);
                    boolean zI4 = x340Var16.i(icr0Var);
                    Object objT12 = x340Var16.T();
                    if (zI4 || objT12 == obj9) {
                        objT12 = new qwc1(icr0Var, (byte) 11);
                        x340Var16.s0(objT12);
                    }
                    qim0 qim0VarH = l6o1.H(ern1.x(qim0VarB, (iu30) objT12), (es41) obj5, false, 14);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var16).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarH, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var16).g, 32, qim0VarB2);
                    cvx cvxVar5 = cbx.b(x340Var16).b;
                    d36 d36Var = new d36(16.0f, true, new um5(false));
                    sud1 sud1Var = (sud1) obj7;
                    int i3 = sud1Var.e;
                    xud1 xud1Var = (xud1) obj3;
                    i8h1 i8h1Var = xud1Var.f;
                    w35 w35Var = xud1Var.d;
                    kly0 kly0Var = xud1Var.c;
                    iu30 iu30Var3 = (iu30) obj4;
                    mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var16, 0);
                    int iHashCode4 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM4 = x340Var16.m();
                    qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarP);
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
                    nko1.H(mbhVarA, x340Var16, y580.O0);
                    nko1.H(xos0VarM4, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE4, x340Var16, y580.Y);
                    String str5 = sud1Var.a;
                    String str6 = sud1Var.d;
                    if (str5 != null) {
                        x340Var16.i0(366942299);
                        if (i3 >= 2) {
                            x340Var16.i0(-1373633420);
                            lee1Var = cbx.d(x340Var16).m;
                            x340Var16.r(false);
                        } else {
                            x340Var16.i0(-1373631818);
                            lee1Var = cbx.d(x340Var16).g;
                            x340Var16.r(false);
                        }
                        lee1 lee1Var2 = lee1Var;
                        String str7 = sud1Var.a;
                        long j = cbx.a(x340Var16).b.b;
                        cvx cvxVar6 = cbx.b(x340Var16).b;
                        uwo1.e(str7, uyn1.z(32.0f, 0.0f, 2, qim0VarC), lee1Var2, j, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2032);
                        x340Var16 = x340Var16;
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(367398774);
                        x340Var16.r(false);
                    }
                    if (i3 >= 2) {
                        x340Var16.i0(367465269);
                        x340 x340Var17 = x340Var16;
                        cvd1.a(sud1Var, kly0Var, i8h1Var, xud1Var.e, w35Var.c(), sud1Var.c, x340Var17, 0);
                        cvd1.e(sud1Var, xud1Var.a, xud1Var.b, (qim0) null, x340Var17, 0);
                        x340Var16 = x340Var17;
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(368090446);
                        cvd1.k(mqo1.A(sud1Var.b), xud1Var.a, xud1Var.b, kly0Var, i8h1Var, this.b, w35Var.c(), sud1Var.c, x340Var16, 0);
                        x340Var16.r(false);
                    }
                    if (str6 != null) {
                        x340Var16.i0(368669619);
                        boolean zI5 = x340Var16.i(xud1Var) | x340Var16.g(iu30Var3);
                        Object objT13 = x340Var16.T();
                        if (zI5 || objT13 == obj9) {
                            objT13 = new cmd1(xud1Var, iu30Var3, (byte) 5);
                            x340Var16.s0(objT13);
                        }
                        cvd1.f(0, str6, x340Var16, (iu30) objT13);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(369133782);
                        x340Var16.r(false);
                    }
                    cvx cvxVar7 = cbx.b(x340Var16).b;
                    x0d.s(qim0VarC, 16.0f, x340Var16, true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                zod.g((c380) obj8, (String) obj7, this.b, (qpj1) obj6, (iu30) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, cv30 cv30Var, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = obj4;
        this.d = obj5;
        this.b = z;
        this.h = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu(Object obj, Object obj2, Object obj3, Object obj4, p280 p280Var, qim0 qim0Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = obj4;
        this.h = p280Var;
        this.d = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(Bitmap bitmap, Function0 function0, Function0 function1, Function0 function2, boolean z, qim0 qim0Var, i3 i3Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.e = bitmap;
        this.f = function0;
        this.g = function1;
        this.c = function2;
        this.b = z;
        this.d = qim0Var;
        this.h = i3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(String str, String str2, String str3, String str4, String str5, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.d = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(List list, String str, oih oihVar, xtb0 xtb0Var, iu30 iu30Var, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.a = (byte) 3;
        this.e = list;
        this.c = str;
        this.f = oihVar;
        this.g = xtb0Var;
        this.h = iu30Var;
        this.d = qim0Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(vu30 vu30Var, Function0 function0, boolean z, vu30 vu30Var2, ngr0 ngr0Var, ygr0 ygr0Var, Function0 function1) {
        super(2);
        this.a = (byte) 11;
        this.e = vu30Var;
        this.f = function0;
        this.b = z;
        this.g = vu30Var2;
        this.c = ngr0Var;
        this.d = ygr0Var;
        this.h = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(c380 c380Var, String str, boolean z, qpj1 qpj1Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 20;
        this.e = c380Var;
        this.c = str;
        this.b = z;
        this.f = qpj1Var;
        this.g = iu30Var;
        this.h = iu30Var2;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(z0j0 z0j0Var, boolean z, String str, c380 c380Var, ctf ctfVar, bqm bqmVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.e = z0j0Var;
        this.b = z;
        this.c = str;
        this.f = c380Var;
        this.g = ctfVar;
        this.h = bqmVar;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(ven0 ven0Var, xhl xhlVar, int i, su suVar, String str, boolean z, unb0 unb0Var, Function0 function0) {
        super(2);
        this.a = (byte) 18;
        this.e = ven0Var;
        this.f = xhlVar;
        this.g = suVar;
        this.c = str;
        this.b = z;
        this.d = unb0Var;
        this.h = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(ven0 ven0Var, xhl xhlVar, su suVar, boolean z, String str, qim0 qim0Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 0;
        this.e = ven0Var;
        this.f = xhlVar;
        this.g = suVar;
        this.b = z;
        this.c = str;
        this.d = qim0Var;
        this.h = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(vnr0 vnr0Var, List list, qsq qsqVar, smc0 smc0Var, rsq rsqVar, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 6;
        this.e = vnr0Var;
        this.f = list;
        this.g = qsqVar;
        this.c = smc0Var;
        this.h = rsqVar;
        this.b = z;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu(fwz0 fwz0Var, boolean z, iyr0 iyr0Var, d0r d0rVar, sjq0 sjq0Var, vb1 vb1Var, dc80 dc80Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = fwz0Var;
        this.b = z;
        this.f = iyr0Var;
        this.g = d0rVar;
        this.c = sjq0Var;
        this.d = vb1Var;
        this.h = dc80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(rb61 rb61Var, List list, o95 o95Var, Function0 function0, String str, hux huxVar, boolean z) {
        super(2);
        this.a = (byte) 16;
        this.e = rb61Var;
        this.f = list;
        this.g = o95Var;
        this.d = function0;
        this.c = str;
        this.h = huxVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(boolean z, String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 9;
        this.b = z;
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(boolean z, Function0 function0, Function0 function1, jgx jgxVar, qim0 qim0Var, pgx pgxVar, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 10;
        this.b = z;
        this.e = function0;
        this.f = function1;
        this.g = jgxVar;
        this.d = qim0Var;
        this.c = pgxVar;
        this.h = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(boolean z, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6, int i) {
        super(2);
        this.a = (byte) 12;
        this.b = z;
        this.h = j2iVar;
        this.e = j2iVar2;
        this.f = j2iVar3;
        this.g = j2iVar4;
        this.c = j2iVar5;
        this.d = j2iVar6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(boolean z, iu30 iu30Var, Function0 function0, String str, w4i1 w4i1Var, c380 c380Var, vu30 vu30Var) {
        super(2);
        this.a = (byte) 2;
        this.b = z;
        this.e = iu30Var;
        this.f = function0;
        this.c = str;
        this.g = w4i1Var;
        this.d = c380Var;
        this.h = vu30Var;
    }
}
