package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class po {
    public final hwe0 a;
    public final Intent b;

    public po(hwe0 hwe0Var, Intent intent) {
        this.a = hwe0Var;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return u890.j(this.a, poVar.a) && u890.j(this.b, poVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
