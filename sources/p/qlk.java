package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qlk extends vlk {
    public final String a;
    public final String b;
    public final tv80 c;

    public qlk(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlk)) {
            return false;
        }
        qlk qlkVar = (qlk) obj;
        return u890.j(this.a, qlkVar.a) && this.b.equals(qlkVar.b) && u890.j(this.c, qlkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
