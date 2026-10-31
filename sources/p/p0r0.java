package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0r0 implements kir0, o2q0 {
    public final vku a;
    public final j0r0 b;
    public final zia c = new zia();

    public p0r0(vku vkuVar, j0r0 j0r0Var) {
        this.a = vkuVar;
        this.b = j0r0Var;
    }

    public final Observable a() {
        return this.c;
    }

    public final void b(String str, zf30 zf30Var) {
        if (zf30Var instanceof ug30) {
            this.a.a(((lir0) zf30Var).c().a.startWithItem(new d6r0(str)).map(new khc(str, (byte) 18)).subscribe(this.c));
        }
        this.b.invoke();
    }
}
