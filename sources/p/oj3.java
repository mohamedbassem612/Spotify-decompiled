package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oj3 implements r290 {
    public final jnq a;
    public final Optional b;
    public final q8n c;
    public final r290 d;

    public oj3(jnq jnqVar, Optional optional, q8n q8nVar, r290 r290Var) {
        this.a = jnqVar;
        this.b = optional;
        this.c = q8nVar;
        this.d = r290Var;
    }

    public static Completable e(oj3 oj3Var, List list, String str, String str2) {
        return oj3Var.d.b(list, str, str2, new gj3(31, (tv80) null));
    }

    @Override // p.r290
    public final Single a(List list, String str, String str2, boolean z, int i, kio kioVar, gj3 gj3Var) {
        return this.d.a(list, str, str2, z, i, kioVar, gj3Var);
    }

    @Override // p.r290
    public final Completable b(List list, String str, String str2, gj3 gj3Var) {
        return this.d.b(list, str, str2, gj3Var);
    }

    public final Single c(List list, String str, String str2, boolean z, gj3 gj3Var) {
        if (list.isEmpty()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        Set set = s4b1.f;
        return rqt0.F(this.c, new vr1(z, list, this, uic.x((String) o7h.q0(list)).c, gj3Var, str, str2, (lnm) null));
    }
}
