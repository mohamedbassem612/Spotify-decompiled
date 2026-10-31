package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lcc0 implements jl51, djo {
    public final /* synthetic */ v6a0 a;
    public final ccc0 b;

    public lcc0(ccc0 ccc0Var, v6a0 v6a0Var) {
        this.a = v6a0Var;
        this.b = ccc0Var;
    }

    public final Single c() {
        return this.a.c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        return rqt0.F(o6x.a, new n0a0(this, list, tv80Var, (lnm) null, (byte) 7));
    }

    public final String h() {
        return "liked_songs";
    }

    @Override // p.djo
    public final List j(List list) {
        return Collections.singletonList(gn90.a);
    }

    @Override // p.djo
    public final Set k() {
        return f46.S0(new pud[]{pud.LIKED_SONGS, pud.SOCIAL_RECOMMENDATIONS});
    }

    @Override // p.djo
    public final int l() {
        return 2131952545;
    }

    @Override // p.djo
    public final Single m(List list) {
        return rqt0.F(o6x.a, new ss90(this, list, (lnm) null, (byte) 20));
    }

    @Override // p.djo
    public final List n(List list) {
        pud pudVar = pud.MOST_PLAYED_SONGS;
        return o7h.N0(o7h.J0(list, pudVar), Collections.singletonList(pudVar));
    }
}
