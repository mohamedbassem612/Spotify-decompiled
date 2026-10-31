package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ff9 implements pf9 {
    public final String a;
    public final UUID b;

    public ff9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff9)) {
            return false;
        }
        ff9 ff9Var = (ff9) obj;
        return this.a.equals(ff9Var.a) && this.b.equals(ff9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
