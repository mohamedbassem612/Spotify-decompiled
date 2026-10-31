package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rd60 {
    public final qd60 a;
    public final boolean b;
    public final boolean c;

    public rd60(qd60 qd60Var, boolean z, boolean z2) {
        this.a = qd60Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd60)) {
            return false;
        }
        rd60 rd60Var = (rd60) obj;
        return this.a.equals(rd60Var.a) && this.b == rd60Var.b && this.c == rd60Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
