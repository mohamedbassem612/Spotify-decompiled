package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class q9c1 {
    public static final p9c1 Companion = new p9c1();
    public final String a;
    public final String b;

    public /* synthetic */ q9c1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, o9c1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9c1)) {
            return false;
        }
        q9c1 q9c1Var = (q9c1) obj;
        return u890.j(this.a, q9c1Var.a) && u890.j(this.b, q9c1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
