package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m301 implements y301 {
    public final String a;
    public final String b;
    public final String c;
    public final Throwable d;

    public m301(String str, String str2, String str3, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m301)) {
            return false;
        }
        m301 m301Var = (m301) obj;
        return u890.j(this.a, m301Var.a) && u890.j(this.b, m301Var.b) && this.c.equals(m301Var.c) && this.d.equals(m301Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
