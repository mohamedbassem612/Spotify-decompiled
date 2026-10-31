package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zoj0 implements cpj0 {
    public final UUID a;

    public zoj0(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoj0) && this.a.equals(((zoj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
