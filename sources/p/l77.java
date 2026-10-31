package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l77 {
    public final xpw a;
    public final kc7 b;

    public l77(xpw xpwVar, kc7 kc7Var) {
        this.a = xpwVar;
        this.b = kc7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l77)) {
            return false;
        }
        l77 l77Var = (l77) obj;
        return this.a.equals(l77Var.a) && this.b.equals(l77Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
