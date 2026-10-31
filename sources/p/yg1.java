package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yg1 {
    public final String a;
    public final String b;
    public final String c;
    public final mh1 d;
    public final ye1 e;
    public final String f;
    public final p10 g;
    public final oh1 h;
    public final boolean i;
    public final p10 j;

    public yg1(String str, String str2, String str3, mh1 mh1Var, ye1 ye1Var, String str4, p10 p10Var, oh1 oh1Var, boolean z, p10 p10Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mh1Var;
        this.e = ye1Var;
        this.f = str4;
        this.g = p10Var;
        this.h = oh1Var;
        this.i = z;
        this.j = p10Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg1)) {
            return false;
        }
        yg1 yg1Var = (yg1) obj;
        return this.a.equals(yg1Var.a) && this.b.equals(yg1Var.b) && this.c.equals(yg1Var.c) && this.d.equals(yg1Var.d) && this.e.equals(yg1Var.e) && this.f.equals(yg1Var.f) && this.g.equals(yg1Var.g) && this.h.equals(yg1Var.h) && this.i == yg1Var.i && this.j.equals(yg1Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g((this.h.hashCode() + ((this.g.hashCode() + cy30.d((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f)) * 31)) * 31, 31, this.i);
    }
}
