package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a90 implements c90 {
    public final String a;
    public final String b;
    public final Function0 c;
    public final hux d;
    public final max e;
    public final ksl f;

    public a90(String str, String str2, Function0 function0, hux huxVar, max maxVar, jsl jslVar, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        huxVar = (i & 8) != 0 ? null : huxVar;
        maxVar = (i & 32) != 0 ? jax.a : maxVar;
        jslVar = (i & 64) != 0 ? isl.a : jslVar;
        this.a = str;
        this.b = str2;
        this.c = function0;
        this.d = huxVar;
        this.e = maxVar;
        this.f = jslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a90)) {
            return false;
        }
        a90 a90Var = (a90) obj;
        return u890.j(this.a, a90Var.a) && u890.j(this.b, a90Var.b) && u890.j(this.c, a90Var.c) && u890.j(this.d, a90Var.d) && this.e.equals(a90Var.e) && this.f.equals(a90Var.f);
    }

    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iN = rjx.n((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        hux huxVar = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iN + (huxVar != null ? huxVar.hashCode() : 0)) * 961)) * 31);
    }
}
