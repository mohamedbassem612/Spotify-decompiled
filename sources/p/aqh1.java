package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class aqh1 {
    public static final zph1 Companion = new zph1();
    public final String a;
    public final String b;

    public /* synthetic */ aqh1(int i, String str, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, yph1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqh1)) {
            return false;
        }
        aqh1 aqh1Var = (aqh1) obj;
        return u890.j(this.a, aqh1Var.a) && u890.j(this.b, aqh1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public aqh1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
