package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class wd61 {
    public static final vd61 Companion = new vd61();
    public final String a;
    public final String b;

    public /* synthetic */ wd61(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ud61.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd61)) {
            return false;
        }
        wd61 wd61Var = (wd61) obj;
        return u890.j(this.a, wd61Var.a) && u890.j(this.b, wd61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
