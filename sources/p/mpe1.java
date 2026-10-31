package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class mpe1 {
    public static final lpe1 Companion = new lpe1();
    public static final znb0[] h = {null, null, null, null, null, null, dm5.S(2, orc1.V0)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ope1 g;

    public /* synthetic */ mpe1(int i, String str, String str2, String str3, String str4, String str5, String str6, ope1 ope1Var) {
        if (63 != (i & 63)) {
            o6p1.t(i, 63, kpe1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i & 64) == 0) {
            this.g = ope1.b;
        } else {
            this.g = ope1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpe1)) {
            return false;
        }
        mpe1 mpe1Var = (mpe1) obj;
        return u890.j(this.a, mpe1Var.a) && u890.j(this.b, mpe1Var.b) && u890.j(this.c, mpe1Var.c) && u890.j(this.d, mpe1Var.d) && u890.j(this.e, mpe1Var.e) && u890.j(this.f, mpe1Var.f) && this.g == mpe1Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
