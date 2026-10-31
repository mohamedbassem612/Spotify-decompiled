package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sd6 {
    public final float a;
    public final float b;

    public sd6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd6)) {
            return false;
        }
        sd6 sd6Var = (sd6) obj;
        return Float.compare(this.a, sd6Var.a) == 0 && Float.compare(this.b, sd6Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
