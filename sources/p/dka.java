package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dka {
    public final List a;
    public final p60 b;
    public final String c;

    public /* synthetic */ dka(List list, p60 p60Var, int i) {
        this((i & 1) != 0 ? z6x.a : list, (i & 2) != 0 ? new p60((String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 0, (k20) null, (String) null, 4095) : p60Var, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dka)) {
            return false;
        }
        dka dkaVar = (dka) obj;
        return u890.j(this.a, dkaVar.a) && u890.j(this.b, dkaVar.b) && u890.j(this.c, dkaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public dka(List list, p60 p60Var, String str) {
        this.a = list;
        this.b = p60Var;
        this.c = str;
    }
}
