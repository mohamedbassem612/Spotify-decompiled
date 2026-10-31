package p;

import android.app.PendingIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojo0 {
    public final vjo0 a;
    public final PendingIntent b;
    public final boolean c;

    public ojo0(vjo0 vjo0Var, PendingIntent pendingIntent, boolean z) {
        this.a = vjo0Var;
        this.b = pendingIntent;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojo0)) {
            return false;
        }
        ojo0 ojo0Var = (ojo0) obj;
        return this.a.equals(ojo0Var.a) && u890.j(this.b, ojo0Var.b) && this.c == ojo0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        PendingIntent pendingIntent = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31);
    }
}
