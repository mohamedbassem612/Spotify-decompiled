package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ac30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ idd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac30(idd1 idd1Var, byte b) {
        super(0);
        this.a = b;
        this.b = idd1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Boolean bool = (Boolean) idd1Var.getValue();
                bool.getClass();
                return bool;
            default:
                return (qua0) idd1Var.getValue();
        }
    }
}
