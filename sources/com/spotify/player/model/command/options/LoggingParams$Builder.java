package com.spotify.player.model.command.options;

import p.b291;
import p.kg11;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class LoggingParams$Builder {
    public LoggingParams$Builder() {
        int i = t380.c;
        kg11 kg11Var = kg11.t;
        pageInstanceIds(kg11Var);
        interactionIds(kg11Var);
    }

    public static LoggingParams$Builder builder() {
        return LoggingParams.builder();
    }

    public abstract LoggingParams build();

    public abstract LoggingParams$Builder commandId(String str);

    public abstract LoggingParams$Builder commandInitiatedTime(Long l);

    public abstract LoggingParams$Builder commandReceivedTime(Long l);

    public LoggingParams$Builder interactionId(String str) {
        int i = t380.c;
        return interactionIds(new b291(str));
    }

    public abstract LoggingParams$Builder interactionIds(t380 t380Var);

    public LoggingParams$Builder pageInstanceId(String str) {
        int i = t380.c;
        return pageInstanceIds(new b291(str));
    }

    public abstract LoggingParams$Builder pageInstanceIds(t380 t380Var);
}
