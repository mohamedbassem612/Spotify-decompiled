package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gl9 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ gl9(xtb0 xtb0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = xtb0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        Object objU;
        Object objK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        int i = this.d;
        int i2 = this.c;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (((Boolean) obj).booleanValue() && (objU = y9g1.u(xtb0Var, i2, i, zv8.a1, lnmVar)) == d9nVar) ? objU : rih1Var;
            case 1:
                ((Number) obj).intValue();
                return (!(((err0) xtb0Var.e.b).s() == i2 && ((err0) xtb0Var.e.c).s() == i) && (objK = xtb0Var.k(i2, i, lnmVar)) == d9nVar) ? objK : rih1Var;
            default:
                ((Number) obj).intValue();
                Object objK2 = xtb0Var.k(i2, i, lnmVar);
                return objK2 == d9nVar ? objK2 : rih1Var;
        }
    }
}
