package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d6f implements r6f {
    public final f7q0 a;
    public final String b;

    public d6f(f7q0 f7q0Var, String str) {
        this.a = f7q0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6f)) {
            return false;
        }
        d6f d6fVar = (d6f) obj;
        return this.a.equals(d6fVar.a) && u890.j(this.b, d6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
