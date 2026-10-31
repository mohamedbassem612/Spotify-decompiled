package p;

import androidx.car.app.k;
import androidx.car.app.l;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dqd implements o5s {
    public final /* synthetic */ l a;
    public final /* synthetic */ k b;

    public dqd(k kVar, l lVar) {
        this.b = kVar;
        this.a = lVar;
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        this.a.c();
        k kVar = this.b;
        if (k.a(kVar) != null) {
            k.a(kVar).release();
            k.b(kVar);
        }
        iac0Var.getLifecycle().d(this);
    }
}
