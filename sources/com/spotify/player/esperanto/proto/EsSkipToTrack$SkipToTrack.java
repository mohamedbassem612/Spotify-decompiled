package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wrz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsSkipToTrack$SkipToTrack extends com.google.protobuf.h implements v2j0 {
    private static final EsSkipToTrack$SkipToTrack DEFAULT_INSTANCE;
    public static final int PAGE_INDEX_FIELD_NUMBER = 2;
    public static final int PAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_INDEX_FIELD_NUMBER = 5;
    public static final int TRACK_UID_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOptional.OptionalInt64 pageIndex_;
    private EsOptional.OptionalInt64 trackIndex_;
    private String pageUrl_ = "";
    private String trackUid_ = "";
    private String trackUri_ = "";

    static {
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = new EsSkipToTrack$SkipToTrack();
        DEFAULT_INSTANCE = esSkipToTrack$SkipToTrack;
        com.google.protobuf.h.registerDefaultInstance(EsSkipToTrack$SkipToTrack.class, esSkipToTrack$SkipToTrack);
    }

    private EsSkipToTrack$SkipToTrack() {
    }

    public static EsSkipToTrack$SkipToTrack n() {
        return DEFAULT_INSTANCE;
    }

    public static wrz p() {
        return (wrz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001", new Object[]{"bitField0_", "pageUrl_", "pageIndex_", "trackUid_", "trackUri_", "trackIndex_"});
        }
        if (iOrdinal == 3) {
            return new EsSkipToTrack$SkipToTrack();
        }
        if (iOrdinal == 4) {
            return new wrz(DEFAULT_INSTANCE);
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
        synchronized (EsSkipToTrack$SkipToTrack.class) {
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

    public final String o() {
        return this.trackUid_;
    }

    public final void q(EsOptional.OptionalInt64 optionalInt64) {
        optionalInt64.getClass();
        this.pageIndex_ = optionalInt64;
        this.bitField0_ |= 1;
    }

    public final void r(String str) {
        str.getClass();
        this.pageUrl_ = str;
    }

    public final void s(EsOptional.OptionalInt64 optionalInt64) {
        optionalInt64.getClass();
        this.trackIndex_ = optionalInt64;
        this.bitField0_ |= 2;
    }

    public final void t(String str) {
        str.getClass();
        this.trackUid_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.trackUri_ = str;
    }
}
