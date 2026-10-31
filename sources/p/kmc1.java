package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class kmc1 {
    public static final jmc1 Companion = new jmc1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ kmc1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, imc1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc1)) {
            return false;
        }
        kmc1 kmc1Var = (kmc1) obj;
        return u890.j(this.a, kmc1Var.a) && u890.j(this.b, kmc1Var.b) && u890.j(this.c, kmc1Var.c) && u890.j(this.d, kmc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public kmc1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
