package com.spotify.aiplaylistcoverart.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y13;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest extends h implements v2j0 {
    public static final int CURRENT_PICTURE_ID_FIELD_NUMBER = 2;
    private static final AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String playlistUri_ = "";
    private phc currentPictureId_ = phc.b;

    static {
        AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest = new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest();
        DEFAULT_INSTANCE = aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest;
        h.registerDefaultInstance(AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.class, aiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest);
    }

    private AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest() {
    }

    public static y13 n() {
        return (y13) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ည\u0000", new Object[]{"bitField0_", "playlistUri_", "currentPictureId_"});
        }
        if (iOrdinal == 3) {
            return new AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest();
        }
        if (iOrdinal == 4) {
            return new y13(DEFAULT_INSTANCE);
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
        synchronized (AiPlaylistCoverArtProto$GetPlaylistImageBackgroundRequest.class) {
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

    public final void o(hhc hhcVar) {
        this.bitField0_ |= 1;
        this.currentPictureId_ = hhcVar;
    }

    public final void p(String str) {
        this.playlistUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
