package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oyi1 extends yoi1 {
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Date n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30p;

    public oyi1(String str, String str2, String str3, String str4, String str5, String str6, Date date, String str7, String str8) {
        super((byte) 21);
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = date;
        this.o = str7;
        this.f30p = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyi1)) {
            return false;
        }
        oyi1 oyi1Var = (oyi1) obj;
        return this.h.equals(oyi1Var.h) && this.i.equals(oyi1Var.i) && this.j.equals(oyi1Var.j) && u890.j(this.k, oyi1Var.k) && u890.j(this.l, oyi1Var.l) && this.m.equals(oyi1Var.m) && this.n.equals(oyi1Var.n) && this.o.equals(oyi1Var.o) && this.f30p.equals(oyi1Var.f30p);
    }

    public final int hashCode() {
        return this.f30p.hashCode() + cy30.d((this.n.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.h.hashCode() * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o);
    }
}
