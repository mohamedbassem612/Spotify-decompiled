package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qrg implements rrg {
    public final int a;

    public qrg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrg) && this.a == ((qrg) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
