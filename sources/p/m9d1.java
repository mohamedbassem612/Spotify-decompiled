package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9d1 {
    public final int a;
    public final ads b;
    public final Function0 c;

    public m9d1(int i, ads adsVar, Function0 function0) {
        this.a = i;
        this.b = adsVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d1)) {
            return false;
        }
        m9d1 m9d1Var = (m9d1) obj;
        return this.a == m9d1Var.a && u890.j(this.b, m9d1Var.b) && u890.j(this.c, m9d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
