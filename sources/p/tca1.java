package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tca1 implements xca1 {
    public final UUID a;

    public tca1(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tca1) && u890.j(this.a, ((tca1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
