package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class owf0 {
    public static final nwf0 Companion = new nwf0();
    public final String a;
    public final String b;

    public /* synthetic */ owf0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, mwf0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owf0)) {
            return false;
        }
        owf0 owf0Var = (owf0) obj;
        return u890.j(this.a, owf0Var.a) && u890.j(this.b, owf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public owf0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
