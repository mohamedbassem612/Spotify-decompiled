package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class vhx0 {
    public static final uhx0 Companion = new uhx0();
    public final String a;
    public final String b;

    public /* synthetic */ vhx0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, thx0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhx0)) {
            return false;
        }
        vhx0 vhx0Var = (vhx0) obj;
        return u890.j(this.a, vhx0Var.a) && u890.j(this.b, vhx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
