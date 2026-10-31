package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qub extends lvx {
    public final String d;
    public final boolean e;
    public final t7q0 f;
    public final boolean g;
    public final boolean h;

    public qub(String str, boolean z, t7q0 t7q0Var, boolean z2, boolean z3) {
        this.d = str;
        this.e = z;
        this.f = t7q0Var;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qub)) {
            return false;
        }
        qub qubVar = (qub) obj;
        return u890.j(this.d, qubVar.d) && this.e == qubVar.e && u890.j(this.f, qubVar.f) && this.g == qubVar.g && this.h == qubVar.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.d.hashCode() * 31, 31, this.e);
        t7q0 t7q0Var = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iG + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31, 31, this.g);
    }
}
