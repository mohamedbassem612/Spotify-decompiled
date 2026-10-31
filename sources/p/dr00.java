package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dr00 implements er00 {
    public final boolean a;
    public final k4m b;
    public final boolean c;
    public final String d;

    public dr00(boolean z, k4m k4mVar, boolean z2, String str) {
        this.a = z;
        this.b = k4mVar;
        this.c = z2;
        this.d = str;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr00)) {
            return false;
        }
        dr00 dr00Var = (dr00) obj;
        return this.a == dr00Var.a && this.b == dr00Var.b && this.c == dr00Var.c && u890.j(this.d, dr00Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(p3d1.g(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
