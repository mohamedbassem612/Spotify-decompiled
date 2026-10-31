package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g6y0 {
    public final String a;
    public final UUID b;

    public g6y0(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6y0)) {
            return false;
        }
        g6y0 g6y0Var = (g6y0) obj;
        return u890.j(this.a, g6y0Var.a) && this.b.equals(g6y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
