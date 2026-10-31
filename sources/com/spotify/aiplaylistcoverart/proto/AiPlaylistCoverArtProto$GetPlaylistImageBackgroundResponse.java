package com.spotify.aiplaylistcoverart.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse extends h implements v2j0 {
    private static final AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURE_ID_FIELD_NUMBER = 1;
    private phc pictureId_ = phc.b;

    static {
        AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse aiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse = new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse();
        DEFAULT_INSTANCE = aiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse;
        h.registerDefaultInstance(AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse.class, aiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse);
    }

    private AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"pictureId_"});
        }
        if (iOrdinal == 3) {
            return new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (AiPlaylistCoverArtProto$GetPlaylistImageBackgroundResponse.class) {
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

    public final phc getPictureId() {
        return this.pictureId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
