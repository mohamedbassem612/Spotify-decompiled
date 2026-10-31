package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a1c1 {
    public final Object a;
    public final String b;

    public a1c1(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1c1)) {
            return false;
        }
        a1c1 a1c1Var = (a1c1) obj;
        return this.a.equals(a1c1Var.a) && this.b.equals(a1c1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
