package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v4f {
    public final String a;
    public final c380 b;

    public v4f(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4f)) {
            return false;
        }
        v4f v4fVar = (v4f) obj;
        return u890.j(this.a, v4fVar.a) && u890.j(this.b, v4fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
