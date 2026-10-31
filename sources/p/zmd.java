package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zmd {
    public final String a;
    public final tr80 b;
    public final tr80 c;

    public zmd(String str, tr80 tr80Var, tr80 tr80Var2) {
        this.a = str;
        this.b = tr80Var;
        this.c = tr80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmd)) {
            return false;
        }
        zmd zmdVar = (zmd) obj;
        return u890.j(this.a, zmdVar.a) && this.b.equals(zmdVar.b) && this.c.equals(zmdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + lf51.e(this.a.hashCode() * 31, 31, this.b);
    }
}
