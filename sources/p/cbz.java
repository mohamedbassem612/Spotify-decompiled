package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cbz {
    public final Context a;
    public final rcf0 b;
    public final gw70 c;

    public cbz(Context context, rcf0 rcf0Var, gw70 gw70Var) {
        this.a = context;
        this.b = rcf0Var;
        this.c = gw70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbz)) {
            return false;
        }
        cbz cbzVar = (cbz) obj;
        return u890.j(this.a, cbzVar.a) && u890.j(this.b, cbzVar.b) && u890.j(this.c, cbzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
