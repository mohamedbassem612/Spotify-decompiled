package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class sb20 {
    public static final rb20 Companion = new rb20();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ sb20(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, qb20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb20)) {
            return false;
        }
        sb20 sb20Var = (sb20) obj;
        return u890.j(this.a, sb20Var.a) && u890.j(this.b, sb20Var.b) && this.c == sb20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
