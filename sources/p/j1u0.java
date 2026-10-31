package p;

import android.app.PendingIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1u0 {
    public final k1u0 a;
    public final PendingIntent b;

    public j1u0(k1u0 k1u0Var, PendingIntent pendingIntent) {
        this.a = k1u0Var;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1u0)) {
            return false;
        }
        j1u0 j1u0Var = (j1u0) obj;
        return this.a.equals(j1u0Var.a) && this.b.equals(j1u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
