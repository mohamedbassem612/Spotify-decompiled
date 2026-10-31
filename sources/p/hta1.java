package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hta1 {
    public final boolean a;
    public final boolean b;

    public hta1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hta1)) {
            return false;
        }
        hta1 hta1Var = (hta1) obj;
        return this.a == hta1Var.a && this.b == hta1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
