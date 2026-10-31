package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k27 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k27(c380 c380Var, byte b) {
        super(0);
        this.a = b;
        this.b = c380Var;
    }

    public final Object invoke() {
        byte b = this.a;
        c380 c380Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Integer.valueOf(c380Var.size());
            case 1:
                return Integer.valueOf(c380Var.size());
            case 2:
                return Integer.valueOf(c380Var.size());
            case 3:
                return Integer.valueOf(c380Var.size());
            case 4:
                return Integer.valueOf(c380Var.size() + 1);
            default:
                return Integer.valueOf(c380Var.size());
        }
    }
}
