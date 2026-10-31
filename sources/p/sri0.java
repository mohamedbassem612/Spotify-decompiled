package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sri0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yri0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sri0(yri0 yri0Var, iu30 iu30Var) {
        super(0);
        this.a = (byte) 1;
        this.b = yri0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yri0 yri0Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(((xri0) yri0Var).b);
                break;
            case 1:
                String str = ((xri0) yri0Var).e;
                if (str != null) {
                    iu30Var.invoke(str);
                }
                break;
            default:
                iu30Var.invoke(((vri0) yri0Var).b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sri0(iu30 iu30Var, yri0 yri0Var, byte b) {
        super(0);
        this.a = b;
        this.c = iu30Var;
        this.b = yri0Var;
    }
}
