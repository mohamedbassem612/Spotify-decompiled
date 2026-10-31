package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wyd0 implements azd0 {
    public final String a;
    public final tv80 b;

    public wyd0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyd0)) {
            return false;
        }
        wyd0 wyd0Var = (wyd0) obj;
        return this.a.equals(wyd0Var.a) && u890.j(this.b, wyd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
