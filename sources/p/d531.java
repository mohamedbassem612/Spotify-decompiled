package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d531 implements e531 {
    public final int a;
    public final tv80 b;

    public d531(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d531)) {
            return false;
        }
        d531 d531Var = (d531) obj;
        return this.a == d531Var.a && u890.j(this.b, d531Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
