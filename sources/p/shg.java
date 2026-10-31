package p;

import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class shg implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ shg(ven0 ven0Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                y9e1 y9e1Var = (y9e1) obj;
                ven0Var.setValue(y9e1Var);
                iu30Var.invoke(y9e1Var);
                break;
            default:
                Offset offset = (Offset) obj;
                y9e1 y9e1Var2 = (y9e1) ven0Var.getValue();
                if (y9e1Var2 != null) {
                    iu30Var.invoke(Integer.valueOf(y9e1Var2.b.g(offset.a)));
                }
                break;
        }
        return rih1Var;
    }
}
