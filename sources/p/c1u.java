package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1u implements nyc, h8q0 {
    public final /* synthetic */ ohd a;

    public /* synthetic */ c1u(ohd ohdVar) {
        this.a = ohdVar;
    }

    public void k(jf01 jf01Var, IOException iOException) {
        ohd ohdVar = this.a;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(iOException));
        }
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        this.a.f(ry21Var, gft.c);
    }

    public void onSuccess(Object obj) {
        this.a.resumeWith(obj);
    }
}
