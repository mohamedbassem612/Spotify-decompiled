package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ypf {
    public final String a;
    public final zks0 b;
    public final vzq0 c;
    public final c380 d;

    public ypf(String str, zks0 zks0Var, vzq0 vzq0Var, c380 c380Var) {
        this.a = str;
        this.b = zks0Var;
        this.c = vzq0Var;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return u890.j(this.a, ypfVar.a) && u890.j(this.b, ypfVar.b) && this.c.equals(ypfVar.c) && u890.j(this.d, ypfVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(20) + kk0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
