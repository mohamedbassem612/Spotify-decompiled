package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class q6h1 {
    public final long a;
    public final List b;
    public final z6h1 c;

    public q6h1(y6h1 y6h1Var, r6h1 r6h1Var, long j, List list) {
        this.a = j;
        this.b = list;
        this.c = new z6h1(y6h1Var, r6h1Var);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{where=");
        z6h1 z6h1Var = this.c;
        sb.append(z6h1Var.b());
        sb.append("; parent=");
        sb.append(z6h1Var.c());
        List list = this.b;
        sb.append(list.isEmpty() ? "" : "; errors=".concat(o7h.y0(list, ";", null, null, null, 62)));
        return sb.toString();
    }
}
