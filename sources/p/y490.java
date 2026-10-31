package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface y490 {
    MediaSessionCompat.Token a();

    void b(r0i0 r0i0Var);

    void c(av7 av7Var);

    void d();

    void e(mmr0 mmr0Var);

    void f(Context context);

    void g(p7s p7sVar);

    void h();

    void i();

    boolean isActive();

    void j();

    BehaviorSubject k();

    void l(r0i0 r0i0Var);

    void release();

    void reset();

    void setExtras(Bundle bundle);

    void setSessionActivity(PendingIntent pendingIntent);
}
