package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class opd1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public opd1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd1)) {
            return false;
        }
        opd1 opd1Var = (opd1) obj;
        return this.a.equals(opd1Var.a) && this.b.equals(opd1Var.b) && this.c.equals(opd1Var.c) && this.d.equals(opd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
