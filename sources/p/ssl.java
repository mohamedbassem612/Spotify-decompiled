package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ssl extends usl {
    public final dtl a;
    public final String b;
    public final op80 c;

    public ssl(dtl dtlVar, String str, op80 op80Var) {
        this.a = dtlVar;
        this.b = str;
        this.c = op80Var;
    }

    @Override // p.usl
    public final dtl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssl)) {
            return false;
        }
        ssl sslVar = (ssl) obj;
        return this.a.equals(sslVar.a) && this.b.equals(sslVar.b) && this.c.equals(sslVar.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
