package p;

import android.app.Notification;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1u0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0u0(g1u0 g1u0Var, byte b) {
        super(1);
        this.a = b;
        this.b = g1u0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g1u0 g1u0Var = this.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                if (g1u0.c(g1u0Var.t)) {
                    Notification notificationC = g1u0Var.d.c(g1u0Var.t, g1u0Var.s, bitmap, g1u0Var.u, g1u0Var.f());
                    g1u0Var.d(notificationC);
                    g1u0Var.A = notificationC;
                }
                break;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                if (g1u0.c(g1u0Var.t)) {
                    Notification notificationC2 = g1u0Var.d.c(g1u0Var.t, g1u0Var.s, bitmap2, g1u0Var.u, g1u0Var.f());
                    g1u0Var.d(notificationC2);
                    g1u0Var.A = notificationC2;
                }
                break;
        }
        return rih1Var;
    }
}
