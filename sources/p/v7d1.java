package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class v7d1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ie5 b;

    public /* synthetic */ v7d1(ie5 ie5Var, byte b) {
        this.a = b;
        this.b = ie5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ie5 ie5Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ie5Var.f = false;
                break;
            default:
                ie5Var.f = false;
                break;
        }
        return rih1Var;
    }
}
