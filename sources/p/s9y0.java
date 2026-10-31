package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s9y0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public s9y0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9y0)) {
            return false;
        }
        s9y0 s9y0Var = (s9y0) obj;
        return u890.j(this.a, s9y0Var.a) && u890.j(this.b, s9y0Var.b) && u890.j(this.c, s9y0Var.c) && u890.j(this.d, s9y0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
