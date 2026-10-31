package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qqj0 implements rqj0 {
    public final UUID a;
    public final String b;

    public qqj0(String str, UUID uuid) {
        this.a = uuid;
        this.b = str;
    }

    public final UUID a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqj0)) {
            return false;
        }
        qqj0 qqj0Var = (qqj0) obj;
        return this.a.equals(qqj0Var.a) && u890.j(this.b, qqj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
