package com.spotify.connectivity.auth.storage.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zrz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsStoredUserInfo$StoredUserInfo extends h implements v2j0 {
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsStoredUserInfo$StoredUserInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private EsAuthBlob$AuthBlob authBlob_;
    private int bitField0_;
    private String username_ = "";

    static {
        EsStoredUserInfo$StoredUserInfo esStoredUserInfo$StoredUserInfo = new EsStoredUserInfo$StoredUserInfo();
        DEFAULT_INSTANCE = esStoredUserInfo$StoredUserInfo;
        h.registerDefaultInstance(EsStoredUserInfo$StoredUserInfo.class, esStoredUserInfo$StoredUserInfo);
    }

    private EsStoredUserInfo$StoredUserInfo() {
    }

    public static EsStoredUserInfo$StoredUserInfo o() {
        return DEFAULT_INSTANCE;
    }

    public static zrz p() {
        return (zrz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "username_", "authBlob_"});
        }
        if (iOrdinal == 3) {
            return new EsStoredUserInfo$StoredUserInfo();
        }
        if (iOrdinal == 4) {
            return new zrz(DEFAULT_INSTANCE);
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
        synchronized (EsStoredUserInfo$StoredUserInfo.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    public final EsAuthBlob$AuthBlob n() {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = this.authBlob_;
        return esAuthBlob$AuthBlob == null ? EsAuthBlob$AuthBlob.n() : esAuthBlob$AuthBlob;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(EsAuthBlob$AuthBlob esAuthBlob$AuthBlob) {
        this.authBlob_ = esAuthBlob$AuthBlob;
        this.bitField0_ |= 1;
    }

    public final void r(String str) {
        str.getClass();
        this.username_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
