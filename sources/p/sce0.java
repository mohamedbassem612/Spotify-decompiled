package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sce0 {
    public final kx7 a;
    public final List b;

    public sce0(kx7 kx7Var, List list) {
        this.a = kx7Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sce0)) {
            return false;
        }
        sce0 sce0Var = (sce0) obj;
        return u890.j(this.a, sce0Var.a) && this.b.equals(sce0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
