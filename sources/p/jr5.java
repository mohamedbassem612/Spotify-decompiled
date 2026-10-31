package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class jr5 extends cv5 {
    public static final ir5 Companion = new ir5();
    public String b;
    public String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr5)) {
            return false;
        }
        jr5 jr5Var = (jr5) obj;
        return u890.j(this.b, jr5Var.b) && u890.j(this.c, jr5Var.c);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
