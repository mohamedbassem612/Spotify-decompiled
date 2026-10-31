package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ywa1 {
    public final qxc0 a;
    public final String b;

    public ywa1(qxc0 qxc0Var, String str) {
        this.a = qxc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywa1)) {
            return false;
        }
        ywa1 ywa1Var = (ywa1) obj;
        return this.a.equals(ywa1Var.a) && u890.j(this.b, ywa1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
