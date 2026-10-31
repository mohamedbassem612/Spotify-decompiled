package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h570 implements i570 {
    public final j380 a;

    public h570(Map map) {
        this.a = j380.c(map);
    }

    public final void a(j570 j570Var, u570 u570Var) {
        i570 i570Var = (i570) this.a.get(((sc70) j570Var).b.b);
        if (i570Var != null) {
            i570Var.a(j570Var, u570Var);
        }
    }
}
