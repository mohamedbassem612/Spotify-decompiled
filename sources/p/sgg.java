package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sgg {
    public final int a;

    public sgg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgg) && this.a == ((sgg) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
