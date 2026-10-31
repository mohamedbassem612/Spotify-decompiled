package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iui0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public iui0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iui0)) {
            return false;
        }
        iui0 iui0Var = (iui0) obj;
        return this.a.equals(iui0Var.a) && this.b.equals(iui0Var.b) && this.c.equals(iui0Var.c) && this.d.equals(iui0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
