package p;

import android.app.PendingIntent;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ulh0 implements wlh0, ezh0 {
    public final /* synthetic */ PendingIntent a;

    public /* synthetic */ ulh0(int i, PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public void a(rlh0 rlh0Var) {
        if (rlh0Var.p()) {
            PendingIntent pendingIntent = rlh0Var.q;
            PendingIntent pendingIntent2 = this.a;
            if (Objects.equals(pendingIntent, pendingIntent2)) {
                return;
            }
            rlh0Var.q = pendingIntent2;
            tkh0 tkh0Var = rlh0Var.a;
            tkh0Var.getClass();
            dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
            tkh0Var.d.getClass();
        }
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.a(i, this.a);
    }

    public /* synthetic */ ulh0(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}
