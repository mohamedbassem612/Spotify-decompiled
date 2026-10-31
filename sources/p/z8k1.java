package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z8k1 extends d7p1 {
    public final tv80 c;
    public final String d;

    public z8k1(String str, tv80 tv80Var) {
        this.c = tv80Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8k1)) {
            return false;
        }
        z8k1 z8k1Var = (z8k1) obj;
        return u890.j(this.c, z8k1Var.c) && u890.j(this.d, z8k1Var.d);
    }

    public final int hashCode() {
        tv80 tv80Var = this.c;
        return this.d.hashCode() + ((tv80Var == null ? 0 : tv80Var.hashCode()) * 31);
    }
}
