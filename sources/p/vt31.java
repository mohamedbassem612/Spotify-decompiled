package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vt31 implements zt31 {
    public final int a;

    public vt31(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt31) && this.a == ((vt31) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
