package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.epz;
import p.fpz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$Progress extends h implements v2j0 {
    private static final EsOffline$Progress DEFAULT_INSTANCE;
    public static final int DOWNLOADED_BYTES_FIELD_NUMBER = 4;
    public static final int DOWNLOADED_TRACKS_FIELD_NUMBER = 3;
    public static final int DOWNLOADING_FIELD_NUMBER = 7;
    public static final int DOWNLOAD_SPEED_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PERCENT_COMPLETE_FIELD_NUMBER = 9;
    public static final int QUEUED_BYTES_FIELD_NUMBER = 2;
    public static final int QUEUED_TRACKS_FIELD_NUMBER = 1;
    public static final int SECONDS_LEFT_FIELD_NUMBER = 10;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 6;
    public static final int TOTAL_TRACKS_FIELD_NUMBER = 5;
    public static final int TRACK_TOTALS_STATE_FIELD_NUMBER = 11;
    private long downloadSpeed_;
    private long downloadedBytes_;
    private long downloadedTracks_;
    private boolean downloading_;
    private float percentComplete_;
    private long queuedBytes_;
    private long queuedTracks_;
    private long secondsLeft_;
    private long totalBytes_;
    private long totalTracks_;
    private int trackTotalsState_;

    static {
        EsOffline$Progress esOffline$Progress = new EsOffline$Progress();
        DEFAULT_INSTANCE = esOffline$Progress;
        h.registerDefaultInstance(EsOffline$Progress.class, esOffline$Progress);
    }

    private EsOffline$Progress() {
    }

    public static epz B() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EsOffline$Progress C(byte[] bArr) {
        return (EsOffline$Progress) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EsOffline$Progress o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final int A() {
        return this.trackTotalsState_;
    }

    public final void D(long j) {
        this.downloadSpeed_ = j;
    }

    public final void E(long j) {
        this.downloadedBytes_ = j;
    }

    public final void F(long j) {
        this.downloadedTracks_ = j;
    }

    public final void G() {
        this.downloading_ = true;
    }

    public final void H(float f) {
        this.percentComplete_ = f;
    }

    public final void I(long j) {
        this.queuedBytes_ = j;
    }

    public final void J(long j) {
        this.queuedTracks_ = j;
    }

    public final void K(long j) {
        this.secondsLeft_ = j;
    }

    public final void L(long j) {
        this.totalBytes_ = j;
    }

    public final void M(long j) {
        this.totalTracks_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0007\b\u0002\t\u0001\n\u0002\u000b\f", new Object[]{"queuedTracks_", "queuedBytes_", "downloadedTracks_", "downloadedBytes_", "totalTracks_", "totalBytes_", "downloading_", "downloadSpeed_", "percentComplete_", "secondsLeft_", "trackTotalsState_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$Progress();
        }
        if (iOrdinal == 4) {
            return new epz();
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
        synchronized (EsOffline$Progress.class) {
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

    public final long p() {
        return this.downloadSpeed_;
    }

    public final long q() {
        return this.downloadedBytes_;
    }

    public final long r() {
        return this.downloadedTracks_;
    }

    public final boolean s() {
        return this.downloading_;
    }

    public final float t() {
        return this.percentComplete_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final long u() {
        return this.queuedBytes_;
    }

    public final long v() {
        return this.queuedTracks_;
    }

    public final long w() {
        return this.secondsLeft_;
    }

    public final long x() {
        return this.totalBytes_;
    }

    public final long y() {
        return this.totalTracks_;
    }

    public final fpz z() {
        fpz fpzVarA = fpz.a(this.trackTotalsState_);
        return fpzVarA == null ? fpz.e : fpzVarA;
    }
}
