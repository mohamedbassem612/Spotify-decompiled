package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fp80 {
    public final int a;
    public final String b;
    public final String c;

    public fp80(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp80)) {
            return false;
        }
        fp80 fp80Var = (fp80) obj;
        return this.a == fp80Var.a && this.b.equals(fp80Var.b) && this.c.equals(fp80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
