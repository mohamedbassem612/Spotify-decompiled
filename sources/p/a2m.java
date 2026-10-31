package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a2m implements c2m {
    public final String a;
    public final k620 b;

    public a2m(String str, k620 k620Var) {
        this.a = str;
        this.b = k620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2m)) {
            return false;
        }
        a2m a2mVar = (a2m) obj;
        return u890.j(this.a, a2mVar.a) && this.b == a2mVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
