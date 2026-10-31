package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsStoredUserInfo$NullableStoredUserInfo extends h implements v2j0 {
    private static final EsStoredUserInfo$NullableStoredUserInfo DEFAULT_INSTANCE;
    public static final int NULL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STORED_USER_INFO_FIELD_NUMBER = 1;
    private int userInfoCase_ = 0;
    private Object userInfo_;

    static {
        EsStoredUserInfo$NullableStoredUserInfo esStoredUserInfo$NullableStoredUserInfo = new EsStoredUserInfo$NullableStoredUserInfo();
        DEFAULT_INSTANCE = esStoredUserInfo$NullableStoredUserInfo;
        h.registerDefaultInstance(EsStoredUserInfo$NullableStoredUserInfo.class, esStoredUserInfo$NullableStoredUserInfo);
    }

    private EsStoredUserInfo$NullableStoredUserInfo() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsStoredUserInfo$NullableStoredUserInfo q(byte[] bArr) {
        return (EsStoredUserInfo$NullableStoredUserInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002?\u0000", new Object[]{"userInfo_", "userInfoCase_", EsStoredUserInfo$StoredUserInfo.class});
        }
        if (iOrdinal == 3) {
            return new EsStoredUserInfo$NullableStoredUserInfo();
        }
        if (iOrdinal == 4) {
            return new lrz((byte) 11);
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
        synchronized (EsStoredUserInfo$NullableStoredUserInfo.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsStoredUserInfo$StoredUserInfo o() {
        return this.userInfoCase_ == 1 ? (EsStoredUserInfo$StoredUserInfo) this.userInfo_ : EsStoredUserInfo$StoredUserInfo.o();
    }

    public final boolean p() {
        return this.userInfoCase_ == 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
