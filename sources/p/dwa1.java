package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwa1 {
    public final String a;
    public final float b;
    public final Float c;
    public final Float d;
    public final boolean e;

    public dwa1(String str, float f, Float f2, Float f3, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwa1)) {
            return false;
        }
        dwa1 dwa1Var = (dwa1) obj;
        return u890.j(this.a, dwa1Var.a) && Float.compare(this.b, dwa1Var.b) == 0 && u890.j(this.c, dwa1Var.c) && u890.j(this.d, dwa1Var.d) && this.e == dwa1Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iF = x0d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Float f = this.c;
        int iHashCode = (iF + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31);
    }
}
