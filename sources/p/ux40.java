package p;

import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ux40 implements z1q0, myc {
    public final /* synthetic */ ohd a;

    public void c() {
        this.a.q((Throwable) null);
    }

    public void u(dxc dxcVar, Throwable th) {
        this.a.resumeWith(new m231(th));
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        boolean z = sy21Var.a.Q0;
        ohd ohdVar = this.a;
        if (z) {
            ohdVar.resumeWith(sy21Var.b);
        } else {
            ohdVar.resumeWith(new m231(new HttpException(sy21Var)));
        }
    }
}
