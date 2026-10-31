package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tkv implements owo0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ tkv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        switch (this.a) {
            case 0:
                return MaybeEmpty.a;
            default:
                if (Boolean.parseBoolean((String) contextTrack.metadata().get("poll.is_present"))) {
                    return Maybe.e(new sxo0(contextTrack.uri()));
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
        }
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(ywo0.class);
            default:
                return rc11.a.b(sxo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                utt uttVar = new utt(this, (byte) 16);
                ji50Var.b.put(ywo0.class, r4o1.Q(jkv.O0, w7xVar, uttVar, fdv.h));
                break;
            default:
                t1t0 t1t0Var = new t1t0(this, (byte) 18);
                ji50Var.b.put(sxo0.class, r4o1.Q(o5v0.S0, w7xVar, t1t0Var, fnt0.d1));
                break;
        }
    }
}
