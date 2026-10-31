package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class adm0 implements fdm0 {
    public static final zcm0 Companion = new zcm0();
    public final String a;
    public final jbf b;

    public /* synthetic */ adm0(int i, String str, jbf jbfVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ycm0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = jbfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adm0)) {
            return false;
        }
        adm0 adm0Var = (adm0) obj;
        return u890.j(this.a, adm0Var.a) && u890.j(this.b, adm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public adm0(String str, jbf jbfVar) {
        this.a = str;
        this.b = jbfVar;
    }
}
