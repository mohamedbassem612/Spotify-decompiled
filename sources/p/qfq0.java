package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qfq0 {
    public final int a;
    public final boolean b;
    public final Function0 c;

    public qfq0(int i, Function0 function0, boolean z) {
        this.a = i;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfq0)) {
            return false;
        }
        qfq0 qfq0Var = (qfq0) obj;
        return this.a == qfq0Var.a && this.b == qfq0Var.b && u890.j(this.c, qfq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
