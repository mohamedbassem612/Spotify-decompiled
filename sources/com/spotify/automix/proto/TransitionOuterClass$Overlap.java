package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ckg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$Overlap extends h implements v2j0 {
    public static final int BPM_A_FIELD_NUMBER = 16;
    public static final int BPM_B_FIELD_NUMBER = 17;
    private static final TransitionOuterClass$Overlap DEFAULT_INSTANCE;
    public static final int DURATION_BARS_FIELD_NUMBER = 8;
    public static final int DURATION_MS_FIELD_NUMBER = 5;
    public static final int IS_BEATMATCHED_FIELD_NUMBER = 9;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 18;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 19;
    private static volatile qzr0 PARSER = null;
    public static final int SPEED_A_FIELD_NUMBER = 6;
    public static final int SPEED_B_FIELD_NUMBER = 7;
    public static final int START_A_MS_FIELD_NUMBER = 3;
    public static final int START_B_MS_FIELD_NUMBER = 4;
    public static final int TRACK_A_PLAYABLE_BEATS_HASH_FIELD_NUMBER = 14;
    public static final int TRACK_A_PLAYABLE_URI_FIELD_NUMBER = 12;
    public static final int TRACK_A_ROW_ID_FIELD_NUMBER = 1;
    public static final int TRACK_A_URI_FIELD_NUMBER = 10;
    public static final int TRACK_B_PLAYABLE_BEATS_HASH_FIELD_NUMBER = 15;
    public static final int TRACK_B_PLAYABLE_URI_FIELD_NUMBER = 13;
    public static final int TRACK_B_ROW_ID_FIELD_NUMBER = 2;
    public static final int TRACK_B_URI_FIELD_NUMBER = 11;
    private int bitField0_;
    private float bpmA_;
    private float bpmB_;
    private int durationBars_;
    private int durationMs_;
    private boolean isBeatmatched_;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private float speedA_;
    private float speedB_;
    private int startAMs_;
    private int startBMs_;
    private String trackARowId_ = "";
    private String trackBRowId_ = "";
    private String trackAUri_ = "";
    private String trackBUri_ = "";
    private String trackAPlayableUri_ = "";
    private String trackBPlayableUri_ = "";
    private String trackAPlayableBeatsHash_ = "";
    private String trackBPlayableBeatsHash_ = "";

    static {
        TransitionOuterClass$Overlap transitionOuterClass$Overlap = new TransitionOuterClass$Overlap();
        DEFAULT_INSTANCE = transitionOuterClass$Overlap;
        h.registerDefaultInstance(TransitionOuterClass$Overlap.class, transitionOuterClass$Overlap);
    }

    private TransitionOuterClass$Overlap() {
    }

    public static ckg1 K() {
        return (ckg1) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionOuterClass$Overlap p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final String A() {
        return this.trackAPlayableUri_;
    }

    public final String B() {
        return this.trackARowId_;
    }

    public final String C() {
        return this.trackAUri_;
    }

    public final String D() {
        return this.trackBPlayableBeatsHash_;
    }

    public final String E() {
        return this.trackBPlayableUri_;
    }

    public final String F() {
        return this.trackBRowId_;
    }

    public final String G() {
        return this.trackBUri_;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void L(float f) {
        this.bpmA_ = f;
    }

    public final void M(float f) {
        this.bpmB_ = f;
    }

    public final void N(int i) {
        this.bitField0_ |= 4;
        this.durationBars_ = i;
    }

    public final void O(int i) {
        this.durationMs_ = i;
    }

    public final void P(boolean z) {
        this.isBeatmatched_ = z;
    }

    public final void Q(double d) {
        this.itemSpeedA_ = d;
    }

    public final void R(double d) {
        this.itemSpeedB_ = d;
    }

    public final void S(float f) {
        this.bitField0_ |= 1;
        this.speedA_ = f;
    }

    public final void T(float f) {
        this.bitField0_ |= 2;
        this.speedB_ = f;
    }

    public final void U(int i) {
        this.startAMs_ = i;
    }

    public final void V(int i) {
        this.startBMs_ = i;
    }

    public final void W(String str) {
        str.getClass();
        this.trackAPlayableBeatsHash_ = str;
    }

    public final void X(String str) {
        str.getClass();
        this.trackAPlayableUri_ = str;
    }

    public final void Y(String str) {
        str.getClass();
        this.trackARowId_ = str;
    }

    public final void Z(String str) {
        str.getClass();
        this.trackAUri_ = str;
    }

    public final void a0(String str) {
        str.getClass();
        this.trackBPlayableBeatsHash_ = str;
    }

    public final void b0(String str) {
        str.getClass();
        this.trackBPlayableUri_ = str;
    }

    public final void c0(String str) {
        str.getClass();
        this.trackBRowId_ = str;
    }

    public final void d0(String str) {
        str.getClass();
        this.trackBUri_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006ခ\u0000\u0007ခ\u0001\bင\u0002\t\u0007\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010\u0001\u0011\u0001\u0012\u0000\u0013\u0000", new Object[]{"bitField0_", "trackARowId_", "trackBRowId_", "startAMs_", "startBMs_", "durationMs_", "speedA_", "speedB_", "durationBars_", "isBeatmatched_", "trackAUri_", "trackBUri_", "trackAPlayableUri_", "trackBPlayableUri_", "trackAPlayableBeatsHash_", "trackBPlayableBeatsHash_", "bpmA_", "bpmB_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Overlap();
        }
        if (iOrdinal == 4) {
            return new ckg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Overlap.class) {
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

    public final float n() {
        return this.bpmA_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final float o() {
        return this.bpmB_;
    }

    public final int q() {
        return this.durationBars_;
    }

    public final int r() {
        return this.durationMs_;
    }

    public final boolean s() {
        return this.isBeatmatched_;
    }

    public final double t() {
        return this.itemSpeedA_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final double u() {
        return this.itemSpeedB_;
    }

    public final float v() {
        return this.speedA_;
    }

    public final float w() {
        return this.speedB_;
    }

    public final int x() {
        return this.startAMs_;
    }

    public final int y() {
        return this.startBMs_;
    }

    public final String z() {
        return this.trackAPlayableBeatsHash_;
    }
}
