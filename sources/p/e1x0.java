package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e1x0 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e1x0(String str, String str2, Integer num, String str3, String str4) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1x0)) {
            return false;
        }
        e1x0 e1x0Var = (e1x0) obj;
        return u890.j(this.a, e1x0Var.a) && u890.j(this.b, e1x0Var.b) && u890.j(this.c, e1x0Var.c) && this.d.equals(e1x0Var.d) && this.e.equals(e1x0Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
