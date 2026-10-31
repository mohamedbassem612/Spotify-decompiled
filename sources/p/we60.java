package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class we60 implements ye60 {
    public final String a;
    public final hvl1 b;
    public final int c;

    public we60(String str, hvl1 hvl1Var, int i) {
        this.a = str;
        this.b = hvl1Var;
        this.c = i;
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
        if (!(obj instanceof we60)) {
            return false;
        }
        we60 we60Var = (we60) obj;
        return this.a.equals(we60Var.a) && this.b.equals(we60Var.b) && this.c == we60Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
