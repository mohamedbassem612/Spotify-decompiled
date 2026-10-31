package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qkw0 {
    public final float a;
    public final int b;

    public qkw0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkw0)) {
            return false;
        }
        qkw0 qkw0Var = (qkw0) obj;
        return Float.compare(this.a, qkw0Var.a) == 0 && this.b == qkw0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
