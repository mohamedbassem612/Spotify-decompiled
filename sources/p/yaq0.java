package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yaq0 {
    public final String a;
    public final String b;
    public final String c;

    public yaq0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaq0)) {
            return false;
        }
        yaq0 yaq0Var = (yaq0) obj;
        return this.a.equals(yaq0Var.a) && this.b.equals(yaq0Var.b) && u890.j(this.c, yaq0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
