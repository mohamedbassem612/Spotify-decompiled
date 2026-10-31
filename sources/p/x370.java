package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x370 implements z370 {
    public final String a;
    public final String b;
    public final fsd1 c;

    public x370(String str, String str2, fsd1 fsd1Var) {
        this.a = str;
        this.b = str2;
        this.c = fsd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x370)) {
            return false;
        }
        x370 x370Var = (x370) obj;
        return this.a.equals(x370Var.a) && this.b.equals(x370Var.b) && this.c.equals(x370Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
