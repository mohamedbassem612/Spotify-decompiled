package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ojg;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ClientMessagingPlatformDisplayStatus extends h implements v2j0 {
    public static final int CMP_MESSAGE_TYPE_FIELD_NUMBER = 15;
    private static final ClientMessagingPlatformDisplayStatus DEFAULT_INSTANCE;
    public static final int DISCARD_DETAILS_FIELD_NUMBER = 9;
    public static final int DISCARD_REASON_FIELD_NUMBER = 8;
    public static final int ENTITY_URI_FIELD_NUMBER = 16;
    public static final int LOCALE_FIELD_NUMBER = 10;
    public static final int LOCAL_MESSAGE_IDENTIFIER_FIELD_NUMBER = 14;
    public static final int MESSAGE_CREATIVE_CAMPAIGN_ID_FIELD_NUMBER = 13;
    public static final int MESSAGE_CREATIVE_ID_FIELD_NUMBER = 4;
    public static final int MESSAGE_CREATIVE_TEMPLATE_ID_FIELD_NUMBER = 12;
    public static final int MESSAGE_CREATIVE_VERSION_FIELD_NUMBER = 11;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_UUID_FIELD_NUMBER = 3;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 7;
    public static final int TRIGGER_FIELD_NUMBER = 6;
    private int bitField0_;
    private long messageCreativeCampaignId_;
    private long messageCreativeId_;
    private long messageCreativeTemplateId_;
    private long messageId_;
    private boolean success_;
    private String opportunityId_ = "";
    private String messageUuid_ = "";
    private String messageFormat_ = "";
    private String trigger_ = "";
    private String discardReason_ = "";
    private String discardDetails_ = "";
    private String locale_ = "";
    private String messageCreativeVersion_ = "";
    private String localMessageIdentifier_ = "";
    private String cmpMessageType_ = "";
    private String entityUri_ = "";

    static {
        ClientMessagingPlatformDisplayStatus clientMessagingPlatformDisplayStatus = new ClientMessagingPlatformDisplayStatus();
        DEFAULT_INSTANCE = clientMessagingPlatformDisplayStatus;
        h.registerDefaultInstance(ClientMessagingPlatformDisplayStatus.class, clientMessagingPlatformDisplayStatus);
    }

    private ClientMessagingPlatformDisplayStatus() {
    }

    public static ojg n() {
        return (ojg) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        this.bitField0_ |= 1;
        this.opportunityId_ = str;
    }

    public final void B(boolean z) {
        this.bitField0_ |= 64;
        this.success_ = z;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.trigger_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဂ\u000b\rဂ\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f", new Object[]{"bitField0_", "opportunityId_", "messageId_", "messageUuid_", "messageCreativeId_", "messageFormat_", "trigger_", "success_", "discardReason_", "discardDetails_", "locale_", "messageCreativeVersion_", "messageCreativeTemplateId_", "messageCreativeCampaignId_", "localMessageIdentifier_", "cmpMessageType_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformDisplayStatus();
        }
        if (iOrdinal == 4) {
            return new ojg(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformDisplayStatus.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.cmpMessageType_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.discardDetails_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 128;
        this.discardReason_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.entityUri_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.locale_ = str;
    }

    public final void t(long j) {
        this.bitField0_ |= 4096;
        this.messageCreativeCampaignId_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.bitField0_ |= 8;
        this.messageCreativeId_ = j;
    }

    public final void v(long j) {
        this.bitField0_ |= 2048;
        this.messageCreativeTemplateId_ = j;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.messageCreativeVersion_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.messageFormat_ = str;
    }

    public final void y(long j) {
        this.bitField0_ |= 2;
        this.messageId_ = j;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.messageUuid_ = str;
    }
}
