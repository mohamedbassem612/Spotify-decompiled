package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dtf {
    public final tkf a;
    public final List b;
    public final boolean c;
    public final int d;

    public dtf(tkf tkfVar, List list, boolean z, int i) {
        this.a = tkfVar;
        this.b = list;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtf)) {
            return false;
        }
        dtf dtfVar = (dtf) obj;
        return u890.j(this.a, dtfVar.a) && u890.j(this.b, dtfVar.b) && this.c == dtfVar.c && this.d == dtfVar.d;
    }

    public final int hashCode() {
        tkf tkfVar = this.a;
        return Integer.hashCode(this.d) + xcg1.g(f4i1.b((tkfVar == null ? 0 : tkfVar.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
