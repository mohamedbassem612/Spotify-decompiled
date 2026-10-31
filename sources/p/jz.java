package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jz implements n10 {
    public final int a;

    public jz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz) && this.a == ((jz) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
