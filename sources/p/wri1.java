package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wri1 implements asi1 {
    public final int a;

    public wri1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wri1) && this.a == ((wri1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
