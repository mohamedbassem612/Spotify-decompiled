package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ir2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ir2(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir2)) {
            return false;
        }
        ir2 ir2Var = (ir2) obj;
        return this.a.equals(ir2Var.a) && this.b.equals(ir2Var.b) && this.c.equals(ir2Var.c) && this.d.equals(ir2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
