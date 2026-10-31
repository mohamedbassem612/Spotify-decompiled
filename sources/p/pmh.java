package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pmh implements owo0 {
    public final ifh a;
    public final xid b;
    public final q2p0 c;
    public final s4p0 d;

    public pmh(ifh ifhVar, xid xidVar, q2p0 q2p0Var, s4p0 s4p0Var) {
        this.a = ifhVar;
        this.b = xidVar;
        this.c = q2p0Var;
        this.d = s4p0Var;
    }

    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        boolean zContains;
        Maybe maybeFlatMapMaybe;
        xid xidVar = this.b;
        if (((kqh) xidVar.c).a()) {
            Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
            Set set = s4b1.f;
            zContains = setS0.contains(uic.x(contextTrack.uri()).c);
        } else {
            zContains = false;
        }
        if (zContains) {
            tjh tjhVar = (tjh) xidVar.b;
            maybeFlatMapMaybe = tjhVar.h.flatMap(new cfd(tjhVar, contextTrack.uri(), (byte) 22)).subscribeOn(tjhVar.a).firstOrError().doOnError(new mba(contextTrack, (byte) 28)).flatMapMaybe(new i3b(contextTrack, (byte) 16));
            maybeFlatMapMaybe.getClass();
        } else {
            maybeFlatMapMaybe = MaybeEmpty.a;
            maybeFlatMapMaybe.getClass();
        }
        return maybeFlatMapMaybe.f(mpi1.Q0);
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(qwo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        qff qffVar = new qff(this, (byte) 18);
        ji50Var.b.put(qwo0.class, r4o1.Q(bmh.g, w7x.a, qffVar, rng.Z0));
    }
}
