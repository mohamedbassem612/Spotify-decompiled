package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class igz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public igz0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igz0)) {
            return false;
        }
        igz0 igz0Var = (igz0) obj;
        return this.a.equals(igz0Var.a) && this.b.equals(igz0Var.b) && this.c.equals(igz0Var.c) && u890.j(this.d, igz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
