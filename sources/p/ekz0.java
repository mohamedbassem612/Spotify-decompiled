package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ekz0 {
    public final String a;
    public final String b;
    public final iu30 c;

    public ekz0(String str, String str2, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekz0)) {
            return false;
        }
        ekz0 ekz0Var = (ekz0) obj;
        return this.a.equals(ekz0Var.a) && u890.j(this.b, ekz0Var.b) && u890.j(this.c, ekz0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
