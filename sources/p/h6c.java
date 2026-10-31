package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h6c {
    public final String a;
    public final UUID b;

    public h6c(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6c)) {
            return false;
        }
        h6c h6cVar = (h6c) obj;
        return this.a.equals(h6cVar.a) && u890.j(this.b, h6cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
