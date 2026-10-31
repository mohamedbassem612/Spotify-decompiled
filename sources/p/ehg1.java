package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ehg1 implements dhg1 {
    public final Object a;
    public final Object b;

    public ehg1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // p.dhg1
    public final Object b() {
        return this.b;
    }

    @Override // p.dhg1
    public final Object e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhg1)) {
            return false;
        }
        dhg1 dhg1Var = (dhg1) obj;
        return u890.j(this.a, dhg1Var.e()) && u890.j(this.b, dhg1Var.b());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
