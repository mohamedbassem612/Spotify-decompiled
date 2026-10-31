package p;

import android.content.Context;
import com.spotify.remoteconfig.backgroundsync.RemoteConfigBackgroundSyncWorker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iz11 implements r0z0 {
    public final Context a;

    public iz11(Context context) {
        this.a = context;
    }

    @Override // p.r0z0
    public final void a() {
        nb51.y(this.a).b("remote-config-quasar-fetch-daily", 2, new uks0(RemoteConfigBackgroundSyncWorker.class, 24L, TimeUnit.HOURS).f(new gjl(10)).b());
    }

    @Override // p.r0z0
    public final void cancel() {
        bzn1.r("remote-config-quasar-fetch-daily", nb51.y(this.a));
    }
}
