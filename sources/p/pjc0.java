package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class pjc0 {
    public static final ojc0 Companion = new ojc0();
    public final String a;
    public final String b;

    public /* synthetic */ pjc0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, njc0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjc0)) {
            return false;
        }
        pjc0 pjc0Var = (pjc0) obj;
        return u890.j(this.a, pjc0Var.a) && u890.j(this.b, pjc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public pjc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
