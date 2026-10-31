package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class izk1 extends c0l1 {
    public static final hzk1 Companion = new hzk1();
    public final int b;
    public final String c;
    public final String d;

    public /* synthetic */ izk1(int i, String str, int i2, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, gzk1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izk1)) {
            return false;
        }
        izk1 izk1Var = (izk1) obj;
        return this.b == izk1Var.b && u890.j(this.c, izk1Var.c) && u890.j(this.d, izk1Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public izk1(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }
}
