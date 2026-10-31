package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qn6 extends sn6 {
    public final String a;
    public final tv80 b;

    public qn6(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn6)) {
            return false;
        }
        qn6 qn6Var = (qn6) obj;
        return this.a.equals(qn6Var.a) && u890.j(this.b, qn6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
