package com.spotify.connectivity.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jc30;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ForceOfflineResponse extends h implements v2j0 {
    private static final ForceOfflineResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String errorMessage_ = "";
    private int statusCode_;

    static {
        ForceOfflineResponse forceOfflineResponse = new ForceOfflineResponse();
        DEFAULT_INSTANCE = forceOfflineResponse;
        h.registerDefaultInstance(ForceOfflineResponse.class, forceOfflineResponse);
    }

    private ForceOfflineResponse() {
    }

    public static ForceOfflineResponse p(byte[] bArr) {
        return (ForceOfflineResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "statusCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new ForceOfflineResponse();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (ForceOfflineResponse.class) {
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

    public final String n() {
        return this.errorMessage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final jc30 o() {
        jc30 jc30Var;
        int i = this.statusCode_;
        if (i != 0) {
            jc30Var = i != 2 ? null : jc30.c;
        } else {
            jc30Var = jc30.b;
        }
        return jc30Var == null ? jc30.d : jc30Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
