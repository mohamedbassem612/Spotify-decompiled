package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lpu {
    public final boolean a;
    public final boolean b;

    public lpu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpu)) {
            return false;
        }
        lpu lpuVar = (lpu) obj;
        return this.a == lpuVar.a && this.b == lpuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public /* synthetic */ lpu() {
        this(false, false);
    }
}
