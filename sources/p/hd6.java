package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hd6 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public hd6(String str, String str2, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd6)) {
            return false;
        }
        hd6 hd6Var = (hd6) obj;
        return this.a.equals(hd6Var.a) && this.b.equals(hd6Var.b) && u890.j(this.c, hd6Var.c) && u890.j(this.d, hd6Var.d) && u890.j(this.e, hd6Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.e.hashCode() + cy30.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }
}
