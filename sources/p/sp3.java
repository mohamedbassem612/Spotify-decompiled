package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sp3 extends hr3 {
    public final String a;
    public final String b;
    public final tv80 c;

    public sp3(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp3)) {
            return false;
        }
        sp3 sp3Var = (sp3) obj;
        return u890.j(this.a, sp3Var.a) && u890.j(this.b, sp3Var.b) && this.c.equals(sp3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
