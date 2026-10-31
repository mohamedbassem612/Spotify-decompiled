package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qig0 implements n1o0, o5s {
    public final dg30 a;
    public final p2o0 b;
    public final v1o0 c;
    public final l6s d;
    public final t380 e;
    public final rku f = new rku();
    public final rh0 g;

    public qig0(dg30 dg30Var, p2o0 p2o0Var, v1o0 v1o0Var, l6s l6sVar, t380 t380Var) {
        this.a = dg30Var;
        this.b = p2o0Var;
        this.c = v1o0Var;
        this.d = l6sVar;
        this.e = t380Var;
        ((f0i) dg30Var).a.a(this);
        c0i c0iVar = ((g0i) dg30Var).i;
        this.g = c0iVar != null ? c0iVar.h("manual_bluetooth_permission_registration", new e1r0((byte) 3, false), new pig0(p2o0Var, (byte) 0)) : null;
        Single.just(Boolean.TRUE);
    }

    public final Single a() {
        return Single.defer(new yj1(this, (byte) 14));
    }

    public final void b() {
        v1o0 v1o0Var = this.c;
        this.f.b(v1o0Var.a().doOnSuccess(new lrj0(v1o0Var, (byte) 13)).ignoreElement().subscribe());
    }

    public final Single h() {
        return this.b.D();
    }

    public final void onDestroy(iac0 iac0Var) {
        ((f0i) this.a).a.d(this);
    }

    public final void onStop(iac0 iac0Var) {
        this.f.a();
    }
}
