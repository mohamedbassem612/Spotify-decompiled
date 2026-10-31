package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iwa1 extends kwa1 {
    public final int a;

    public iwa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwa1) && this.a == ((iwa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
