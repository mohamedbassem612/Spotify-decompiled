package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jod1 extends lod1 {
    public final int a;

    public jod1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jod1) && this.a == ((jod1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
