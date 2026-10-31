package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f460 {
    public final String a;
    public final if5 b;

    public f460(String str, if5 if5Var) {
        this.a = str;
        this.b = if5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f460)) {
            return false;
        }
        f460 f460Var = (f460) obj;
        return u890.j(this.a, f460Var.a) && this.b.equals(f460Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
