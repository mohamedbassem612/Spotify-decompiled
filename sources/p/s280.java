package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s280 implements d0r {
    public final Map a;

    public s280(Map map) {
        this.a = map;
    }

    @Override // p.d0r
    public final k1r b(f1r f1rVar) {
        return f1rVar.a(this.a);
    }

    @Override // p.d0r
    public final c0r c(f1r f1rVar) {
        return new r280(f1rVar.a(this.a));
    }

    @Override // p.d0r
    public final Object e(zjd1 zjd1Var, List list, lnm lnmVar) {
        throw new IllegalStateException("execute not supported on immutable data pools");
    }

    @Override // p.d0r
    public final Map j() {
        return sqg0.U(this.a);
    }

    @Override // p.d0r
    public final void a(q0r q0rVar) {
    }

    @Override // p.d0r
    public final void h(q0r q0rVar) {
    }
}
