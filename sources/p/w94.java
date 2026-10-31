package p;

import android.os.Handler;
import android.os.Looper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class w94 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha4 b;

    public /* synthetic */ w94(ha4 ha4Var, byte b) {
        this.a = b;
        this.b = ha4Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ha4 ha4Var = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                Handler handler = ha4Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = ha4Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t94(function0, (byte) 0));
                    }
                } else {
                    function0.invoke();
                }
                break;
            default:
                ((dz20) ha4Var.getFocusOwner()).i(((yx20) obj).d(), false);
                break;
        }
        return rih1Var;
    }
}
