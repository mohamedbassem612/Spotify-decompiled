package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pjz {
    public final int a;

    public pjz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjz) && this.a == ((pjz) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
