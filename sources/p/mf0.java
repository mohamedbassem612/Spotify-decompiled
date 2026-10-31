package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mf0 implements xpw {
    public final pe a;
    public final js20 b;
    public final psw c;
    public final u7h1 d;

    public mf0(pe peVar, hgd0 hgd0Var) {
        Observable observableJust;
        this.a = peVar;
        if (hgd0Var.s != null) {
            observableJust = ((Observable) hgd0Var.u.getValue()).map(dj20.t).distinctUntilChanged();
            observableJust.getClass();
        } else {
            observableJust = Observable.just(hgd0Var.r);
            observableJust.getClass();
        }
        this.b = x3p1.m(yoi1.g(observableJust), ft.Z0, new ab(this, (byte) 10), null, null, 24);
        j2i j2iVar = f3i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.d = eth.a0(e3.N0, (xu30) null, 2);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
