package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qhi1 {
    public final xpw a;
    public final Object b;
    public final String c;

    public qhi1(xpw xpwVar, Object obj, String str) {
        this.a = xpwVar;
        this.b = obj;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhi1)) {
            return false;
        }
        qhi1 qhi1Var = (qhi1) obj;
        return this.a.equals(qhi1Var.a) && this.b.equals(qhi1Var.b) && u890.j(this.c, qhi1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
