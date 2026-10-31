package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vp61 implements bq61 {
    public final String a;
    public final tv80 b;

    public vp61(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp61)) {
            return false;
        }
        vp61 vp61Var = (vp61) obj;
        return this.a.equals(vp61Var.a) && u890.j(this.b, vp61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
