package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w9x {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public w9x(String str, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = function0;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9x)) {
            return false;
        }
        w9x w9xVar = (w9x) obj;
        return u890.j(this.a, w9xVar.a) && u890.j(this.b, w9xVar.b) && u890.j(this.c, w9xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rjx.n(this.a.hashCode() * 31, 31, this.b);
    }
}
