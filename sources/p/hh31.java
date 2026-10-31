package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class hh31 {
    public static final gh31 Companion = new gh31();
    public final String a;
    public final yg51 b;
    public final String c;

    public /* synthetic */ hh31(int i, String str, yg51 yg51Var, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = yg51Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh31)) {
            return false;
        }
        hh31 hh31Var = (hh31) obj;
        return u890.j(this.a, hh31Var.a) && u890.j(this.b, hh31Var.b) && u890.j(this.c, hh31Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        yg51 yg51Var = this.b;
        int iHashCode2 = (iHashCode + (yg51Var == null ? 0 : yg51Var.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
