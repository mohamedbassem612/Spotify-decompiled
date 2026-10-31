package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h87 {
    public final c380 a;
    public final ArrayList b;
    public final String c;

    public h87(c380 c380Var, ArrayList arrayList, String str) {
        this.a = c380Var;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h87)) {
            return false;
        }
        h87 h87Var = (h87) obj;
        return u890.j(this.a, h87Var.a) && this.b.equals(h87Var.b) && u890.j(this.c, h87Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
