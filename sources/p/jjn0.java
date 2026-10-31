package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jjn0 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public jjn0(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjn0)) {
            return false;
        }
        jjn0 jjn0Var = (jjn0) obj;
        return this.a == jjn0Var.a && this.b.equals(jjn0Var.b) && this.c.equals(jjn0Var.c) && this.d == jjn0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
