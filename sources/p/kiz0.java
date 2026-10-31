package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kiz0 {
    public final String a;
    public final wwo1 b;

    public kiz0(String str, wwo1 wwo1Var) {
        this.a = str;
        this.b = wwo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiz0)) {
            return false;
        }
        kiz0 kiz0Var = (kiz0) obj;
        return u890.j(this.a, kiz0Var.a) && this.b.equals(kiz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
