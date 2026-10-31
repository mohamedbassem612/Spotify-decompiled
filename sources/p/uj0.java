package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uj0 {
    public final String a;
    public final ji0 b;
    public final int c;
    public final String d;
    public final Function0 e;

    public uj0(String str, ji0 ji0Var, int i, String str2, Function0 function0) {
        this.a = str;
        this.b = ji0Var;
        this.c = i;
        this.d = str2;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return this.a.equals(uj0Var.a) && this.b.equals(uj0Var.b) && this.c == uj0Var.c && this.d.equals(uj0Var.d) && u890.j(this.e, uj0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        Function0 function0 = this.e;
        return iD + (function0 == null ? 0 : function0.hashCode());
    }
}
