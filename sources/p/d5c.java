package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d5c implements jl51, djo {
    public final /* synthetic */ atu0 a;
    public final iyc0 b;
    public final ijr c;
    public final q8n d;
    public final String e;
    public final String f;
    public final lik1 g;

    public d5c(iyc0 iyc0Var, ijr ijrVar, u0p u0pVar, q8n q8nVar, String str, String str2, lik1 lik1Var) {
        this.a = u0pVar.a(str);
        this.b = iyc0Var;
        this.c = ijrVar;
        this.d = q8nVar;
        this.e = str;
        this.f = str2;
        this.g = lik1Var;
    }

    public final Single c() {
        return ((ctu0) this.a).c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        return rqt0.F(this.d, new vs0(this, list, tv80Var, (lnm) null, (byte) 16)).flatMap(new lo9(this, (byte) 6));
    }

    public final String h() {
        this.a.getClass();
        return "playlist";
    }

    @Override // p.djo
    public final List j(List list) {
        return Collections.singletonList(gn90.a);
    }

    @Override // p.djo
    public final Set k() {
        return f46.S0(new pud[]{pud.TOP_GENRES, pud.MOST_PLAYED_SONGS, pud.SUGGESTED_SONGS, pud.SUGGESTED_EPISODES, pud.SUGGESTED_AUDIOBOOKS, pud.SIMILAR_TO_EPISODE, pud.SIMILAR_TO_AUDIOBOOK, pud.YOUR_EPISODES, pud.SOCIAL_RECOMMENDATIONS});
    }

    @Override // p.djo
    public final int l() {
        return 2131952546;
    }

    @Override // p.djo
    public final Single m(List list) {
        return rqt0.F(this.d, new w7a(this, list, (lnm) null, (byte) 22)).map(new kba(this, (byte) 5));
    }

    @Override // p.djo
    public final List n(List list) {
        pud pudVar = pud.BRIDGE_TRACKS;
        return o7h.N0(o7h.J0(list, pudVar), Collections.singletonList(pudVar));
    }
}
