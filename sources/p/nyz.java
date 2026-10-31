package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nyz implements b700 {
    public final String a;
    public final String b;
    public final tv80 c;

    public nyz(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyz)) {
            return false;
        }
        nyz nyzVar = (nyz) obj;
        return u890.j(this.a, nyzVar.a) && u890.j(this.b, nyzVar.b) && u890.j(this.c, nyzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
