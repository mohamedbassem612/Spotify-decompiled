package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xe60 implements ye60 {
    public final String a;
    public final hvl1 b;

    public xe60(String str, hvl1 hvl1Var) {
        this.a = str;
        this.b = hvl1Var;
    }

    @Override // p.ye60
    public final String a() {
        return this.a;
    }

    @Override // p.ye60
    public final x360 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe60)) {
            return false;
        }
        xe60 xe60Var = (xe60) obj;
        return this.a.equals(xe60Var.a) && this.b.equals(xe60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
