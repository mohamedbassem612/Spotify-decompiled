package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vkz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateCredentials$ParentChildCredentials extends h implements v2j0 {
    public static final int CHILDID_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$ParentChildCredentials DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UNENCRYPTEDPARENTCREDENTIALS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String childId_ = "";
    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedParentCredentials_;

    static {
        EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials = new EsAuthenticateCredentials$ParentChildCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$ParentChildCredentials;
        h.registerDefaultInstance(EsAuthenticateCredentials$ParentChildCredentials.class, esAuthenticateCredentials$ParentChildCredentials);
    }

    private EsAuthenticateCredentials$ParentChildCredentials() {
    }

    public static vkz o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "childId_", "unencryptedParentCredentials_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$ParentChildCredentials();
        }
        if (iOrdinal == 4) {
            return new vkz();
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
        synchronized (EsAuthenticateCredentials$ParentChildCredentials.class) {
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

    public final void p(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        this.unencryptedParentCredentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        this.bitField0_ |= 1;
    }

    public final void setChildId(String str) {
        str.getClass();
        this.childId_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
