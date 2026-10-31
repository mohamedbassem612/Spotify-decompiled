package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rvh extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvh(long j, cua cuaVar) {
        super(3);
        this.a = (byte) 11;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        u5j1 u5j1Var = d4o1.a;
        long j = this.b;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.r(nim0Var, 40.0f), svh.a), j, u5j1Var), 0L, (hw61) null, 15), (b0k) obj2, 0);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV = u291.v(nim0Var, 100.0f);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV, 12.0f), svh.a), j, u5j1Var), 0L, (hw61) null, 15), b0kVar, 0);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV2 = u291.v(nim0Var, 140.0f);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV2, 16.0f), svh.a), j, u5j1Var), 0L, (hw61) null, 15), b0kVar2, 0);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lb91 lb91Var = lb91.a;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var2);
                    }
                    lb91Var.a((idn0) objT, (qim0) null, (fb91) null, false, this.b, x340Var2, 0, 14);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarL0 = cwl1.l0(dug.f(u291.f(nim0Var, 0.5f), j, er31.b(4.0f)), j, er31.b(4.0f), 12);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarL0);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
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
                nko1.H(gfh0VarC, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwo1.e(" ", (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, 6, 0, 1726);
                x340Var5.r(true);
                return rih1Var;
            case 5:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w0h1.a(wsx.c, isl.a, u291.r(nim0Var, 16.0f), this.b, 0L, false, x340Var7, wsx.d | 48, 48);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.r(nim0Var, 64.0f), ey00.b), j, u5j1Var), 0L, (hw61) null, 15), (b0k) obj2, 0);
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var3 = cbx.b(b0kVar3).g;
                qim0 qim0VarV3 = u291.v(nim0Var, 64.0f);
                zov0 zov0Var4 = cbx.b(b0kVar3).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV3, 12.0f), ey00.b), j, u5j1Var), 0L, (hw61) null, 15), b0kVar3, 0);
                return rih1Var;
            case 8:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV4 = u291.v(nim0Var, 120.0f);
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var5 = cbx.b(b0kVar4).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV4, 12.0f), ey00.b), j, u5j1Var), 0L, (hw61) null, 15), b0kVar4, 0);
                return rih1Var;
            case 9:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV5 = u291.v(nim0Var, 160.0f);
                uwr uwrVar5 = cbx.a;
                zov0 zov0Var6 = cbx.b(b0kVar5).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV5, 16.0f), ey00.b), j, u5j1Var), 0L, (hw61) null, 15), b0kVar5, 0);
                return rih1Var;
            case 10:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    w0h1.a(hrx.c, isl.a, u291.r(nim0Var, ((wat) x340Var9.k(t4k.h)).y(j)), 0L, 0L, false, x340Var9, hrx.d | 48, 56);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                t1c.a(dug.f(((g2c) obj).b(nim0Var), j, er31.b(8.0f)), (b0k) obj2, 0);
                return rih1Var;
            case 12:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarL1 = cwl1.l0(dug.f(u291.f(nim0Var, 0.5f), j, er31.b(4.0f)), j, er31.b(4.0f), 12);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var11 = x340Var10;
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarL1);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
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
                nko1.H(gfh0VarC2, x340Var10, y580.O0);
                nko1.H(xos0VarM2, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE2, x340Var10, y580.Y);
                uwo1.e(" ", (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var10, 6, 0, 1726);
                x340Var12.r(true);
                return rih1Var;
            case 13:
                DrawScope drawScope = (DrawScope) obj;
                long j2 = ((Offset) obj2).a;
                long j3 = ((u7h) obj3).a;
                float f = rr51.e;
                float fX0 = drawScope.X0(f) / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.05f;
                int i = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i) > fIntBitsToFloat && Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fIntBitsToFloat) {
                    DrawScope.d0(drawScope, this.b, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - fX0)) << 32), (((long) Float.floatToRawIntBits(drawScope.X0(f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM3 = x340Var14.m();
                    qim0 qim0VarE3 = zr7.E(x340Var14, nim0Var);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var14, y580.O0);
                    nko1.H(xos0VarM3, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE3, x340Var14, y580.Y);
                    w0h1.a(gtx.c, isl.a, u291.r(nim0Var, 12.0f), this.b, 0L, false, x340Var14, gtx.d | 48, 48);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.r(nim0Var, 64.0f), o6i1.a), j, u5j1Var), 0L, (hw61) null, 15), (b0k) obj2, 0);
                return rih1Var;
            case 16:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                zov0 zov0Var7 = cbx.b(b0kVar6).g;
                qim0 qim0VarV6 = u291.v(nim0Var, 64.0f);
                zov0 zov0Var8 = cbx.b(b0kVar6).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV6, 12.0f), o6i1.a), j, u5j1Var), 0L, (hw61) null, 15), b0kVar6, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV7 = u291.v(nim0Var, 120.0f);
                uwr uwrVar7 = cbx.a;
                zov0 zov0Var9 = cbx.b(b0kVar7).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV7, 12.0f), o6i1.a), j, u5j1Var), 0L, (hw61) null, 15), b0kVar7, 0);
                return rih1Var;
            default:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarV8 = u291.v(nim0Var, 160.0f);
                uwr uwrVar8 = cbx.a;
                zov0 zov0Var10 = cbx.b(b0kVar8).g;
                t1c.a(cwl1.l0(dug.f(i1p1.q(u291.h(qim0VarV8, 16.0f), o6i1.a), j, u5j1Var), 0L, (hw61) null, 15), b0kVar8, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvh(byte b, long j) {
        super(3);
        this.a = b;
        this.b = j;
    }
}
