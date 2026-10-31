package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ce9 implements ee9 {
    public final cih1 a;
    public final UUID b;

    public ce9(cih1 cih1Var) {
        this.a = cih1Var;
        UUID uuid = pe9.a;
        this.b = pe9.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ce9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ce9 ce9Var = (ce9) obj;
        return u890.j(this.b, ce9Var.b) && this.a == ce9Var.a;
    }

    @Override // p.ee9
    public final UUID getUuid() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
