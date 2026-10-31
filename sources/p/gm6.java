package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gm6 {
    public final String a;
    public final c380 b;

    public gm6(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm6)) {
            return false;
        }
        gm6 gm6Var = (gm6) obj;
        return u890.j(this.a, gm6Var.a) && u890.j(this.b, gm6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
