package com.spotify.liveeventslocation.v1.userlocation;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kr40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetUserLocationRequest extends h implements v2j0 {
    private static final GetUserLocationRequest DEFAULT_INSTANCE;
    public static final int IGNORED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String ignored_ = "";

    static {
        GetUserLocationRequest getUserLocationRequest = new GetUserLocationRequest();
        DEFAULT_INSTANCE = getUserLocationRequest;
        h.registerDefaultInstance(GetUserLocationRequest.class, getUserLocationRequest);
    }

    private GetUserLocationRequest() {
    }

    public static kr40 n() {
        return (kr40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "ignored_"});
        }
        if (iOrdinal == 3) {
            return new GetUserLocationRequest();
        }
        if (iOrdinal == 4) {
            return new kr40(DEFAULT_INSTANCE);
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
        synchronized (GetUserLocationRequest.class) {
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

    public final void o() {
        this.bitField0_ |= 1;
        this.ignored_ = "ignorethis";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
