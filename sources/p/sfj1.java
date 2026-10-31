package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sfj1 implements owo0 {
    public final g2q a;
    public final phi0 b;
    public final ivn0 c;
    public final v1r0 d;
    public final muz e;
    public final tgt0 f;
    public final v65 g;
    public final lv4 h;
    public final q8n i;
    public final v290 j;
    public final kko k;
    public final mr20 l;
    public final s4p0 m;

    public sfj1(g2q g2qVar, phi0 phi0Var, ivn0 ivn0Var, v1r0 v1r0Var, muz muzVar, tgt0 tgt0Var, v65 v65Var, lv4 lv4Var, q8n q8nVar, v290 v290Var, kko kkoVar, mr20 mr20Var, s4p0 s4p0Var) {
        this.a = g2qVar;
        this.b = phi0Var;
        this.c = ivn0Var;
        this.d = v1r0Var;
        this.e = muzVar;
        this.f = tgt0Var;
        this.g = v65Var;
        this.h = lv4Var;
        this.i = q8nVar;
        this.j = v290Var;
        this.k = kkoVar;
        this.l = mr20Var;
        this.m = s4p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    @Override // p.owo0
    public final Maybe b(ContextTrack contextTrack) {
        Maybe maybeFlatMapMaybe;
        n36 n36Var;
        phi0 phi0Var = this.b;
        fu4 fu4Var = (fu4) phi0Var.f;
        String strUri = contextTrack.uri();
        if (strUri == null) {
            strUri = "";
        }
        String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ARTIST_URI);
        String str = strA0 != null ? strA0 : "";
        if (!fu4Var.a() || !ihc1.h0(strUri, "track", false) || str.length() <= 0 || ihc1.h0(str.toLowerCase(Locale.ROOT), "spotify:local", false)) {
            if (fu4Var.b()) {
                Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
                Set set = s4b1.f;
                if (setS0.contains(uic.x(strUri).c)) {
                    n36Var = ((fuj1) phi0Var.d).a;
                    if (l4o1.Y(contextTrack) && !n36Var.contains(contextTrack.uri())) {
                        if (n36Var.c > 5) {
                            n36Var.removeFirst();
                        }
                        n36Var.addLast(contextTrack.uri());
                    }
                    p241 p241Var = (o241) phi0Var.c;
                    maybeFlatMapMaybe = Observable.combineLatest(p241Var.a("allow-child-video", "true"), p241Var.a("filter-explicit-content", "true"), a020.Q0).firstOrError().flatMapMaybe(new bnj0(phi0Var, contextTrack, (byte) 7));
                }
            }
            maybeFlatMapMaybe = MaybeEmpty.a;
        } else {
            n36Var = ((fuj1) phi0Var.d).a;
            if (l4o1.Y(contextTrack)) {
                if (n36Var.c > 5) {
                    n36Var.removeFirst();
                }
                n36Var.addLast(contextTrack.uri());
            }
            p241 p241Var2 = (o241) phi0Var.c;
            maybeFlatMapMaybe = Observable.combineLatest(p241Var2.a("allow-child-video", "true"), p241Var2.a("filter-explicit-content", "true"), a020.Q0).firstOrError().flatMapMaybe(new bnj0(phi0Var, contextTrack, (byte) 7));
        }
        return maybeFlatMapMaybe.f(l9x0.W0);
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(cyo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        ji50Var.b.put(cyo0.class, r4o1.Q(l6j1.a1, f46.S0(new aq21[]{new zp21(jo70.class), new zp21(hll.class), new yp21(zoy0.class), new yp21(this.g.c() ? pjw0.class : yo60.class), new yp21(nbw0.class), new yp21(prl.class), new yp21(xkk1.class)}), new muh1(this, (byte) 19), zhi1.X0));
    }
}
