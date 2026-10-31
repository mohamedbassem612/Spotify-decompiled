package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.in0;
import p.jf40;
import p.kn0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AdDetectionOuterClass$DetectResponse extends h implements v2j0 {
    public static final int AD_BREAKS_FIELD_NUMBER = 2;
    public static final int AUDIO_URI_FIELD_NUMBER = 10;
    private static final AdDetectionOuterClass$DetectResponse DEFAULT_INSTANCE;
    public static final int DEGRADED_RANGES_FIELD_NUMBER = 3;
    public static final int DETECTION_ALGORITHM_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 7;
    public static final int REMAINING_AD_DURATION_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 8;
    public static final int TOTAL_AD_DURATION_FIELD_NUMBER = 4;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 6;
    private int detectionAlgorithm_;
    private int precision_;
    private int remainingAdDuration_;
    private int status_;
    private int totalAdDuration_;
    private int totalBytes_;
    private h290 adBreaks_ = h.emptyProtobufList();
    private h290 degradedRanges_ = h.emptyProtobufList();
    private String audioUri_ = "";

    public static final class InternalTimelineResync extends h implements v2j0 {
        public static final int ADJUSTMENT_MS_FIELD_NUMBER = 1;
        private static final InternalTimelineResync DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int adjustmentMs_;

        static {
            InternalTimelineResync internalTimelineResync = new InternalTimelineResync();
            DEFAULT_INSTANCE = internalTimelineResync;
            h.registerDefaultInstance(InternalTimelineResync.class, internalTimelineResync);
        }

        private InternalTimelineResync() {
        }

        public static InternalTimelineResync o() {
            return DEFAULT_INSTANCE;
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"adjustmentMs_"});
            }
            if (iOrdinal == 3) {
                return new InternalTimelineResync();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (InternalTimelineResync.class) {
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

        public final int n() {
            return this.adjustmentMs_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Range extends h implements v2j0 {
        private static final Range DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 3;
        public static final int END_BYTE_FIELD_NUMBER = 5;
        public static final int END_MS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PRECISION_FIELD_NUMBER = 6;
        public static final int RESYNC_FIELD_NUMBER = 7;
        public static final int START_BYTE_FIELD_NUMBER = 4;
        public static final int START_MS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int durationMs_;
        private int endByte_;
        private int endMs_;
        private int precision_;
        private InternalTimelineResync resync_;
        private int startByte_;
        private int startMs_;

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            h.registerDefaultInstance(Range.class, range);
        }

        private Range() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\f\u0007ဉ\u0000", new Object[]{"bitField0_", "startMs_", "endMs_", "durationMs_", "startByte_", "endByte_", "precision_", "resync_"});
            }
            if (iOrdinal == 3) {
                return new Range();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (Range.class) {
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

        public final int n() {
            return this.durationMs_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            return this.endByte_;
        }

        public final int p() {
            return this.endMs_;
        }

        public final kn0 q() {
            kn0 kn0VarA = kn0.a(this.precision_);
            return kn0VarA == null ? kn0.e : kn0VarA;
        }

        public final InternalTimelineResync r() {
            InternalTimelineResync internalTimelineResync = this.resync_;
            return internalTimelineResync == null ? InternalTimelineResync.o() : internalTimelineResync;
        }

        public final int s() {
            return this.startByte_;
        }

        public final int t() {
            return this.startMs_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AdDetectionOuterClass$DetectResponse adDetectionOuterClass$DetectResponse = new AdDetectionOuterClass$DetectResponse();
        DEFAULT_INSTANCE = adDetectionOuterClass$DetectResponse;
        h.registerDefaultInstance(AdDetectionOuterClass$DetectResponse.class, adDetectionOuterClass$DetectResponse);
    }

    private AdDetectionOuterClass$DetectResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AdDetectionOuterClass$DetectResponse u(byte[] bArr) {
        return (AdDetectionOuterClass$DetectResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0002\n\t\u0000\u0002\u0000\u0002\u001b\u0003\u001b\u0004\u0004\u0005\u0004\u0006\u0004\u0007\f\b\f\t\f\nȈ", new Object[]{"adBreaks_", Range.class, "degradedRanges_", Range.class, "totalAdDuration_", "remainingAdDuration_", "totalBytes_", "precision_", "status_", "detectionAlgorithm_", "audioUri_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$DetectResponse();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$DetectResponse.class) {
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
        return this.adBreaks_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.degradedRanges_;
    }

    public final kn0 p() {
        kn0 kn0VarA = kn0.a(this.precision_);
        return kn0VarA == null ? kn0.e : kn0VarA;
    }

    public final int q() {
        return this.remainingAdDuration_;
    }

    public final in0 r() {
        in0 in0Var;
        int i = this.status_;
        if (i == 0) {
            in0Var = in0.DETECT_STATUS_UNKNOWN;
        } else if (i == 1) {
            in0Var = in0.DETECT_STATUS_ERROR;
        } else if (i == 2) {
            in0Var = in0.DETECT_STATUS_IN_PROGRESS;
        } else if (i == 3) {
            in0Var = in0.DETECT_STATUS_FINISHED;
        } else if (i != 4) {
            in0Var = i != 5 ? null : in0.DETECT_STATUS_FINISHED_BASED_ON_METADATA_ONLY;
        } else {
            in0Var = in0.DETECT_STATUS_AUDIO_UNAVAILABLE;
        }
        return in0Var == null ? in0.UNRECOGNIZED : in0Var;
    }

    public final int s() {
        return this.totalAdDuration_;
    }

    public final int t() {
        return this.totalBytes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
