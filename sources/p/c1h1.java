package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c1h1 {
    public static final c1h1 d = new c1h1(z6x.a, b7x.a, null);
    public final List a;
    public final Map b;
    public final c1h1 c;

    public c1h1(List list, Map map, c1h1 c1h1Var) {
        this.a = list;
        this.b = map;
        this.c = c1h1Var;
    }

    public final qma0 a(int i) {
        qma0 qma0Var = (qma0) this.b.get(Integer.valueOf(i));
        if (qma0Var != null) {
            return qma0Var;
        }
        c1h1 c1h1Var = this.c;
        if (c1h1Var != null) {
            return c1h1Var.a(i);
        }
        return null;
    }
}
