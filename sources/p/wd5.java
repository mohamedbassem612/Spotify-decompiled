package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wd5 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbf0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd5(kbf0 kbf0Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kbf0Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kbf0 kbf0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Float.valueOf(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : ((Number) kbf0Var.getValue()).floatValue());
            default:
                return Float.valueOf(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : ((Number) kbf0Var.getValue()).floatValue());
        }
    }
}
