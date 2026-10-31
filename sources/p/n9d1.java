package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n9d1 {
    public final int a;
    public final Function0 b;
    public final j2i c;

    public n9d1(int i, Function0 function0, hux huxVar) {
        j2i j2iVar = new j2i(1152236047, new g70(huxVar, (byte) 11), true);
        this.a = i;
        this.b = function0;
        this.c = j2iVar;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n9d1) {
            n9d1 n9d1Var = (n9d1) obj;
            return this.a == n9d1Var.a && u890.j(this.b, n9d1Var.b) && this.c == n9d1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + rjx.n(l1d.C(this.a) * 31, 31, this.b);
    }
}
