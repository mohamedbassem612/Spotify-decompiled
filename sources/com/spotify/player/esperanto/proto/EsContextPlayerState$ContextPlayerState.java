package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.bf40;
import p.h290;
import p.jf40;
import p.jlz;
import p.kqz;
import p.lmz;
import p.mmz;
import p.nmz;
import p.phc;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsContextPlayerState$ContextPlayerState extends h implements v2j0 {
    public static final int AD_BREAK_CONTEXT_FIELD_NUMBER = 30;
    public static final int AUDIO_STREAM_FIELD_NUMBER = 26;
    public static final int CONTEXT_METADATA_FIELD_NUMBER = 22;
    public static final int CONTEXT_RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int CONTEXT_URL_FIELD_NUMBER = 3;
    private static final EsContextPlayerState$ContextPlayerState DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 12;
    public static final int FORMAT_FIELD_NUMBER = 29;
    public static final int INDEX_FIELD_NUMBER = 6;
    public static final int IS_BUFFERING_FIELD_NUMBER = 15;
    public static final int IS_PAUSED_FIELD_NUMBER = 14;
    public static final int IS_PLAYING_FIELD_NUMBER = 13;
    public static final int IS_SYSTEM_INITIATED_FIELD_NUMBER = 16;
    public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 32;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 21;
    public static final int OBSERVATION_STATUS_FIELD_NUMBER = 33;
    public static final int OPTIONS_FIELD_NUMBER = 17;
    public static final int PAGE_METADATA_FIELD_NUMBER = 23;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 8;
    public static final int PLAYBACK_QUALITY_FIELD_NUMBER = 9;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 10;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 5;
    public static final int POSITION_AS_OF_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int PREV_TRACKS_FIELD_NUMBER = 20;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 25;
    public static final int RESTRICTIONS_FIELD_NUMBER = 18;
    public static final int SESSION_COMMAND_ID_FIELD_NUMBER = 28;
    public static final int SESSION_ID_FIELD_NUMBER = 24;
    public static final int SIGNALS_FIELD_NUMBER = 27;
    public static final int SLEEP_TIMER_FIELD_NUMBER = 31;
    public static final int SUPPRESSIONS_FIELD_NUMBER = 19;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 7;
    private EsAdBreakContext$AdBreakContext adBreakContext_;
    private int audioStream_;
    private int bitField0_;
    private qng0 contextMetadata_;
    private EsRestrictions$Restrictions contextRestrictions_;
    private String contextUri_;
    private String contextUrl_;
    private EsOptional$OptionalInt64 duration_;
    private int format_;
    private EsContextPlayerState$ContextIndex index_;
    private boolean isBuffering_;
    private boolean isPaused_;
    private boolean isPlaying_;
    private boolean isSystemInitiated_;
    private String logicalPlaybackIdentifier_;
    private h290 nextTracks_;
    private int observationStatus_;
    private EsContextPlayerOptions$ContextPlayerOptions options_;
    private qng0 pageMetadata_;
    private EsPlayOrigin$PlayOrigin playOrigin_;
    private phc playbackId_;
    private EsContextPlayerState$PlaybackQuality playbackQuality_;
    private EsOptional$OptionalDouble playbackSpeed_;
    private EsOptional$OptionalInt64 positionAsOfTimestamp_;
    private h290 prevTracks_;
    private long queueRevision_;
    private EsRestrictions$Restrictions restrictions_;
    private String sessionCommandId_;
    private String sessionId_;
    private h290 signals_;
    private EsSleepTimer$SleepTimer sleepTimer_;
    private h290 suppressions_;
    private long timestamp_;
    private EsProvidedTrack$ProvidedTrack track_;

    static {
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = new EsContextPlayerState$ContextPlayerState();
        DEFAULT_INSTANCE = esContextPlayerState$ContextPlayerState;
        h.registerDefaultInstance(EsContextPlayerState$ContextPlayerState.class, esContextPlayerState$ContextPlayerState);
    }

    private EsContextPlayerState$ContextPlayerState() {
        qng0 qng0Var = qng0.b;
        this.contextMetadata_ = qng0Var;
        this.pageMetadata_ = qng0Var;
        this.contextUri_ = "";
        this.contextUrl_ = "";
        this.playbackId_ = phc.b;
        this.suppressions_ = h.emptyProtobufList();
        this.prevTracks_ = h.emptyProtobufList();
        this.nextTracks_ = h.emptyProtobufList();
        this.sessionId_ = "";
        this.signals_ = h.emptyProtobufList();
        this.sessionCommandId_ = "";
        this.logicalPlaybackIdentifier_ = "";
    }

    public static EsContextPlayerState$ContextPlayerState Z(byte[] bArr) {
        return (EsContextPlayerState$ContextPlayerState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return this.isSystemInitiated_;
    }

    public final int B() {
        return this.nextTracks_.size();
    }

    public final h290 C() {
        return this.nextTracks_;
    }

    public final EsContextPlayerOptions$ContextPlayerOptions D() {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = this.options_;
        return esContextPlayerOptions$ContextPlayerOptions == null ? EsContextPlayerOptions$ContextPlayerOptions.o() : esContextPlayerOptions$ContextPlayerOptions;
    }

    public final Map E() {
        return Collections.unmodifiableMap(this.pageMetadata_);
    }

    public final EsPlayOrigin$PlayOrigin F() {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = this.playOrigin_;
        return esPlayOrigin$PlayOrigin == null ? EsPlayOrigin$PlayOrigin.p() : esPlayOrigin$PlayOrigin;
    }

    public final phc G() {
        return this.playbackId_;
    }

    public final EsContextPlayerState$PlaybackQuality H() {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = this.playbackQuality_;
        return esContextPlayerState$PlaybackQuality == null ? EsContextPlayerState$PlaybackQuality.p() : esContextPlayerState$PlaybackQuality;
    }

    public final EsOptional$OptionalDouble I() {
        EsOptional$OptionalDouble esOptional$OptionalDouble = this.playbackSpeed_;
        return esOptional$OptionalDouble == null ? EsOptional$OptionalDouble.o() : esOptional$OptionalDouble;
    }

    public final EsOptional$OptionalInt64 J() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.positionAsOfTimestamp_;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.n() : esOptional$OptionalInt64;
    }

    public final int K() {
        return this.prevTracks_.size();
    }

    public final h290 L() {
        return this.prevTracks_;
    }

    public final long M() {
        return this.queueRevision_;
    }

    public final EsRestrictions$Restrictions N() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.restrictions_;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.Y() : esRestrictions$Restrictions;
    }

    public final String O() {
        return this.sessionCommandId_;
    }

    public final EsSleepTimer$SleepTimer P() {
        EsSleepTimer$SleepTimer esSleepTimer$SleepTimer = this.sleepTimer_;
        return esSleepTimer$SleepTimer == null ? EsSleepTimer$SleepTimer.o() : esSleepTimer$SleepTimer;
    }

    public final int Q() {
        return this.suppressions_.size();
    }

    public final h290 R() {
        return this.suppressions_;
    }

    public final EsProvidedTrack$ProvidedTrack S() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.track_;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.p() : esProvidedTrack$ProvidedTrack;
    }

    public final boolean T() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 4096) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 8) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000!\u0000\u0001\u0001!!\u0002\u0004\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\b\n\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fဉ\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011ဉ\b\u0012ဉ\t\u0013Ț\u0014\u001b\u0015\u001b\u00162\u00172\u0018Ȉ\u0019\u0003\u001a\f\u001bȚ\u001cȈ\u001dဌ\n\u001eဉ\u000b\u001fဉ\f ለ\r!\f", new Object[]{"bitField0_", "timestamp_", "contextUri_", "contextUrl_", "contextRestrictions_", "playOrigin_", "index_", "track_", "playbackId_", "playbackQuality_", "playbackSpeed_", "positionAsOfTimestamp_", "duration_", "isPlaying_", "isPaused_", "isBuffering_", "isSystemInitiated_", "options_", "restrictions_", "suppressions_", "prevTracks_", EsProvidedTrack$ProvidedTrack.class, "nextTracks_", EsProvidedTrack$ProvidedTrack.class, "contextMetadata_", lmz.a, "pageMetadata_", nmz.a, "sessionId_", "queueRevision_", "audioStream_", "signals_", "sessionCommandId_", "format_", "adBreakContext_", "sleepTimer_", "logicalPlaybackIdentifier_", "observationStatus_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$ContextPlayerState();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 23);
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
        synchronized (EsContextPlayerState$ContextPlayerState.class) {
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

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final int getSignalsCount() {
        return this.signals_.size();
    }

    public final List getSignalsList() {
        return this.signals_;
    }

    public final long getTimestamp() {
        return this.timestamp_;
    }

    public final boolean hasDuration() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasFormat() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean hasIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsAdBreakContext$AdBreakContext o() {
        EsAdBreakContext$AdBreakContext esAdBreakContext$AdBreakContext = this.adBreakContext_;
        return esAdBreakContext$AdBreakContext == null ? EsAdBreakContext$AdBreakContext.o() : esAdBreakContext$AdBreakContext;
    }

    public final kqz p() {
        kqz kqzVar;
        int i = this.audioStream_;
        if (i != 0) {
            kqzVar = i != 1 ? null : kqz.ALARM;
        } else {
            kqzVar = kqz.DEFAULT;
        }
        return kqzVar == null ? kqz.UNRECOGNIZED : kqzVar;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.contextMetadata_);
    }

    public final EsRestrictions$Restrictions r() {
        EsRestrictions$Restrictions esRestrictions$Restrictions = this.contextRestrictions_;
        return esRestrictions$Restrictions == null ? EsRestrictions$Restrictions.Y() : esRestrictions$Restrictions;
    }

    public final String s() {
        return this.contextUri_;
    }

    public final String t() {
        return this.contextUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final EsOptional$OptionalInt64 u() {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = this.duration_;
        return esOptional$OptionalInt64 == null ? EsOptional$OptionalInt64.n() : esOptional$OptionalInt64;
    }

    public final mmz v() {
        mmz mmzVar;
        int i = this.format_;
        if (i == 0) {
            mmzVar = mmz.UNKNOWN;
        } else if (i != 1) {
            mmzVar = i != 2 ? null : mmz.PARROT;
        } else {
            mmzVar = mmz.DEFAULT;
        }
        return mmzVar == null ? mmz.UNRECOGNIZED : mmzVar;
    }

    public final EsContextPlayerState$ContextIndex w() {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = this.index_;
        return esContextPlayerState$ContextIndex == null ? EsContextPlayerState$ContextIndex.o() : esContextPlayerState$ContextIndex;
    }

    public final boolean x() {
        return this.isBuffering_;
    }

    public final boolean y() {
        return this.isPaused_;
    }

    public final boolean z() {
        return this.isPlaying_;
    }
}
