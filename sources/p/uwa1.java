package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uwa1 {
    public final String a;
    public final Float b;

    public uwa1(String str, Float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwa1)) {
            return false;
        }
        uwa1 uwa1Var = (uwa1) obj;
        return u890.j(this.a, uwa1Var.a) && u890.j(this.b, uwa1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }
}
