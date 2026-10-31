package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f1k0 implements k1k0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public f1k0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1k0)) {
            return false;
        }
        f1k0 f1k0Var = (f1k0) obj;
        return u890.j(this.a, f1k0Var.a) && u890.j(this.b, f1k0Var.b) && u890.j(this.c, f1k0Var.c) && u890.j(this.d, f1k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
