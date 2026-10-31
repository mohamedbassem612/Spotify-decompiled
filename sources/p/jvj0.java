package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jvj0 implements kvj0 {
    public final int a;
    public final int b;

    public jvj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvj0)) {
            return false;
        }
        jvj0 jvj0Var = (jvj0) obj;
        return this.a == jvj0Var.a && this.b == jvj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
