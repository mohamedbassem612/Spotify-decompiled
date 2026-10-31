package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yi61 {
    public final int a;

    public yi61(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi61) && this.a == ((yi61) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
