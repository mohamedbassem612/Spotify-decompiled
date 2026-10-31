package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q4f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4f(int i, int i2, hux huxVar) {
        super(2);
        this.a = (byte) 1;
        this.b = i;
        this.c = huxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        hux huxVar = this.c;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iqo1.f(huxVar, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                iqo1.m(i, czo1.p(65), (b0k) obj, huxVar);
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(this.c, new jsl(cwl1.o0(x340Var2, i)), (qim0) null, u7h.f, 0L, false, x340Var2, 8, 52);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var4, 0);
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
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    uwo1.e(((Context) x340Var4.k(AndroidCompositionLocals_androidKt.b)).getString(i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2046);
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(this.c, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var4, 56, 56);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4f(int i, hux huxVar, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = huxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4f(hux huxVar, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = huxVar;
        this.b = i;
    }
}
