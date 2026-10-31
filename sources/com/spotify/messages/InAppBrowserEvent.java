package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z480;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class InAppBrowserEvent extends com.google.protobuf.h implements v2j0 {
    public static final int AD_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int AD_REQUEST_ID_FIELD_NUMBER = 11;
    public static final int AD_URL_FIELD_NUMBER = 7;
    private static final InAppBrowserEvent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int LOADING_PROGRESS_FIELD_NUMBER = 9;
    public static final int LOAD_TIME_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 8;
    public static final int SESSION_ID_FIELD_NUMBER = 10;
    public static final int TIME_SPENT_FIELD_NUMBER = 5;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private double loadTime_;
    private int loadingProgress_;
    private int sequence_;
    private double timeSpent_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adIdentifier_ = "";
    private String adUrl_ = "";
    private String sessionId_ = "";
    private String adRequestId_ = "";

    static {
        InAppBrowserEvent inAppBrowserEvent = new InAppBrowserEvent();
        DEFAULT_INSTANCE = inAppBrowserEvent;
        com.google.protobuf.h.registerDefaultInstance(InAppBrowserEvent.class, inAppBrowserEvent);
    }

    private InAppBrowserEvent() {
    }

    public static z480 n() {
        return (z480) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005က\u0004\u0006က\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nဈ\t\u000bဈ\n", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adIdentifier_", "timeSpent_", "loadTime_", "adUrl_", "sequence_", "loadingProgress_", "sessionId_", "adRequestId_"});
        }
        if (iOrdinal == 3) {
            return new InAppBrowserEvent();
        }
        if (iOrdinal == 4) {
            return new z480(DEFAULT_INSTANCE);
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
        synchronized (InAppBrowserEvent.class) {
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
        this.bitField0_ |= 8;
        this.adIdentifier_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.adRequestId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.adUrl_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.eventData_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 1;
        this.eventName_ = str;
    }

    public final void t(int i) {
        this.bitField0_ |= 256;
        this.loadingProgress_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 128;
        this.sequence_ = i;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.sessionId_ = str;
    }

    public final void w(double d) {
        this.bitField0_ |= 16;
        this.timeSpent_ = d;
    }

    public final void x(long j) {
        this.bitField0_ |= 2;
        this.timeStamp_ = j;
    }
}
