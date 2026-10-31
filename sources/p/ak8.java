package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ak8 {
    public static final zj8 Companion = new zj8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ak8(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, yj8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak8)) {
            return false;
        }
        ak8 ak8Var = (ak8) obj;
        return u890.j(this.a, ak8Var.a) && u890.j(this.b, ak8Var.b) && u890.j(this.c, ak8Var.c) && u890.j(this.d, ak8Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
