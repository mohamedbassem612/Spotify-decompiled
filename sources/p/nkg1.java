package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nkg1 {
    public final String a;
    public final String b;
    public final Function0 c;

    public nkg1(String str, String str2, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkg1)) {
            return false;
        }
        nkg1 nkg1Var = (nkg1) obj;
        return u890.j(this.a, nkg1Var.a) && u890.j(this.b, nkg1Var.b) && u890.j(this.c, nkg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
