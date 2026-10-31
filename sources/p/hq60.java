package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hq60 {
    public final UUID a;
    public final UUID b;

    public hq60(UUID uuid, UUID uuid2) {
        this.a = uuid;
        this.b = uuid2;
    }

    public final UUID a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq60)) {
            return false;
        }
        hq60 hq60Var = (hq60) obj;
        return u890.j(this.a, hq60Var.a) && this.b.equals(hq60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
