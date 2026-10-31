package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro61 implements wo61 {
    public final String a;
    public final tv80 b;

    public ro61(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro61)) {
            return false;
        }
        ro61 ro61Var = (ro61) obj;
        return this.a.equals(ro61Var.a) && u890.j(this.b, ro61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
