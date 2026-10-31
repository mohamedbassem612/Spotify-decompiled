package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gom implements sp80 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ gom(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final boolean a() {
        switch (this.a) {
        }
        return false;
    }

    public final op80 b(op80 op80Var) {
        r6h1 r6h1Var;
        iu30 iu30Var;
        byte b = this.a;
        iu30 iu30Var2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (op80) iu30Var2.invoke(op80Var);
            default:
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(0)) == null) {
                    r6h1Var = r6h1.c;
                }
                return new h3h1(new hij1(iu30Var2, r6h1Var, (byte) 15));
        }
    }
}
