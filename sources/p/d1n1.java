package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d1n1 extends q1n1 {
    public final String a;
    public final tv80 b;

    public d1n1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1n1)) {
            return false;
        }
        d1n1 d1n1Var = (d1n1) obj;
        return this.a.equals(d1n1Var.a) && this.b.equals(d1n1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
