package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aei0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public aei0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aei0)) {
            return false;
        }
        aei0 aei0Var = (aei0) obj;
        return this.a.equals(aei0Var.a) && this.b.equals(aei0Var.b) && this.c.equals(aei0Var.c) && this.d.equals(aei0Var.d) && this.e.equals(aei0Var.e) && this.f.equals(aei0Var.f) && this.g.equals(aei0Var.g) && this.h.equals(aei0Var.h) && this.i.equals(aei0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
