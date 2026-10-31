package com.spotify.share.destinations.smartsorting.networking.request;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.dja1;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SortedDestinationsProtoResponse extends h implements v2j0 {
    public static final int AGGREGATION_FIELD_NUMBER = 1;
    private static final SortedDestinationsProtoResponse DEFAULT_INSTANCE;
    public static final int DESTINATIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int aggregation_;
    private qng0 destinations_ = qng0.b;

    static {
        SortedDestinationsProtoResponse sortedDestinationsProtoResponse = new SortedDestinationsProtoResponse();
        DEFAULT_INSTANCE = sortedDestinationsProtoResponse;
        h.registerDefaultInstance(SortedDestinationsProtoResponse.class, sortedDestinationsProtoResponse);
    }

    private SortedDestinationsProtoResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u00022", new Object[]{"aggregation_", "destinations_", dja1.a});
        }
        if (iOrdinal == 3) {
            return new SortedDestinationsProtoResponse();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (SortedDestinationsProtoResponse.class) {
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

    public final Map n() {
        return Collections.unmodifiableMap(this.destinations_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
