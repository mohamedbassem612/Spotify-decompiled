package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l5w0 implements m5w0 {
    public final hib0 a;
    public final String b;

    public l5w0(hib0 hib0Var, String str) {
        this.a = hib0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5w0)) {
            return false;
        }
        l5w0 l5w0Var = (l5w0) obj;
        return this.a.equals(l5w0Var.a) && this.b.equals(l5w0Var.b);
    }

    @Override // p.m5w0
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
