package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nk7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk7(int i, long j, j2i j2iVar) {
        super(2);
        this.a = (byte) 9;
        this.b = j;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                zqo1.d((m5f) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zsx zsxVar = wro1.M(((xji0) obj3).c) ? zsx.c : znx.c;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    isl islVar = isl.a;
                    long j2 = this.b;
                    w0h1.a(zsxVar, islVar, qim0VarR, j2, j2, true, x340Var2, 196664, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                dym.a((txm) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                lcc.c((c9) obj3, j, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w3d1.a((qim0) null, (hw61) null, this.b, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-534136207, new k7f((byte) 18, (vu30) obj3, false), x340Var4), x340Var4, 12582912, 123);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    w0h1.a((hux) obj3, isl.a, u291.r(nim0Var, 16.0f), this.b, 0L, false, x340Var6, 56, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                rwq0.b((qhq0) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    ckm0 ckm0Var = (ckm0) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    boolean z = x340Var8.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var8, lljVar4);
                    gra graVar = een.h;
                    qim0 qim0VarF = dug.f(i1p1.q(d7e.r(1.0f, u291.f(uyn1.x(nim0Var2, 8.0f), 1.0f), false), er31.a), j, d4o1.a);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarF);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, lljVar);
                    nko1.H(xos0VarM2, x340Var8, lljVar2);
                    x0d.q(iHashCode2, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE2, x340Var8, lljVar4);
                    String str = ckm0Var.b;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str, uyn1.x(nim0Var2, 8.0f), cbx.d(x340Var8).k, 0L, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var8, 0, 0, 1704);
                    x340Var8.r(true);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                int i = ((e8y0) obj3).d;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    int[] iArr = f8y0.a;
                    if (iArr[l1d.C(i)] == 2) {
                        x340Var10.i0(1096973602);
                        uwr uwrVar4 = cbx.a;
                        xto1.e(null, 1, cbx.a(x340Var10).b.a, cbx.a(x340Var10).b.b, x340Var10, 48, 1);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(1096981367);
                        b180 b180Var = ((hux) tsx.c).a.a;
                        qim0 qim0VarR2 = u291.r(nim0Var, 16.0f);
                        if (iArr[l1d.C(i)] == 1) {
                            x340Var10.i0(1096990272);
                            x340Var10.r(false);
                        } else {
                            x340Var10.i0(1096992184);
                            uwr uwrVar5 = cbx.a;
                            j = cbx.a(x340Var10).b.a;
                            x340Var10.r(false);
                        }
                        long j3 = j;
                        qim0 qim0Var = pl70.a;
                        pl70.a(byo1.s(b180Var, x340Var10), qim0VarR2, j3, x340Var10, 56, 0);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                b3o1.e(j, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                grn1.l((bl80) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                rje1.c((qte1) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                don1.j((wbm1) obj3, j, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk7(long j, Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk7(Object obj, long j, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk7(Object obj, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
