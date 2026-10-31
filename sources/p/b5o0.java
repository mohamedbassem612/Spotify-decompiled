package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class b5o0 {
    public static final a5o0 Companion = new a5o0();
    public final String a;
    public final String b;

    public /* synthetic */ b5o0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, z4o0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5o0)) {
            return false;
        }
        b5o0 b5o0Var = (b5o0) obj;
        return u890.j(this.a, b5o0Var.a) && u890.j(this.b, b5o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
