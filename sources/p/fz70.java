package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fz70 implements hz70 {
    public final kks0 a;

    public fz70(kks0 kks0Var) {
        this.a = kks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz70) && this.a == ((fz70) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
