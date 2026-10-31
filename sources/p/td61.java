package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class td61 {
    public static final sd61 Companion = new sd61();
    public final String a;
    public final euq0 b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ td61(int i, String str, euq0 euq0Var, String str2, String str3, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = euq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td61)) {
            return false;
        }
        td61 td61Var = (td61) obj;
        return u890.j(this.a, td61Var.a) && u890.j(this.b, td61Var.b) && u890.j(this.c, td61Var.c) && u890.j(this.d, td61Var.d) && this.e == td61Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        euq0 euq0Var = this.b;
        int iHashCode2 = (iHashCode + (euq0Var == null ? 0 : euq0Var.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
