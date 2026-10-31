package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yc0 {
    public final boolean a;
    public final Function0 b;
    public final List c;

    public yc0(List list, Function0 function0, boolean z) {
        this.a = z;
        this.b = function0;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return this.a == yc0Var.a && u890.j(this.b, yc0Var.b) && u890.j(this.c, yc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rjx.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
