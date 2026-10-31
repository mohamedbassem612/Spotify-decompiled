package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d811 {
    public final boolean a;
    public final int b;
    public final Map c;
    public final tu00 d;

    public d811(boolean z, int i, Map map, tu00 tu00Var) {
        this.a = z;
        this.b = i;
        this.c = map;
        this.d = tu00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d811)) {
            return false;
        }
        d811 d811Var = (d811) obj;
        return this.a == d811Var.a && this.b == d811Var.b && u890.j(this.c, d811Var.c) && u890.j(this.d, d811Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.e(kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
