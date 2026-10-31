package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t311 implements uga {
    public final Set a;
    public final vu30 b;

    public t311(Set set, vu30 vu30Var) {
        this.a = set;
        this.b = vu30Var;
    }

    public final void a(String str, double d) {
        Set set = this.a;
        if (set == null || set.contains(str)) {
            this.b.invoke(str, Double.valueOf(d));
        }
    }
}
