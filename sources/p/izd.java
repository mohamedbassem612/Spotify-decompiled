package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izd implements tj0 {
    public final int a;

    public izd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izd) && this.a == ((izd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
