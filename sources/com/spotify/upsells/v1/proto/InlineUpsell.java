package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h780;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class InlineUpsell extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 3;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final InlineUpsell DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 5;
    public static final int TARGET_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Badge badge_;
    private int bitField0_;
    private SignifierDisplay signifier_;
    private String title_ = "";
    private String body_ = "";
    private String target_ = "";

    static {
        InlineUpsell inlineUpsell = new InlineUpsell();
        DEFAULT_INSTANCE = inlineUpsell;
        h.registerDefaultInstance(InlineUpsell.class, inlineUpsell);
    }

    private InlineUpsell() {
    }

    public static InlineUpsell o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "title_", "body_", "badge_", "target_", "signifier_"});
        }
        if (iOrdinal == 3) {
            return new InlineUpsell();
        }
        if (iOrdinal == 4) {
            return new h780(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (InlineUpsell.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SignifierDisplay p() {
        SignifierDisplay signifierDisplay = this.signifier_;
        return signifierDisplay == null ? SignifierDisplay.o() : signifierDisplay;
    }

    public final String q() {
        return this.target_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
