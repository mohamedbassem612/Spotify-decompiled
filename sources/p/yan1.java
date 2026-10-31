package p;

import android.app.PendingIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yan1 extends r8o {
    public final PendingIntent a;
    public final boolean b;

    public yan1(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            bhn0.i("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // p.r8o
    public final PendingIntent a() {
        return this.a;
    }

    @Override // p.r8o
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r8o) {
            yan1 yan1Var = (yan1) ((r8o) obj);
            if (this.a.equals(yan1Var.a) && this.b == yan1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return l1d.r(l1d.t("CrossDevicePromptInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
