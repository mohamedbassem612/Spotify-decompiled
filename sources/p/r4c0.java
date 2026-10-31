package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class r4c0 {
    public static final q4c0 Companion = new q4c0();
    public final String a;
    public final String b;

    public /* synthetic */ r4c0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, p4c0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4c0)) {
            return false;
        }
        r4c0 r4c0Var = (r4c0) obj;
        return u890.j(this.a, r4c0Var.a) && u890.j(this.b, r4c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
