package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tkk extends vlk {
    public final String a;
    public final tv80 b;

    public tkk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkk)) {
            return false;
        }
        tkk tkkVar = (tkk) obj;
        return u890.j(this.a, tkkVar.a) && u890.j(this.b, tkkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
