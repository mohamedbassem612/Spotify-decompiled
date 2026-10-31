package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q480 {
    public final UUID a;
    public final int b;

    public q480(UUID uuid, int i) {
        this.a = uuid;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q480)) {
            return false;
        }
        q480 q480Var = (q480) obj;
        return this.a.equals(q480Var.a) && this.b == q480Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
