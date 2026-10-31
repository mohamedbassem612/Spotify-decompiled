package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class la0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(long j, cvx cvxVar, String str) {
        super(3);
        this.a = (byte) 2;
        this.c = j;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                uwo1.e(this.b, null, null, this.c, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2038);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    uwo1.e(this.b, null, null, this.c, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2038);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var3, 0);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var3, nim0Var);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(hmb0.t1);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                clx clxVar = clx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var3).g;
                qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                int i = clx.d | 48;
                isl islVar = isl.a;
                long j = this.c;
                w0h1.a(clxVar, islVar, qim0VarR, j, 0L, false, x340Var3, i, 48);
                uwo1.e(this.b, uyn1.z(4.0f, 0.0f, 2, nim0Var), cbx.d(x340Var3).m, j, null, null, 2, false, new cjc0(1), 0, null, x340Var3, 0, 0, 1712);
                x340Var5.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la0(byte b, long j, String str) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = j;
    }
}
