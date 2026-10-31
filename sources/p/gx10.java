package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gx10 {
    public final String a;
    public final fyo1 b;
    public final boolean c;
    public final float d;

    public gx10(String str, fyo1 fyo1Var, boolean z, float f) {
        this.a = str;
        this.b = fyo1Var;
        this.c = z;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx10)) {
            return false;
        }
        gx10 gx10Var = (gx10) obj;
        return this.a.equals(gx10Var.a) && this.b.equals(gx10Var.b) && this.c == gx10Var.c && Float.compare(this.d, gx10Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
