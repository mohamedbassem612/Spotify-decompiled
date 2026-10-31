package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tuc1 {
    public final String a;
    public final int b;
    public final Function0 c;
    public final Function0 d;

    public tuc1(int i, String str, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = i;
        this.c = function0;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuc1)) {
            return false;
        }
        tuc1 tuc1Var = (tuc1) obj;
        return u890.j(this.a, tuc1Var.a) && this.b == tuc1Var.b && u890.j(this.c, tuc1Var.c) && u890.j(this.d, tuc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rjx.n(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
