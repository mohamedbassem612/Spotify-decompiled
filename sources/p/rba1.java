package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rba1 {
    public final c380 a;
    public final String b;

    public rba1(c9 c9Var) {
        this.a = c9Var;
        this.b = ((kba1) o7h.q0(c9Var)).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rba1) && this.a.equals(((rba1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
