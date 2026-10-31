package com.spotify.musicquizservice.v1;

import com.google.protobuf.Timestamp;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class RoundMetadata extends com.google.protobuf.h implements v2j0 {
    private static final RoundMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int END_ROUND_FIELD_NUMBER = 8;
    public static final int FACTS_FIELD_NUMBER = 5;
    public static final int FOREGROUND_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTIONS_FIELD_NUMBER = 7;
    public static final int ROUND_ID_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UPDATED_AT_FIELD_NUMBER = 9;
    private int bitField0_;
    private EndRound endRound_;
    private int index_;
    private Timestamp updatedAt_;
    private String roundId_ = "";
    private String title_ = "";
    private String imageUrl_ = "";
    private String description_ = "";
    private h290 facts_ = com.google.protobuf.h.emptyProtobufList();
    private h290 questions_ = com.google.protobuf.h.emptyProtobufList();
    private String foregroundImageUrl_ = "";

    static {
        RoundMetadata roundMetadata = new RoundMetadata();
        DEFAULT_INSTANCE = roundMetadata;
        com.google.protobuf.h.registerDefaultInstance(RoundMetadata.class, roundMetadata);
    }

    private RoundMetadata() {
    }

    public static RoundMetadata n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004Ȉ\u0005Ț\u0006\u0004\u0007\u001b\bဉ\u0001\tဉ\u0002\nለ\u0003", new Object[]{"bitField0_", "roundId_", "title_", "imageUrl_", "description_", "facts_", "index_", "questions_", Question.class, "endRound_", "updatedAt_", "foregroundImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new RoundMetadata();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (RoundMetadata.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final int getIndex() {
        return this.index_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasUpdatedAt() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.facts_;
    }

    public final h290 p() {
        return this.questions_;
    }

    public final String q() {
        return this.roundId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
