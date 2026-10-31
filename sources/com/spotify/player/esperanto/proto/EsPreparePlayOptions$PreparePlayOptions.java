package com.spotify.player.esperanto.proto;

import p.bf40;
import p.h290;
import p.hhc;
import p.i9;
import p.jf40;
import p.kqz;
import p.lqz;
import p.mqz;
import p.nqz;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsPreparePlayOptions$PreparePlayOptions extends com.google.protobuf.h implements v2j0 {
    public static final int ALWAYS_PLAY_SOMETHING_FIELD_NUMBER = 2;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 10;
    public static final int CONFIGURATION_OVERRIDE_FIELD_NUMBER = 13;
    private static final EsPreparePlayOptions$PreparePlayOptions DEFAULT_INSTANCE;
    public static final int INITIALLY_PAUSED_FIELD_NUMBER = 5;
    public static final int LICENSE_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PLAYER_OPTIONS_OVERRIDE_FIELD_NUMBER = 7;
    public static final int PREFETCH_LEVEL_FIELD_NUMBER = 9;
    public static final int SEEK_TO_CREATOR_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int SEEK_TO_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 11;
    public static final int SKIP_TO_FIELD_NUMBER = 3;
    public static final int SUPPRESSIONS_FIELD_NUMBER = 8;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER = 6;
    private boolean alwaysPlaySomething_;
    private int audioStream_;
    private int bitField0_;
    private boolean initiallyPaused_;
    private EsContextPlayerOptions$ContextPlayerOptionOverrides playerOptionsOverride_;
    private int prefetchLevel_;
    private EsOptional.OptionalInt64 seekTo_;
    private EsSkipToTrack$SkipToTrack skipTo_;
    private boolean systemInitiated_;
    private qng0 configurationOverride_ = qng0.b;
    private phc playbackId_ = phc.b;
    private h290 suppressions_ = com.google.protobuf.h.emptyProtobufList();
    private String sessionId_ = "";
    private String license_ = "";
    private String seekToCreatorTimestamp_ = "";

    static {
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = new EsPreparePlayOptions$PreparePlayOptions();
        DEFAULT_INSTANCE = esPreparePlayOptions$PreparePlayOptions;
        com.google.protobuf.h.registerDefaultInstance(EsPreparePlayOptions$PreparePlayOptions.class, esPreparePlayOptions$PreparePlayOptions);
    }

    private EsPreparePlayOptions$PreparePlayOptions() {
    }

    public static EsPreparePlayOptions$PreparePlayOptions p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static lqz s() {
        return (lqz) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(EsOptional.OptionalInt64 optionalInt64) {
        optionalInt64.getClass();
        this.seekTo_ = optionalInt64;
        this.bitField0_ |= 2;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.seekToCreatorTimestamp_ = str;
    }

    public final void C(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    public final void D(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack) {
        esSkipToTrack$SkipToTrack.getClass();
        this.skipTo_ = esSkipToTrack$SkipToTrack;
        this.bitField0_ |= 1;
    }

    public final void E(boolean z) {
        this.systemInitiated_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0001\u0000\u0001\n\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006\u0007\u0007ဉ\u0002\bȚ\t\f\n\f\u000bȈ\fȈ\r2\u000eለ\u0003", new Object[]{"bitField0_", "playbackId_", "alwaysPlaySomething_", "skipTo_", "seekTo_", "initiallyPaused_", "systemInitiated_", "playerOptionsOverride_", "suppressions_", "prefetchLevel_", "audioStream_", "sessionId_", "license_", "configurationOverride_", mqz.a, "seekToCreatorTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new EsPreparePlayOptions$PreparePlayOptions();
        }
        if (iOrdinal == 4) {
            return new lqz(DEFAULT_INSTANCE);
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
        synchronized (EsPreparePlayOptions$PreparePlayOptions.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.suppressions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.suppressions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        h290 h290VarMutableCopy = this.suppressions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.suppressions_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add("mft");
    }

    public final EsSkipToTrack$SkipToTrack q() {
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = this.skipTo_;
        return esSkipToTrack$SkipToTrack == null ? EsSkipToTrack$SkipToTrack.n() : esSkipToTrack$SkipToTrack;
    }

    public final qng0 r() {
        qng0 qng0Var = this.configurationOverride_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.configurationOverride_ = qng0VarH;
        return qng0VarH;
    }

    public final void t(boolean z) {
        this.alwaysPlaySomething_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(kqz kqzVar) {
        this.audioStream_ = kqzVar.getNumber();
    }

    public final void v(boolean z) {
        this.initiallyPaused_ = z;
    }

    public final void w(String str) {
        str.getClass();
        this.license_ = str;
    }

    public final void x(hhc hhcVar) {
        this.playbackId_ = hhcVar;
    }

    public final void y(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
        esContextPlayerOptions$ContextPlayerOptionOverrides.getClass();
        this.playerOptionsOverride_ = esContextPlayerOptions$ContextPlayerOptionOverrides;
        this.bitField0_ |= 4;
    }

    public final void z(nqz nqzVar) {
        this.prefetchLevel_ = nqzVar.getNumber();
    }
}
