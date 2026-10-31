package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qwl implements twl {
    public final String a;
    public final jno b;
    public final lxh c;
    public final long d;
    public final qpe1 e;

    public qwl(String str, jno jnoVar, lxh lxhVar, long j, qpe1 qpe1Var) {
        this.a = str;
        this.b = jnoVar;
        this.c = lxhVar;
        this.d = j;
        this.e = qpe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwl)) {
            return false;
        }
        qwl qwlVar = (qwl) obj;
        if (!u890.j(this.a, qwlVar.a) || !u890.j(this.b, qwlVar.b) || !u890.j(this.c, qwlVar.c)) {
            return false;
        }
        long j = qwlVar.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e == qwlVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = u7h.l;
        return this.e.hashCode() + cy30.f(iHashCode, this.d, 31);
    }

    public /* synthetic */ qwl(String str, jno jnoVar, lxh lxhVar, long j) {
        this(str, jnoVar, lxhVar, j, qpe1.a);
    }
}
