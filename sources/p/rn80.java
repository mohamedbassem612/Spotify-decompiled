package p;

import com.android.installreferrer.api.InstallReferrerClient;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rn80 {
    public final InstallReferrerClient a;
    public final pn80 b;

    public rn80(InstallReferrerClient installReferrerClient, pn80 pn80Var) {
        this.a = installReferrerClient;
        this.b = pn80Var;
    }

    public final void a() {
        InstallReferrerClient installReferrerClient = this.a;
        if (installReferrerClient.isReady()) {
            Logger.g("End InstallReferrerClient connection", new Object[0]);
            installReferrerClient.endConnection();
        }
    }
}
