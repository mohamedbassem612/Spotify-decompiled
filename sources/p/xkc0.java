package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xkc0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Function0 e;

    public xkc0(int i, int i2, String str, String str2, Function0 function0) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkc0)) {
            return false;
        }
        xkc0 xkc0Var = (xkc0) obj;
        return this.a == xkc0Var.a && this.b == xkc0Var.b && this.c.equals(xkc0Var.c) && this.d.equals(xkc0Var.d) && u890.j(this.e, xkc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
