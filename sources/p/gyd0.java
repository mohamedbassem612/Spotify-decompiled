package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gyd0 implements azd0 {
    public final boolean a;
    public final String b;
    public final String c;

    public gyd0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyd0)) {
            return false;
        }
        gyd0 gyd0Var = (gyd0) obj;
        return this.a == gyd0Var.a && this.b.equals(gyd0Var.b) && u890.j(this.c, gyd0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return (iD + (str == null ? 0 : str.hashCode())) * 31;
    }
}
