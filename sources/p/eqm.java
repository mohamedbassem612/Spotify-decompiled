package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eqm {
    public final String a;
    public final era b;
    public final int c;
    public final Function0 d;

    public eqm(String str, era eraVar, int i, Function0 function0) {
        this.a = str;
        this.b = eraVar;
        this.c = i;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqm)) {
            return false;
        }
        eqm eqmVar = (eqm) obj;
        return u890.j(this.a, eqmVar.a) && this.b.equals(eqmVar.b) && this.c == eqmVar.c && u890.j(this.d, eqmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, x0d.f(this.a.hashCode() * 31, 31, this.b.a), 31);
    }
}
