package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ybg1 implements bcg1 {
    public final boolean a;
    public final boolean b;

    public ybg1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybg1)) {
            return false;
        }
        ybg1 ybg1Var = (ybg1) obj;
        return this.a == ybg1Var.a && this.b == ybg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
