package com.spotify.home.evopage.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ln60;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class HomeFeedLoadingErrorEvent extends h implements v2j0 {
    private static final HomeFeedLoadingErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 4;
    public static final int FEED_ID_FIELD_NUMBER = 2;
    public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 1;
    public static final int IS_OFFLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int httpStatusCode_;
    private boolean isOffline_;
    private String feedId_ = "";
    private String errorMessage_ = "";

    static {
        HomeFeedLoadingErrorEvent homeFeedLoadingErrorEvent = new HomeFeedLoadingErrorEvent();
        DEFAULT_INSTANCE = homeFeedLoadingErrorEvent;
        h.registerDefaultInstance(HomeFeedLoadingErrorEvent.class, homeFeedLoadingErrorEvent);
    }

    private HomeFeedLoadingErrorEvent() {
    }

    public static ln60 n() {
        return (ln60) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "httpStatusCode_", "feedId_", "isOffline_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new HomeFeedLoadingErrorEvent();
        }
        if (iOrdinal == 4) {
            return new ln60(DEFAULT_INSTANCE);
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
        synchronized (HomeFeedLoadingErrorEvent.class) {
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
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.feedId_ = str;
    }

    public final void q(int i) {
        this.bitField0_ |= 1;
        this.httpStatusCode_ = i;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 4;
        this.isOffline_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
