package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f13 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f13(int i, byte b) {
        super(3);
        this.a = b;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        qim0 qim0VarH;
        String strK;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                k1u.b(i, 0, 4, (b0k) obj2, null);
                return rih1Var;
            case 1:
                return new pab1((i3i0) obj, (xcu0) obj2, (n900) obj3, i);
            case 2:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strO0 = cwl1.o0(x340Var2, i);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, anm1.N("managed-accounts-note-row", nim0Var), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 48, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO1 = cwl1.o0(b0kVar, i);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2042);
                return rih1Var;
            case 4:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(984664236);
                if (i == 1) {
                    z = true;
                } else {
                    if (i != 2 && i != 3) {
                        throw null;
                    }
                    z = false;
                }
                if (z) {
                    x340Var3.i0(-494335276);
                    x340Var3.r(false);
                    qim0VarH = u291.c(qim0Var, 1.0f);
                } else {
                    x340Var3.i0(-494292713);
                    byte bC = xcg1.c(i);
                    lee1 lee1VarI = pxl.i(x340Var3, i);
                    yae1 yae1VarQ = d5p1.q(0, x340Var3, 1);
                    wat watVar = (wat) x340Var3.k(t4k.h);
                    boolean zG = x340Var3.g(lee1VarI) | x340Var3.g(watVar);
                    Object objT = x340Var3.T();
                    if (zG || objT == fkj0.X) {
                        objT = ktd.k(watVar.M0((int) (yae1.b(yae1VarQ, new af5("X"), lee1VarI, 0, true, 0, 0L, (flb0) null, (wat) null, (f930) null, 2036).c & 4294967295L)), x340Var3);
                    }
                    qim0VarH = u291.h(qim0Var, ((p3v) objT).a * bC);
                    x340Var3.r(false);
                }
                x340Var3.r(false);
                return qim0VarH;
            case 5:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO2 = cwl1.o0(b0kVar2, i);
                uwr uwrVar3 = cbx.a;
                uwo1.e(strO2, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                return rih1Var;
            case 6:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO3 = cwl1.o0(b0kVar3, i);
                uwr uwrVar4 = cbx.a;
                uwo1.e(strO3, (qim0) null, cbx.d(b0kVar3).g, cbx.a(b0kVar3).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                return rih1Var;
            case 7:
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH = ((afh0) obj2).H(j);
                return ((ifh0) obj).S(yoi1.p(q5t0VarH.a, hjl.k(j), hjl.i(j)), yoi1.p(q5t0VarH.b + i, hjl.j(j), hjl.h(j)), b7xVar, new f2(q5t0VarH, (byte) 18));
            case 8:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strI = xcg1.i(cwl1.o0(b0kVar4, 2131953397), " • ", cwl1.U(2131820600, i, new Object[]{Integer.valueOf(i)}, b0kVar4));
                uwr uwrVar5 = cbx.a;
                uwo1.e(strI, (qim0) null, cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2034);
                return rih1Var;
            case 9:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                int i2 = i == 0 ? -1 : i3d0.a[l1d.C(i)];
                if (i2 == -1) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-1540406848);
                    x340Var5.r(false);
                } else if (i2 == 1) {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(1612871390);
                    nyo1.e(ilx.c, x340Var6, ilx.d);
                    x340Var6.r(false);
                } else if (i2 == 2) {
                    x340 x340Var7 = x340Var4;
                    x340Var7.i0(1612873504);
                    nyo1.e(mkx.c, x340Var7, mkx.d);
                    x340Var7.r(false);
                } else {
                    if (i2 != 3) {
                        throw p3d1.k(x340Var4, 1612870045, false);
                    }
                    x340 x340Var8 = x340Var4;
                    x340Var8.i0(1612875714);
                    nyo1.e(hkx.c, x340Var8, hkx.d);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 10:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar5, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2046);
                return rih1Var;
            case 11:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                int iC = l1d.C(i);
                if (iC == 0) {
                    x340 x340Var10 = x340Var9;
                    strK = x0d.k(x340Var10, 1803638887, 2131951769, x340Var10, false);
                } else if (iC == 1) {
                    x340 x340Var11 = x340Var9;
                    strK = x0d.k(x340Var11, 1803641636, 2131951767, x340Var11, false);
                } else if (iC == 2) {
                    x340 x340Var12 = x340Var9;
                    strK = x0d.k(x340Var12, 1803644259, 2131951768, x340Var12, false);
                } else if (iC == 3) {
                    x340 x340Var13 = x340Var9;
                    x340Var13.i0(81122594);
                    x340Var13.r(false);
                    strK = "Teen";
                } else {
                    if (iC != 4) {
                        throw p3d1.k(x340Var9, 1803637648, false);
                    }
                    x340 x340Var14 = x340Var9;
                    x340Var14.i0(78553452);
                    x340Var14.r(false);
                    strK = "";
                }
                uwo1.e(strK, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var9, 0, 0, 2046);
                return rih1Var;
            case 12:
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (i > 0) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(-1932906457);
                    hqn1.g(i, x340Var16, 0);
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(-1932849758);
                    x340Var17.r(false);
                }
                return rih1Var;
            case 13:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    op71.g(x340Var19, u291.h(nim0Var, ((wat) x340Var19.k(t4k.h)).M0(i)));
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 14:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar6, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar6, 0, 0, 2046);
                return rih1Var;
            case 15:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strN0 = cwl1.n0(2131960398, new Object[]{Integer.valueOf(i)}, b0kVar7);
                qim0 qim0VarW = uyn1.w(anm1.N("ranking-view", nim0Var), sok.y(b0kVar7));
                uwr uwrVar6 = cbx.a;
                uwo1.e(strN0, qim0VarW, cbx.d(b0kVar7).j, cbx.a(b0kVar7).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar7, 0, 0, 1712);
                return rih1Var;
            case 16:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(((hjl) obj3).a);
                int i3 = q5t0VarH2.a;
                if (i3 == 0 && q5t0VarH2.b == 0) {
                    return ifh0Var.S(0, 0, b7xVar, ou11.O0);
                }
                int iMax = Math.max(i3, i);
                int iMax2 = Math.max(q5t0VarH2.b, i);
                return ifh0Var.S(iMax, iMax2, b7xVar, new ro60(q5t0VarH2, iMax, iMax2, (byte) 4));
            case 17:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strValueOf = String.valueOf(i);
                qim0 qim0VarX = u291.x(18.0f, 0.0f, 2, nim0Var);
                uwr uwrVar7 = cbx.a;
                uwo1.e(strValueOf, qim0VarX, cbx.d(b0kVar8).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar8, 0, 0, 2040);
                return rih1Var;
            case 18:
                long j2 = ((hjl) obj3).a;
                return ((ifh0) obj).S(0, 0, b7xVar, new wb5(((afh0) obj2).H(jjl.b(0, 0, 0, 0, 15)), i, (byte) 20));
            case 19:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strU = cwl1.U(2131820587, i, new Object[]{Integer.valueOf(i)}, b0kVar9);
                uwr uwrVar8 = cbx.a;
                uwo1.e(strU, (qim0) null, cbx.d(b0kVar9).j, cbx.a(b0kVar9).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar9, 0, 0, 2034);
                return rih1Var;
            case 20:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                for (int i4 = 0; i4 < i; i4++) {
                    x340 x340Var21 = x340Var20;
                    if (i4 > 0) {
                        x340Var21.i0(1153780313);
                        fc11.g(dm5.h0(et40.a, 8.0f), x340Var21, 0);
                    } else {
                        x340Var21.i0(1407493621);
                    }
                    x340Var21.r(false);
                    oe91.a(x340Var20, 0);
                }
                return rih1Var;
            case 21:
                b0k b0kVar10 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO4 = cwl1.o0(b0kVar10, i);
                uwr uwrVar9 = cbx.a;
                uwo1.e(strO4, (qim0) null, cbx.d(b0kVar10).j, cbx.a(b0kVar10).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar10, 0, 0, 2034);
                return rih1Var;
            case 22:
                b0k b0kVar11 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO5 = cwl1.o0(b0kVar11, i);
                uwr uwrVar10 = cbx.a;
                uwo1.e(strO5, (qim0) null, cbx.d(b0kVar11).g, cbx.a(b0kVar11).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar11, 0, 0, 2034);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                b0k b0kVar12 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO6 = cwl1.o0(b0kVar12, i);
                uwr uwrVar11 = cbx.a;
                uwo1.e(strO6, (qim0) null, cbx.d(b0kVar12).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar12, 0, 0, 2042);
                return rih1Var;
            case 24:
                b0k b0kVar13 = (b0k) obj2;
                ((Number) obj3).intValue();
                suo1.f(cwl1.o0(b0kVar13, i), 2, (qim0) null, 3, b0kVar13, 24624, 12);
                return rih1Var;
            default:
                b0k b0kVar14 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar12 = cbx.a;
                uwo1.e(cwl1.U(2131820883, i, new Object[]{Integer.valueOf(i)}, b0kVar14), (qim0) null, cbx.d(b0kVar14).g, cbx.a(b0kVar14).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar14, 0, 0, 2034);
                return rih1Var;
        }
    }
}
