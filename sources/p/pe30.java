package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pe30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pe30(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe30)) {
            return false;
        }
        pe30 pe30Var = (pe30) obj;
        return u890.j(this.a, pe30Var.a) && u890.j(this.b, pe30Var.b) && this.c.equals(pe30Var.c) && this.d.equals(pe30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
