package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tob {
    public final sob a;
    public final ArrayList b;
    public final long c;

    public tob(sob sobVar, ArrayList arrayList, long j) {
        this.a = sobVar;
        this.b = arrayList;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tob)) {
            return false;
        }
        tob tobVar = (tob) obj;
        return this.a.equals(tobVar.a) && this.b.equals(tobVar.b) && jfv.f(this.c, tobVar.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.a.hashCode() * 31, 31);
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.c) + iF;
    }
}
