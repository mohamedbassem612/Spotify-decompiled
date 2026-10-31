package com.spotify.download.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.enz;
import p.fnz;
import p.gnz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsDownload$MediaManifestParams extends h implements v2j0 {
    private static final EsDownload$MediaManifestParams DEFAULT_INSTANCE;
    public static final int MANIFEST_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 2;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int mediaType_;
    private int requestType_;
    private String manifestId_ = "";
    private String playbackId_ = "";
    private String sessionId_ = "";

    static {
        EsDownload$MediaManifestParams esDownload$MediaManifestParams = new EsDownload$MediaManifestParams();
        DEFAULT_INSTANCE = esDownload$MediaManifestParams;
        h.registerDefaultInstance(EsDownload$MediaManifestParams.class, esDownload$MediaManifestParams);
    }

    private EsDownload$MediaManifestParams() {
    }

    public static enz n() {
        return (enz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\f", new Object[]{"manifestId_", "playbackId_", "sessionId_", "requestType_", "mediaType_"});
        }
        if (iOrdinal == 3) {
            return new EsDownload$MediaManifestParams();
        }
        if (iOrdinal == 4) {
            return new enz(DEFAULT_INSTANCE);
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
        synchronized (EsDownload$MediaManifestParams.class) {
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

    public final void o(fnz fnzVar) {
        this.mediaType_ = fnzVar.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.playbackId_ = str;
    }

    public final void q(gnz gnzVar) {
        this.requestType_ = gnzVar.getNumber();
    }

    public final void r(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    public final void setManifestId(String str) {
        str.getClass();
        this.manifestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
