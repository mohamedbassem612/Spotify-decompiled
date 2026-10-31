package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jmt {
    public final kio a;
    public final int b;
    public final List c;

    public jmt(kio kioVar, int i, List list) {
        this.a = kioVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmt)) {
            return false;
        }
        jmt jmtVar = (jmt) obj;
        return this.a.equals(jmtVar.a) && this.b == jmtVar.b && u890.j(this.c, jmtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
