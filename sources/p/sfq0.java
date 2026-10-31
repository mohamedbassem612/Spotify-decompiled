package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sfq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sfq0(String str, lee1 lee1Var, long j, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = lee1Var;
        this.d = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(this.b, null, this.c, this.d, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = this.b;
                    if (str == null) {
                        x340Var4.i0(-423527790);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-423527789);
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarE = zr7.E(x340Var4, nim0Var);
                        hzj.A.getClass();
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(hmb0.t1);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, x340Var4, y580.O0);
                        nko1.H(xos0VarM, x340Var4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        nko1.F(x340Var4);
                        nko1.H(qim0VarE, x340Var4, y580.Y);
                        Object objT = x340Var4.T();
                        if (objT == fkj0.X) {
                            objT = nhe1.N0;
                            x340Var4.s0(objT);
                        }
                        uwo1.e(str, s161.b(nim0Var, false, (iu30) objT), this.c, this.d, new a0e1(3), null, 0, false, null, 0, null, x340Var4, 0, 0, 2016);
                        x340Var4.r(true);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
