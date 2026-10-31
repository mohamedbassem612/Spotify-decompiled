package p;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class yxj implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yxj(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xab1) obj).d((CancellationException) null);
                break;
            case 1:
                x6e1 x6e1Var = (x6e1) obj;
                if (x6e1Var != null) {
                    r1c0 r1c0Var = x6e1Var.d;
                    if (r1c0Var != null) {
                        r1c0Var.e(nbe1.b);
                    }
                    r1c0 r1c0Var2 = x6e1Var.d;
                    if (r1c0Var2 != null) {
                        r1c0Var2.f(nbe1.b);
                    }
                }
                break;
            default:
                ggg1 ggg1Var = (ggg1) obj;
                y7e1 y7e1Var = ggg1Var.a;
                dk80 dk80Var = ggg1Var.b;
                y7e1Var.b.c().h();
                h4e1 h4e1Var = y7e1Var.b;
                h4e1Var.t = null;
                ggg1Var.r(h4e1Var);
                y7e1Var.b(dk80Var, true, 1);
                y7e1Var.g(true);
                y7e1Var.f(y7e1Var.b.e);
                break;
        }
    }
}
