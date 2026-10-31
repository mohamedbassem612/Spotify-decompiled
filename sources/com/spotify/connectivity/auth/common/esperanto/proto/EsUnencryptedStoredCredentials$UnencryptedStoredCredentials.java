package com.spotify.connectivity.auth.common.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vsz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsUnencryptedStoredCredentials$UnencryptedStoredCredentials extends h implements v2j0 {
    private static final EsUnencryptedStoredCredentials$UnencryptedStoredCredentials DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";
    private phc storedCredentials_ = phc.b;

    static {
        EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials = new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
        DEFAULT_INSTANCE = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        h.registerDefaultInstance(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class, esUnencryptedStoredCredentials$UnencryptedStoredCredentials);
    }

    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials() {
    }

    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials n() {
        return DEFAULT_INSTANCE;
    }

    public static vsz p() {
        return (vsz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"username_", "storedCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
        }
        if (iOrdinal == 4) {
            return new vsz(DEFAULT_INSTANCE);
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
        synchronized (EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final phc o() {
        return this.storedCredentials_;
    }

    public final void q(hhc hhcVar) {
        this.storedCredentials_ = hhcVar;
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
