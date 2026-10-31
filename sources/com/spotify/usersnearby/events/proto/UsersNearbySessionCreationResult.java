package com.spotify.usersnearby.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.oni1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UsersNearbySessionCreationResult extends h implements v2j0 {
    private static final UsersNearbySessionCreationResult DEFAULT_INSTANCE;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 4;
    public static final int ERROR_DATA_FIELD_NUMBER = 3;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private String featureId_ = "";
    private String sessionToken_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";

    static {
        UsersNearbySessionCreationResult usersNearbySessionCreationResult = new UsersNearbySessionCreationResult();
        DEFAULT_INSTANCE = usersNearbySessionCreationResult;
        h.registerDefaultInstance(UsersNearbySessionCreationResult.class, usersNearbySessionCreationResult);
    }

    private UsersNearbySessionCreationResult() {
    }

    public static oni1 n() {
        return (oni1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "featureId_", "sessionToken_", "errorData_", "errorCategory_"});
        }
        if (iOrdinal == 3) {
            return new UsersNearbySessionCreationResult();
        }
        if (iOrdinal == 4) {
            return new oni1(DEFAULT_INSTANCE);
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
        synchronized (UsersNearbySessionCreationResult.class) {
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
        this.errorCategory_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.errorData_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.featureId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.sessionToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
