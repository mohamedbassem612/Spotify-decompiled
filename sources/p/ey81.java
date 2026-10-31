package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ey81 {
    public final z6a1 a;
    public final List b;

    public ey81(z6a1 z6a1Var, List list) {
        this.a = z6a1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey81)) {
            return false;
        }
        ey81 ey81Var = (ey81) obj;
        return this.a.equals(ey81Var.a) && this.b.equals(ey81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
