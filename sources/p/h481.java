package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h481 {
    public final vo30 a;
    public final f481 b;
    public final ujs c;

    public h481(vo30 vo30Var, f481 f481Var, ujs ujsVar) {
        this.a = vo30Var;
        this.b = f481Var;
        this.c = ujsVar;
    }

    public final Single a(String str, e481 e481Var) {
        t881 t881Var = e481Var.b;
        f481 f481Var = this.b;
        return this.c.a((t881Var != null ? f481Var.a(str, j6p1.q(e481Var), t881Var) : f481Var.c(str, j6p1.q(e481Var))).toObservable(), g481.a, new d061(this.a, (byte) 6)).map(new lqc(e481Var.q, (byte) 24)).firstOrError();
    }
}
