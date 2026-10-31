package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class on6 extends sn6 {
    public final String a;
    public final tv80 b;

    public on6(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on6)) {
            return false;
        }
        on6 on6Var = (on6) obj;
        return u890.j(this.a, on6Var.a) && u890.j(this.b, on6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
