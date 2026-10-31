package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class log extends x1p1 {
    public final Uri c;
    public final o571 d;
    public final c380 e;

    static {
        idd1 idd1Var = o571.c;
    }

    public log(Uri uri, o571 o571Var, c380 c380Var) {
        this.c = uri;
        this.d = o571Var;
        this.e = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof log)) {
            return false;
        }
        log logVar = (log) obj;
        return this.c.equals(logVar.c) && u890.j(this.d, logVar.d) && u890.j(this.e, logVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
