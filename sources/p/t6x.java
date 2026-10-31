package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t6x implements yue1 {
    public final String a;
    public final String b;
    public final d761 c;
    public final qc60 d;

    public t6x(String str, String str2, d761 d761Var, qc60 qc60Var) {
        this.a = str;
        this.b = str2;
        this.c = d761Var;
        this.d = qc60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6x)) {
            return false;
        }
        t6x t6xVar = (t6x) obj;
        return this.a.equals(t6xVar.a) && this.b.equals(t6xVar.b) && this.c.equals(t6xVar.c) && this.d.equals(t6xVar.d);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ktd.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c.a, 31);
    }
}
