package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j1m1 implements r1m1 {
    public final String a;
    public final String b;

    public j1m1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1m1)) {
            return false;
        }
        j1m1 j1m1Var = (j1m1) obj;
        return u890.j(this.a, j1m1Var.a) && this.b.equals(j1m1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
