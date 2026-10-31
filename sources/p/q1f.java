package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q1f implements q3f {
    public final String a;
    public final lg31 b;

    public q1f(String str, lg31 lg31Var) {
        this.a = str;
        this.b = lg31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1f)) {
            return false;
        }
        q1f q1fVar = (q1f) obj;
        return u890.j(this.a, q1fVar.a) && u890.j(this.b, q1fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
