package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class rzk1 extends c0l1 {
    public static final qzk1 Companion = new qzk1();
    public final String b;
    public final String c;

    public /* synthetic */ rzk1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, pzk1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzk1)) {
            return false;
        }
        rzk1 rzk1Var = (rzk1) obj;
        return u890.j(this.b, rzk1Var.b) && u890.j(this.c, rzk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public rzk1(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
