package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Hero extends h implements v2j0 {
    public static final int ARTWORK_FIELD_NUMBER = 5;
    public static final int BODY_1_FIELD_NUMBER = 3;
    public static final int BODY_2_FIELD_NUMBER = 4;
    private static final Hero DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Artwork artwork_;
    private int bitField0_;
    private Paragraph body1_;
    private Paragraph body2_;
    private Paragraph subtitle_;
    private String title_ = "";

    static {
        Hero hero = new Hero();
        DEFAULT_INSTANCE = hero;
        h.registerDefaultInstance(Hero.class, hero);
    }

    private Hero() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Hero q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "title_", "subtitle_", "body1_", "body2_", "artwork_"});
        }
        if (iOrdinal == 3) {
            return new Hero();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (Hero.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final Artwork n() {
        Artwork artwork = this.artwork_;
        return artwork == null ? Artwork.p() : artwork;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph o() {
        Paragraph paragraph = this.body1_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.body2_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
