package p;

import android.os.Bundle;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p1o0 implements n1o0, iyf0, cyf0 {
    public final dg30 a;
    public final th30 b;
    public final p2o0 c;
    public final Set d;
    public final v1o0 e;
    public boolean f;
    public final PublishSubject g = new PublishSubject();
    public final rku h = new rku();

    public p1o0(dg30 dg30Var, th30 th30Var, kuw0 kuw0Var, p2o0 p2o0Var, Set set, v1o0 v1o0Var) {
        this.a = dg30Var;
        this.b = th30Var;
        this.c = p2o0Var;
        this.d = set;
        this.e = v1o0Var;
    }

    @Override // p.n1o0
    public final Single a() {
        return new CompletableFromAction(new wqd0(this, (byte) 8)).d(this.g).firstOrError();
    }

    @Override // p.n1o0
    public final void b() {
        v1o0 v1o0Var = this.e;
        this.h.b(v1o0Var.a().doOnSuccess(new lrj0(v1o0Var, (byte) 13)).ignoreElement().subscribe());
    }

    @Override // p.iyf0
    public final void c() {
        if (this.f) {
            ruc0 ruc0Var = new ruc0(this, (byte) 20);
            th30 th30Var = this.b;
            th30Var.j0("bluetooth-permission-flow-fragment-request", this.a, ruc0Var);
            if (th30Var.G("bluetooth-permission-flow-fragment") != null) {
                return;
            }
            eg.m("Required value was null.");
        }
    }

    @Override // p.iyf0
    public final void d() {
        nh30 nh30Var = (nh30) this.b.n.remove("bluetooth-permission-flow-fragment-request");
        if (nh30Var != null) {
            nh30Var.a.d(nh30Var.c);
        }
        th30.P(2);
        this.h.a();
    }

    @Override // p.cyf0
    public final void e(Bundle bundle) {
        this.f = bundle.getBoolean("bluetooth-permissions-flow-ongoing");
    }

    @Override // p.cyf0
    public final void f(Bundle bundle) {
        bundle.putAll(mno1.h(new mmr0[]{oqn1.n("bluetooth-permissions-flow-ongoing", Boolean.valueOf(this.f))}));
    }

    @Override // p.n1o0
    public final Single h() {
        return this.c.D();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
