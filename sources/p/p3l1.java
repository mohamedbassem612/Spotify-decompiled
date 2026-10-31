package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class p3l1 extends l4l1 {
    public static final o3l1 Targets = new o3l1();
    public final String b;
    public final String c;

    public /* synthetic */ p3l1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, n3l1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3l1)) {
            return false;
        }
        p3l1 p3l1Var = (p3l1) obj;
        return u890.j(this.b, p3l1Var.b) && u890.j(this.c, p3l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
