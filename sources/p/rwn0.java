package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rwn0 implements sg30 {
    public final dar0 a;
    public final yun0 b;
    public final axn0 c;
    public final th30 d;
    public final Observable e;

    public rwn0(dg30 dg30Var, dg0 dg0Var, dar0 dar0Var, yun0 yun0Var, axn0 axn0Var) {
        this.a = dar0Var;
        this.b = yun0Var;
        this.c = axn0Var;
        this.d = dg30Var.e0();
        this.e = dg0Var.a(dg30Var);
    }

    @Override // p.sg30
    public final Observable l(zf30 zf30Var) {
        return i8p1.n(zf30Var, this.a, this.d, this.e, this.b, this.c);
    }
}
