package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ehz {
    public final Function0 a;
    public final Function0 b;

    public ehz(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehz)) {
            return false;
        }
        ehz ehzVar = (ehz) obj;
        return u890.j(this.a, ehzVar.a) && u890.j(this.b, ehzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
