package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pv1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv1(ow1 ow1Var, byte b) {
        super(0);
        this.a = b;
        this.b = ow1Var;
    }

    public final Object invoke() throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ow1 ow1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ow1Var.o.invoke(wo1.b);
                break;
            case 1:
                ow1Var.j.invoke();
                break;
            default:
                ow1Var.i.invoke();
                break;
        }
        return rih1Var;
    }
}
