package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ynk0 implements bok0 {
    public final int a;
    public final int b;

    public ynk0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynk0)) {
            return false;
        }
        ynk0 ynk0Var = (ynk0) obj;
        return this.a == ynk0Var.a && this.b == ynk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
