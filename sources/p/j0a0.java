package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j0a0 implements l0a0 {
    public final String a;
    public final String b;

    public j0a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0a0)) {
            return false;
        }
        j0a0 j0a0Var = (j0a0) obj;
        return this.a.equals(j0a0Var.a) && u890.j(this.b, j0a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
