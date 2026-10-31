package com.spotify.pses.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.m420;
import p.nuk;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.ydh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ConfigurationResponse extends h implements v2j0 {
    private static final ConfigurationResponse DEFAULT_INSTANCE;
    public static final int DEFAULT_LAYOUT_FIELD_NUMBER = 3;
    public static final int FLAGS_FIELD_NUMBER = 1;
    public static final int GUEST_LAYOUT_FIELD_NUMBER = 8;
    public static final int INTENT_LED_LAYOUT_FIELD_NUMBER = 5;
    public static final int METHOD_LED_LAYOUT_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    private Object layout_;
    private int layoutCase_ = 0;
    private h290 flags_ = h.emptyProtobufList();
    private String requestId_ = "";

    static {
        ConfigurationResponse configurationResponse = new ConfigurationResponse();
        DEFAULT_INSTANCE = configurationResponse;
        h.registerDefaultInstance(ConfigurationResponse.class, configurationResponse);
    }

    private ConfigurationResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nuk s() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigurationResponse t(m420 m420Var) {
        return (ConfigurationResponse) h.parseFrom(DEFAULT_INSTANCE, m420Var);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0003<\u0000\u0004Ȉ\u0005<\u0000\u0006<\u0000\b<\u0000", new Object[]{"layout_", "layoutCase_", "flags_", DefaultLayout.class, "requestId_", IntentLedLayout.class, MethodLedLayout.class, GuestLayout.class});
        }
        if (iOrdinal == 3) {
            return new ConfigurationResponse();
        }
        if (iOrdinal == 4) {
            return new nuk();
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
        synchronized (ConfigurationResponse.class) {
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

    public final h290 o() {
        return this.flags_;
    }

    public final IntentLedLayout p() {
        return this.layoutCase_ == 5 ? (IntentLedLayout) this.layout_ : IntentLedLayout.p();
    }

    public final int q() {
        return ydh.a(this.layoutCase_);
    }

    public final String r() {
        return this.requestId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(IntentLedLayout intentLedLayout) {
        intentLedLayout.getClass();
        this.layout_ = intentLedLayout;
        this.layoutCase_ = 5;
    }
}
