package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uoz;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOffline$Error extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final EsOffline$Error DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int code_;

    static {
        EsOffline$Error esOffline$Error = new EsOffline$Error();
        DEFAULT_INSTANCE = esOffline$Error;
        h.registerDefaultInstance(EsOffline$Error.class, esOffline$Error);
    }

    private EsOffline$Error() {
    }

    public static EsOffline$Error o(byte[] bArr) {
        return (EsOffline$Error) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"code_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Error();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (EsOffline$Error.class) {
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

    public final uoz n() {
        uoz uozVar;
        int i = this.code_;
        if (i == 0) {
            uozVar = uoz.SUCCESS;
        } else if (i == 1) {
            uozVar = uoz.GENERIC;
        } else if (i == 8) {
            uozVar = uoz.DISK_FULL;
        } else if (i == 14) {
            uozVar = uoz.EXPIRED;
        } else if (i == 19) {
            uozVar = uoz.TOO_MANY_TRACKS;
        } else if (i == 23) {
            uozVar = uoz.NOT_ALLOWED;
        } else if (i != 36) {
            uozVar = i != 7028 ? null : uoz.DEVICE_LIMIT_REACHED;
        } else {
            uozVar = uoz.CONNECTION_DISABLED;
        }
        return uozVar == null ? uoz.UNRECOGNIZED : uozVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
