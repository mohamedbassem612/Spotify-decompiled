package com.spotify.aipartner.aipartnerapiwrapper.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l0s0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class PartnerAIResolveIntentRequest extends h implements v2j0 {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final PartnerAIResolveIntentRequest DEFAULT_INSTANCE;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 3;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    public static final int SOURCE_DEVICE_FIELD_NUMBER = 5;
    public static final int TARGET_DEVICE_FIELD_NUMBER = 6;
    private int bitField0_;
    private String callingPackage_ = "";
    private String requestId_ = "";
    private String platform_ = "";
    private String mediaType_ = "";
    private String sourceDevice_ = "";
    private String targetDevice_ = "";

    static {
        PartnerAIResolveIntentRequest partnerAIResolveIntentRequest = new PartnerAIResolveIntentRequest();
        DEFAULT_INSTANCE = partnerAIResolveIntentRequest;
        h.registerDefaultInstance(PartnerAIResolveIntentRequest.class, partnerAIResolveIntentRequest);
    }

    private PartnerAIResolveIntentRequest() {
    }

    public static l0s0 n() {
        return (l0s0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "callingPackage_", "requestId_", "platform_", "mediaType_", "sourceDevice_", "targetDevice_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAIResolveIntentRequest();
        }
        if (iOrdinal == 4) {
            return new l0s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAIResolveIntentRequest.class) {
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
        this.bitField0_ |= 1;
        this.callingPackage_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.mediaType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.platform_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.sourceDevice_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.targetDevice_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
