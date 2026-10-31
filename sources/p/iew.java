package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iew {
    public final String a;
    public final String b;
    public final tv80 c;

    public iew(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iew)) {
            return false;
        }
        iew iewVar = (iew) obj;
        return u890.j(this.a, iewVar.a) && u890.j(this.b, iewVar.b) && u890.j(this.c, iewVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
