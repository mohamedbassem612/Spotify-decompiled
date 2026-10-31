package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m6t0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public m6t0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6t0)) {
            return false;
        }
        m6t0 m6t0Var = (m6t0) obj;
        return u890.j(this.a, m6t0Var.a) && u890.j(this.b, m6t0Var.b) && u890.j(this.c, m6t0Var.c) && u890.j(this.d, m6t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
