package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ti9 implements bj9 {
    public final String a;
    public final UUID b;

    public ti9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti9)) {
            return false;
        }
        ti9 ti9Var = (ti9) obj;
        return u890.j(this.a, ti9Var.a) && u890.j(this.b, ti9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
