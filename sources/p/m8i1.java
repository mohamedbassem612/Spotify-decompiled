package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class m8i1 {
    public static final l8i1 Companion = new l8i1();
    public final String a;
    public final String b;

    public /* synthetic */ m8i1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, k8i1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8i1)) {
            return false;
        }
        m8i1 m8i1Var = (m8i1) obj;
        return u890.j(this.a, m8i1Var.a) && u890.j(this.b, m8i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
