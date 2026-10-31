package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class n6f0 {
    public static final m6f0 Companion = new m6f0();
    public final String a;
    public final String b;

    public /* synthetic */ n6f0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, l6f0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6f0)) {
            return false;
        }
        n6f0 n6f0Var = (n6f0) obj;
        return u890.j(this.a, n6f0Var.a) && u890.j(this.b, n6f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public n6f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
