package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eu2 {
    public final float a;
    public final zzq0 b;

    public eu2(float f, zzq0 zzq0Var) {
        this.a = f;
        this.b = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu2)) {
            return false;
        }
        eu2 eu2Var = (eu2) obj;
        return p3v.c(this.a, eu2Var.a) && this.b.equals(eu2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}
