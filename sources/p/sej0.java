package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sej0 {
    public final int a;

    public sej0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sej0) && this.a == ((sej0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
