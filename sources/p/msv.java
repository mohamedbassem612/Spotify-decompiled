package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class msv implements usv {
    public final String a;
    public final String b;
    public final tv80 c;

    public msv(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msv)) {
            return false;
        }
        msv msvVar = (msv) obj;
        return u890.j(this.a, msvVar.a) && u890.j(this.b, msvVar.b) && this.c.equals(msvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
