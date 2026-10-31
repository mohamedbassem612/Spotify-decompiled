package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsOffline$GetOfflinePlaybackStatusResponse extends h implements v2j0 {
    public static final int ALLOWED_FIELD_NUMBER = 1;
    private static final EsOffline$GetOfflinePlaybackStatusResponse DEFAULT_INSTANCE;
    public static final int EXPLICITLY_ENABLED_FIELD_NUMBER = 2;
    public static final int IMPLICITLY_ENABLED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean allowed_;
    private boolean explicitlyEnabled_;
    private boolean implicitlyEnabled_;

    static {
        EsOffline$GetOfflinePlaybackStatusResponse esOffline$GetOfflinePlaybackStatusResponse = new EsOffline$GetOfflinePlaybackStatusResponse();
        DEFAULT_INSTANCE = esOffline$GetOfflinePlaybackStatusResponse;
        h.registerDefaultInstance(EsOffline$GetOfflinePlaybackStatusResponse.class, esOffline$GetOfflinePlaybackStatusResponse);
    }

    private EsOffline$GetOfflinePlaybackStatusResponse() {
    }

    public static EsOffline$GetOfflinePlaybackStatusResponse o(byte[] bArr) {
        return (EsOffline$GetOfflinePlaybackStatusResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"allowed_", "explicitlyEnabled_", "implicitlyEnabled_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$GetOfflinePlaybackStatusResponse();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 4);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (EsOffline$GetOfflinePlaybackStatusResponse.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean n() {
        return this.allowed_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
