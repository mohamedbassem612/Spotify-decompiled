package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls31 {
    public final kio a;
    public final int b;

    public ls31(kio kioVar, int i) {
        this.a = kioVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls31)) {
            return false;
        }
        ls31 ls31Var = (ls31) obj;
        return this.a.equals(ls31Var.a) && this.b == ls31Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
