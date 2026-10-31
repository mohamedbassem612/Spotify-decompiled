package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Section extends h implements v2j0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 10;
    public static final int EXTERNAL_LINK_FIELD_NUMBER = 11;
    public static final int FALLBACK_FIELD_NUMBER = 2;
    public static final int IMAGE_FIELD_NUMBER = 6;
    public static final int LOOPING_VIDEO_FIELD_NUMBER = 9;
    public static final int MUSIC_CLOSED_CAPTION_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int START_MS_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int bodyCase_ = 0;
    private Object body_;
    private TextSentence fallback_;
    private int startMs_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"body_", "bodyCase_", "bitField0_", "startMs_", "fallback_", TextSentence.class, TitleSection.class, ImageSection.class, MusicClosedCaption.class, LoopingVideoSection.class, EntitySection.class, ExternalLinkSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (Section.class) {
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

    public final int n() {
        int i = this.bodyCase_;
        if (i == 0) {
            return 8;
        }
        if (i == 6) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 8:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntitySection o() {
        return this.bodyCase_ == 10 ? (EntitySection) this.body_ : EntitySection.o();
    }

    public final ExternalLinkSection p() {
        return this.bodyCase_ == 11 ? (ExternalLinkSection) this.body_ : ExternalLinkSection.n();
    }

    public final ImageSection q() {
        return this.bodyCase_ == 6 ? (ImageSection) this.body_ : ImageSection.q();
    }

    public final LoopingVideoSection r() {
        return this.bodyCase_ == 9 ? (LoopingVideoSection) this.body_ : LoopingVideoSection.q();
    }

    public final MusicClosedCaption s() {
        return this.bodyCase_ == 8 ? (MusicClosedCaption) this.body_ : MusicClosedCaption.n();
    }

    public final int t() {
        return this.startMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final TextSentence u() {
        return this.bodyCase_ == 3 ? (TextSentence) this.body_ : TextSentence.n();
    }

    public final TitleSection v() {
        return this.bodyCase_ == 4 ? (TitleSection) this.body_ : TitleSection.n();
    }
}
