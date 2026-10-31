package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bix0 {
    public final String a;
    public final float b;
    public final String c;
    public final float d;

    public bix0(String str, float f, String str2, float f2) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bix0)) {
            return false;
        }
        bix0 bix0Var = (bix0) obj;
        return this.a.equals(bix0Var.a) && Float.compare(this.b, bix0Var.b) == 0 && this.c.equals(bix0Var.c) && Float.compare(this.d, bix0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + cy30.d(x0d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
