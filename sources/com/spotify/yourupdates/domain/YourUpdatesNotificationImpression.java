package com.spotify.yourupdates.domain;

import com.google.protobuf.h;
import p.bf40;
import p.j2n1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourUpdatesNotificationImpression extends h implements v2j0 {
    public static final int ACTION_URI_FIELD_NUMBER = 7;
    private static final YourUpdatesNotificationImpression DEFAULT_INSTANCE;
    public static final int IS_NEW_FIELD_NUMBER = 3;
    public static final int MESSAGE_ID_FIELD_NUMBER = 6;
    public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isNew_;
    private int position_;
    private String notificationId_ = "";
    private String requestId_ = "";
    private String opportunityId_ = "";
    private String messageId_ = "";
    private String actionUri_ = "";

    static {
        YourUpdatesNotificationImpression yourUpdatesNotificationImpression = new YourUpdatesNotificationImpression();
        DEFAULT_INSTANCE = yourUpdatesNotificationImpression;
        h.registerDefaultInstance(YourUpdatesNotificationImpression.class, yourUpdatesNotificationImpression);
    }

    private YourUpdatesNotificationImpression() {
    }

    public static j2n1 n() {
        return (j2n1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "notificationId_", "position_", "isNew_", "requestId_", "opportunityId_", "messageId_", "actionUri_"});
        }
        if (iOrdinal == 3) {
            return new YourUpdatesNotificationImpression();
        }
        if (iOrdinal == 4) {
            return new j2n1(DEFAULT_INSTANCE);
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
        synchronized (YourUpdatesNotificationImpression.class) {
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
        this.bitField0_ |= 64;
        this.actionUri_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 4;
        this.isNew_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.messageId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.notificationId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.opportunityId_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 2;
        this.position_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.requestId_ = str;
    }
}
