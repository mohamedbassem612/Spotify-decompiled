package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistRequest$LensState extends h implements v2j0 {
    public static final int APPLIED_LENSES_FIELD_NUMBER = 2;
    private static final PlaylistRequest$LensState DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTED_LENSES_FIELD_NUMBER = 1;
    private h290 requestedLenses_ = h.emptyProtobufList();
    private h290 appliedLenses_ = h.emptyProtobufList();

    static {
        PlaylistRequest$LensState playlistRequest$LensState = new PlaylistRequest$LensState();
        DEFAULT_INSTANCE = playlistRequest$LensState;
        h.registerDefaultInstance(PlaylistRequest$LensState.class, playlistRequest$LensState);
    }

    private PlaylistRequest$LensState() {
    }

    public static PlaylistRequest$LensState o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"requestedLenses_", PlaylistRequest.Lens.class, "appliedLenses_", PlaylistRequest.Lens.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$LensState();
        }
        if (iOrdinal == 4) {
            return new iqu0((byte) 11);
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
        synchronized (PlaylistRequest$LensState.class) {
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

    public final h290 p() {
        return this.requestedLenses_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
