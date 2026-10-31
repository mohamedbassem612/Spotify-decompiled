package com.spotify.carapplibrary.app.instrumentation.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kvc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CalImageLoadingError extends h implements v2j0 {
    private static final CalImageLoadingError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int EXTRAS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String type_ = "";
    private String uri_ = "";
    private String errorMessage_ = "";
    private String extras_ = "";

    static {
        CalImageLoadingError calImageLoadingError = new CalImageLoadingError();
        DEFAULT_INSTANCE = calImageLoadingError;
        h.registerDefaultInstance(CalImageLoadingError.class, calImageLoadingError);
    }

    private CalImageLoadingError() {
    }

    public static kvc n() {
        return (kvc) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "type_", "uri_", "errorMessage_", "extras_"});
        }
        if (iOrdinal == 3) {
            return new CalImageLoadingError();
        }
        if (iOrdinal == 4) {
            return new kvc(DEFAULT_INSTANCE);
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
        synchronized (CalImageLoadingError.class) {
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
        this.bitField0_ |= 4;
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
