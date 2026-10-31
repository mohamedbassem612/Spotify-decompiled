package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rib1 {
    public final phx a;
    public final c380 b;
    public final boolean c;

    public rib1(phx phxVar, c380 c380Var, boolean z) {
        this.a = phxVar;
        this.b = c380Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rib1)) {
            return false;
        }
        rib1 rib1Var = (rib1) obj;
        return this.a.equals(rib1Var.a) && u890.j(this.b, rib1Var.b) && this.c == rib1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kk0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
