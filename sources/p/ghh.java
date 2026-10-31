package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ghh implements jhh {
    public final String a;
    public final kfi1 b;

    public ghh(String str, kfi1 kfi1Var) {
        this.a = str;
        this.b = kfi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghh)) {
            return false;
        }
        ghh ghhVar = (ghh) obj;
        return this.a.equals(ghhVar.a) && u890.j(this.b, ghhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kfi1 kfi1Var = this.b;
        return iHashCode + (kfi1Var == null ? 0 : kfi1Var.hashCode());
    }
}
