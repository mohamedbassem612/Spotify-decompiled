package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.fh5;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Answer extends h implements v2j0 {
    public static final int ANSWER_SOURCE_FIELD_NUMBER = 4;
    private static final Answer DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SELECTED_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    private int answerSource_;
    private int bitField0_;
    private boolean selected_;
    private String id_ = "";
    private String text_ = "";
    private String description_ = "";

    static {
        Answer answer = new Answer();
        DEFAULT_INSTANCE = answer;
        h.registerDefaultInstance(Answer.class, answer);
    }

    private Answer() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f\u0005\u0007", new Object[]{"bitField0_", "id_", "text_", "description_", "answerSource_", "selected_"});
        }
        if (iOrdinal == 3) {
            return new Answer();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (Answer.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public final fh5 n() {
        fh5 fh5Var;
        int i = this.answerSource_;
        if (i == 0) {
            fh5Var = fh5.ANSWER_SOURCE_UNSPECIFIED;
        } else if (i == 1) {
            fh5Var = fh5.ANSWER_SOURCE_PRESET;
        } else if (i != 2) {
            fh5Var = i != 3 ? null : fh5.ANSWER_SOURCE_USER;
        } else {
            fh5Var = fh5.ANSWER_SOURCE_USER_PROFILE;
        }
        return fh5Var == null ? fh5.UNRECOGNIZED : fh5Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.selected_;
    }

    public final String p() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
