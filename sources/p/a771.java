package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a771 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im0 b;
    public final /* synthetic */ v671 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a771(im0 im0Var, v671 v671Var, byte b) {
        super(0);
        this.a = b;
        this.b = im0Var;
        this.c = v671Var;
    }

    public final Object invoke() {
        xab1 xab1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v671 v671Var = this.c;
        im0 im0Var = this.b;
        switch (b) {
            case 0:
                ((iac0) im0Var.i).getLifecycle().a(v671Var);
                break;
            default:
                ((iac0) im0Var.i).getLifecycle().d(v671Var);
                xab1 xab1Var2 = (xab1) v671Var.b;
                if (xab1Var2 != null && !xab1Var2.isCancelled() && (xab1Var = (xab1) v671Var.b) != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
        }
        return rih1Var;
    }
}
