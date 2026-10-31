package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class blb0 {
    public final int a;
    public final float b;
    public final float c;

    public blb0(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb0)) {
            return false;
        }
        blb0 blb0Var = (blb0) obj;
        return this.a == blb0Var.a && Float.compare(this.b, blb0Var.b) == 0 && Float.compare(this.c, blb0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
