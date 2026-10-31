package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bnf0 implements owo0 {
    public final q2p0 a;
    public final mre0 b;
    public final fdc c;

    public bnf0(q2p0 q2p0Var, mre0 mre0Var, fdc fdcVar) {
        this.a = q2p0Var;
        this.b = mre0Var;
        this.c = fdcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x004e  */
    @Override // p.owo0
    public final Maybe d(ContextTrack contextTrack, String str) {
        Maybe maybe;
        FlowableFilter flowableFilterD = this.a.c().d();
        if (l4o1.N(contextTrack)) {
            maybe = MaybeEmpty.a;
            maybe.getClass();
        } else {
            fdc fdcVar = this.c;
            if (((bhf0) fdcVar.d).a(contextTrack)) {
                maybe = new FlowableSingleSingle(new FlowableTake(flowableFilterD.x(new gxh(contextTrack, str)))).map(b610.Z).onErrorReturnItem("absent").flatMap(new yge0(fdcVar, contextTrack, (byte) 8)).toMaybe();
                maybe.getClass();
            } else {
                maybe = MaybeEmpty.a;
                maybe.getClass();
            }
        }
        return maybe.f(zj20.Y);
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(mxo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        mbf0 mbf0Var = new mbf0(this, (byte) 2);
        ji50Var.b.put(mxo0.class, r4o1.Q(klf0.g, w7x.a, mbf0Var, ujf0.e));
    }
}
