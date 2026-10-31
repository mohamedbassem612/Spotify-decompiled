package com.spotify.adshome.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o2x;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class EmbeddedHomeAdEvent extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 5;
    private static final EmbeddedHomeAdEvent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adId_ = "";
    private String adPlaybackId_ = "";

    static {
        EmbeddedHomeAdEvent embeddedHomeAdEvent = new EmbeddedHomeAdEvent();
        DEFAULT_INSTANCE = embeddedHomeAdEvent;
        h.registerDefaultInstance(EmbeddedHomeAdEvent.class, embeddedHomeAdEvent);
    }

    private EmbeddedHomeAdEvent() {
    }

    public static o2x n() {
        return (o2x) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adId_", "adPlaybackId_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedHomeAdEvent();
        }
        if (iOrdinal == 4) {
            return new o2x(DEFAULT_INSTANCE);
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
        synchronized (EmbeddedHomeAdEvent.class) {
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
        this.adId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.adPlaybackId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.eventName_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
