package com.spotify.connectivity.hosts.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsHosts$Hosts extends h implements v2j0 {
    public static final int BACKENDRPCGLOBALHOST_FIELD_NUMBER = 3;
    public static final int BACKENDRPCREGIONALHOST_FIELD_NUMBER = 4;
    public static final int BACKENDSTREAMINGHOST_FIELD_NUMBER = 1;
    private static final EsHosts$Hosts DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String backendStreamingHost_ = "";
    private String backendRpcGlobalHost_ = "";
    private String backendRpcRegionalHost_ = "";

    static {
        EsHosts$Hosts esHosts$Hosts = new EsHosts$Hosts();
        DEFAULT_INSTANCE = esHosts$Hosts;
        h.registerDefaultInstance(EsHosts$Hosts.class, esHosts$Hosts);
    }

    private EsHosts$Hosts() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsHosts$Hosts q(byte[] bArr) {
        return (EsHosts$Hosts) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"backendStreamingHost_", "backendRpcGlobalHost_", "backendRpcRegionalHost_"});
        }
        if (iOrdinal == 3) {
            return new EsHosts$Hosts();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 5);
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
        synchronized (EsHosts$Hosts.class) {
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

    public final String o() {
        return this.backendRpcGlobalHost_;
    }

    public final String p() {
        return this.backendRpcRegionalHost_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
