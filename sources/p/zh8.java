package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zh8 implements f961 {
    public final obl a;
    public final idd1 b = new idd1(new i26(this, (byte) 26));

    public zh8(obl oblVar) {
        this.a = oblVar;
    }

    public final void shutdown() {
        Logger.g("AuthStorageApi shutdown", new Object[0]);
    }

    public final Object getApi() {
        return this;
    }
}
