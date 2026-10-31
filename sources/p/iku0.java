package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iku0 implements jl51, djo {
    public final /* synthetic */ atu0 a;
    public final iyc0 b;
    public final ijr c;
    public final i54 d;
    public final q8n e;
    public final lik1 f;
    public final String g;

    public iku0(iyc0 iyc0Var, ijr ijrVar, u0p u0pVar, i54 i54Var, q8n q8nVar, lik1 lik1Var, String str) {
        this.a = u0pVar.a(str);
        this.b = iyc0Var;
        this.c = ijrVar;
        this.d = i54Var;
        this.e = q8nVar;
        this.f = lik1Var;
        this.g = str;
    }

    public final Single c() {
        return ((ctu0) this.a).c();
    }

    @Override // p.djo
    public final Single f(List list, tv80 tv80Var) {
        return rqt0.F(this.e, new l4f0(this, list, tv80Var, null, (byte) 20)).flatMap(new jkp0(this, (byte) 16));
    }

    public final String h() {
        this.a.getClass();
        return "playlist";
    }

    @Override // p.djo
    public final List j(List list) {
        boolean zA = this.d.a();
        gn90 gn90Var = gn90.c;
        gn90 gn90Var2 = gn90.b;
        gn90 gn90Var3 = gn90.a;
        if (zA) {
            return p7h.M(new gn90[]{gn90Var3, gn90Var2, gn90Var});
        }
        if (list.isEmpty()) {
            return p7h.M(new gn90[]{gn90Var3, gn90Var2});
        }
        if (!list.isEmpty()) {
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    Set set = s4b1.f;
                    if (!uic.g(str, blc0.fh)) {
                    }
                }
            }
            return Collections.singletonList(gn90Var);
        }
        return p7h.M(new gn90[]{gn90Var3, gn90Var2});
    }

    @Override // p.djo
    public final int l() {
        return 2131952546;
    }

    @Override // p.djo
    public final Single m(List list) {
        return rqt0.F(this.e, new f3t0(this, list, (lnm) null, (byte) 19)).map(new vyq0(this, (byte) 6));
    }
}
