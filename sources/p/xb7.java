package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xb7 extends x7e0 implements b031 {
    public Bundle N0;
    public y87 O0;
    public djo P0;
    public final rku X = new rku();
    public final BehaviorSubject Y;
    public final BehaviorSubject Z;
    public final lik1 d;
    public final rg7 e;
    public final Scheduler f;
    public final yb7 g;
    public final gae h;
    public final n0p i;
    public final b6p0 t;

    public xb7(lik1 lik1Var, rg7 rg7Var, Scheduler scheduler, yb7 yb7Var, gae gaeVar, n0p n0pVar, b6p0 b6p0Var) {
        this.d = lik1Var;
        this.e = rg7Var;
        this.f = scheduler;
        this.g = yb7Var;
        this.h = gaeVar;
        this.i = n0pVar;
        this.t = b6p0Var;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.Y = behaviorSubjectF;
        this.Z = behaviorSubjectF;
    }

    public final void a(Bundle bundle) {
        this.N0 = bundle;
        b6p0 b6p0Var = this.t;
        b6p0Var.getClass();
        z5p0 z5p0Var = (z5p0) jhc1.t(bundle, "now_playing_reference", z5p0.class);
        if (z5p0Var == null) {
            return;
        }
        xab1 xab1Var = b6p0Var.k;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        b6p0Var.k = null;
        b6p0Var.d.l((Object) null);
        hfu0 hfu0Var = z5p0Var.a;
        b6p0Var.i = hfu0Var;
        b6p0Var.g = z5p0Var.b;
        hfu0 hfu0Var2 = z5p0Var.c;
        if (hfu0Var2 == null) {
            hfu0Var2 = hfu0Var;
        }
        b6p0Var.h = hfu0Var2;
        boolean z = z5p0Var.d && hfu0Var == null;
        b6p0Var.j = z;
        b6p0Var.f.m((Object) null, Boolean.valueOf(z));
    }

    public final void e() {
        xab1 xab1Var;
        long jB;
        b6p0 b6p0Var = this.t;
        if (!b6p0Var.j && ((xab1Var = b6p0Var.k) == null || !xab1Var.isActive())) {
            Long l = b6p0Var.g;
            if (l != null) {
                jB = l.longValue();
            } else {
                jB = b6p0Var.b.b();
                b6p0Var.g = Long.valueOf(jB);
            }
            b6p0Var.k = fn31.T(cto1.q(b6p0Var.c), (o8n) null, 0, new kv2(b6p0Var, jB, (lnm) null, (byte) 10), 3);
        }
        Observable observable = this.h.g(this.g.c, this.d).toObservable();
        rg7 rg7Var = this.e;
        rg7Var.getClass();
        this.X.b(observable.doOnSubscribe(new pg7(rg7Var, (byte) 0)).doOnNext(new pg7(rg7Var, (byte) 1)).observeOn(this.f).flatMap(new e4b1(this, (byte) 25)).subscribe(new wb7(this, (byte) 0), new wb7(this, (byte) 1)));
    }

    public final void f() {
        this.X.a();
    }

    public final djo k() {
        djo djoVar = this.P0;
        if (djoVar != null) {
            return djoVar;
        }
        u890.C("_curationHandler");
        throw null;
    }

    public final Bundle serialize() {
        y87 y87Var = this.O0;
        Bundle bundleSerialize = y87Var != null ? y87Var.serialize() : new Bundle();
        b6p0 b6p0Var = this.t;
        bundleSerialize.putParcelable("now_playing_reference", new z5p0(b6p0Var.i, b6p0Var.g, b6p0Var.h, b6p0Var.j));
        return bundleSerialize;
    }
}
