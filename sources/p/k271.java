package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k271 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j171 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k271(j171 j171Var, byte b) {
        super(0);
        this.a = b;
        this.b = j171Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j171 j171Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                j171Var.d.invoke();
                break;
            default:
                j171Var.d.invoke();
                break;
        }
        return rih1Var;
    }
}
