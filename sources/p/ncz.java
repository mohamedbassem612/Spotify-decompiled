package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ncz implements qcz {
    public final int a;

    public ncz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncz) && this.a == ((ncz) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
