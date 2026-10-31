package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g0b implements jl51, djo {
    public final /* synthetic */ atu0 a;
    public final j2b b;
    public final xrc0 c;
    public final iyc0 d;
    public final q8n e;
    public final String f;
    public final Set g = Collections.synchronizedSet(new LinkedHashSet());

    public g0b(j2b j2bVar, u0p u0pVar, xrc0 xrc0Var, iyc0 iyc0Var, q8n q8nVar, String str) {
        this.a = u0pVar.a(str);
        this.b = j2bVar;
        this.c = xrc0Var;
        this.d = iyc0Var;
        this.e = q8nVar;
        this.f = str;
    }

    public final Single c() {
        return ((ctu0) this.a).c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        if (!this.g.add(list)) {
            Single singleJust = Single.just(bjo.a);
            singleJust.getClass();
            return singleJust;
        }
        String str = (String) list.get(0);
        Set set = s4b1.f;
        if (!uic.g(str, blc0.ti)) {
            Single singleJust2 = Single.just(new ajo(4));
            singleJust2.getClass();
            return singleJust2;
        }
        Single singleDoFinally = rqt0.F(this.e, new w7a(this, list, (lnm) null, (byte) 10)).flatMap(new q59(this, list, (byte) 13)).doFinally(new bm0(this, list, (byte) 12));
        singleDoFinally.getClass();
        return singleDoFinally;
    }

    public final String h() {
        this.a.getClass();
        return "playlist";
    }

    @Override // p.djo
    public final int l() {
        return 2131952546;
    }

    @Override // p.djo
    public final Single m(List list) {
        String str = (String) list.get(0);
        Set set = s4b1.f;
        if (!uic.g(str, blc0.ti)) {
            Single singleJust = Single.just(new ajo(4));
            singleJust.getClass();
            return singleJust;
        }
        Set set2 = s4b1.f;
        Single singleOnErrorReturnItem = this.b.a(new m2b(uic.x(this.f).h(), (String) list.get(0), "REMOVE_TRACK")).flatMap(new lo9((Object) this, (byte) 3)).onErrorReturnItem(new ajo(3));
        singleOnErrorReturnItem.getClass();
        return singleOnErrorReturnItem;
    }
}
