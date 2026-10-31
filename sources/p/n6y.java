package p;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n6y implements i2q0, d5q0 {
    public final /* synthetic */ l441 a;

    public void i(Exception exc) {
        this.a.resumeWith(new m231(exc));
    }

    public void onComplete(Task task) {
        Exception excV;
        boolean zJ = task.j();
        rih1 rih1Var = rih1.a;
        l441 l441Var = this.a;
        if (zJ) {
            l441Var.resumeWith(rih1Var);
            return;
        }
        Exception excF = task.f();
        if (excF == null || (excV = lmt0.v(excF)) == null) {
            l441Var.resumeWith(rih1Var);
        } else {
            l441Var.resumeWith(new m231(excV));
        }
    }
}
