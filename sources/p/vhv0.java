package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vhv0 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dq70 e;
    public final dq70 f;
    public final long g;
    public final String h;
    public final String i;

    public vhv0(String str, String str2, String str3, String str4, dq70 dq70Var, dq70 dq70Var2, long j, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dq70Var;
        this.f = dq70Var2;
        this.g = j;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhv0)) {
            return false;
        }
        vhv0 vhv0Var = (vhv0) obj;
        return this.a.equals(vhv0Var.a) && this.b.equals(vhv0Var.b) && this.c.equals(vhv0Var.c) && this.d.equals(vhv0Var.d) && this.e.equals(vhv0Var.e) && this.f.equals(vhv0Var.f) && this.g == vhv0Var.g && this.h.equals(vhv0Var.h) && this.i.equals(vhv0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.f((this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, this.g, 31), 31, this.h);
    }
}
