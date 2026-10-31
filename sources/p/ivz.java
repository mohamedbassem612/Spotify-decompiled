package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivz {
    public final int a;

    public ivz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivz) && this.a == ((ivz) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
