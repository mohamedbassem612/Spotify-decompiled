package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t791 implements u791 {
    public final ji0 a;
    public final u70 b;
    public final lt0 c;
    public final huz d;
    public final q4 e;
    public final boolean f;

    public t791(ji0 ji0Var, u70 u70Var, lt0 lt0Var, huz huzVar, q4 q4Var, boolean z) {
        this.a = ji0Var;
        this.b = u70Var;
        this.c = lt0Var;
        this.d = huzVar;
        this.e = q4Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t791) {
            t791 t791Var = (t791) obj;
            if (this.a.equals(t791Var.a) && this.b == t791Var.b && this.c == t791Var.c && this.d == t791Var.d && this.e == t791Var.e && this.f == t791Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
