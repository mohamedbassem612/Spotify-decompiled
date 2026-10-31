package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class bww0 {
    public static final yvw0 Companion = new yvw0();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ bww0(int i, String str, String str2, boolean z) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, uvw0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bww0)) {
            return false;
        }
        bww0 bww0Var = (bww0) obj;
        return u890.j(this.a, bww0Var.a) && this.b == bww0Var.b && u890.j(this.c, bww0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public bww0(String str, String str2) {
        this.a = str;
        this.b = true;
        this.c = str2;
    }
}
