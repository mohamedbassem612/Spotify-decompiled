package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ef7 extends iqo1 {
    public final String d;
    public final tv80 e;

    public ef7(String str, tv80 tv80Var) {
        this.d = str;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef7)) {
            return false;
        }
        ef7 ef7Var = (ef7) obj;
        return u890.j(this.d, ef7Var.d) && u890.j(this.e, ef7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
