package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class eyy0 {
    public static final dyy0 Companion = new dyy0();
    public final String a;
    public final String b;

    public /* synthetic */ eyy0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, cyy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyy0)) {
            return false;
        }
        eyy0 eyy0Var = (eyy0) obj;
        return u890.j(this.a, eyy0Var.a) && u890.j(this.b, eyy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public eyy0(String str) {
        this.a = "Android";
        this.b = str;
    }
}
