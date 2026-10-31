package p;

import com.spotify.player.esperanto.internal.PlayerInternalError;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wuz {
    public final ujm a;
    public final cve0 b;
    public final String c;
    public boolean d;

    public wuz(ujm ujmVar, cve0 cve0Var, String str) {
        this.a = ujmVar;
        this.b = cve0Var;
        this.c = str;
    }

    public final void finalize() {
        if (!this.d) {
            throw new PlayerInternalError(new Throwable(String.format("PreparedSession '%s' has not been destroyed", Arrays.copyOf(new Object[]{this.c}, 1))));
        }
    }
}
