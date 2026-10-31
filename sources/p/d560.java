package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d560 extends j560 {
    public final c560 a;
    public final boolean b;

    public d560(c560 c560Var, boolean z) {
        this.a = c560Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d560)) {
            return false;
        }
        d560 d560Var = (d560) obj;
        return this.a.equals(d560Var.a) && this.b == d560Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
