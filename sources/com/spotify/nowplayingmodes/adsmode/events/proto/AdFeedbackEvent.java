package com.spotify.nowplayingmodes.adsmode.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AdFeedbackEvent extends h implements v2j0 {
    public static final int ADVERTISER_FIELD_NUMBER = 5;
    public static final int AD_ID_FIELD_NUMBER = 4;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final AdFeedbackEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 12;
    public static final int FORMAT_FIELD_NUMBER = 9;
    public static final int IMAGE_URL_FIELD_NUMBER = 10;
    public static final int LINE_ITEM_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_FILES_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 14;
    public static final int PROGRESS_FIELD_NUMBER = 8;
    public static final int SLOT_FIELD_NUMBER = 13;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int VOLUME_FIELD_NUMBER = 7;
    private int bitField0_;
    private long progress_;
    private double volume_;
    private String lineItemId_ = "";
    private String creativeId_ = "";
    private String adPlaybackId_ = "";
    private String adId_ = "";
    private String advertiser_ = "";
    private String title_ = "";
    private String format_ = "";
    private String imageUrl_ = "";
    private String mediaFiles_ = "";
    private String event_ = "";
    private String slot_ = "";
    private String productName_ = "";

    static {
        AdFeedbackEvent adFeedbackEvent = new AdFeedbackEvent();
        DEFAULT_INSTANCE = adFeedbackEvent;
        h.registerDefaultInstance(AdFeedbackEvent.class, adFeedbackEvent);
    }

    private AdFeedbackEvent() {
    }

    public static sp0 n() {
        return (sp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007က\u0006\bဂ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"bitField0_", "lineItemId_", "creativeId_", "adPlaybackId_", "adId_", "advertiser_", "title_", "volume_", "progress_", "format_", "imageUrl_", "mediaFiles_", "event_", "slot_", "productName_"});
        }
        if (iOrdinal == 3) {
            return new AdFeedbackEvent();
        }
        if (iOrdinal == 4) {
            return new sp0(DEFAULT_INSTANCE);
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
        synchronized (AdFeedbackEvent.class) {
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
        this.bitField0_ |= 4;
        this.adPlaybackId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.advertiser_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.creativeId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.event_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 256;
        this.format_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.lineItemId_ = str;
    }

    public final void v(long j) {
        this.bitField0_ |= 128;
        this.progress_ = j;
    }

    public final void w(double d) {
        this.bitField0_ |= 64;
        this.volume_ = d;
    }
}
