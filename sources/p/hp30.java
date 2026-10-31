package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hp30 {
    public final float a;
    public final float b;

    public hp30(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp30)) {
            return false;
        }
        hp30 hp30Var = (hp30) obj;
        return p3v.c(this.a, hp30Var.a) && Float.compare(this.b, hp30Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
