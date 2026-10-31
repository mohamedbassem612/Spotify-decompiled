package p;

import android.content.Context;
import com.spotify.notifications.notifications.workers.PushTokenSyncQuasarWorker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class byy0 implements r0z0 {
    public final Context a;

    public byy0(Context context) {
        this.a = context;
    }

    @Override // p.r0z0
    public final void a() {
        uks0 uks0Var = new uks0(PushTokenSyncQuasarWorker.class, 20L, TimeUnit.DAYS);
        b2c b2cVar = new b2c();
        b2cVar.j();
        b2cVar.i();
        nb51.y(this.a).b("push_token_sync", 2, uks0Var.f(b2cVar.c()).e(10L, TimeUnit.MINUTES).b());
    }

    @Override // p.r0z0
    public final void cancel() {
        bzn1.r("push_token_sync", nb51.y(this.a));
    }
}
