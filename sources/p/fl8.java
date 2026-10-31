package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class fl8 {
    public static final el8 Companion = new el8();
    public final String a;
    public final String b;
    public final String c;
    public final ak8 d;

    public /* synthetic */ fl8(int i, String str, String str2, String str3, ak8 ak8Var) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, dl8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ak8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl8)) {
            return false;
        }
        fl8 fl8Var = (fl8) obj;
        return u890.j(this.a, fl8Var.a) && u890.j(this.b, fl8Var.b) && u890.j(this.c, fl8Var.c) && u890.j(this.d, fl8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
