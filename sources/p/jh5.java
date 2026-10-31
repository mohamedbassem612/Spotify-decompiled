package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jh5 {
    public final zjd1 a;
    public final Object b;
    public final int c;

    public jh5(zjd1 zjd1Var, Object obj) {
        this.a = zjd1Var;
        this.b = obj;
        this.c = obj.hashCode() + (zjd1Var.hashCode() * 31);
    }

    public final boolean a() {
        return u890.j(this.b, fkj0.R0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5)) {
            return false;
        }
        jh5 jh5Var = (jh5) obj;
        return u890.j(this.a, jh5Var.a) && u890.j(this.b, jh5Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
