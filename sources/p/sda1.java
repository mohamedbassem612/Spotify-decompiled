package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sda1 {
    public final boolean a;
    public final xca1 b;
    public final String c;

    public sda1(boolean z, xca1 xca1Var, String str) {
        this.a = z;
        this.b = xca1Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sda1)) {
            return false;
        }
        sda1 sda1Var = (sda1) obj;
        if (this.a != sda1Var.a || !u890.j(this.b, sda1Var.b)) {
            return false;
        }
        String str = sda1Var.c;
        String str2 = this.c;
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
        return zEquals;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
