package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lj9 implements uj9 {
    public final String a;
    public final UUID b;

    public lj9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj9)) {
            return false;
        }
        lj9 lj9Var = (lj9) obj;
        return u890.j(this.a, lj9Var.a) && u890.j(this.b, lj9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
