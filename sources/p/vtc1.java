package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vtc1 extends ResultReceiver {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtc1(a6n1 a6n1Var, Handler handler, bsd1 bsd1Var) {
        super(handler);
        this.b = bsd1Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uw0 uw0Var = (uw0) obj;
                a1r0 a1r0Var = (a1r0) uw0Var.t;
                if (i == -1) {
                    if (!a1r0Var.h((Activity) uw0Var.e)) {
                        ((lzn0) uw0Var.f).e();
                    } else {
                        a1r0Var.l();
                    }
                }
                break;
            default:
                ((bsd1) obj).d((Object) null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtc1(uw0 uw0Var, Handler handler) {
        super(handler);
        this.b = uw0Var;
    }
}
