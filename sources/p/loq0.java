package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class loq0 extends toq0 {
    public final c560 a;
    public final String b;

    public loq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loq0)) {
            return false;
        }
        loq0 loq0Var = (loq0) obj;
        return this.a.equals(loq0Var.a) && this.b.equals(loq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
