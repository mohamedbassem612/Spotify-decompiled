package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qg21 {
    public final goe a;
    public final String b;
    public final ArrayList c;

    public qg21(goe goeVar, String str, ArrayList arrayList) {
        this.a = goeVar;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg21)) {
            return false;
        }
        qg21 qg21Var = (qg21) obj;
        return u890.j(this.a, qg21Var.a) && u890.j(this.b, qg21Var.b) && this.c.equals(qg21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
