package com.spotify.playlistmixing.extensions.mixthreebandwaveforms.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ThreeBandWaveforms extends h implements v2j0 {
    private static final ThreeBandWaveforms DEFAULT_INSTANCE;
    public static final int HIGHS_FIELD_NUMBER = 5;
    public static final int LOWS_FIELD_NUMBER = 3;
    public static final int MIDS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 1;
    public static final int SAMPLE_WINDOW_SIZE_MS_FIELD_NUMBER = 2;
    private int sampleRate_;
    private int sampleWindowSizeMs_;
    private int lowsMemoizedSerializedSize = -1;
    private int midsMemoizedSerializedSize = -1;
    private int highsMemoizedSerializedSize = -1;
    private b290 lows_ = h.emptyIntList();
    private b290 mids_ = h.emptyIntList();
    private b290 highs_ = h.emptyIntList();

    static {
        ThreeBandWaveforms threeBandWaveforms = new ThreeBandWaveforms();
        DEFAULT_INSTANCE = threeBandWaveforms;
        h.registerDefaultInstance(ThreeBandWaveforms.class, threeBandWaveforms);
    }

    private ThreeBandWaveforms() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ThreeBandWaveforms s(byte[] bArr) {
        return (ThreeBandWaveforms) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0004\u0002\u0004\u0003'\u0004'\u0005'", new Object[]{"sampleRate_", "sampleWindowSizeMs_", "lows_", "mids_", "highs_"});
        }
        if (iOrdinal == 3) {
            return new ThreeBandWaveforms();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (ThreeBandWaveforms.class) {
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

    public final b290 n() {
        return this.highs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final b290 o() {
        return this.lows_;
    }

    public final b290 p() {
        return this.mids_;
    }

    public final int q() {
        return this.sampleRate_;
    }

    public final int r() {
        return this.sampleWindowSizeMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
