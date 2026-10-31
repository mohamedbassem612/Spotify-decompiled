package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kva0 extends uyn1 {
    public final String b;
    public final String c;
    public final String d;

    public kva0(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva0)) {
            return false;
        }
        kva0 kva0Var = (kva0) obj;
        return this.b.equals(kva0Var.b) && u890.j(this.c, kva0Var.c) && u890.j(this.d, kva0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(this.b.hashCode() * 31, 31, this.c);
    }
}
