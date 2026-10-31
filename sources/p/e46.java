package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class e46 extends sgl {
    public final iu30 b;

    public e46(List list, iu30 iu30Var) {
        super(list);
        this.b = iu30Var;
    }

    @Override // p.sgl
    public final a8b0 a(zim0 zim0Var) {
        jfg jfgVarS;
        a8b0 a8b0Var = (a8b0) this.b.invoke(zim0Var);
        if (!g6b0.z(a8b0Var) && (((jfgVarS = a8b0Var.t0().s()) == null || g6b0.s(jfgVarS) == null) && !g6b0.C(a8b0Var, rfb1.W.a) && !g6b0.C(a8b0Var, rfb1.X.a) && !g6b0.C(a8b0Var, rfb1.Y.a))) {
            g6b0.C(a8b0Var, rfb1.Z.a);
        }
        return a8b0Var;
    }
}
