package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ro91 implements owo0 {
    public final lik1 a;
    public final w9u0 b;
    public final Flowable c;
    public final lmw d;
    public final dxy e;

    public ro91(lik1 lik1Var, w9u0 w9u0Var, Flowable flowable, tuz tuzVar, lmw lmwVar, dxy dxyVar) {
        this.a = lik1Var;
        this.b = w9u0Var;
        this.c = flowable;
        this.d = lmwVar;
        this.e = dxyVar;
    }

    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        dxy dxyVar = this.e;
        Flowable flowable = (Flowable) dxyVar.b;
        flowable.getClass();
        return new MaybeFlatten(new FlowableElementAtMaybe(flowable), new nn61(dxyVar, contextTrack, false, (byte) 29)).f(l9x0.O0);
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(zxo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        wh91 wh91Var = new wh91(this, (byte) 2);
        ji50Var.b.put(zxo0.class, r4o1.Q(fe91.T0, w7x.a, wh91Var, yd81.X0));
    }
}
