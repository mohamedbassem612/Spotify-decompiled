package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qvh extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvh(int i, String str, byte b) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        x340 x340Var2;
        x340 x340Var3;
        x340 x340Var4;
        byte b = this.a;
        String str = this.c;
        n4k n4kVar = hmb0.t1;
        gex0 gex0Var = h36.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var5, nim0Var);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
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
                nko1.H(jw31VarA, x340Var5, y580.O0);
                nko1.H(xos0VarM, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE, x340Var5, y580.Y);
                if (i == 0) {
                    x340Var7.i0(1843581122);
                    x340Var7.r(false);
                    x340Var = x340Var7;
                } else {
                    x340Var7.i0(1843581123);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    x340Var = x340Var7;
                    kqn1.d(i, 0, 0, x340Var5, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                    x340Var.r(false);
                }
                uwr uwrVar2 = cbx.a;
                uwo1.e(this.c, (qim0) null, cbx.d(x340Var5).j, cbx.a(x340Var5).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var5, 0, 0, 1714);
                x340Var.r(true);
                return rih1Var;
            case 1:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarE2 = zr7.E(x340Var8, nim0Var2);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
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
                nko1.H(jw31VarA2, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                if (i == 0) {
                    x340Var10.i0(-1135013640);
                    x340Var10.r(false);
                    x340Var2 = x340Var10;
                } else {
                    x340Var10.i0(-1135013639);
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    x340Var2 = x340Var10;
                    kqn1.d(i, 0, 0, x340Var8, anm1.N("extended-user-activity-row-content-restriction-badge-test-tag", uyn1.B(nim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11)));
                    x340Var2.r(false);
                }
                zic0 zic0Var = new zic0(1);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var8).j;
                long j = cbx.a(x340Var8).b.b;
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = fa00.a1;
                    x340Var2.s0(objT);
                }
                uwo1.e(this.c, s161.b(nim0Var2, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 2, false, zic0Var, 0, (qx8) null, x340Var8, 0, 0, 1712);
                x340Var2.r(true);
                return rih1Var;
            case 2:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(this.c, (qim0) null, cbx.d(x340Var12).j, cbx.a(x340Var12).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(i), 0, (qx8) null, x340Var12, 1572864, 0, 1714);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 3:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(str);
                uwr uwrVar6 = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                cua cuaVar2 = cbx.b(b0kVar).f;
                qim0 qim0VarK = xcg1.k(cbx.a, u291.f(i1p1.q(nim0.a, new zvx()), 1.0f));
                as80 as80Var = mif1.P0;
                fwx fwxVarE = hso1.E(this.b, 0L, false, 0L, b0kVar, 0, 14);
                eso1.e(uri, isl.a, qim0VarK, null, null, null, as80Var, null, null, new pux(fwxVarE, fwxVarE), false, false, b0kVar, 1073741872, 0, 3512);
                return rih1Var;
            case 4:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA3 = ew31.a(gex0Var, een.N0, x340Var13, 0);
                x340 x340Var14 = x340Var13;
                int iHashCode3 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM3 = x340Var14.m();
                nim0 nim0Var3 = nim0.a;
                qim0 qim0VarE3 = zr7.E(x340Var13, nim0Var3);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(jw31VarA3, x340Var13, y580.O0);
                nko1.H(xos0VarM3, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE3, x340Var13, y580.Y);
                if (i == 0) {
                    x340Var15.i0(-1082869541);
                    x340Var15.r(false);
                    x340Var3 = x340Var15;
                } else {
                    x340Var15.i0(-1082869540);
                    uwr uwrVar7 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var13).b;
                    x340Var3 = x340Var15;
                    kqn1.d(i, 0, 0, x340Var13, anm1.N("reaction_sheet_header_content_restriction_badge", uyn1.B(nim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11)));
                    x340Var3.r(false);
                }
                String str2 = this.c;
                if (str2 != null) {
                    x340Var3.i0(-1082533128);
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var13).j, cbx.a(x340Var13).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var13, 0, 0, 1714);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1082236179);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 5:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                et40 et40Var = et40.a;
                yoi1.d(new p05(2131231804), (String) null, eqr0.H(et40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0, (u8h) null, x340Var16, 48, 24);
                x340 x340Var17 = x340Var16;
                Object objT2 = x340Var17.T();
                if (objT2 == fkj0.X) {
                    objT2 = nhe1.Z0;
                    x340Var17.s0(objT2);
                }
                o4p1.g(this.c, iko1.x(et40Var, (iu30) objT2), nee1.l, this.b, x340Var17, 0, 0);
                return rih1Var;
            case 6:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                jch0.f(eqr0.F(ila0.m(et40.a, new p05(2131231025)), 16.0f, 8.0f), 1, apo.r(1034868364, new qvh(str, i, (byte) 5), b0kVar2), b0kVar2, 3072, 2);
                return rih1Var;
            default:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA4 = ew31.a(gex0Var, een.N0, x340Var18, 0);
                x340 x340Var19 = x340Var18;
                int iHashCode4 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM4 = x340Var19.m();
                nim0 nim0Var4 = nim0.a;
                qim0 qim0VarE4 = zr7.E(x340Var18, nim0Var4);
                hzj.A.getClass();
                x340 x340Var20 = x340Var18;
                if (x340Var20.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(jw31VarA4, x340Var18, y580.O0);
                nko1.H(xos0VarM4, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE4, x340Var18, y580.Y);
                if (i == 0) {
                    x340Var20.i0(1029374487);
                    x340Var20.r(false);
                    x340Var4 = x340Var20;
                } else {
                    x340Var20.i0(1029374488);
                    uwr uwrVar9 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var18).b;
                    x340Var4 = x340Var20;
                    kqn1.d(i, 0, 0, x340Var18, anm1.N("user-activity-row-content-restriction-badge-test-tag", uyn1.B(nim0Var4, 0.0f, 0.0f, 4.0f, 0.0f, 11)));
                    x340Var4.r(false);
                }
                zic0 zic0Var2 = new zic0(1);
                uwr uwrVar10 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var18).j;
                long j2 = cbx.a(x340Var18).b.b;
                Object objT3 = x340Var4.T();
                if (objT3 == fkj0.X) {
                    objT3 = osh1.T0;
                    x340Var4.s0(objT3);
                }
                uwo1.e(this.c, s161.b(nim0Var4, false, (iu30) objT3), lee1Var2, j2, (a0e1) null, (iu30) null, 2, false, zic0Var2, 0, (qx8) null, x340Var18, 0, 0, 1712);
                x340Var4.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvh(String str, int i, byte b) {
        super(3);
        this.a = b;
        this.c = str;
        this.b = i;
    }
}
