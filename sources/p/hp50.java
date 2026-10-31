package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hp50 {
    public final List a;
    public final boolean b;
    public final Function0 c;

    public hp50(List list, Function0 function0, boolean z) {
        this.a = list;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp50)) {
            return false;
        }
        hp50 hp50Var = (hp50) obj;
        return u890.j(this.a, hp50Var.a) && this.b == hp50Var.b && u890.j(this.c, hp50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
