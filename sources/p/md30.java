package p;

import android.app.Notification;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class md30 {
    public final Notification a;
    public final boolean b;
    public final Integer c;

    public md30(Notification notification, boolean z, Integer num) {
        this.a = notification;
        this.b = z;
        this.c = num;
    }

    public final Integer a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final Notification c() {
        return this.a;
    }

    public final String toString() {
        return this.a + " foreground=" + this.b + " fgsType=" + this.c;
    }
}
