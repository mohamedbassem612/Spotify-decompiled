package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mi1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ h6q0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi1(iu30 iu30Var, int i, h6q0 h6q0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.d = i;
        this.c = h6q0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h6q0 h6q0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w4i1 w4i1Var = h6q0Var.a;
                String strZ = h6q0Var.b().z();
                iu30Var.invoke(new dj1(this.d, strZ == null ? "" : strZ, w4i1Var, zBooleanValue, false));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                w4i1 w4i1Var2 = h6q0Var.a;
                String strZ2 = h6q0Var.b().z();
                iu30Var.invoke(new dj1(this.d, strZ2 == null ? "" : strZ2, w4i1Var2, zBooleanValue2, true));
                break;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                w4i1 w4i1Var3 = h6q0Var.a;
                String strZ3 = h6q0Var.b().z();
                iu30Var.invoke(new wkn(this.d, strZ3 == null ? "" : strZ3, w4i1Var3, zBooleanValue3, false));
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                w4i1 w4i1Var4 = h6q0Var.a;
                String strZ4 = h6q0Var.b().z();
                iu30Var.invoke(new wkn(this.d, strZ4 == null ? "" : strZ4, w4i1Var4, zBooleanValue4, true));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi1(iu30 iu30Var, h6q0 h6q0Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = h6q0Var;
        this.d = i;
    }
}
