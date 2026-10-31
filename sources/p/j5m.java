package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j5m extends e6m {
    public final String a;
    public final h290 b;
    public final ArrayList c;

    public j5m(String str, h290 h290Var, ArrayList arrayList) {
        this.a = str;
        this.b = h290Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5m)) {
            return false;
        }
        j5m j5mVar = (j5m) obj;
        return u890.j(this.a, j5mVar.a) && this.b.equals(j5mVar.b) && this.c.equals(j5mVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + kk0.g(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
