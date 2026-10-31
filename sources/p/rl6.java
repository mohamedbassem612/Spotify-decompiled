package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rl6 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl6(c380 c380Var, kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, hvj0 hvj0Var) {
        super(4);
        this.a = (byte) 5;
        this.b = c380Var;
        this.c = kkk0Var;
        this.f = iu30Var;
        this.d = xskVar;
        this.e = hvj0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        byte b = this.a;
        j2i j2iVarR = null;
        nim0 nim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.c;
        Object obj6 = this.e;
        Object obj7 = this.b;
        Object obj8 = this.f;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                return new b14((pp) obj7, (di4) obj5, (Context) obj2, (iu30) obj4, (yqg) obj9, (kly0) obj6, (iu30) obj8);
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                wgo1.d((oo41) ((c380) obj7).get(iIntValue), iIntValue, (zau0) obj5, iIntValue == ((err0) ((jkr0) obj9).d.c).s(), (vu30) obj6, (lz20) ((List) obj8).get(iIntValue), u291.d(nim0Var, 1.0f), (b0k) obj3, ((Number) obj4).intValue() & 112);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                xtb0 xtb0Var = (xtb0) obj8;
                ven0 ven0Var = (ven0) obj6;
                ss50 ss50Var = (ss50) obj9;
                ven0 ven0Var2 = (ven0) obj5;
                dke dkeVar = (dke) obj7;
                String str = dkeVar.a.b;
                String strC = f4i1.c(dkeVar.b, "chapter_header_");
                x340 x340Var = (b0k) obj3;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                boolean zI = x340Var.i(ven0Var2) | x340Var.i(ss50Var) | x340Var.i(ven0Var) | x340Var.i(xtb0Var) | x340Var.i(dkeVar);
                ss50 ss50Var2 = (ss50) obj9;
                xtb0 xtb0Var2 = (xtb0) obj8;
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new vt1(dkeVar, ven0Var2, ss50Var2, xtb0Var2, ven0Var);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarV = bin.v(nim0.a, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT2, 28);
                boolean zI2 = x340Var.i(ven0Var2) | x340Var.i(ss50Var) | x340Var.i(ven0Var) | x340Var.i(xtb0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    ggh gghVar = new ggh(ven0Var2, ss50Var, xtb0Var, ven0Var, (byte) 22);
                    x340Var.s0(gghVar);
                    objT3 = gghVar;
                }
                bs51.a(0, str, strC, x340Var, ern1.x(qim0VarV, (iu30) objT3));
                return rih1Var;
            case 3:
                x340 x340Var2 = (b0k) obj3;
                ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj8;
                nlg0 nlg0Var = (nlg0) obj7;
                int iOrdinal = ((efv0) obj2).ordinal();
                if (iOrdinal == 0) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(1299352363);
                    op71.g(x340Var3, nim0Var);
                    x340Var3.r(false);
                } else if (iOrdinal == 1) {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(1299433211);
                    irn1.B(nlg0Var.a.b, nlg0Var.c, (qim0) null, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var2, -1343557636, false);
                    }
                    x340 x340Var5 = x340Var2;
                    x340Var5.i0(1299601324);
                    long j = ((u7h) x340Var5.k(gaa1.a)).a;
                    Function0 function0 = (Function0) x340Var5.k(alg0.b);
                    xm6 xm6Var = nlg0Var.j;
                    if (xm6Var == null) {
                        x340Var5.i0(1299751983);
                    } else {
                        x340Var5.i0(1299751984);
                        j2iVarR = apo.r(1772131640, new mbf0(xm6Var, (byte) 19), x340Var5);
                    }
                    x340Var5.r(false);
                    j2i j2iVar = j2iVarR;
                    kiv kivVar = alg0.g;
                    Function0 function1 = (Function0) x340Var5.k(kivVar);
                    boolean zG = x340Var5.g(iu30Var) | x340Var5.g(function1);
                    Object objT4 = x340Var5.T();
                    if (zG || objT4 == fkj0.X) {
                        objT4 = new wmf(iu30Var, function1, (byte) 3);
                        x340Var5.s0(objT4);
                    }
                    mod.b(kivVar.a(objT4), apo.r(457989098, new uih(nlg0Var, function0, iu30Var, j, j2iVar, (bv40) obj5, (d0r) obj9, (mjm) obj6, (byte) 1), x340Var5), x340Var5, 56);
                    x340Var5.r(false);
                }
                return rih1Var;
            case 4:
                x340 x340Var6 = (b0k) obj3;
                ((Number) obj4).intValue();
                iu30 iu30Var2 = (iu30) obj8;
                gmg0 gmg0Var = (gmg0) obj7;
                int iOrdinal2 = ((efv0) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(-1313946019);
                    op71.g(x340Var7, nim0Var);
                    x340Var7.r(false);
                } else if (iOrdinal2 == 1) {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(-1313864148);
                    lrn1.n(gmg0Var.b, gmg0Var.e, gmg0Var.m, gmg0Var.n, (qim0) null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    if (iOrdinal2 != 2) {
                        throw p3d1.k(x340Var6, 511804703, false);
                    }
                    x340 x340Var9 = x340Var6;
                    x340Var9.i0(-1313676598);
                    long j2 = ((u7h) x340Var9.k(gaa1.a)).a;
                    Function0 function2 = (Function0) x340Var9.k(alg0.b);
                    if (gmg0Var.a == null || gmg0Var.o == null) {
                        x340Var9.i0(-1313398900);
                        x340Var9.r(false);
                    } else {
                        x340Var9.i0(-1313479779);
                        j2iVarR = apo.r(-2129494522, new mbf0(gmg0Var, (byte) 20), x340Var9);
                        x340Var9.r(false);
                    }
                    j2i j2iVar2 = j2iVarR;
                    kiv kivVar2 = alg0.g;
                    Function0 function3 = (Function0) x340Var9.k(kivVar2);
                    boolean zG2 = x340Var9.g(iu30Var2) | x340Var9.g(function3);
                    Object objT5 = x340Var9.T();
                    if (zG2 || objT5 == fkj0.X) {
                        objT5 = new wmf(iu30Var2, function3, (byte) 4);
                        x340Var9.s0(objT5);
                    }
                    mod.b(kivVar2.a(objT5), apo.r(1917100792, new uih(gmg0Var, function2, iu30Var2, j2, j2iVar2, (bv40) obj5, (d0r) obj9, (njm) obj6, (byte) 2), x340Var9), x340Var9, 56);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 5:
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var10 = (b0k) obj3;
                ((Number) obj4).intValue();
                fkc1 fkc1Var = (fkc1) ((c380) obj7).get(iIntValue2);
                qim0 qim0VarQ = i1p1.q(u291.d(nim0Var, 1.0f), er31.b(16.0f));
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var10).a.a.c(), d4o1.a);
                kkk0 kkk0Var = (kkk0) obj5;
                iu30 iu30Var3 = (iu30) obj8;
                xsk xskVar = (xsk) obj9;
                hvj0 hvj0Var = (hvj0) obj6;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var11 = x340Var10;
                int iHashCode = Long.hashCode(x340Var11.T);
                xos0 xos0VarM = x340Var11.m();
                qim0 qim0VarE = zr7.E(x340Var10, qim0VarF);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(hmb0.t1);
                } else {
                    x340Var12.v0();
                }
                nko1.H(gfh0VarC, x340Var10, y580.O0);
                nko1.H(xos0VarM, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE, x340Var10, y580.Y);
                t3p1.l(fkc1Var, kkk0Var, iu30Var3, xskVar, hvj0Var, x340Var10, 0);
                x340Var12.r(true);
                return rih1Var;
            case 6:
                yzo1.g((bot0) obj7, ((Boolean) obj2).booleanValue(), (fit0) obj5, (dmq) obj9, (emq) obj6, (iu30) obj8, (b0k) obj3, ((Number) obj4).intValue() & 112);
                return rih1Var;
            case 7:
                wa5 wa5Var = (wa5) obj;
                b0k b0kVar = (b0k) obj3;
                pv71 pv71Var = (pv71) obj7;
                jv71.a(pv71Var, wa5Var, apo.r(-265342755, new uu((pt) obj5, (ti81) obj9, pv71Var, wa5Var, (Function0) obj6, ((Boolean) obj2).booleanValue(), (Function0) obj8, (byte) 17), b0kVar), b0kVar, ((((Number) obj4).intValue() << 3) & 112) | 384);
                return rih1Var;
            case 8:
                y5c1 y5c1Var = (y5c1) obj2;
                x340 x340Var13 = (b0k) obj3;
                ((Number) obj4).intValue();
                j4c1 j4c1Var = (j4c1) obj5;
                vnr0 vnr0Var = y5c1Var.b;
                dzo1 dzo1Var = y5c1Var.l;
                String str2 = y5c1Var.k;
                String str3 = y5c1Var.j;
                int i = y5c1Var.i;
                q5c1 q5c1Var = y5c1Var.g;
                if (q5c1Var instanceof q5c1) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-1125658300);
                    otw.c((y731) obj7, new x731(y5c1Var.a, vnr0Var, q5c1Var.a, j4c1Var.c, new v731(), new w731(i, str3), new u731(str2, dzo1Var)), (qim0) null, (ipb1) null, x340Var14, 64, 12);
                    x340Var14.r(false);
                } else if (q5c1Var instanceof r5c1) {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-1125617254);
                    otw.c((bl31) obj9, new tk31(y5c1Var.a, vnr0Var, ((r5c1) q5c1Var).a, j4c1Var.c, new rk31(), new sk31(i, str3), new qk31(str2, dzo1Var)), (qim0) null, (ipb1) null, x340Var15, 64, 12);
                    x340Var15.r(false);
                } else {
                    if (!(q5c1Var instanceof s5c1)) {
                        throw p3d1.k(x340Var13, -1125658105, false);
                    }
                    x340 x340Var16 = x340Var13;
                    x340Var16.i0(-1125575407);
                    bzc1 bzc1Var = (bzc1) obj6;
                    String str4 = y5c1Var.a;
                    yyc1 yyc1Var = new yyc1();
                    jxc1 jxc1Var = (jxc1) obj8;
                    if (jxc1Var == null) {
                        jxc1Var = ((s5c1) q5c1Var).a;
                    }
                    otw.c(bzc1Var, new azc1(str4, jxc1Var, ((s5c1) q5c1Var).b, j4c1Var.c, yyc1Var, new zyc1(i, str3), new xyc1(str2, dzo1Var)), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                    x340Var16.r(false);
                }
                return rih1Var;
            default:
                long j3 = ((Offset) obj).a;
                float fFloatValue = ((Number) obj2).floatValue();
                long j4 = ((Offset) obj3).a;
                int iIntValue3 = ((Number) obj4).intValue();
                j8d1 j8d1Var = (nav0) obj7;
                drr0 drr0Var = (drr0) obj6;
                ven0 ven0Var3 = (ven0) obj9;
                drr0 drr0Var2 = (drr0) obj5;
                float fO = yoi1.o(drr0Var2.s() * fFloatValue, 1.0f, 2.9f);
                if (iIntValue3 <= 1 && fO <= 1.01f) {
                    z = false;
                }
                drr0Var2.t(fO);
                if (z) {
                    ven0Var3.setValue(new Offset(drr0Var2.s() == 1.0f ? 0L : Offset.g(((Offset) ven0Var3.getValue()).a, j3)));
                    drr0Var.t(0.0f);
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L)) + drr0Var.s();
                    drr0Var.t(fIntBitsToFloat >= 0.0f ? fIntBitsToFloat : 0.0f);
                    j8d1 j8d1Var2 = j8d1Var;
                    ((ven0) obj8).setValue(new tie1(yoi1.o(((Float.intBitsToFloat((int) (j4 >> 32)) / ((int) (j8d1Var2.Y0 >> 32))) * 2.0f) - 1.0f, -1.0f, 1.0f), yoi1.o(((Float.intBitsToFloat((int) (j4 & 4294967295L)) / ((int) (4294967295L & j8d1Var2.Y0))) * 2.0f) - 1.0f, -1.0f, 1.0f)));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl6(Object obj, iu30 iu30Var, bv40 bv40Var, d0r d0rVar, mjm mjmVar, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.f = iu30Var;
        this.c = bv40Var;
        this.d = d0rVar;
        this.e = mjmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
