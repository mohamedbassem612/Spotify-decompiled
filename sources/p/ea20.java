package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class ea20 {
    public static final da20 Companion = new da20();
    public final String a;
    public final String b;

    public /* synthetic */ ea20(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ca20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea20)) {
            return false;
        }
        ea20 ea20Var = (ea20) obj;
        return u890.j(this.a, ea20Var.a) && u890.j(this.b, ea20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
