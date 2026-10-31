package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jii0 extends kii0 {
    public final int a;

    public jii0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jii0) && this.a == ((jii0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
