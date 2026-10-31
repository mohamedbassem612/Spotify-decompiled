package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class yt0 {
    public static final xt0 Companion = new xt0();
    public final String a;
    public final String b;

    public /* synthetic */ yt0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, wt0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt0)) {
            return false;
        }
        yt0 yt0Var = (yt0) obj;
        return u890.j(this.a, yt0Var.a) && u890.j(this.b, yt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public yt0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
