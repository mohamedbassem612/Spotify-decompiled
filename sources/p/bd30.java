package p;

import android.app.Notification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bd30 {
    public final int a;
    public final int b;
    public final Notification c;

    public bd30(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bd30.class != obj.getClass()) {
            return false;
        }
        bd30 bd30Var = (bd30) obj;
        if (this.a == bd30Var.a && this.b == bd30Var.b) {
            return this.c.equals(bd30Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
