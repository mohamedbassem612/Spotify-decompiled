package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hc61 {
    public final boolean a;
    public final crb b;
    public final List c;

    public hc61(boolean z, crb crbVar, List list) {
        this.a = z;
        this.b = crbVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc61)) {
            return false;
        }
        hc61 hc61Var = (hc61) obj;
        return this.a == hc61Var.a && this.b.equals(hc61Var.b) && u890.j(this.c, hc61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
