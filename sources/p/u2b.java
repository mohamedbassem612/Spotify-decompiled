package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u2b implements yta0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ cv30 c;

    public /* synthetic */ u2b(y7e1 y7e1Var, cv30 cv30Var, byte b) {
        this.a = b;
        this.b = y7e1Var;
        this.c = cv30Var;
    }

    public final void a() {
        byte b = this.a;
        iu30 iu30Var = this.c;
        y7e1 y7e1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!ihc1.y0(y7e1Var.d().d)) {
                    ((Function0) iu30Var).invoke();
                }
                break;
            default:
                if (!ihc1.y0(y7e1Var.d().d)) {
                    iu30Var.invoke(y7e1Var.d().d.toString());
                }
                break;
        }
    }
}
