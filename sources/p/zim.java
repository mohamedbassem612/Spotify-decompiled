package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zim {
    public final bjm a;
    public final Function0 b;

    public zim(bjm bjmVar, Function0 function0) {
        this.a = bjmVar;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zim)) {
            return false;
        }
        zim zimVar = (zim) obj;
        return u890.j(this.a, zimVar.a) && this.b.equals(zimVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
