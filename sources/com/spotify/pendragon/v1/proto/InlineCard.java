package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.ab80;
import p.bf40;
import p.h290;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class InlineCard extends h implements v2j0 {
    public static final int BASE_INLINE_CARD_FIELD_NUMBER = 5;
    public static final int BUTTONS_FIELD_NUMBER = 3;
    public static final int COMPACT_INLINE_CARD_FIELD_NUMBER = 2;
    private static final InlineCard DEFAULT_INSTANCE;
    public static final int MICRO_COMPACT_INLINE_CARD_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int STANDARD_INLINE_CARD_FIELD_NUMBER = 1;
    private Object inlineCardTemplate_;
    private int inlineCardTemplateCase_ = 0;
    private h290 buttons_ = h.emptyProtobufList();

    static {
        InlineCard inlineCard = new InlineCard();
        DEFAULT_INSTANCE = inlineCard;
        h.registerDefaultInstance(InlineCard.class, inlineCard);
    }

    private InlineCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static InlineCard r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"inlineCardTemplate_", "inlineCardTemplateCase_", StandardInlineCard.class, CompactInlineCard.class, "buttons_", Button.class, MicroCompactInlineCard.class, BaseInlineCard.class});
        }
        if (iOrdinal == 3) {
            return new InlineCard();
        }
        if (iOrdinal == 4) {
            return new h780((byte) 6);
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
        synchronized (InlineCard.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BaseInlineCard o() {
        return this.inlineCardTemplateCase_ == 5 ? (BaseInlineCard) this.inlineCardTemplate_ : BaseInlineCard.s();
    }

    public final h290 p() {
        return this.buttons_;
    }

    public final CompactInlineCard q() {
        return this.inlineCardTemplateCase_ == 2 ? (CompactInlineCard) this.inlineCardTemplate_ : CompactInlineCard.s();
    }

    public final int s() {
        return ab80.a(this.inlineCardTemplateCase_);
    }

    public final MicroCompactInlineCard t() {
        return this.inlineCardTemplateCase_ == 4 ? (MicroCompactInlineCard) this.inlineCardTemplate_ : MicroCompactInlineCard.q();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final StandardInlineCard u() {
        return this.inlineCardTemplateCase_ == 1 ? (StandardInlineCard) this.inlineCardTemplate_ : StandardInlineCard.s();
    }
}
