package com.spotify.home.evopage.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn60;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class HomeFeedLoadingEvent extends h implements v2j0 {
    public static final int CACHE_HIT_FIELD_NUMBER = 1;
    private static final HomeFeedLoadingEvent DEFAULT_INSTANCE;
    public static final int FEED_ID_FIELD_NUMBER = 4;
    public static final int IS_OFFLINE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean cacheHit_;
    private boolean isOffline_;
    private String responseId_ = "";
    private String feedId_ = "";

    static {
        HomeFeedLoadingEvent homeFeedLoadingEvent = new HomeFeedLoadingEvent();
        DEFAULT_INSTANCE = homeFeedLoadingEvent;
        h.registerDefaultInstance(HomeFeedLoadingEvent.class, homeFeedLoadingEvent);
    }

    private HomeFeedLoadingEvent() {
    }

    public static mn60 n() {
        return (mn60) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "cacheHit_", "responseId_", "isOffline_", "feedId_"});
        }
        if (iOrdinal == 3) {
            return new HomeFeedLoadingEvent();
        }
        if (iOrdinal == 4) {
            return new mn60(DEFAULT_INSTANCE);
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
        synchronized (HomeFeedLoadingEvent.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 1;
        this.cacheHit_ = z;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.feedId_ = str;
    }

    public final void q(boolean z) {
        this.bitField0_ |= 4;
        this.isOffline_ = z;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.responseId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
