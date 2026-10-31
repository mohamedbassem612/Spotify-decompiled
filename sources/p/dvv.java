package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dvv implements evv {
    public final int a;

    public dvv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvv) && this.a == ((dvv) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
