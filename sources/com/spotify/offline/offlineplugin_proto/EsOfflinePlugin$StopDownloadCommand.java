package com.spotify.offline.offlineplugin_proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOfflinePlugin$StopDownloadCommand extends com.google.protobuf.h implements v2j0 {
    private static final EsOfflinePlugin$StopDownloadCommand DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String link_ = "";

    static {
        EsOfflinePlugin$StopDownloadCommand esOfflinePlugin$StopDownloadCommand = new EsOfflinePlugin$StopDownloadCommand();
        DEFAULT_INSTANCE = esOfflinePlugin$StopDownloadCommand;
        com.google.protobuf.h.registerDefaultInstance(EsOfflinePlugin$StopDownloadCommand.class, esOfflinePlugin$StopDownloadCommand);
    }

    private EsOfflinePlugin$StopDownloadCommand() {
    }

    public static EsOfflinePlugin$StopDownloadCommand n(byte[] bArr) {
        return (EsOfflinePlugin$StopDownloadCommand) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"link_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$StopDownloadCommand();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (EsOfflinePlugin$StopDownloadCommand.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
