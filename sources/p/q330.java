package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q330 implements w330 {
    public final yf a;
    public final p3v b;

    public q330(yf yfVar, p3v p3vVar) {
        this.a = yfVar;
        this.b = p3vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q330)) {
            return false;
        }
        q330 q330Var = (q330) obj;
        return u890.j(this.a, q330Var.a) && u890.j(this.b, q330Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p3v p3vVar = this.b;
        return iHashCode + (p3vVar == null ? 0 : Float.hashCode(p3vVar.a));
    }

    public /* synthetic */ q330(yf yfVar, p3v p3vVar, int i) {
        this(yfVar, p3vVar);
    }
}
