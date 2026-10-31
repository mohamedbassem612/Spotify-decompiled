package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzb0 implements owo0 {
    public final m1q a;
    public final ft30 b;
    public final lv4 c;
    public final jjh1 d;
    public boolean e;

    public fzb0(m1q m1qVar, ft30 ft30Var, lv4 lv4Var, jjh1 jjh1Var) {
        this.a = m1qVar;
        this.b = ft30Var;
        this.c = lv4Var;
        this.d = jjh1Var;
    }

    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        lv4 lv4Var = this.c;
        if (lv4Var.l() && prn1.j(contextTrack) == 1) {
            this.e = false;
            MaybeEmpty maybeEmpty = MaybeEmpty.a;
            maybeEmpty.getClass();
            return maybeEmpty;
        }
        if (!lv4Var.m() || prn1.j(contextTrack) != 2) {
            return ((Maybe) this.b.invoke(contextTrack)).f(new hl00(this, (byte) 24));
        }
        this.e = false;
        MaybeEmpty maybeEmpty2 = MaybeEmpty.a;
        maybeEmpty2.getClass();
        return maybeEmpty2;
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(jxo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        gs90 gs90Var = new gs90(this, (byte) 28);
        ji50Var.b.put(jxo0.class, r4o1.Q(hyb0.f, w7x.a, gs90Var, k9b0.e1));
    }
}
