package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jo60 {
    public final String a;
    public final String b;
    public final tv80 c;

    public jo60(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo60)) {
            return false;
        }
        jo60 jo60Var = (jo60) obj;
        return this.a.equals(jo60Var.a) && u890.j(this.b, jo60Var.b) && u890.j(this.c, jo60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
