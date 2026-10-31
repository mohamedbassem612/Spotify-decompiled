package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f301 {
    public final d301 a;
    public final String b;

    public f301(d301 d301Var, String str) {
        this.a = d301Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f301)) {
            return false;
        }
        f301 f301Var = (f301) obj;
        return this.a.equals(f301Var.a) && this.b.equals(f301Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
