package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cgk extends nln {
    public final String e;
    public final String f;
    public final tv80 g;
    public final String h;

    public cgk(String str, String str2, tv80 tv80Var) {
        super((byte) 4);
        this.e = str;
        this.f = str2;
        this.g = tv80Var;
        this.h = "context-menu";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgk)) {
            return false;
        }
        cgk cgkVar = (cgk) obj;
        return u890.j(this.e, cgkVar.e) && this.f.equals(cgkVar.f) && u890.j(this.g, cgkVar.g) && this.h.equals(cgkVar.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.e.hashCode() * 31, 31, this.f);
        tv80 tv80Var = this.g;
        return this.h.hashCode() + ((iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
