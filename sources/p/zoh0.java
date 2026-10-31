package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zoh0 {
    public final float a;
    public final float b;

    public zoh0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoh0)) {
            return false;
        }
        zoh0 zoh0Var = (zoh0) obj;
        return Float.compare(this.a, zoh0Var.a) == 0 && Float.compare(this.b, zoh0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
