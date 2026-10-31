package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class fny0 {
    public static final eny0 Companion = new eny0();
    public final String a;
    public final String b;

    public /* synthetic */ fny0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, dny0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fny0)) {
            return false;
        }
        fny0 fny0Var = (fny0) obj;
        return u890.j(this.a, fny0Var.a) && u890.j(this.b, fny0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public fny0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
