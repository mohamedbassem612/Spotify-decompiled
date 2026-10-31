package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qm30 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public qm30(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm30)) {
            return false;
        }
        qm30 qm30Var = (qm30) obj;
        return this.a.equals(qm30Var.a) && this.b.equals(qm30Var.b) && this.c.equals(qm30Var.c) && this.d.equals(qm30Var.d) && u890.j(this.e, qm30Var.e) && this.f == qm30Var.f && this.g == qm30Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }
}
