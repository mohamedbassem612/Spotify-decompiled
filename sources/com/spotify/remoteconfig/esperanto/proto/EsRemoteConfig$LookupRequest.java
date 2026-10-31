package com.spotify.remoteconfig.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsRemoteConfig$LookupRequest extends h implements v2j0 {
    private static final EsRemoteConfig$LookupRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private String scope_ = "";
    private String name_ = "";

    static {
        EsRemoteConfig$LookupRequest esRemoteConfig$LookupRequest = new EsRemoteConfig$LookupRequest();
        DEFAULT_INSTANCE = esRemoteConfig$LookupRequest;
        h.registerDefaultInstance(EsRemoteConfig$LookupRequest.class, esRemoteConfig$LookupRequest);
    }

    private EsRemoteConfig$LookupRequest() {
    }

    public static EsRemoteConfig$LookupRequest p(byte[] bArr) {
        return (EsRemoteConfig$LookupRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"scope_", "name_"});
        }
        if (iOrdinal == 3) {
            return new EsRemoteConfig$LookupRequest();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 24);
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
        synchronized (EsRemoteConfig$LookupRequest.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.scope_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
