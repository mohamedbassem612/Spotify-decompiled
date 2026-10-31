package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oqc0 {
    public final String a;
    public final int b;
    public final List c;

    public oqc0(String str, List list, int i) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqc0)) {
            return false;
        }
        oqc0 oqc0Var = (oqc0) obj;
        return u890.j(this.a, oqc0Var.a) && this.b == oqc0Var.b && this.c.equals(oqc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
