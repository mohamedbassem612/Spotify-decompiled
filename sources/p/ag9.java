package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ag9 extends qg9 {
    public final String a;
    public final UUID b;

    public ag9(String str, UUID uuid) {
        this.a = str;
        this.b = uuid;
    }

    @Override // p.qg9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag9)) {
            return false;
        }
        ag9 ag9Var = (ag9) obj;
        return u890.j(this.a, ag9Var.a) && u890.j(this.b, ag9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
