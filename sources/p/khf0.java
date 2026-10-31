package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class khf0 implements yhf0 {
    public final String a;
    public final String b;
    public final String c;
    public final a9h d;

    public khf0(String str, String str2, String str3, a9h a9hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khf0)) {
            return false;
        }
        khf0 khf0Var = (khf0) obj;
        return u890.j(this.a, khf0Var.a) && u890.j(this.b, khf0Var.b) && u890.j(this.c, khf0Var.c) && u890.j(this.d, khf0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d((dhf0.b.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.c);
        a9h a9hVar = this.d;
        return iD + (a9hVar == null ? 0 : a9hVar.hashCode());
    }
}
