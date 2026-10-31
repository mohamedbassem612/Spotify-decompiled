package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uk10 implements vk10 {
    public final String a;
    public final String b;
    public final String c;

    public uk10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk10)) {
            return false;
        }
        uk10 uk10Var = (uk10) obj;
        return this.a.equals(uk10Var.a) && this.b.equals(uk10Var.b) && u890.j(this.c, uk10Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
