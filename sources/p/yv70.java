package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yv70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv70(int i, Function0 function0, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = function0;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        int i = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                elb0 elb0Var = (elb0) obj;
                if (!((Boolean) ven0Var.getValue()).booleanValue() && Float.intBitsToFloat((int) (elb0Var.p(0L) & 4294967295L)) < i + 500.0f) {
                    ven0Var.setValue(Boolean.TRUE);
                    function0.invoke();
                }
                break;
            default:
                if (((Number) obj).intValue() >= i && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    function0.invoke();
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return rih1Var;
    }
}
