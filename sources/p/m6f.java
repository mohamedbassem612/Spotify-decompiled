package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6f implements r6f {
    public final f7q0 a;
    public final String b;

    public m6f(f7q0 f7q0Var, String str) {
        this.a = f7q0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6f)) {
            return false;
        }
        m6f m6fVar = (m6f) obj;
        return u890.j(this.a, m6fVar.a) && u890.j(this.b, m6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
