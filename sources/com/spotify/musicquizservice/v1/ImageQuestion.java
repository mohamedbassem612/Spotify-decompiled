package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ImageQuestion extends com.google.protobuf.h implements v2j0 {
    private static final ImageQuestion DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_TEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String imageUrl_ = "";
    private String questionText_ = "";
    private String entityUri_ = "";

    static {
        ImageQuestion imageQuestion = new ImageQuestion();
        DEFAULT_INSTANCE = imageQuestion;
        com.google.protobuf.h.registerDefaultInstance(ImageQuestion.class, imageQuestion);
    }

    private ImageQuestion() {
    }

    public static ImageQuestion n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "imageUrl_", "questionText_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ImageQuestion();
        }
        if (iOrdinal == 4) {
            return new np70(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (ImageQuestion.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.questionText_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
