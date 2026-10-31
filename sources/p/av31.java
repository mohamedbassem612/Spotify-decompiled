package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class av31 implements aw31 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public av31(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av31)) {
            return false;
        }
        av31 av31Var = (av31) obj;
        return this.a == av31Var.a && u890.j(this.b, av31Var.b) && this.c.equals(av31Var.c) && u890.j(this.d, av31Var.d) && u890.j(this.e, av31Var.e) && u890.j(this.f, av31Var.f) && this.g.equals(av31Var.g) && this.h.equals(av31Var.h) && this.i.equals(av31Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.i.hashCode() + cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}
