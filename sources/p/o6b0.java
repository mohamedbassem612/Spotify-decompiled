package p;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o6b0 implements myc, i2q0 {
    public final /* synthetic */ ohd a;

    public /* synthetic */ o6b0(ohd ohdVar) {
        this.a = ohdVar;
    }

    public void onComplete(Task task) {
        Exception excF = task.f();
        if (excF != null) {
            this.a.resumeWith(new m231(excF));
            return;
        }
        boolean z = ((hfp1) task).d;
        ohd ohdVar = this.a;
        if (z) {
            ohdVar.q(null);
        } else {
            ohdVar.resumeWith(task.g());
        }
    }

    @Override // p.myc
    public void u(dxc dxcVar, Throwable th) {
        this.a.resumeWith(new m231(th));
    }

    @Override // p.myc
    public void z(dxc dxcVar, sy21 sy21Var) {
        this.a.resumeWith(sy21Var);
    }
}
