package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class owx0 {
    public final List a;
    public final Function0 b;

    public owx0(List list, Function0 function0) {
        this.a = list;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owx0)) {
            return false;
        }
        owx0 owx0Var = (owx0) obj;
        return this.a.equals(owx0Var.a) && u890.j(this.b, owx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
