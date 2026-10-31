package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b34 extends c34 {
    public final String a;
    public final x360 b;

    public b34(String str, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
    }

    @Override // p.c34
    public final x360 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b34)) {
            return false;
        }
        b34 b34Var = (b34) obj;
        return this.a.equals(b34Var.a) && u890.j(this.b, b34Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return iHashCode + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
