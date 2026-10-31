package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Bespoke2025Content extends h implements v2j0 {
    private static final Bespoke2025Content DEFAULT_INSTANCE;
    public static final int LISTENING_AGE_INTRO_FIELD_NUMBER = 12;
    public static final int LISTENING_AGE_REVEAL_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Bespoke2025Content bespoke2025Content = new Bespoke2025Content();
        DEFAULT_INSTANCE = bespoke2025Content;
        h.registerDefaultInstance(Bespoke2025Content.class, bespoke2025Content);
    }

    private Bespoke2025Content() {
    }

    public static Bespoke2025Content o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\f\r\u0002\u0000\u0000\u0000\f<\u0000\r<\u0000", new Object[]{"content_", "contentCase_", SceneTemplate.ListeningAgeContent.Card1.class, SceneTemplate.ListeningAgeContent.Card2.class});
        }
        if (iOrdinal == 3) {
            return new Bespoke2025Content();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Bespoke2025Content.class) {
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
        int i = this.contentCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 12) {
            return i != 13 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SceneTemplate.ListeningAgeContent.Card1 p() {
        return this.contentCase_ == 12 ? (SceneTemplate.ListeningAgeContent.Card1) this.content_ : SceneTemplate.ListeningAgeContent.Card1.n();
    }

    public final SceneTemplate.ListeningAgeContent.Card2 q() {
        return this.contentCase_ == 13 ? (SceneTemplate.ListeningAgeContent.Card2) this.content_ : SceneTemplate.ListeningAgeContent.Card2.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
