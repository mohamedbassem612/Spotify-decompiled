package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class lzk1 extends c0l1 {
    public static final kzk1 Companion = new kzk1();
    public final String b;
    public final String c;

    public /* synthetic */ lzk1(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzk1)) {
            return false;
        }
        lzk1 lzk1Var = (lzk1) obj;
        return u890.j(this.b, lzk1Var.b) && u890.j(this.c, lzk1Var.c);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public lzk1(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
