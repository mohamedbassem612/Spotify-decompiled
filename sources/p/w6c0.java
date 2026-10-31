package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w6c0 implements wuy0 {
    public static final Set b = f46.S0(new String[]{"220792", "218589"});
    public final gx5 a;

    public w6c0(gx5 gx5Var) {
        this.a = gx5Var;
    }

    @Override // p.wuy0
    public final boolean a(rba rbaVar) {
        return o7h.i0(b, rbaVar.b.e);
    }

    @Override // p.wuy0
    public final Object b(lnm lnmVar) {
        return this.a.a() ? new ob(1) : mb.a;
    }
}
