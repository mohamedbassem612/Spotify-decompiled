package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxz0 {
    public final List a;
    public final int b;
    public final String c;
    public final String d;

    public jxz0(int i, String str, String str2, List list) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxz0)) {
            return false;
        }
        jxz0 jxz0Var = (jxz0) obj;
        return this.a.equals(jxz0Var.a) && this.b == jxz0Var.b && this.c.equals(jxz0Var.c) && u890.j(this.d, jxz0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
