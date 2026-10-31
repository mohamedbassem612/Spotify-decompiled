package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lkz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthBlob$AuthBlob extends h implements v2j0 {
    private static final EsAuthBlob$AuthBlob DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER = 1;
    public static final int UNENCRYPTEDSTOREDCREDENTIALS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int blobCase_ = 0;
    private Object blob_;
    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedStoredCredentials_;

    static {
        EsAuthBlob$AuthBlob esAuthBlob$AuthBlob = new EsAuthBlob$AuthBlob();
        DEFAULT_INSTANCE = esAuthBlob$AuthBlob;
        h.registerDefaultInstance(EsAuthBlob$AuthBlob.class, esAuthBlob$AuthBlob);
    }

    private EsAuthBlob$AuthBlob() {
    }

    public static EsAuthBlob$AuthBlob n() {
        return DEFAULT_INSTANCE;
    }

    public static lkz p() {
        return (lkz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000", new Object[]{"blob_", "blobCase_", "bitField0_", EsEncryptedStoredCredentials$EncryptedStoredCredentials.class, "unencryptedStoredCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthBlob$AuthBlob();
        }
        if (iOrdinal == 4) {
            return new lkz(DEFAULT_INSTANCE);
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
        synchronized (EsAuthBlob$AuthBlob.class) {
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

    public final EsUnencryptedStoredCredentials$UnencryptedStoredCredentials o() {
        EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials = this.unencryptedStoredCredentials_;
        return esUnencryptedStoredCredentials$UnencryptedStoredCredentials == null ? EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.n() : esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
    }

    public final void q(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        this.unencryptedStoredCredentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
