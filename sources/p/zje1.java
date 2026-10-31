package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zje1 {
    public final float a;
    public final float b;

    public zje1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zje1)) {
            return false;
        }
        zje1 zje1Var = (zje1) obj;
        return Float.compare(this.a, zje1Var.a) == 0 && Float.compare(this.b, zje1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public /* synthetic */ zje1() {
        this(0.0f, 0.0f);
    }
}
