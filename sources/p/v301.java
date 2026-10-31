package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v301 implements y301 {
    public final String a;
    public final String b;
    public final String c;
    public final Throwable d;

    public v301(String str, String str2, String str3, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v301)) {
            return false;
        }
        v301 v301Var = (v301) obj;
        return u890.j(this.a, v301Var.a) && u890.j(this.b, v301Var.b) && u890.j(this.c, v301Var.c) && this.d.equals(v301Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
