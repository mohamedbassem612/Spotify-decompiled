package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class StoryCard extends h implements v2j0 {
    public static final int ACCESSIBILITY_TITLE_FIELD_NUMBER = 3;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    public static final int BESPOKE_CONTENT_2026_FIELD_NUMBER = 2026;
    public static final int BESPOKE_CONTENT_FIELD_NUMBER = 2025;
    public static final int CLASSIC_CONTENT_FIELD_NUMBER = 1000;
    private static final StoryCard DEFAULT_INSTANCE;
    public static final int EXCLUDE_FROM_RETRIEVAL_STORAGE_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object content_;
    private boolean excludeFromRetrievalStorage_;
    private CardShareConfiguration shareConfiguration_;
    private int contentCase_ = 0;
    private String id_ = "";
    private String accessibilityTitle_ = "";
    private String backgroundColor_ = "";

    static {
        StoryCard storyCard = new StoryCard();
        DEFAULT_INSTANCE = storyCard;
        h.registerDefaultInstance(StoryCard.class, storyCard);
    }

    private StoryCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static StoryCard t() {
        return DEFAULT_INSTANCE;
    }

    public static StoryCard x(byte[] bArr) {
        return (StoryCard) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001ߪ\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005\u0007Ϩ<\u0000ߩ<\u0000ߪ<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "id_", "shareConfiguration_", "accessibilityTitle_", "backgroundColor_", "excludeFromRetrievalStorage_", ClassicContent.class, Bespoke2025Content.class, Bespoke2026Content.class});
        }
        if (iOrdinal == 3) {
            return new StoryCard();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (StoryCard.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.accessibilityTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundColor_;
    }

    public final Bespoke2025Content p() {
        return this.contentCase_ == 2025 ? (Bespoke2025Content) this.content_ : Bespoke2025Content.o();
    }

    public final Bespoke2026Content q() {
        return this.contentCase_ == 2026 ? (Bespoke2026Content) this.content_ : Bespoke2026Content.t();
    }

    public final ClassicContent r() {
        return this.contentCase_ == 1000 ? (ClassicContent) this.content_ : ClassicContent.p();
    }

    public final int s() {
        int i = this.contentCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 1000) {
            return 1;
        }
        if (i != 2025) {
            return i != 2026 ? 0 : 3;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.excludeFromRetrievalStorage_;
    }

    public final CardShareConfiguration v() {
        CardShareConfiguration cardShareConfiguration = this.shareConfiguration_;
        return cardShareConfiguration == null ? CardShareConfiguration.p() : cardShareConfiguration;
    }

    public final boolean w() {
        return this.contentCase_ == 1000;
    }
}
