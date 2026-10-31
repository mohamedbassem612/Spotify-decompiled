package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq0(ziu ziuVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = ziuVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        b36 b36Var = h36.g;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        ziu ziuVar = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(b36Var, een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(nim0Var, 6.0f);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = di0.O0;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = uyn1.B(s161.b(qim0VarX, false, (iu30) objT), 12.0f, 0.0f, 16.0f, 0.0f, 10);
                    vq60 vq60Var = jw80.a;
                    r2p1.a(qim0VarB.then(tsj0.a), x340Var2, 0);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new p1(iu30Var, (byte) 23);
                        x340Var2.s0(objT2);
                    }
                    kp0 kp0VarB = ziuVar.b((Function0) objT2, true, true);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qp0.a(kp0VarB, uyn1.x(nim0Var, 8.0f), x340Var2, 0, 0);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var4).b;
                    cvx cvxVar5 = cbx.b(x340Var4).b;
                    cvx cvxVar6 = cbx.b(x340Var4).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarF2, 16.0f, 12.0f, 16.0f, 0.0f, 8);
                    jw31 jw31VarA2 = ew31.a(b36Var, een.N0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB2);
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
                    nko1.H(jw31VarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    biu biuVar = ziuVar.f.c;
                    String str = biuVar.a;
                    String str2 = biuVar.c;
                    wnb0 wnb0Var = new wnb0(1.0f, false);
                    cvx cvxVar7 = cbx.b(x340Var4).b;
                    i3p1.b(0, str, str2, x340Var4, uyn1.B(wnb0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11));
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new p1(iu30Var, (byte) 25);
                        x340Var4.s0(objT3);
                    }
                    qp0.a(ziuVar.b((Function0) objT3, true, true), (qim0) null, x340Var4, 0, 2);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == fkj0.X) {
                        objT4 = new p1(iu30Var, (byte) 29);
                        x340Var6.s0(objT4);
                    }
                    qp0.a(ziuVar.b((Function0) objT4, true, false), (qim0) null, x340Var6, 0, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zG4 = x340Var8.g(iu30Var);
                    Object objT5 = x340Var8.T();
                    if (zG4 || objT5 == fkj0.X) {
                        objT5 = new u460(iu30Var, (byte) 9);
                        x340Var8.s0(objT5);
                    }
                    qp0.a(ziuVar.b((Function0) objT5, false, false), (qim0) null, x340Var8, 0, 2);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
