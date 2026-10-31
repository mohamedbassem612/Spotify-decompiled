package com.spotify.lyrics.fullscreenview.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsErrorReportingEventV3 extends h implements v2j0 {
    private static final LyricsErrorReportingEventV3 DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 3;
    public static final int REPORTED_CORRECTIONS_FIELD_NUMBER = 6;
    public static final int REPORTED_FULL_LYRICS_TEXT_FIELD_NUMBER = 5;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String flag_ = "";
    private String reportedFullLyricsText_ = "";
    private h290 reportedCorrections_ = h.emptyProtobufList();

    public static final class ReportedCorrections extends h implements v2j0 {
        public static final int CORRECTED_TEXT_FIELD_NUMBER = 2;
        private static final ReportedCorrections DEFAULT_INSTANCE;
        public static final int ORIGINAL_TEXT_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private String originalText_ = "";
        private String correctedText_ = "";

        static {
            ReportedCorrections reportedCorrections = new ReportedCorrections();
            DEFAULT_INSTANCE = reportedCorrections;
            h.registerDefaultInstance(ReportedCorrections.class, reportedCorrections);
        }

        private ReportedCorrections() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "originalText_", "correctedText_"});
            }
            if (iOrdinal == 3) {
                return new ReportedCorrections();
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
            synchronized (ReportedCorrections.class) {
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
            str.getClass();
            this.bitField0_ |= 2;
            this.correctedText_ = str;
        }

        public final void p(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.originalText_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        LyricsErrorReportingEventV3 lyricsErrorReportingEventV3 = new LyricsErrorReportingEventV3();
        DEFAULT_INSTANCE = lyricsErrorReportingEventV3;
        h.registerDefaultInstance(LyricsErrorReportingEventV3.class, lyricsErrorReportingEventV3);
    }

    private LyricsErrorReportingEventV3() {
    }

    public static a o() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001b", new Object[]{"bitField0_", "trackUri_", "provider_", "providerLyricsId_", "flag_", "reportedFullLyricsText_", "reportedCorrections_", ReportedCorrections.class});
        }
        if (iOrdinal == 3) {
            return new LyricsErrorReportingEventV3();
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
        synchronized (LyricsErrorReportingEventV3.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.reportedCorrections_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.reportedCorrections_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.flag_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.provider_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.providerLyricsId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.reportedFullLyricsText_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.trackUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
