package com.spotify.extendedmetadata.extensions.videothumbnailimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PreviewResponse extends h implements v2j0 {
    private static final PreviewResponse DEFAULT_INSTANCE;
    public static final int ENTITY_STATUS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 2;
    private int bitField0_;
    private EntityStatus entityStatus_;
    private Preview preview_;

    static {
        PreviewResponse previewResponse = new PreviewResponse();
        DEFAULT_INSTANCE = previewResponse;
        h.registerDefaultInstance(PreviewResponse.class, previewResponse);
    }

    private PreviewResponse() {
    }

    public static PreviewResponse o(byte[] bArr) {
        return (PreviewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "entityStatus_", "preview_"});
        }
        if (iOrdinal == 3) {
            return new PreviewResponse();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (PreviewResponse.class) {
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

    public final Preview n() {
        Preview preview = this.preview_;
        return preview == null ? Preview.n() : preview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
