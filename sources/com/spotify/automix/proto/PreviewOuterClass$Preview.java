package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.viw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class PreviewOuterClass$Preview extends h implements v2j0 {
    public static final int ARM_ID_FIELD_NUMBER = 13;
    public static final int AUTOMIX_MODE_FIELD_NUMBER = 3;
    public static final int CONTEXT_URI_FIELD_NUMBER = 12;
    public static final int CUEPOINTS_FIELD_NUMBER = 7;
    private static final PreviewOuterClass$Preview DEFAULT_INSTANCE;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 14;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 15;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_TRACK_URI_1_FIELD_NUMBER = 10;
    public static final int PLAYABLE_TRACK_URI_2_FIELD_NUMBER = 11;
    public static final int RELATIVE_START_POSITION_FIELD_NUMBER = 6;
    public static final int START_POSITION_MS_FIELD_NUMBER = 5;
    public static final int STOP_POSITION_MS_FIELD_NUMBER = 8;
    public static final int TRACK_URI_1_FIELD_NUMBER = 1;
    public static final int TRACK_URI_2_FIELD_NUMBER = 2;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 9;
    public static final int TRANSITION_URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private CuepointsOuterClass.Cuepoints cuepoints_;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private boolean relativeStartPosition_;
    private long startPositionMs_;
    private long stopPositionMs_;
    private TransitionOuterClass$Transition transitionRecipe_;
    private String trackUri1_ = "";
    private String trackUri2_ = "";
    private String automixMode_ = "";
    private String transitionUri_ = "";
    private String playableTrackUri1_ = "";
    private String playableTrackUri2_ = "";
    private String contextUri_ = "";
    private String armId_ = "";

    static {
        PreviewOuterClass$Preview previewOuterClass$Preview = new PreviewOuterClass$Preview();
        DEFAULT_INSTANCE = previewOuterClass$Preview;
        h.registerDefaultInstance(PreviewOuterClass$Preview.class, previewOuterClass$Preview);
    }

    private PreviewOuterClass$Preview() {
    }

    public static viw0 n() {
        return (viw0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0007\u0007ဉ\u0000\bဂ\u0001\tဉ\u0002\nȈ\u000bȈ\fȈ\rȈ\u000e\u0000\u000f\u0000", new Object[]{"bitField0_", "trackUri1_", "trackUri2_", "automixMode_", "transitionUri_", "startPositionMs_", "relativeStartPosition_", "cuepoints_", "stopPositionMs_", "transitionRecipe_", "playableTrackUri1_", "playableTrackUri2_", "contextUri_", "armId_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new PreviewOuterClass$Preview();
        }
        if (iOrdinal == 4) {
            return new viw0(DEFAULT_INSTANCE);
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
        synchronized (PreviewOuterClass$Preview.class) {
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
        this.armId_ = str;
    }

    public final void p() {
        this.automixMode_ = "auto";
    }

    public final void q(String str) {
        this.contextUri_ = str;
    }

    public final void r(double d) {
        this.itemSpeedA_ = d;
    }

    public final void s(double d) {
        this.itemSpeedB_ = d;
    }

    public final void t(String str) {
        str.getClass();
        this.playableTrackUri1_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.playableTrackUri2_ = str;
    }

    public final void v() {
        this.relativeStartPosition_ = true;
    }

    public final void w() {
        this.startPositionMs_ = 3000L;
    }

    public final void x(String str) {
        str.getClass();
        this.trackUri1_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.trackUri2_ = str;
    }

    public final void z(TransitionOuterClass$Transition transitionOuterClass$Transition) {
        this.transitionRecipe_ = transitionOuterClass$Transition;
        this.bitField0_ |= 4;
    }
}
