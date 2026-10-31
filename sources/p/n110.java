package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n110 implements su30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n110(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) ((ContextTrack) obj).metadata().get((String) obj2);
                return str == null ? "" : str;
            case 1:
                return Boolean.valueOf(((hod0) obj2).g((ContextTrack) obj));
            default:
                LoggingParams loggingParams = (LoggingParams) obj;
                cve0 cve0Var = (cve0) obj2;
                loggingParams.getClass();
                cve0Var.getClass();
                return loggingParams.toBuilder().commandInitiatedTime(Long.valueOf(cve0Var.a.b())).build();
        }
    }
}
