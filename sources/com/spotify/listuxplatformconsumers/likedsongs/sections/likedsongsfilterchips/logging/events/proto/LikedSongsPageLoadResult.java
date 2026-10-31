package com.spotify.listuxplatformconsumers.likedsongs.sections.likedsongsfilterchips.logging.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sfc0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LikedSongsPageLoadResult extends h implements v2j0 {
    public static final int ACTIVE_FILTER_CHIP_FIELD_NUMBER = 3;
    private static final LikedSongsPageLoadResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int TRACK_COUNT_FIELD_NUMBER = 2;
    private String activeFilterChip_ = "";
    private int bitField0_;
    private boolean success_;
    private int trackCount_;

    static {
        LikedSongsPageLoadResult likedSongsPageLoadResult = new LikedSongsPageLoadResult();
        DEFAULT_INSTANCE = likedSongsPageLoadResult;
        h.registerDefaultInstance(LikedSongsPageLoadResult.class, likedSongsPageLoadResult);
    }

    private LikedSongsPageLoadResult() {
    }

    public static sfc0 n() {
        return (sfc0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "success_", "trackCount_", "activeFilterChip_"});
        }
        if (iOrdinal == 3) {
            return new LikedSongsPageLoadResult();
        }
        if (iOrdinal == 4) {
            return new sfc0(DEFAULT_INSTANCE);
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
        synchronized (LikedSongsPageLoadResult.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        this.bitField0_ |= 4;
        this.activeFilterChip_ = str;
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.success_ = true;
    }

    public final void q(int i) {
        this.bitField0_ |= 2;
        this.trackCount_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
