package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vw60 {
    public final int a;

    public vw60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw60) && this.a == ((vw60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
