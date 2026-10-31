package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tqa1 implements era1 {
    public final String a;
    public final String b;
    public final String c;
    public final float d;

    public tqa1(String str, String str2, float f, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqa1)) {
            return false;
        }
        tqa1 tqa1Var = (tqa1) obj;
        return u890.j(this.a, tqa1Var.a) && u890.j(this.b, tqa1Var.b) && u890.j(this.c, tqa1Var.c) && Float.compare(this.d, tqa1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
