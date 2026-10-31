package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class za6 {
    public final long a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public za6(int i, int i2, long j, String str, String str2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof za6) {
                za6 za6Var = (za6) obj;
                if (this.a == za6Var.a && this.b == za6Var.b && this.c == za6Var.c) {
                    String str = za6Var.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && u890.j(this.e, za6Var.e)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, ab80.k(this.b, Long.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
