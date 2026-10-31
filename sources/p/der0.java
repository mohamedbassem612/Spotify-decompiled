package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class der0 implements rdo0 {
    public final b6r0 a;
    public final jir0 b;
    public final ezc c;
    public final dcr0 d;

    public der0(lzh lzhVar, b6r0 b6r0Var, Object obj, xnn0 xnn0Var, Bundle bundle) {
        this.a = b6r0Var;
        jir0 jir0Var = new jir0(xnn0Var);
        this.b = jir0Var;
        this.c = yoi1.g(Observable.combineLatest(b6r0Var.h, b6r0Var.g, b6r0Var.i.a(), bk20.U0).distinctUntilChanged());
        dcr0 dcr0Var = new dcr0(b6r0Var.e(jir0Var), new g1k1(lzhVar.a, obj), lzhVar.b, b6r0Var.e, bundle, (x8c0) null, obj, (rck1) null);
        dcr0Var.f();
        this.d = dcr0Var;
    }

    @Override // p.rdo0
    public final void dispose() {
        this.d.a();
    }
}
