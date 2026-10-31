package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v0a1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialListeningClientSessionCreated extends h implements v2j0 {
    private static final SocialListeningClientSessionCreated DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_TYPE_FIELD_NUMBER = 3;
    public static final int SESSION_URI_FIELD_NUMBER = 2;
    public static final int TECH_TYPE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String sessionId_ = "";
    private String sessionUri_ = "";
    private String sessionType_ = "";
    private String deviceType_ = "";
    private String techType_ = "";

    static {
        SocialListeningClientSessionCreated socialListeningClientSessionCreated = new SocialListeningClientSessionCreated();
        DEFAULT_INSTANCE = socialListeningClientSessionCreated;
        h.registerDefaultInstance(SocialListeningClientSessionCreated.class, socialListeningClientSessionCreated);
    }

    private SocialListeningClientSessionCreated() {
    }

    public static v0a1 n() {
        return (v0a1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "sessionId_", "sessionUri_", "sessionType_", "deviceType_", "techType_"});
        }
        if (iOrdinal == 3) {
            return new SocialListeningClientSessionCreated();
        }
        if (iOrdinal == 4) {
            return new v0a1(DEFAULT_INSTANCE);
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
        synchronized (SocialListeningClientSessionCreated.class) {
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
        this.bitField0_ |= 8;
        this.deviceType_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.sessionType_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.sessionUri_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.techType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
