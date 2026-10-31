package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class quf {
    public final a5i1 a;
    public final a5i1 b;
    public final yuf c;

    public quf(a5i1 a5i1Var, a5i1 a5i1Var2, yuf yufVar) {
        this.a = a5i1Var;
        this.b = a5i1Var2;
        this.c = yufVar;
    }

    public static quf a(quf qufVar, a5i1 a5i1Var, a5i1 a5i1Var2, yuf yufVar, int i) {
        if ((i & 1) != 0) {
            a5i1Var = qufVar.a;
        }
        if ((i & 2) != 0) {
            a5i1Var2 = qufVar.b;
        }
        if ((i & 4) != 0) {
            yufVar = qufVar.c;
        }
        return new quf(a5i1Var, a5i1Var2, yufVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quf)) {
            return false;
        }
        quf qufVar = (quf) obj;
        return this.a.equals(qufVar.a) && u890.j(this.b, qufVar.b) && this.c.equals(qufVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a5i1 a5i1Var = this.b;
        return this.c.hashCode() + ((iHashCode + (a5i1Var == null ? 0 : a5i1Var.hashCode())) * 31);
    }
}
