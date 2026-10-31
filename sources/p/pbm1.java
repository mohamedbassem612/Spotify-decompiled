package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pbm1 implements w8l1 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final r160 h;

    public pbm1(String str, String str2, int i, String str3, String str4, String str5, String str6, r160 r160Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = r160Var;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbm1)) {
            return false;
        }
        pbm1 pbm1Var = (pbm1) obj;
        return this.a.equals(pbm1Var.a) && this.b.equals(pbm1Var.b) && this.c == pbm1Var.c && this.d.equals(pbm1Var.d) && this.e.equals(pbm1Var.e) && this.f.equals(pbm1Var.f) && this.g.equals(pbm1Var.g) && u890.j(this.h, pbm1Var.h);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.g;
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        r160 r160Var = this.h;
        return iD + (r160Var == null ? 0 : r160Var.hashCode());
    }
}
