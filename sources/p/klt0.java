package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class klt0 implements nlt0 {
    public final String a;
    public final String b;
    public final String c;

    public klt0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klt0)) {
            return false;
        }
        klt0 klt0Var = (klt0) obj;
        return this.a.equals(klt0Var.a) && u890.j(this.b, klt0Var.b) && u890.j(this.c, klt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
