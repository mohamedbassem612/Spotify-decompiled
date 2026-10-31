package p;

import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cve0 {
    public final yqg a;

    public cve0(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final LoggingParams a(spq0 spq0Var) {
        return (LoggingParams) spq0Var.i(new n110(this, (byte) 2)).e(LoggingParams.EMPTY.toBuilder().commandInitiatedTime(Long.valueOf(this.a.b())).build());
    }
}
