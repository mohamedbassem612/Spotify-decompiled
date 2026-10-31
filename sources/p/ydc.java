package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ydc {
    public static final udc Companion = new udc();
    public final q9c1 a;
    public final String b;

    public /* synthetic */ ydc(int i, q9c1 q9c1Var, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, tdc.a.getDescriptor());
            throw null;
        }
        this.a = q9c1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydc)) {
            return false;
        }
        ydc ydcVar = (ydc) obj;
        return u890.j(this.a, ydcVar.a) && u890.j(this.b, ydcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
