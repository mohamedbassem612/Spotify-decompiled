package p;

import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.settings.settings.SettingsDelegate;
import com.spotify.settings.settingsimpl.NativeSettings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eu61 implements f961 {
    public final a8n a;
    public NativeSettings b;

    public eu61(a8n a8nVar, SharedCosmosRouterApi sharedCosmosRouterApi, p5n p5nVar, obl oblVar, String str, SettingsDelegate settingsDelegate) {
        this.a = a8nVar;
        ((d8n) a8nVar).c.runBlocking(new du61(this, sharedCosmosRouterApi, p5nVar, oblVar, str, settingsDelegate));
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.c.runBlocking(new xfz0(this, (byte) 14));
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
