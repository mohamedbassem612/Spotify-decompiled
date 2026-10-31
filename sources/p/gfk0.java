package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gfk0 {
    public final String a;
    public final bek0 b;

    public gfk0(String str, bek0 bek0Var) {
        this.a = str;
        this.b = bek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfk0)) {
            return false;
        }
        gfk0 gfk0Var = (gfk0) obj;
        return this.a.equals(gfk0Var.a) && this.b.equals(gfk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
