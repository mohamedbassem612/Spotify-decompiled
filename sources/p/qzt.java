package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qzt {
    public final bxt a;
    public final iwc1 b;
    public final Set c;
    public final long d;
    public final long e;

    public qzt(bxt bxtVar, iwc1 iwc1Var, Set set, long j, long j2) {
        this.a = bxtVar;
        this.b = iwc1Var;
        this.c = set;
        this.d = j;
        this.e = j2;
    }

    public static qzt a(qzt qztVar, bxt bxtVar, iwc1 iwc1Var, Set set, long j, long j2, int i) {
        if ((i & 1) != 0) {
            bxtVar = qztVar.a;
        }
        bxt bxtVar2 = bxtVar;
        if ((i & 2) != 0) {
            iwc1Var = qztVar.b;
        }
        iwc1 iwc1Var2 = iwc1Var;
        if ((i & 4) != 0) {
            set = qztVar.c;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            j = qztVar.d;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = qztVar.e;
        }
        return new qzt(bxtVar2, iwc1Var2, set2, j3, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzt)) {
            return false;
        }
        qzt qztVar = (qzt) obj;
        return u890.j(this.a, qztVar.a) && this.b == qztVar.b && u890.j(this.c, qztVar.c) && this.d == qztVar.d && this.e == qztVar.e;
    }

    public final int hashCode() {
        bxt bxtVar = this.a;
        int iHashCode = (bxtVar == null ? 0 : bxtVar.hashCode()) * 31;
        iwc1 iwc1Var = this.b;
        return Long.hashCode(this.e) + cy30.f(gvg.c((iHashCode + (iwc1Var != null ? iwc1Var.hashCode() : 0)) * 31, 31, this.c), this.d, 31);
    }
}
