package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h71 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ h71(j71 j71Var, byte b) {
        this.a = b;
        this.b = j71Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        j71 j71Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                j71Var.f.e();
                break;
            default:
                c71 c71Var = (c71) obj;
                j71Var.h.a(dv.a(j71Var.b, j71Var.g, c71Var.c, c71Var.d, c71Var.e));
                break;
        }
    }
}
