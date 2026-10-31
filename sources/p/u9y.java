package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u9y {
    public final String a;
    public final long b;
    public final String c;
    public final List d;

    public u9y(String str, long j, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9y)) {
            return false;
        }
        u9y u9yVar = (u9y) obj;
        return u890.j(this.a, u9yVar.a) && this.b == u9yVar.b && u890.j(this.c, u9yVar.c) && this.d.equals(u9yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }
}
