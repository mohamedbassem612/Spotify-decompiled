package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class TopStoryFeedCard extends h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 4;
    private static final TopStoryFeedCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STORY_ID_FIELD_NUMBER = 1;
    public static final int WHY_THIS_FIELD_NUMBER = 5;
    private int bitField0_;
    private int category_;
    private String storyId_ = "";
    private String description_ = "";
    private h290 items_ = h.emptyProtobufList();
    private String whyThis_ = "";

    static {
        TopStoryFeedCard topStoryFeedCard = new TopStoryFeedCard();
        DEFAULT_INSTANCE = topStoryFeedCard;
        h.registerDefaultInstance(TopStoryFeedCard.class, topStoryFeedCard);
    }

    private TopStoryFeedCard() {
    }

    public static TopStoryFeedCard o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\f\u0005ለ\u0000", new Object[]{"bitField0_", "storyId_", "description_", "items_", Item.class, "category_", "whyThis_"});
        }
        if (iOrdinal == 3) {
            return new TopStoryFeedCard();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (TopStoryFeedCard.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final int n() {
        return this.category_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.storyId_;
    }

    public final String q() {
        return this.whyThis_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
