package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lgm {
    public final igm a;
    public final yim b;
    public final Function0 c;

    public lgm(igm igmVar, yim yimVar, Function0 function0) {
        this.a = igmVar;
        this.b = yimVar;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgm)) {
            return false;
        }
        lgm lgmVar = (lgm) obj;
        return u890.j(this.a, lgmVar.a) && u890.j(this.b, lgmVar.b) && u890.j(this.c, lgmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yim yimVar = this.b;
        return this.c.hashCode() + ((iHashCode + (yimVar == null ? 0 : yimVar.hashCode())) * 31);
    }
}
