package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wyw0 implements kzw0 {
    public final int a;

    public wyw0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyw0) && this.a == ((wyw0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
