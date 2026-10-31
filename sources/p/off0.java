package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class off0 {
    public static final nff0 Companion = new nff0();
    public static final znb0[] d = {null, null, dm5.S(2, i0f0.P0)};
    public final long a;
    public final String b;
    public final List c;

    public /* synthetic */ off0(int i, long j, String str, List list) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, mff0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof off0)) {
            return false;
        }
        off0 off0Var = (off0) obj;
        return this.a == off0Var.a && u890.j(this.b, off0Var.b) && u890.j(this.c, off0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public off0(long j, String str, ArrayList arrayList) {
        this.a = j;
        this.b = str;
        this.c = arrayList;
    }
}
