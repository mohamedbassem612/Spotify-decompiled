package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i4c0 extends vqo1 {
    public final int c;

    public i4c0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4c0) && this.c == ((i4c0) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
