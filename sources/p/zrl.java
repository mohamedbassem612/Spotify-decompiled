package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/zrl;", "Lp/uim0;", "Lp/asl;", "glimmer"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class zrl extends uim0 {
    public final long a;

    public zrl(long j) {
        this.a = j;
    }

    public final pim0 a() {
        return new asl(this.a);
    }

    public final void b(pim0 pim0Var) {
        ((asl) pim0Var).O0.setValue(new u7h(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrl)) {
            return false;
        }
        long j = ((zrl) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }
}
