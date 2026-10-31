package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cv50 {
    public static final rhc d;
    public static final rhc e;
    public static final rhc f;
    public static final rhc g;
    public static final rhc h;
    public static final rhc i;
    public final rhc a;
    public final rhc b;
    public final int c;

    static {
        rhc rhcVar = new rhc(ryn1.m(":"));
        rhcVar.c = ":";
        d = rhcVar;
        rhc rhcVar2 = new rhc(ryn1.m(":status"));
        rhcVar2.c = ":status";
        e = rhcVar2;
        rhc rhcVar3 = new rhc(ryn1.m(":method"));
        rhcVar3.c = ":method";
        f = rhcVar3;
        rhc rhcVar4 = new rhc(ryn1.m(":path"));
        rhcVar4.c = ":path";
        g = rhcVar4;
        rhc rhcVar5 = new rhc(ryn1.m(":scheme"));
        rhcVar5.c = ":scheme";
        h = rhcVar5;
        rhc rhcVar6 = new rhc(ryn1.m(":authority"));
        rhcVar6.c = ":authority";
        i = rhcVar6;
    }

    public cv50(String str, String str2) {
        rhc rhcVar = new rhc(ryn1.m(str));
        rhcVar.c = str;
        rhc rhcVar2 = new rhc(ryn1.m(str2));
        rhcVar2.c = str2;
        this(rhcVar, rhcVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv50)) {
            return false;
        }
        cv50 cv50Var = (cv50) obj;
        return u890.j(this.a, cv50Var.a) && u890.j(this.b, cv50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.r() + ": " + this.b.r();
    }

    public cv50(rhc rhcVar, rhc rhcVar2) {
        this.a = rhcVar;
        this.b = rhcVar2;
        this.c = rhcVar2.d() + rhcVar.d() + 32;
    }

    public cv50(rhc rhcVar, String str) {
        rhc rhcVar2 = new rhc(ryn1.m(str));
        rhcVar2.c = str;
        this(rhcVar, rhcVar2);
    }
}
