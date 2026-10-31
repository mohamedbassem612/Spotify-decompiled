package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class puc1 {
    public static final ouc1 Companion = new ouc1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ puc1(String str, int i, String str2, String str3, boolean z, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, nuc1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.e;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puc1)) {
            return false;
        }
        puc1 puc1Var = (puc1) obj;
        return u890.j(this.a, puc1Var.a) && u890.j(this.b, puc1Var.b) && u890.j(this.c, puc1Var.c) && u890.j(this.d, puc1Var.d) && this.e == puc1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
