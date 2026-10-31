package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uam1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uam1(Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
