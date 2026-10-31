package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yb80 {
    public final int a;

    public yb80(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb80) && this.a == ((yb80) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
