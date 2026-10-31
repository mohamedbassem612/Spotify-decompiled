package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.ycr;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeeplinkOpenNonAuth extends h implements v2j0 {
    public static final int AUTH_SESSION_ID_FIELD_NUMBER = 8;
    public static final int DEEPLINK_SESSION_ID_FIELD_NUMBER = 4;
    private static final DeeplinkOpenNonAuth DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAVIGATION_REFERENCE_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 7;
    public static final int SHORTLINK_SOURCE_FIELD_NUMBER = 6;
    public static final int SHORT_LINK_FIELD_NUMBER = 5;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String link_ = "";
    private String entityUri_ = "";
    private String source_ = "";
    private String deeplinkSessionId_ = "";
    private String shortLink_ = "";
    private String shortlinkSource_ = "";
    private String shortlinkSessionId_ = "";
    private String authSessionId_ = "";
    private String navigationReference_ = "";

    static {
        DeeplinkOpenNonAuth deeplinkOpenNonAuth = new DeeplinkOpenNonAuth();
        DEFAULT_INSTANCE = deeplinkOpenNonAuth;
        h.registerDefaultInstance(DeeplinkOpenNonAuth.class, deeplinkOpenNonAuth);
    }

    private DeeplinkOpenNonAuth() {
    }

    public static ycr n() {
        return (ycr) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "link_", "entityUri_", "source_", "deeplinkSessionId_", "shortLink_", "shortlinkSource_", "shortlinkSessionId_", "authSessionId_", "navigationReference_"});
        }
        if (iOrdinal == 3) {
            return new DeeplinkOpenNonAuth();
        }
        if (iOrdinal == 4) {
            return new ycr(DEFAULT_INSTANCE);
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
        synchronized (DeeplinkOpenNonAuth.class) {
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
        this.bitField0_ |= 128;
        this.authSessionId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.deeplinkSessionId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.entityUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 256;
        this.navigationReference_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 16;
        this.shortLink_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.shortlinkSessionId_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 32;
        this.shortlinkSource_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 4;
        this.source_ = str;
    }
}
