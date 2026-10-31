package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dq60 {
    public final UUID a;

    public dq60(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq60) && u890.j(this.a, ((dq60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
