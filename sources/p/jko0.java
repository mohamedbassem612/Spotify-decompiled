package p;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jko0 extends glo0 {
    public int[] e = null;
    public MediaSessionCompat.Token f;

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) fdcVar.d;
        if (i >= 34) {
            yjo0.d(builder, yjo0.b(zjo0.a(yjo0.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            yjo0.d(builder, yjo0.b(yjo0.a(), this.e, this.f));
        }
    }
}
