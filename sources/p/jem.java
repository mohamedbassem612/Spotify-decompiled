package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jem {
    public final String a;
    public final mr20 b;
    public final Function0 c;
    public final Function0 d;

    public jem(String str, mr20 mr20Var, Function0 function0, Function0 function1) {
        this.a = str;
        this.b = mr20Var;
        this.c = function0;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jem)) {
            return false;
        }
        jem jemVar = (jem) obj;
        return u890.j(this.a, jemVar.a) && u890.j(this.b, jemVar.b) && u890.j(this.c, jemVar.c) && u890.j(this.d, jemVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rjx.n(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false), 31, this.c);
    }
}
