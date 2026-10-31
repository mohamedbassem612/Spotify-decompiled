package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zhm {
    public final String a;
    public final String b;
    public final ip80 c;
    public final int d;
    public final Function0 e;

    public zhm(String str, String str2, ip80 ip80Var, int i, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = ip80Var;
        this.d = i;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhm)) {
            return false;
        }
        zhm zhmVar = (zhm) obj;
        return this.a.equals(zhmVar.a) && this.b.equals(zhmVar.b) && this.c.equals(zhmVar.c) && this.d == zhmVar.d && this.e.equals(zhmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }
}
