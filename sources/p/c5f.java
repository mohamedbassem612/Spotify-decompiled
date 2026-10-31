package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c5f implements d5f {
    public final String a;
    public final boolean b;
    public final jwm c;
    public final List d;

    public c5f(String str, boolean z, jwm jwmVar, List list) {
        this.a = str;
        this.b = z;
        this.c = jwmVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5f)) {
            return false;
        }
        c5f c5fVar = (c5f) obj;
        return u890.j(this.a, c5fVar.a) && this.b == c5fVar.b && u890.j(this.c, c5fVar.c) && this.d.equals(c5fVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
    }
}
