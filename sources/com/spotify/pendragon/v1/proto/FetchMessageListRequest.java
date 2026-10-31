package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nz10;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FetchMessageListRequest extends h implements v2j0 {
    private static final FetchMessageListRequest DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int NATIVE_COMPONENT_VERSION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String locale_ = "";
    private int nativeComponentVersion_;

    static {
        FetchMessageListRequest fetchMessageListRequest = new FetchMessageListRequest();
        DEFAULT_INSTANCE = fetchMessageListRequest;
        h.registerDefaultInstance(FetchMessageListRequest.class, fetchMessageListRequest);
    }

    private FetchMessageListRequest() {
    }

    public static nz10 n() {
        return (nz10) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"locale_", "nativeComponentVersion_"});
        }
        if (iOrdinal == 3) {
            return new FetchMessageListRequest();
        }
        if (iOrdinal == 4) {
            return new nz10(DEFAULT_INSTANCE);
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
        synchronized (FetchMessageListRequest.class) {
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
        this.locale_ = str;
    }

    public final void p() {
        this.nativeComponentVersion_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
