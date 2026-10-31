package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o9c {
    public final String a;
    public final ArrayList b;
    public final hvl1 c;

    public o9c(String str, ArrayList arrayList, hvl1 hvl1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9c)) {
            return false;
        }
        o9c o9cVar = (o9c) obj;
        return this.a.equals(o9cVar.a) && this.b.equals(o9cVar.b) && this.c.equals(o9cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
