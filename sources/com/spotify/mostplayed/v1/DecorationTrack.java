package com.spotify.mostplayed.v1;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class DecorationTrack extends h implements v2j0 {
    public static final int ALBUM_FIELD_NUMBER = 3;
    public static final int ARTISTS_FIELD_NUMBER = 4;
    public static final int CONTENT_RATING_FIELD_NUMBER = 7;
    private static final DecorationTrack DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private DecorationAlbum album_;
    private int bitField0_;
    private boolean explicit_;
    private String uri_ = "";
    private String name_ = "";
    private h290 artists_ = h.emptyProtobufList();
    private String previewId_ = "";
    private h290 contentRating_ = h.emptyProtobufList();

    static {
        DecorationTrack decorationTrack = new DecorationTrack();
        DEFAULT_INSTANCE = decorationTrack;
        h.registerDefaultInstance(DecorationTrack.class, decorationTrack);
    }

    private DecorationTrack() {
    }

    public static DecorationTrack n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005Ȉ\u0006\u0007\u0007\u001b", new Object[]{"bitField0_", "uri_", "name_", "album_", "artists_", DecorationArtist.class, "previewId_", "explicit_", "contentRating_", DecorationContentRating.class});
        }
        if (iOrdinal == 3) {
            return new DecorationTrack();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (DecorationTrack.class) {
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

    public final boolean hasAlbum() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
