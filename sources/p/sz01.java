package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sz01 implements Connectable {
    public final yx11 X;
    public final vnq Y;
    public final lik1 a;
    public final lkw0 b;
    public final Scheduler c;
    public final dsg d;
    public final dsg e;
    public final bk1 f;
    public final snq g;
    public final tnq h;
    public final bk1 i;
    public final unq t;

    public sz01(lik1 lik1Var, lkw0 lkw0Var, Scheduler scheduler, dsg dsgVar, dsg dsgVar2, bk1 bk1Var, snq snqVar, tnq tnqVar, bk1 bk1Var2, unq unqVar, yx11 yx11Var, vnq vnqVar) {
        this.a = lik1Var;
        this.b = lkw0Var;
        this.c = scheduler;
        this.d = dsgVar;
        this.e = dsgVar2;
        this.f = bk1Var;
        this.g = snqVar;
        this.h = tnqVar;
        this.i = bk1Var2;
        this.t = unqVar;
        this.X = yx11Var;
        this.Y = vnqVar;
    }

    public final Connection L(Consumer consumer) {
        return new rz01(this, consumer);
    }
}
