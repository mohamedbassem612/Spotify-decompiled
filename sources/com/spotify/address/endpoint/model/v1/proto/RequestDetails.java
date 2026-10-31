package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.jf40;
import p.lo21;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class RequestDetails extends com.google.protobuf.h implements v2j0 {
    public static final int ANDROID_APP_VERSION_FIELD_NUMBER = 4;
    public static final int AUTOCOMPLETE_ENABLED_FIELD_NUMBER = 6;
    public static final int CONFIGURATION_TYPE_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final RequestDetails DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int WEB_SDK_VERSION_FIELD_NUMBER = 5;
    private boolean autocompleteEnabled_;
    private Object version_;
    private int versionCase_ = 0;
    private String configurationType_ = "";
    private String country_ = "";
    private String locale_ = "";

    static {
        RequestDetails requestDetails = new RequestDetails();
        DEFAULT_INSTANCE = requestDetails;
        com.google.protobuf.h.registerDefaultInstance(RequestDetails.class, requestDetails);
    }

    private RequestDetails() {
    }

    public static RequestDetails p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static lo21 q() {
        return (lo21) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006\u0007", new Object[]{"version_", "versionCase_", "configurationType_", "country_", "locale_", "autocompleteEnabled_"});
        }
        if (iOrdinal == 3) {
            return new RequestDetails();
        }
        if (iOrdinal == 4) {
            return new lo21(DEFAULT_INSTANCE);
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
        synchronized (RequestDetails.class) {
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

    public final boolean n() {
        return this.autocompleteEnabled_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.country_;
    }

    public final void r() {
        this.autocompleteEnabled_ = true;
    }

    public final void s(String str) {
        str.getClass();
        this.configurationType_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.country_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
