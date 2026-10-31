package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mal1 implements owo0 {
    public final ilh1 a;
    public final e821 b;
    public final boolean c;

    public mal1(ilh1 ilh1Var, e821 e821Var, boolean z) {
        this.a = ilh1Var;
        this.b = e821Var;
        this.c = z;
    }

    public final Maybe b(ContextTrack contextTrack) {
        e821 e821Var = this.b;
        return ((Flowable) e821Var.a).z().map(new qpj1(e821Var, contextTrack, (byte) 12)).flatMapMaybe(new jqd0(e821Var, contextTrack, this.c, (byte) 27)).f(y6x0.X0);
    }

    public final tka0 e() {
        return rc11.a.b(dyo0.class);
    }

    public final void f(ji50 ji50Var) {
        fak1 fak1Var = new fak1(this, (byte) 11);
        ji50Var.b.put(dyo0.class, r4o1.Q(v5l1.V0, w7x.a, fak1Var, u5l1.h));
    }
}
