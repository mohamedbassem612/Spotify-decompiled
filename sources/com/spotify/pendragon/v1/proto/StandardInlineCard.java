package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class StandardInlineCard extends h implements v2j0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 7;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 4;
    private static final StandardInlineCard DEFAULT_INSTANCE;
    public static final int HEADLINE_COLOR_FIELD_NUMBER = 3;
    public static final int HEADLINE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 1;
    private AccessoryContent accessoryContent_;
    private BackgroundColor backgroundColor_;
    private int bitField0_;
    private Signifier signifier_;
    private String headline_ = "";
    private String headlineColor_ = "";
    private String body_ = "";
    private String bodyColor_ = "";

    static {
        StandardInlineCard standardInlineCard = new StandardInlineCard();
        DEFAULT_INSTANCE = standardInlineCard;
        h.registerDefaultInstance(StandardInlineCard.class, standardInlineCard);
    }

    private StandardInlineCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static StandardInlineCard s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "signifier_", "headline_", "headlineColor_", "body_", "bodyColor_", "backgroundColor_", "accessoryContent_"});
        }
        if (iOrdinal == 3) {
            return new StandardInlineCard();
        }
        if (iOrdinal == 4) {
            return new o9b1((byte) 8);
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
        synchronized (StandardInlineCard.class) {
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

    public final AccessoryContent o() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.p() : accessoryContent;
    }

    public final BackgroundColor p() {
        BackgroundColor backgroundColor = this.backgroundColor_;
        return backgroundColor == null ? BackgroundColor.p() : backgroundColor;
    }

    public final String q() {
        return this.body_;
    }

    public final String r() {
        return this.bodyColor_;
    }

    public final String t() {
        return this.headline_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.headlineColor_;
    }

    public final Signifier v() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.o() : signifier;
    }
}
