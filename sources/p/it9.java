package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class it9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it9(drr0 drr0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = drr0Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        drr0 drr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                drr0Var.t(0.0f);
                function0.invoke();
                break;
            default:
                drr0Var.t(1.0f);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
