package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qp31 implements ez00 {
    public final boolean a;

    public qp31(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp31) && this.a == ((qp31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
