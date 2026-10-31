package com.spotify.adsdisplay.elementimpl.survey.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hv0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AdPreferenceChangedEvent extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 6;
    public static final int AD_PLAYBACK_ID_FIELD_NUMBER = 5;
    private static final AdPreferenceChangedEvent DEFAULT_INSTANCE;
    public static final int NEW_VALUE_FIELD_NUMBER = 2;
    public static final int OLD_VALUE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREFERENCE_FIELD_NUMBER = 1;
    public static final int PROPERTY_FIELD_NUMBER = 7;
    public static final int REASON_FIELD_NUMBER = 4;
    private int bitField0_;
    private String preference_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";
    private String reason_ = "";
    private String adPlaybackId_ = "";
    private String adId_ = "";
    private String property_ = "";

    static {
        AdPreferenceChangedEvent adPreferenceChangedEvent = new AdPreferenceChangedEvent();
        DEFAULT_INSTANCE = adPreferenceChangedEvent;
        h.registerDefaultInstance(AdPreferenceChangedEvent.class, adPreferenceChangedEvent);
    }

    private AdPreferenceChangedEvent() {
    }

    public static hv0 n() {
        return (hv0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "preference_", "newValue_", "oldValue_", "reason_", "adPlaybackId_", "adId_", "property_"});
        }
        if (iOrdinal == 3) {
            return new AdPreferenceChangedEvent();
        }
        if (iOrdinal == 4) {
            return new hv0(DEFAULT_INSTANCE);
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
        synchronized (AdPreferenceChangedEvent.class) {
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
        this.adId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.newValue_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.oldValue_ = str;
    }

    public final void r() {
        this.bitField0_ |= 1;
        this.preference_ = "ad_topic";
    }

    public final void s(String str) {
        this.bitField0_ |= 64;
        this.property_ = str;
    }

    public final void t() {
        this.bitField0_ |= 8;
        this.reason_ = "topic_survey";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
