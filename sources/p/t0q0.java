package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t0q0 {
    public final boolean a;
    public final Map b;

    public t0q0(Map map, boolean z) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0q0)) {
            return false;
        }
        t0q0 t0q0Var = (t0q0) obj;
        return this.a == t0q0Var.a && this.b.equals(t0q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
