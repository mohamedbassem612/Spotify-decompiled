package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gwb {
    public final fwb a;
    public final long b;
    public final long c;
    public final Function0 d;

    public gwb(fwb fwbVar, long j, long j2, Function0 function0) {
        this.a = fwbVar;
        this.b = j;
        this.c = j2;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwb)) {
            return false;
        }
        gwb gwbVar = (gwb) obj;
        if (this.a != gwbVar.a) {
            return false;
        }
        long j = gwbVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && z4h1.b(this.c, gwbVar.c) && u890.j(this.d, gwbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return this.d.hashCode() + cy30.f(cy30.f(iHashCode, this.b, 31), this.c, 31);
    }
}
