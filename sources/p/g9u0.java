package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g9u0 extends q9u0 {
    public final String a;
    public final boolean b;

    public g9u0(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @Override // p.q9u0
    public final Object a(ogr ogrVar, ouz ouzVar, dqu dquVar, laz lazVar, fey feyVar, lmw lmwVar, puz puzVar, quz quzVar, mjv mjvVar, qmr qmrVar, rmr rmrVar, efr efrVar, tzo tzoVar) {
        return ogrVar.apply(this);
    }

    @Override // p.q9u0
    public final void b(yqb1 yqb1Var, o2b1 o2b1Var, zqb1 zqb1Var, utw0 utw0Var, yqb1 yqb1Var2, vr51 vr51Var, dn81 dn81Var, q881 q881Var, zqb1 zqb1Var2, wqb1 wqb1Var, xqb1 xqb1Var, y281 y281Var) {
        yqb1Var.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g9u0)) {
            return false;
        }
        g9u0 g9u0Var = (g9u0) obj;
        return g9u0Var.b == this.b && g9u0Var.a.equals(this.a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resume{featureIdentifier=");
        sb.append(this.a);
        sb.append(", systemInitiated=");
        return f4i1.g(sb, this.b, '}');
    }
}
