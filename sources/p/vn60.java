package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vn60 extends iro1 {
    public final String b;
    public final String c;
    public final String d;

    public vn60(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn60)) {
            return false;
        }
        vn60 vn60Var = (vn60) obj;
        return u890.j(this.b, vn60Var.b) && u890.j(this.c, vn60Var.c) && u890.j(this.d, vn60Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
