package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nc31 {
    public final String a;
    public final boolean b;

    public nc31(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc31)) {
            return false;
        }
        nc31 nc31Var = (nc31) obj;
        return u890.j(this.a, nc31Var.a) && this.b == nc31Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
