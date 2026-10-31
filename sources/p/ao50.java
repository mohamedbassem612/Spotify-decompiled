package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ao50 implements jl51, djo {
    public final /* synthetic */ ro30 a;
    public final String b;
    public final tuz c;

    public ao50(String str, tuz tuzVar, ro30 ro30Var) {
        this.a = ro30Var;
        this.b = str;
        this.c = tuzVar;
    }

    public final Single c() {
        return this.a.c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        return this.c.a(ContextTrack.create((String) list.get(0))).map(rh20.e);
    }

    public final String h() {
        return "group_session";
    }

    @Override // p.djo
    public final Set k() {
        return dm61.v0(f46.S0(pud.values()), bo50.a);
    }

    @Override // p.djo
    public final int l() {
        return u890.j(this.b, "spotify:now-playing:jam") ? 2131952544 : 2131952547;
    }

    @Override // p.djo
    public final Single m(List list) {
        return new FlowableSingleSingle(new FlowableTake(this.c.c)).flatMap(new zn50(this, list)).map(xi20.e);
    }

    @Override // p.djo
    public final List n(List list) {
        List list2 = bo50.a;
        return o7h.N0(o7h.K0(list, list2), list2);
    }

    @Override // p.djo
    public final boolean o() {
        return true;
    }
}
