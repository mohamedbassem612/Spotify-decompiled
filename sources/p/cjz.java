package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cjz implements djz {
    public final int a;

    public cjz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjz) && this.a == ((cjz) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
