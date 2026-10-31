package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class upm1 implements jl51, djo {
    public final /* synthetic */ atu0 a;
    public final iyc0 b;
    public final lik1 c;
    public final String d;

    public upm1(iyc0 iyc0Var, u0p u0pVar, lik1 lik1Var, String str) {
        this.a = u0pVar.a(str);
        this.b = iyc0Var;
        this.c = lik1Var;
        this.d = str;
    }

    public final Single c() {
        return ((ctu0) this.a).c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        return rqt0.F(igu.b, new q4m1(this, list, tv80Var, (lnm) null, (byte) 10)).flatMap(new ltf1(this, (byte) 18));
    }

    public final String h() {
        this.a.getClass();
        return "playlist";
    }

    @Override // p.djo
    public final List j(List list) {
        return Collections.singletonList(gn90.b);
    }

    @Override // p.djo
    public final Set k() {
        return Collections.singleton(pud.YOUR_EPISODES);
    }

    @Override // p.djo
    public final int l() {
        return 2131952548;
    }

    @Override // p.djo
    public final Single m(List list) {
        return rqt0.F(igu.b, new h8m1((Object) this, (Object) list, (lnm) null, (byte) 5)).map(new f2g1(this, (byte) 16));
    }
}
