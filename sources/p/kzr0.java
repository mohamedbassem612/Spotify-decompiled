package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kzr0 {
    public final npb a;
    public final List b;

    public kzr0(npb npbVar, List list) {
        this.a = npbVar;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzr0) {
            kzr0 kzr0Var = (kzr0) obj;
            if (this.a == kzr0Var.a && this.b.equals(kzr0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
