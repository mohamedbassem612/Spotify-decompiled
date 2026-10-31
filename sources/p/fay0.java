package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fay0 extends kay0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public fay0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fay0)) {
            return false;
        }
        fay0 fay0Var = (fay0) obj;
        return u890.j(this.a, fay0Var.a) && u890.j(this.b, fay0Var.b) && u890.j(this.c, fay0Var.c) && u890.j(this.d, fay0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
