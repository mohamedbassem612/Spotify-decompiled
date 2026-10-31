package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k30 {
    public final String a;
    public final x360 b;
    public final c380 c;

    public k30(String str, x360 x360Var, c380 c380Var) {
        this.a = str;
        this.b = x360Var;
        this.c = c380Var;
    }

    public final x360 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final c380 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k30)) {
            return false;
        }
        k30 k30Var = (k30) obj;
        return this.a.equals(k30Var.a) && u890.j(this.b, k30Var.b) && u890.j(this.c, k30Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.c.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
