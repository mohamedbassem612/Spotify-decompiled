package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rsn {
    public final List a;
    public final ega1 b;
    public final boolean c;

    public rsn(smc0 smc0Var, ega1 ega1Var, boolean z) {
        this.a = smc0Var;
        this.b = ega1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsn)) {
            return false;
        }
        rsn rsnVar = (rsn) obj;
        return this.a.equals(rsnVar.a) && u890.j(this.b, rsnVar.b) && this.c == rsnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
