package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g70 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g70(hux huxVar, byte b) {
        super(3);
        this.a = b;
        this.b = huxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    t1c.a(dug.f(qim0VarD, cbx.a(x340Var2).a.b.a(), er31.a), x340Var2, 0);
                    w0h1.a(this.b, isl.a, (qim0) null, cbx.a(x340Var2).b.b, 0L, false, x340Var2, 56, 52);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, 56, 60);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                w0h1.a(this.b, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar, 56, 56);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                w0h1.a(this.b, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, 56, 48);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, 56, 60);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                w0h1.a(this.b, isl.a, u291.h(nim0Var, 16.0f), 0L, 0L, false, (b0k) obj2, 56, 56);
                return rih1Var;
            case 6:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                w0h1.a(this.b, isl.a, (qim0) null, cbx.a(b0kVar3).b.b, 0L, false, b0kVar3, 56, 52);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, 56, 60);
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, false, x340Var4, 56, 60);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var6).g;
                    w0h1.a(this.b, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var6).b.a, 0L, false, x340Var6, 56, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, 56, 60);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var7.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var8, 0);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, nim0Var);
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
                    nko1.H(mbhVarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM2, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, y580.Y);
                    w0h1.a(this.b, isl.a, (qim0) null, 0L, 0L, zBooleanValue, x340Var8, 56 | ((iIntValue4 << 15) & 458752), 28);
                    x340Var8.i0(1215032829);
                    x340Var8.r(false);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                w0h1.a(this.b, isl.a, (qim0) null, cbx.a(b0kVar4).b.a, 0L, false, b0kVar4, 56, 52);
                return rih1Var;
            default:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                zov0 zov0Var4 = cbx.b(b0kVar5).g;
                w0h1.a(this.b, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, b0kVar5, 56, 56);
                return rih1Var;
        }
    }
}
