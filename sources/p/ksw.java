package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ksw {
    public final wsw a;
    public final Function0 b;
    public final String c;
    public final ipb1 d;

    public ksw(wsw wswVar, Function0 function0, String str, ipb1 ipb1Var) {
        this.a = wswVar;
        this.b = function0;
        this.c = str;
        this.d = ipb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksw)) {
            return false;
        }
        ksw kswVar = (ksw) obj;
        return this.a.equals(kswVar.a) && this.b.equals(kswVar.b) && u890.j(this.c, kswVar.c) && u890.j(this.d, kswVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(rjx.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ipb1 ipb1Var = this.d;
        return iD + (ipb1Var == null ? 0 : ipb1Var.hashCode());
    }
}
