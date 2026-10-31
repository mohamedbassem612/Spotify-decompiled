package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e68 {
    public final Flowable a;
    public final d0r b;
    public final boolean c;
    public final w9u0 d;
    public final u961 e;
    public final ajq0 f;
    public final c3s g;
    public final in01 h;

    public e68(Flowable flowable, d0r d0rVar, boolean z, w9u0 w9u0Var, u961 u961Var, ajq0 ajq0Var, c3s c3sVar, in01 in01Var) {
        this.a = flowable;
        this.b = d0rVar;
        this.c = z;
        this.d = w9u0Var;
        this.e = u961Var;
        this.f = ajq0Var;
        this.g = c3sVar;
        this.h = in01Var;
    }

    public final m68 a() {
        ajq0 ajq0Var = this.f;
        return new m68(this.a, this.b, this.e, new p68(this.d, this.c, (u961) ajq0Var.a, (in01) ajq0Var.b, (cn4) ajq0Var.c, (a1r0) ajq0Var.d, (b0a0) ajq0Var.e), this.g, this.h);
    }
}
