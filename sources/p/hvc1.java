package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hvc1 {
    public final String a;
    public final int b;
    public final Function0 c;

    public hvc1(int i, String str, Function0 function0) {
        this.a = str;
        this.b = i;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvc1)) {
            return false;
        }
        hvc1 hvc1Var = (hvc1) obj;
        return u890.j(this.a, hvc1Var.a) && this.b == hvc1Var.b && u890.j(this.c, hvc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
