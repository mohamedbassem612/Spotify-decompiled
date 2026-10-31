package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class gpe1 {
    public static final fpe1 Companion = new fpe1();
    public final String a;
    public final String b;

    public /* synthetic */ gpe1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, epe1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe1)) {
            return false;
        }
        gpe1 gpe1Var = (gpe1) obj;
        return u890.j(this.a, gpe1Var.a) && u890.j(this.b, gpe1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
