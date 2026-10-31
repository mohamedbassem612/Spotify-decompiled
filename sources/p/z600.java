package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z600 {
    public final String a;
    public final String b;
    public final long c;
    public final Map d;

    public z600(String str, String str2, long j, Map map) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z600)) {
            return false;
        }
        z600 z600Var = (z600) obj;
        return this.a.equals(z600Var.a) && u890.j(this.b, z600Var.b) && this.c == z600Var.c && u890.j(this.d, z600Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
