package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import p.b4u0;
import p.bf40;
import p.dzt0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PlaybackSettingsEsperantoService$ShuffleState extends h implements v2j0 {
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$ShuffleState DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHUFFLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int contextEnhancement_;
    private boolean shuffle_;

    static {
        PlaybackSettingsEsperantoService$ShuffleState playbackSettingsEsperantoService$ShuffleState = new PlaybackSettingsEsperantoService$ShuffleState();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ShuffleState;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$ShuffleState.class, playbackSettingsEsperantoService$ShuffleState);
    }

    private PlaybackSettingsEsperantoService$ShuffleState() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaybackSettingsEsperantoService$ShuffleState r(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$ShuffleState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "shuffle_", "contextEnhancement_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ShuffleState();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (PlaybackSettingsEsperantoService$ShuffleState.class) {
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

    public final b4u0 n() {
        b4u0 b4u0Var;
        int i = this.contextEnhancement_;
        if (i != 0) {
            b4u0Var = i != 1 ? null : b4u0.RECOMMENDATION;
        } else {
            b4u0Var = b4u0.NOT_ENHANCED;
        }
        return b4u0Var == null ? b4u0.UNRECOGNIZED : b4u0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.shuffle_;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
