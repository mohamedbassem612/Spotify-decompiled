package p;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dy10 {
    public final UUID a;
    public final long b;
    public final Set c;

    public dy10(UUID uuid, long j, Set set) {
        this.a = uuid;
        this.b = j;
        this.c = set;
    }

    public final Set a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy10)) {
            return false;
        }
        dy10 dy10Var = (dy10) obj;
        return this.a.equals(dy10Var.a) && this.b == dy10Var.b && this.c.equals(dy10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
