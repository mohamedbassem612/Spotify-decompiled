package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ogf1 {
    public final int a;
    public final int b;

    public ogf1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogf1)) {
            return false;
        }
        ogf1 ogf1Var = (ogf1) obj;
        return this.a == ogf1Var.a && this.b == ogf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
