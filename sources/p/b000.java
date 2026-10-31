package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b000 implements m700 {
    public final int a;
    public final float b;

    public b000(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b000)) {
            return false;
        }
        b000 b000Var = (b000) obj;
        return this.a == b000Var.a && Float.compare(this.b, b000Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
