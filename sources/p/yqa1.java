package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yqa1 implements era1 {
    public final String a;
    public final String b;
    public final float c;

    public yqa1(String str, float f, String str2) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqa1)) {
            return false;
        }
        yqa1 yqa1Var = (yqa1) obj;
        return u890.j(this.a, yqa1Var.a) && u890.j(this.b, yqa1Var.b) && Float.compare(this.c, yqa1Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
