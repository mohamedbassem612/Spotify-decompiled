package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zk80 implements xk80 {
    public final String a;
    public final v7f b;
    public final bl80 c;
    public final String d;
    public final int e;
    public final long f;

    public zk80(String str, v7f v7fVar, bl80 bl80Var, String str2, int i, long j) {
        this.a = str;
        this.b = v7fVar;
        this.c = bl80Var;
        this.d = str2;
        this.e = i;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk80)) {
            return false;
        }
        zk80 zk80Var = (zk80) obj;
        return this.a.equals(zk80Var.a) && u890.j(this.b, zk80Var.b) && this.c.equals(zk80Var.c) && this.d.equals(zk80Var.d) && this.e == zk80Var.e && this.f == zk80Var.f;
    }

    @Override // p.xk80
    public final String getEntityUri() {
        return this.d;
    }

    @Override // p.cl80
    public final String getId() {
        return this.a;
    }

    @Override // p.cl80
    public final v7f getTimeRange() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v7f v7fVar = this.b;
        return Long.hashCode(this.f) + ab80.k(this.e, cy30.d((this.c.hashCode() + ((iHashCode + (v7fVar == null ? 0 : v7fVar.hashCode())) * 31)) * 31, 31, this.d), 31);
    }
}
