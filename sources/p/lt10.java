package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lt10 implements st10 {
    public final uv10 a;
    public final String b;
    public final String c;

    public lt10(uv10 uv10Var, String str, String str2) {
        this.a = uv10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt10)) {
            return false;
        }
        lt10 lt10Var = (lt10) obj;
        return this.a.equals(lt10Var.a) && this.b.equals(lt10Var.b) && u890.j(this.c, lt10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
