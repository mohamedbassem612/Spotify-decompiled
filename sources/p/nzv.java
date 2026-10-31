package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nzv extends l0w {
    public final int a;

    public nzv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzv) && this.a == ((nzv) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
