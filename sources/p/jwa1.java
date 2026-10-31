package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jwa1 extends kwa1 {
    public final int a;

    public jwa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwa1) && this.a == ((jwa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
