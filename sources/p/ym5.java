package p;

import android.app.ActivityManager;
import io.reactivex.rxjava3.functions.Action;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ym5 implements Action {
    public final /* synthetic */ an5 a;

    public ym5(an5 an5Var) {
        this.a = an5Var;
    }

    public final void run() {
        an5 an5Var = this.a;
        vd31 vd31Var = new vd31(((ActivityManager) an5Var.b.get()).getHistoricalProcessExitReasons(an5Var.a.getPackageName(), 0, 15));
        xm5 xm5Var = (xm5) an5Var.c.get();
        ud31 it = vd31Var.iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it.b;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                xm5Var.a(k220.b(listIterator.previous()));
            }
        }
    }
}
