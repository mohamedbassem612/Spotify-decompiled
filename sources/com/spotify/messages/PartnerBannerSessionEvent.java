package com.spotify.messages;

import p.bf40;
import p.h290;
import p.i9;
import p.j1s0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PartnerBannerSessionEvent extends com.google.protobuf.h implements v2j0 {
    public static final int BANNER_SESSION_ID_FIELD_NUMBER = 1;
    public static final int CONNECTED_APP_FIELD_NUMBER = 7;
    private static final PartnerBannerSessionEvent DEFAULT_INSTANCE;
    public static final int EVENT_REASON_FIELD_NUMBER = 3;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_LENGTH_SECONDS_FIELD_NUMBER = 4;
    public static final int SESSION_TYPE_FIELD_NUMBER = 5;
    public static final int SHOWN_APPS_FIELD_NUMBER = 6;
    private int bitField0_;
    private long sessionLengthSeconds_;
    private String bannerSessionId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String sessionType_ = "";
    private h290 shownApps_ = com.google.protobuf.h.emptyProtobufList();
    private String connectedApp_ = "";

    static {
        PartnerBannerSessionEvent partnerBannerSessionEvent = new PartnerBannerSessionEvent();
        DEFAULT_INSTANCE = partnerBannerSessionEvent;
        com.google.protobuf.h.registerDefaultInstance(PartnerBannerSessionEvent.class, partnerBannerSessionEvent);
    }

    private PartnerBannerSessionEvent() {
    }

    public static j1s0 o() {
        return (j1s0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005", new Object[]{"bitField0_", "bannerSessionId_", "eventType_", "eventReason_", "sessionLengthSeconds_", "sessionType_", "shownApps_", "connectedApp_"});
        }
        if (iOrdinal == 3) {
            return new PartnerBannerSessionEvent();
        }
        if (iOrdinal == 4) {
            return new j1s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerBannerSessionEvent.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.shownApps_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.shownApps_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.bannerSessionId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.connectedApp_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.eventReason_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 2;
        this.eventType_ = str;
    }

    public final void t(long j) {
        this.bitField0_ |= 8;
        this.sessionLengthSeconds_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.sessionType_ = str;
    }
}
