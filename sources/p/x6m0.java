package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x6m0 implements a4l {
    public final g0l a;
    public final zsk1 b;
    public final kly0 c;
    public final BehaviorSubject d = BehaviorSubject.f();
    public final BehaviorSubject e = BehaviorSubject.f();
    public final vku f = new vku();

    public x6m0(g0l g0lVar, zsk1 zsk1Var, a8p a8pVar) {
        this.a = g0lVar;
        this.b = zsk1Var;
        this.c = a8pVar;
    }

    @Override // p.a4l
    public final void a() {
        this.f.c();
    }

    @Override // p.a4l
    public final void b() {
        zsk1 zsk1Var = this.b;
        Disposable disposableSubscribe = zsk1Var.t.subscribe(new dy40(this, (byte) 10));
        vku vkuVar = this.f;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(zsk1Var.i.filter(vf61.Z0).subscribe(new lrj0(this, (byte) 6)));
    }

    public final nnr c() {
        kx7 kx7Var;
        nnr nnrVarK = ((inr) this.a).k();
        if (((nnrVarK == null || (kx7Var = nnrVarK.B.a) == null) ? null : kx7Var.d) == luq0.BLUETOOTH) {
            return nnrVarK;
        }
        return null;
    }

    public final boolean d() {
        return ((c9c0) this.c.get()).b.current().getValue() != null;
    }

    public final void g(double d, String str, boolean z) {
        inr inrVar = (inr) this.a;
        l0l l0lVarC = inrVar.c();
        c();
        Objects.toString(l0lVarC);
        if (z) {
            this.e.onNext(new ix5(d, true, inrVar.c(), c(), str, d()));
        } else {
            this.d.onNext(new ix5(d, false, inrVar.c(), c(), str, d()));
        }
    }
}
