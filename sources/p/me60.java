package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class me60 {
    public final String a;
    public final String b;
    public final ie60 c;
    public final cu70 d;

    public me60(String str, String str2, ie60 ie60Var, cu70 cu70Var) {
        this.a = str;
        this.b = str2;
        this.c = ie60Var;
        this.d = cu70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me60)) {
            return false;
        }
        me60 me60Var = (me60) obj;
        return u890.j(this.a, me60Var.a) && this.b.equals(me60Var.b) && this.c.equals(me60Var.c) && this.d.equals(me60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
