package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gbx {
    public final dzo1 a;
    public final Function0 b;
    public final String c;
    public final idd1 d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public gbx(dzo1 dzo1Var, Function0 function0) throws NoWhenBranchMatchedException {
        String str;
        this.a = dzo1Var;
        this.b = function0;
        if (dzo1Var instanceof y50) {
            str = ((y50) dzo1Var).c;
        } else {
            if (!dzo1Var.equals(z50.c)) {
                eg.o();
                throw null;
            }
            str = "";
        }
        this.c = str;
        this.d = new idd1(new d4e(this, (byte) 24));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbx)) {
            return false;
        }
        gbx gbxVar = (gbx) obj;
        return u890.j(this.a, gbxVar.a) && u890.j(this.b, gbxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
