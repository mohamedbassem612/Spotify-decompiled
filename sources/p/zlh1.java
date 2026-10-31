package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class zlh1 {
    public static final ylh1 Companion = new ylh1();
    public final String a;
    public final String b;

    public /* synthetic */ zlh1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, xlh1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlh1)) {
            return false;
        }
        zlh1 zlh1Var = (zlh1) obj;
        return u890.j(this.a, zlh1Var.a) && u890.j(this.b, zlh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
