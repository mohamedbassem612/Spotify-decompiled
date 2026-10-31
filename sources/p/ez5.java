package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ez5 {
    public final String a;
    public final rz5 b;

    public ez5(String str, rz5 rz5Var) {
        this.a = str;
        this.b = rz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez5)) {
            return false;
        }
        ez5 ez5Var = (ez5) obj;
        return u890.j(this.a, ez5Var.a) && this.b.equals(ez5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
