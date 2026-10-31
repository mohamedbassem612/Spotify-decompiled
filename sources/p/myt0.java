package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class myt0 {
    public static final lyt0 Companion = new lyt0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ myt0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, kyt0.a.getDescriptor());
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
        if (!(obj instanceof myt0)) {
            return false;
        }
        myt0 myt0Var = (myt0) obj;
        return u890.j(this.a, myt0Var.a) && u890.j(this.b, myt0Var.b) && u890.j(this.c, myt0Var.c) && u890.j(this.d, myt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
