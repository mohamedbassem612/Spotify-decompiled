package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rx61;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Share extends h implements v2j0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 11;
    public static final int CAPABILITY_FIELD_NUMBER = 8;
    public static final int CREATOR_URI_FIELD_NUMBER = 6;
    private static final Share DEFAULT_INSTANCE;
    public static final int DESTINATION_ID_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int FULL_URL_FIELD_NUMBER = 14;
    public static final int INTEGRATION_FIELD_NUMBER = 9;
    public static final int INTERACTION_ID_FIELD_NUMBER = 12;
    public static final int INTERNAL_SHARE_ID_FIELD_NUMBER = 15;
    public static final int IS_OFFLINE_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int PRESELECTED_SHAREFORMAT_ID_FIELD_NUMBER = 17;
    public static final int SHAREFORMAT_ID_FIELD_NUMBER = 13;
    public static final int SHARE_ID_FIELD_NUMBER = 3;
    public static final int SHARE_URL_FIELD_NUMBER = 10;
    public static final int SOURCE_PAGE_FIELD_NUMBER = 5;
    public static final int SOURCE_PAGE_URI_FIELD_NUMBER = 4;
    public static final int SYSTEM_DESTINATION_FIELD_NUMBER = 7;
    private boolean audioPreview_;
    private int bitField0_;
    private boolean isOffline_;
    private String entityUri_ = "";
    private String destinationId_ = "";
    private String shareId_ = "";
    private String sourcePageUri_ = "";
    private String sourcePage_ = "";
    private String creatorUri_ = "";
    private String systemDestination_ = "";
    private String capability_ = "";
    private String integration_ = "";
    private String shareUrl_ = "";
    private String interactionId_ = "";
    private String shareformatId_ = "";
    private String fullUrl_ = "";
    private String internalShareId_ = "";
    private String preselectedShareformatId_ = "";

    static {
        Share share = new Share();
        DEFAULT_INSTANCE = share;
        h.registerDefaultInstance(Share.class, share);
    }

    private Share() {
    }

    public static rx61 n() {
        return (rx61) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.sourcePage_ = str;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.sourcePageUri_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.systemDestination_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဇ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0010ဇ\u000f\u0011ဈ\u0010", new Object[]{"bitField0_", "entityUri_", "destinationId_", "shareId_", "sourcePageUri_", "sourcePage_", "creatorUri_", "systemDestination_", "capability_", "integration_", "shareUrl_", "audioPreview_", "interactionId_", "shareformatId_", "fullUrl_", "internalShareId_", "isOffline_", "preselectedShareformatId_"});
        }
        if (iOrdinal == 3) {
            return new Share();
        }
        if (iOrdinal == 4) {
            return new rx61(DEFAULT_INSTANCE);
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
        synchronized (Share.class) {
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
        this.bitField0_ |= 128;
        this.capability_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.destinationId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.entityUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.fullUrl_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.integration_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.interactionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.internalShareId_ = str;
    }

    public final void v(boolean z) {
        this.bitField0_ |= 32768;
        this.isOffline_ = z;
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.preselectedShareformatId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.shareId_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.shareUrl_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.shareformatId_ = str;
    }
}
