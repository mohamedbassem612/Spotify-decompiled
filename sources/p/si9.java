package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class si9 implements bj9 {
    public final String a;
    public final UUID b;

    public si9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si9)) {
            return false;
        }
        si9 si9Var = (si9) obj;
        return u890.j(this.a, si9Var.a) && u890.j(this.b, si9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
