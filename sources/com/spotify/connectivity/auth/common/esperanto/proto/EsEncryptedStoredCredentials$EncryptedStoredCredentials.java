package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsEncryptedStoredCredentials$EncryptedStoredCredentials extends h implements v2j0 {
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsEncryptedStoredCredentials$EncryptedStoredCredentials DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";
    private phc authBlob_ = phc.b;
    private String deviceId_ = "";

    static {
        EsEncryptedStoredCredentials$EncryptedStoredCredentials esEncryptedStoredCredentials$EncryptedStoredCredentials = new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
        DEFAULT_INSTANCE = esEncryptedStoredCredentials$EncryptedStoredCredentials;
        h.registerDefaultInstance(EsEncryptedStoredCredentials$EncryptedStoredCredentials.class, esEncryptedStoredCredentials$EncryptedStoredCredentials);
    }

    private EsEncryptedStoredCredentials$EncryptedStoredCredentials() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"username_", "authBlob_", "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 1);
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
        synchronized (EsEncryptedStoredCredentials$EncryptedStoredCredentials.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
