package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d97 {
    public final yrd a;
    public final List b;

    public d97(yrd yrdVar, List list) {
        this.a = yrdVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d97)) {
            return false;
        }
        d97 d97Var = (d97) obj;
        return this.a.equals(d97Var.a) && this.b.equals(d97Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
