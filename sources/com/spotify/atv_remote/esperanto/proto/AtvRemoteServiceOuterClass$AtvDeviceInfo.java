package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.kn7;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvDeviceInfo extends h implements v2j0 {
    private static final AtvRemoteServiceOuterClass$AtvDeviceInfo DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    public static final int IP_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PAIRED_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int TXT_RECORDS_FIELD_NUMBER = 5;
    private boolean paired_;
    private int port_;
    private qng0 txtRecords_ = qng0.b;
    private String name_ = "";
    private String host_ = "";
    private String ip_ = "";

    static {
        AtvRemoteServiceOuterClass$AtvDeviceInfo atvRemoteServiceOuterClass$AtvDeviceInfo = new AtvRemoteServiceOuterClass$AtvDeviceInfo();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvDeviceInfo;
        h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvDeviceInfo.class, atvRemoteServiceOuterClass$AtvDeviceInfo);
    }

    private AtvRemoteServiceOuterClass$AtvDeviceInfo() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ȉ\u00052\u0006\u0007", new Object[]{"name_", "host_", "port_", "ip_", "txtRecords_", kn7.a, "paired_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvDeviceInfo();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (AtvRemoteServiceOuterClass$AtvDeviceInfo.class) {
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

    public final String n() {
        return this.host_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ip_;
    }

    public final boolean p() {
        return this.paired_;
    }

    public final int q() {
        return this.port_;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.txtRecords_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
