package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jg9 implements og9 {
    public final int a;

    public jg9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg9) && this.a == ((jg9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
