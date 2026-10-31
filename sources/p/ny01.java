package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class ny01 {
    public static final my01 Companion = new my01();
    public final String a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ ny01(int i, String str, String str2, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny01)) {
            return false;
        }
        ny01 ny01Var = (ny01) obj;
        return u890.j(this.a, ny01Var.a) && u890.j(this.b, ny01Var.b) && u890.j(this.c, ny01Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public ny01(Boolean bool, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }
}
