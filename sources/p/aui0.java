package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aui0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public aui0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aui0)) {
            return false;
        }
        aui0 aui0Var = (aui0) obj;
        return this.a.equals(aui0Var.a) && this.b.equals(aui0Var.b) && this.c.equals(aui0Var.c) && this.d.equals(aui0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
