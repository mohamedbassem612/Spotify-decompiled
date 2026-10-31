package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hof0 {
    public final String a;
    public final long b;
    public final String c;
    public final List d;

    public hof0(String str, long j, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hof0)) {
            return false;
        }
        hof0 hof0Var = (hof0) obj;
        return u890.j(this.a, hof0Var.a) && this.b == hof0Var.b && u890.j(this.c, hof0Var.c) && this.d.equals(hof0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }
}
