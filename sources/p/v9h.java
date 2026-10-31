package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v9h {
    public final s1b0 a;
    public final List b;

    public v9h(s1b0 s1b0Var, List list) {
        this.a = s1b0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9h)) {
            return false;
        }
        v9h v9hVar = (v9h) obj;
        return u890.j(this.a, v9hVar.a) && u890.j(this.b, v9hVar.b);
    }

    public final int hashCode() {
        s1b0 s1b0Var = this.a;
        return this.b.hashCode() + ((s1b0Var == null ? 0 : s1b0Var.hashCode()) * 31);
    }
}
