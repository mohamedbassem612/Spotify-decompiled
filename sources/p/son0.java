package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class son0 {
    public final UUID a;

    public son0(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof son0) && this.a.equals(((son0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
