package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vfd0 {
    public final String a;
    public final String b;
    public final String c;

    public vfd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd0)) {
            return false;
        }
        vfd0 vfd0Var = (vfd0) obj;
        return u890.j(this.a, vfd0Var.a) && u890.j(this.b, vfd0Var.b) && this.c.equals(vfd0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
