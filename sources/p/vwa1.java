package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vwa1 {
    public final Integer a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final h2v e;
    public final c380 f;

    public vwa1(Integer num, int i, boolean z, boolean z2, h2v h2vVar, c380 c380Var) {
        this.a = num;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = h2vVar;
        this.f = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwa1)) {
            return false;
        }
        vwa1 vwa1Var = (vwa1) obj;
        return u890.j(this.a, vwa1Var.a) && this.b == vwa1Var.b && this.c == vwa1Var.c && this.d == vwa1Var.d && u890.j(this.e, vwa1Var.e) && u890.j(this.f, vwa1Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iG = xcg1.g(xcg1.g(ab80.k(this.b, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.c), 31, this.d);
        h2v h2vVar = this.e;
        return this.f.hashCode() + ((iG + (h2vVar != null ? h2vVar.hashCode() : 0)) * 31);
    }
}
