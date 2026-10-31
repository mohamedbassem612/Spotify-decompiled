package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ine {
    public final UUID a;
    public final Integer b;

    public ine(UUID uuid, Integer num) {
        this.a = uuid;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ine)) {
            return false;
        }
        ine ineVar = (ine) obj;
        return this.a.equals(ineVar.a) && this.b.equals(ineVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
