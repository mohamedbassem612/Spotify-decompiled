package com.spotify.yourupdates.domain;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k2n1;
import p.l2n1;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourUpdatesNotificationInteraction extends h implements v2j0 {
    public static final int CTA_URI_FIELD_NUMBER = 7;
    private static final YourUpdatesNotificationInteraction DEFAULT_INSTANCE;
    public static final int INTERACTION_DETAILS_FIELD_NUMBER = 3;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 2;
    public static final int MESSAGE_ID_FIELD_NUMBER = 6;
    public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private qng0 interactionDetails_ = qng0.b;
    private String notificationId_ = "";
    private String interactionType_ = "";
    private String requestId_ = "";
    private String opportunityId_ = "";
    private String messageId_ = "";
    private String ctaUri_ = "";

    static {
        YourUpdatesNotificationInteraction yourUpdatesNotificationInteraction = new YourUpdatesNotificationInteraction();
        DEFAULT_INSTANCE = yourUpdatesNotificationInteraction;
        h.registerDefaultInstance(YourUpdatesNotificationInteraction.class, yourUpdatesNotificationInteraction);
    }

    private YourUpdatesNotificationInteraction() {
    }

    public static k2n1 n() {
        return (k2n1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"bitField0_", "notificationId_", "interactionType_", "interactionDetails_", l2n1.a, "requestId_", "opportunityId_", "messageId_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new YourUpdatesNotificationInteraction();
        }
        if (iOrdinal == 4) {
            return new k2n1(DEFAULT_INSTANCE);
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
        synchronized (YourUpdatesNotificationInteraction.class) {
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
        this.bitField0_ |= 32;
        this.ctaUri_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.interactionType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.messageId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.notificationId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.opportunityId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
