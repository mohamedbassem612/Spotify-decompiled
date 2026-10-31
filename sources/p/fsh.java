package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class fsh {
    public static final esh Companion = new esh();
    public final String a;
    public final String b;

    public /* synthetic */ fsh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, dsh.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsh)) {
            return false;
        }
        fsh fshVar = (fsh) obj;
        return u890.j(this.a, fshVar.a) && u890.j(this.b, fshVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
