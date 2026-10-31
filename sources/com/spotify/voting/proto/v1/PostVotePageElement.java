package com.spotify.voting.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PostVotePageElement extends h implements v2j0 {
    private static final PostVotePageElement DEFAULT_INSTANCE;
    public static final int HEADER_TEXT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CAROUSEL_FIELD_NUMBER = 3;
    public static final int TEXT_SECTION_FIELD_NUMBER = 2;
    public static final int UPSELL_BANNER_FIELD_NUMBER = 4;
    private int elementsOneofCase_ = 0;
    private Object elementsOneof_;

    static {
        PostVotePageElement postVotePageElement = new PostVotePageElement();
        DEFAULT_INSTANCE = postVotePageElement;
        h.registerDefaultInstance(PostVotePageElement.class, postVotePageElement);
    }

    private PostVotePageElement() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementsOneof_", "elementsOneofCase_", TextSectionElement.class, TextSectionElement.class, ShareElements.class, PremiumUpsell.class});
        }
        if (iOrdinal == 3) {
            return new PostVotePageElement();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (PostVotePageElement.class) {
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
        int i = this.elementsOneofCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TextSectionElement o() {
        return this.elementsOneofCase_ == 1 ? (TextSectionElement) this.elementsOneof_ : TextSectionElement.n();
    }

    public final ShareElements p() {
        return this.elementsOneofCase_ == 3 ? (ShareElements) this.elementsOneof_ : ShareElements.n();
    }

    public final TextSectionElement q() {
        return this.elementsOneofCase_ == 2 ? (TextSectionElement) this.elementsOneof_ : TextSectionElement.n();
    }

    public final PremiumUpsell r() {
        return this.elementsOneofCase_ == 4 ? (PremiumUpsell) this.elementsOneof_ : PremiumUpsell.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
