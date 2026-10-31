package com.spotify.stickers.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetSurfaceResponse extends h implements v2j0 {
    private static final GetSurfaceResponse DEFAULT_INSTANCE;
    public static final int FILTER_CHIPS_FIELD_NUMBER = 2;
    public static final int PACKS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 packs_ = h.emptyProtobufList();
    private h290 filterChips_ = h.emptyProtobufList();

    static {
        GetSurfaceResponse getSurfaceResponse = new GetSurfaceResponse();
        DEFAULT_INSTANCE = getSurfaceResponse;
        h.registerDefaultInstance(GetSurfaceResponse.class, getSurfaceResponse);
    }

    private GetSurfaceResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"packs_", StickerPack.class, "filterChips_", FilterChip.class});
        }
        if (iOrdinal == 3) {
            return new GetSurfaceResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (GetSurfaceResponse.class) {
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
        return this.filterChips_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.packs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
