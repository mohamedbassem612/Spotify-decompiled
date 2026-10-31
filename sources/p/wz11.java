package p;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wz11 implements SingleSource {
    public final /* synthetic */ xz11 a;

    public wz11(xz11 xz11Var) {
        this.a = xz11Var;
    }

    @Override // io.reactivex.rxjava3.core.SingleSource
    public final void subscribe(SingleObserver singleObserver) {
        vz11 vz11Var = this.a.c;
        vz11Var.b().c(vz11Var.a(x020.c));
    }
}
