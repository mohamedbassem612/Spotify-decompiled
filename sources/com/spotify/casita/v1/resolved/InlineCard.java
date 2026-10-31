package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.jf40;
import p.lf80;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class InlineCard extends h implements v2j0 {
    private static final InlineCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        InlineCard inlineCard = new InlineCard();
        DEFAULT_INSTANCE = inlineCard;
        h.registerDefaultInstance(InlineCard.class, inlineCard);
    }

    private InlineCard() {
    }

    public static InlineCard o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new InlineCard();
        }
        if (iOrdinal == 4) {
            return new h780((byte) 7);
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final lf80 p() {
        lf80 lf80Var;
        int i = this.type_;
        if (i != 0) {
            lf80Var = i != 1 ? null : lf80.MESSAGING_AUDIOBOOK_SUBFEED;
        } else {
            lf80Var = lf80.UNKNOWN;
        }
        return lf80Var == null ? lf80.UNRECOGNIZED : lf80Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
