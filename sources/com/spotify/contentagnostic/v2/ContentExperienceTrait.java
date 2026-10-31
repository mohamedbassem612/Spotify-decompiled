package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j4l;
import p.jf40;
import p.ltl;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ContentExperienceTrait extends h implements v2j0 {
    public static final int CONTENT_EXPERIENCE_FIELD_NUMBER = 1;
    private static final ContentExperienceTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int contentExperience_;

    static {
        ContentExperienceTrait contentExperienceTrait = new ContentExperienceTrait();
        DEFAULT_INSTANCE = contentExperienceTrait;
        h.registerDefaultInstance(ContentExperienceTrait.class, contentExperienceTrait);
    }

    private ContentExperienceTrait() {
    }

    public static ContentExperienceTrait o(byte[] bArr) {
        return (ContentExperienceTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"contentExperience_"});
        }
        if (iOrdinal == 3) {
            return new ContentExperienceTrait();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ContentExperienceTrait.class) {
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

    public final ltl n() {
        ltl ltlVar;
        int i = this.contentExperience_;
        if (i == 0) {
            ltlVar = ltl.CONTENT_EXPERIENCE_UNSPECIFIED;
        } else if (i != 1) {
            ltlVar = i != 2 ? null : ltl.CONTENT_EXPERIENCE_TALK;
        } else {
            ltlVar = ltl.CONTENT_EXPERIENCE_MUSIC;
        }
        return ltlVar == null ? ltl.UNRECOGNIZED : ltlVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
