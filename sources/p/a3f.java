package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a3f implements q3f {
    public final String a;
    public final f7q0 b;
    public final long c;

    public a3f(String str, f7q0 f7q0Var, long j) {
        this.a = str;
        this.b = f7q0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3f)) {
            return false;
        }
        a3f a3fVar = (a3f) obj;
        return u890.j(this.a, a3fVar.a) && this.b.equals(a3fVar.b) && this.c == a3fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
