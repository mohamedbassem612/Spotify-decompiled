package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class DuplicateMixResponse extends h implements v2j0 {
    private static final DuplicateMixResponse DEFAULT_INSTANCE;
    public static final int ORIGINAL_PLAYLIST_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private String playlistUri_ = "";
    private String originalPlaylistUri_ = "";

    static {
        DuplicateMixResponse duplicateMixResponse = new DuplicateMixResponse();
        DEFAULT_INSTANCE = duplicateMixResponse;
        h.registerDefaultInstance(DuplicateMixResponse.class, duplicateMixResponse);
    }

    private DuplicateMixResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"playlistUri_", "originalPlaylistUri_"});
        }
        if (iOrdinal == 3) {
            return new DuplicateMixResponse();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (DuplicateMixResponse.class) {
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

    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
