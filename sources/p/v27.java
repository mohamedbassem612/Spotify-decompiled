package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v27 {
    public final String a;
    public final boolean b;

    public v27(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v27)) {
            return false;
        }
        v27 v27Var = (v27) obj;
        return u890.j(this.a, v27Var.a) && this.b == v27Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
