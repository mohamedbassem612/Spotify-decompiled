package p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tsc0 implements wmc {
    public final EsLoggingParams$LoggingParams a;
    public final EsPlayOrigin.PlayOrigin b;
    public final EsPreparePlayOptions$PreparePlayOptions c;
    public final trc0 d;

    public tsc0(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, EsPlayOrigin.PlayOrigin playOrigin, EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, trc0 trc0Var) {
        this.a = esLoggingParams$LoggingParams;
        this.b = playOrigin;
        this.c = esPreparePlayOptions$PreparePlayOptions;
        this.d = trc0Var;
    }

    public final trc0 a() {
        return this.d;
    }

    public final EsLoggingParams$LoggingParams b() {
        return this.a;
    }

    public final EsPlayOrigin.PlayOrigin c() {
        return this.b;
    }

    public final EsPreparePlayOptions$PreparePlayOptions d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsc0)) {
            return false;
        }
        tsc0 tsc0Var = (tsc0) obj;
        return u890.j(this.a, tsc0Var.a) && u890.j(this.b, tsc0Var.b) && this.c.equals(tsc0Var.c) && this.d.equals(tsc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
