package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TracksTile extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final TracksTile DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_EMPTY_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_CHANGE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isEmpty_;
    private int positionChange_;
    private Paragraph title_;
    private String header_ = "";
    private String imageUrl_ = "";
    private String accessibilityDescription_ = "";

    static {
        TracksTile tracksTile = new TracksTile();
        DEFAULT_INSTANCE = tracksTile;
        h.registerDefaultInstance(TracksTile.class, tracksTile);
    }

    private TracksTile() {
    }

    public static TracksTile o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u000f\u0005Ȉ\u0006\u0007", new Object[]{"bitField0_", "header_", "title_", "imageUrl_", "positionChange_", "accessibilityDescription_", "isEmpty_"});
        }
        if (iOrdinal == 3) {
            return new TracksTile();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (TracksTile.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String n() {
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.header_;
    }

    public final boolean q() {
        return this.isEmpty_;
    }

    public final int r() {
        return this.positionChange_;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
