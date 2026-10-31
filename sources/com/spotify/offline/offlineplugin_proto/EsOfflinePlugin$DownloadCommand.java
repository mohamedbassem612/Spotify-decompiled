package com.spotify.offline.offlineplugin_proto;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.jpz;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOfflinePlugin$DownloadCommand extends com.google.protobuf.h implements v2j0 {
    private static final EsOfflinePlugin$DownloadCommand DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_FORMAT_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsOfflinePlugin$TargetFormat targetFormat_;
    private qng0 metadata_ = qng0.b;
    private String link_ = "";

    static {
        EsOfflinePlugin$DownloadCommand esOfflinePlugin$DownloadCommand = new EsOfflinePlugin$DownloadCommand();
        DEFAULT_INSTANCE = esOfflinePlugin$DownloadCommand;
        com.google.protobuf.h.registerDefaultInstance(EsOfflinePlugin$DownloadCommand.class, esOfflinePlugin$DownloadCommand);
    }

    private EsOfflinePlugin$DownloadCommand() {
    }

    public static EsOfflinePlugin$DownloadCommand n(byte[] bArr) {
        return (EsOfflinePlugin$DownloadCommand) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u00032", new Object[]{"bitField0_", "link_", "targetFormat_", "metadata_", jpz.a});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$DownloadCommand();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (EsOfflinePlugin$DownloadCommand.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final Map getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
