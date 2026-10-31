package com.spotify.timesyncedtext.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetTimeSyncedTextResponse extends h implements v2j0 {
    private static final GetTimeSyncedTextResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TIME_SYNCED_TEXT_FIELD_NUMBER = 3;
    private h290 timeSyncedText_ = h.emptyProtobufList();

    static {
        GetTimeSyncedTextResponse getTimeSyncedTextResponse = new GetTimeSyncedTextResponse();
        DEFAULT_INSTANCE = getTimeSyncedTextResponse;
        h.registerDefaultInstance(GetTimeSyncedTextResponse.class, getTimeSyncedTextResponse);
    }

    private GetTimeSyncedTextResponse() {
    }

    public static GetTimeSyncedTextResponse o(byte[] bArr) {
        return (GetTimeSyncedTextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"timeSyncedText_", TimeSyncedText.class});
        }
        if (iOrdinal == 3) {
            return new GetTimeSyncedTextResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (GetTimeSyncedTextResponse.class) {
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

    public final h290 n() {
        return this.timeSyncedText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
