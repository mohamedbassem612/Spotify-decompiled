package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zod1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lee1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zod1(lee1 lee1Var, byte b) {
        super(4);
        this.a = b;
        this.b = lee1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = (String) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = pod1.c;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                cjc0 cjc0Var = new cjc0(2);
                uwo1.e(str, qim0VarB, this.b, 0L, new a0e1(5), null, 2, false, cjc0Var, 0, null, x340Var, (iIntValue >> 3) & 14, 0, 1704);
                return rih1Var;
            case 1:
                List<af5> list = (List) obj2;
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                boolean z = true;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, b0kVar, 0);
                x340 x340Var2 = (x340) b0kVar;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(b0kVar, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = (x340) b0kVar;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, b0kVar, y580.O0);
                nko1.H(xos0VarM, b0kVar, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
                nko1.F(b0kVar);
                nko1.H(qim0VarE, b0kVar, y580.Y);
                x340Var3.i0(29883486);
                for (af5 af5Var : list) {
                    uwr uwrVar2 = cbx.a;
                    b0k b0kVar2 = b0kVar;
                    uwo1.d(af5Var, cbx.a(b0kVar).b.b, null, this.b, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4084);
                    x340Var3 = x340Var3;
                    b0kVar = b0kVar2;
                    z = true;
                }
                x340 x340Var4 = x340Var3;
                x340Var4.r(false);
                x340Var4.r(true);
                return rih1Var;
            default:
                b0k b0kVar3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.d((af5) obj2, cbx.a(b0kVar3).b.b, null, this.b, null, null, 0, false, null, 0, null, null, b0kVar3, (iIntValue2 >> 3) & 14, 0, 4084);
                return rih1Var;
        }
    }
}
