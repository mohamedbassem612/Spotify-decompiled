package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final y30 f;

    public e40(String str, String str2, String str3, String str4, String str5, y30 y30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = y30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return this.a.equals(e40Var.a) && this.b.equals(e40Var.b) && this.c.equals(e40Var.c) && this.d.equals(e40Var.d) && this.e.equals(e40Var.e) && u890.j(this.f, e40Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        y30 y30Var = this.f;
        return iD + (y30Var == null ? 0 : y30Var.hashCode());
    }
}
