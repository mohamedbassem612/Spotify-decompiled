package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c3y implements g3y {
    public final int a;

    public c3y(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3y) && this.a == ((c3y) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
