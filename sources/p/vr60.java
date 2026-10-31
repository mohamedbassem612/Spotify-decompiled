package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vr60 {
    public final int a;

    public vr60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr60) && this.a == ((vr60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a) + (l1d.C(1) * 31);
    }
}
