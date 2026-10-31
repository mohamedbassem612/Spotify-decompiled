package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hyu {
    public final int a;
    public final int b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;

    public hyu(int i, int i2, Function0 function0, Function0 function1, Function0 function2) {
        this.a = i;
        this.b = i2;
        this.c = function0;
        this.d = function1;
        this.e = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyu)) {
            return false;
        }
        hyu hyuVar = (hyu) obj;
        return this.a == hyuVar.a && this.b == hyuVar.b && u890.j(this.c, hyuVar.c) && u890.j(this.d, hyuVar.d) && u890.j(this.e, hyuVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rjx.n(rjx.n(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }
}
