package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v0a0 implements x0a0 {
    public final Set a;
    public final ko90 b;

    public v0a0(Set set, ko90 ko90Var) {
        this.a = set;
        this.b = ko90Var;
    }

    @Override // p.x0a0
    public final ko90 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0a0)) {
            return false;
        }
        v0a0 v0a0Var = (v0a0) obj;
        return u890.j(this.a, v0a0Var.a) && this.b == v0a0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
