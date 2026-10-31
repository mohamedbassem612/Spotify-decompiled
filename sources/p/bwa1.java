package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bwa1 implements cwa1 {
    public final int a;

    public bwa1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwa1) && this.a == ((bwa1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
