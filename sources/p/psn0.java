package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class psn0 {
    public final int a;

    public psn0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psn0) && this.a == ((psn0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
