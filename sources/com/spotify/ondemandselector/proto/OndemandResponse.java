package com.spotify.ondemandselector.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.djp0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class OndemandResponse extends h implements v2j0 {
    private static final OndemandResponse DEFAULT_INSTANCE;
    public static final int EXPIRETIMESTAMPMILLIS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URIS_FIELD_NUMBER = 1;
    private long expireTimestampMillis_;
    private h290 uris_ = h.emptyProtobufList();

    static {
        OndemandResponse ondemandResponse = new OndemandResponse();
        DEFAULT_INSTANCE = ondemandResponse;
        h.registerDefaultInstance(OndemandResponse.class, ondemandResponse);
    }

    private OndemandResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0002", new Object[]{"uris_", "expireTimestampMillis_"});
        }
        if (iOrdinal == 3) {
            return new OndemandResponse();
        }
        if (iOrdinal == 4) {
            return new djp0((byte) 24);
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
        synchronized (OndemandResponse.class) {
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

    public final List getUrisList() {
        return this.uris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.expireTimestampMillis_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
