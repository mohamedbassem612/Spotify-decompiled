package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.voiceassistants.playermodels.PlayContextWrapper;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bge0 {
    public static final PlayOrigin d;
    public final Flowable a;
    public final hyv0 b;
    public final a710 c;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("external-integration-service");
        a690 a690Var = b690.a;
        d = builder.referrerIdentifier("external-integration-service").build();
    }

    public bge0(Flowable flowable, hyv0 hyv0Var, a710 a710Var) {
        this.a = flowable;
        this.b = hyv0Var;
        this.c = a710Var;
    }

    public static LoggingParams a(PlayContextWrapper playContextWrapper, String str) {
        spq0 spq0VarCommandId;
        String str2;
        LoggingParams.Builder builder = LoggingParams.builder();
        LoggingParams loggingParams = playContextWrapper.getLoggingParams();
        String str3 = "";
        if (loggingParams != null && (spq0VarCommandId = loggingParams.commandId()) != null && (str2 = (String) spq0VarCommandId.e("")) != null) {
            str3 = str2;
        }
        if (str != null) {
            builder.interactionId(str);
        }
        if (str3.length() > 0) {
            builder.commandId(str3);
        }
        return builder.build();
    }
}
