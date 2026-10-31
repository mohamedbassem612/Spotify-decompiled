package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fbd {
    public final piz a;
    public final boolean b;
    public final Intent c;

    public fbd(piz pizVar, boolean z, Intent intent) {
        this.a = pizVar;
        this.b = z;
        this.c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd)) {
            return false;
        }
        fbd fbdVar = (fbd) obj;
        return u890.j(this.a, fbdVar.a) && this.b == fbdVar.b && u890.j(this.c, fbdVar.c);
    }

    public final int hashCode() {
        piz pizVar = this.a;
        int iG = xcg1.g((pizVar == null ? 0 : pizVar.hashCode()) * 31, 31, this.b);
        Intent intent = this.c;
        return iG + (intent != null ? intent.hashCode() : 0);
    }
}
