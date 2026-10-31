package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xyc extends bzc {
    public final long b;
    public final ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyc(long j, ArrayList arrayList) {
        super(mp10.p(), arrayList);
        pr31 pr31Var = pr31.r;
        this.b = j;
        this.c = arrayList;
    }

    @Override // p.bzc
    public final List b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyc)) {
            return false;
        }
        xyc xycVar = (xyc) obj;
        return this.b == xycVar.b && this.c.equals(xycVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }
}
