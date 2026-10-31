package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tif implements uif {
    public final int a;

    public tif(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tif) && this.a == ((tif) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
