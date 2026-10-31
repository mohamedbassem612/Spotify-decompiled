package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i950 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i950(String str, boolean z, boolean z2, int i) {
        super(2);
        this.c = str;
        this.b = z;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fra fraVar = een.N0;
                    qim0 qim0VarF = nim0.a;
                    if (z2) {
                        qim0VarF = u291.f(qim0VarF, 1.0f);
                    }
                    jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var2, 0);
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
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    t4n1.f(0, x340Var2, (qim0) null, z);
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.c, null, cbx.d(x340Var2).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2026);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                kyo1.e(czo1.p(1), str, (b0k) obj, z2, z);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                y2o1.o(czo1.p(1), str, (b0k) obj, z2, z);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i950(boolean z, String str, boolean z2, int i) {
        super(2);
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i950(boolean z, boolean z2, String str) {
        super(2);
        this.b = z;
        this.d = z2;
        this.c = str;
    }
}
