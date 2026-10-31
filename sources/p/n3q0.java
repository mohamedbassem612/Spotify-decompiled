package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n3q0 {
    public static final long f = 3600;
    public final yqg a;
    public final be b;
    public final Scheduler c;
    public Set d;
    public o0g e;

    public n3q0(yqg yqgVar, be beVar, Scheduler scheduler) {
        this.a = yqgVar;
        this.b = beVar;
        this.c = scheduler;
    }

    public final Boolean a(String str) {
        o0g o0gVar = this.e;
        if (o0gVar != null && new l3q0(str).equals(o0gVar.E()) && o0gVar.F() > this.a.e()) {
            return Boolean.TRUE;
        }
        Set set = this.d;
        if (set == null) {
            return null;
        }
        return Boolean.valueOf(set.contains(new l3q0(str)));
    }

    public final CompletableAndThenCompletable b(Set set) {
        nj61 nj61VarO = com.spotify.on_demand_set.proto.Set.o();
        nj61VarO.n(o7h.l1(set));
        com.spotify.on_demand_set.proto.Set set2 = (com.spotify.on_demand_set.proto.Set) nj61VarO.build();
        set2.getClass();
        return this.b.g(set2).flatMapCompletable(new qkn0(this, (byte) 10)).n(this.c).c(new CompletableDefer(new xf0(this, set, (byte) 9)));
    }
}
