package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bwe0 implements kir0 {
    public final zia a = new zia();

    public final Observable a() {
        return this.a.distinctUntilChanged();
    }

    public final void b(String str, zf30 zf30Var) {
        if (zf30Var instanceof lir0) {
            zf30Var.s1.a(new ct6(((lir0) zf30Var).c().a.startWithItem(new d6r0("")).subscribe((Consumer) this.a), (byte) 9));
        }
    }
}
