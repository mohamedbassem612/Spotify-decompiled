package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MessageCreative extends h implements v2j0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 6;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_VERSION_FIELD_NUMBER = 4;
    private static final MessageCreative DEFAULT_INSTANCE;
    public static final int FORMAT_METADATA_FIELD_NUMBER = 2;
    public static final int HTML_FIELD_NUMBER = 3;
    public static final int LOCALE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 8;
    private long campaignId_;
    private Object content_;
    private long creativeId_;
    private long templateId_;
    private int contentCase_ = 0;
    private String creativeVersion_ = "";
    private String locale_ = "";
    private String type_ = "";

    static {
        MessageCreative messageCreative = new MessageCreative();
        DEFAULT_INSTANCE = messageCreative;
        h.registerDefaultInstance(MessageCreative.class, messageCreative);
    }

    private MessageCreative() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static MessageCreative r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ", new Object[]{"content_", "contentCase_", "creativeId_", FormatMetadata.class, Html.class, "creativeVersion_", "templateId_", "campaignId_", "locale_", "type_"});
        }
        if (iOrdinal == 3) {
            return new MessageCreative();
        }
        if (iOrdinal == 4) {
            return new eog0((byte) 27);
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
        synchronized (MessageCreative.class) {
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

    public final long o() {
        return this.campaignId_;
    }

    public final long p() {
        return this.creativeId_;
    }

    public final String q() {
        return this.creativeVersion_;
    }

    public final FormatMetadata s() {
        return this.contentCase_ == 2 ? (FormatMetadata) this.content_ : FormatMetadata.q();
    }

    public final Html t() {
        return this.contentCase_ == 3 ? (Html) this.content_ : Html.q();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.locale_;
    }

    public final long v() {
        return this.templateId_;
    }

    public final boolean w() {
        return this.contentCase_ == 2;
    }

    public final boolean x() {
        return this.contentCase_ == 3;
    }
}
