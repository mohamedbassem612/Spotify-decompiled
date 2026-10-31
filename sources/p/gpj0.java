package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gpj0 implements hpj0 {
    public final UUID a;

    public gpj0(UUID uuid) {
        this.a = uuid;
    }

    public final UUID a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpj0) && this.a.equals(((gpj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
