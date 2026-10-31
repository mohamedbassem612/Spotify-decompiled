package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxa0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final dxr0 g;
    public final String h;
    public final Integer i;

    public zxa0(String str, String str2, String str3, String str4, String str5, String str6, dxr0 dxr0Var, String str7, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = dxr0Var;
        this.h = str7;
        this.i = num;
    }

    public final Integer a() {
        return this.i;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxa0)) {
            return false;
        }
        zxa0 zxa0Var = (zxa0) obj;
        return this.a.equals(zxa0Var.a) && this.b.equals(zxa0Var.b) && this.c.equals(zxa0Var.c) && this.d.equals(zxa0Var.d) && this.e.equals(zxa0Var.e) && this.f.equals(zxa0Var.f) && this.g.equals(zxa0Var.g) && this.h.equals(zxa0Var.h) && this.i.equals(zxa0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d((this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }
}
