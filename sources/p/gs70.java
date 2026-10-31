package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gs70 {
    public final List a;
    public final int b;

    public gs70(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs70)) {
            return false;
        }
        gs70 gs70Var = (gs70) obj;
        return this.a.equals(gs70Var.a) && this.b == gs70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
