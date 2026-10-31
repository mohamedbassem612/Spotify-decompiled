package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class oeb0 {
    public static final neb0 Companion = new neb0();
    public final String a;
    public final seb0 b;

    public /* synthetic */ oeb0(int i, String str, seb0 seb0Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, meb0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = seb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeb0)) {
            return false;
        }
        oeb0 oeb0Var = (oeb0) obj;
        return u890.j(this.a, oeb0Var.a) && u890.j(this.b, oeb0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public oeb0(seb0 seb0Var) {
        this.a = "selected-language";
        this.b = seb0Var;
    }
}
