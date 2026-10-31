package com.spotify.player.model;

import java.util.List;
import java.util.Map;
import p.b380;
import p.bb00;
import p.bhn0;
import p.eg;
import p.j380;
import p.j5;
import p.l1d;
import p.mno1;
import p.spq0;
import p.z1p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_PlayerState extends PlayerState {
    private final spq0 adBreakContext;
    private final AudioStream audioStream;
    private final j380 contextMetadata;
    private final Restrictions contextRestrictions;
    private final String contextUri;
    private final String contextUrl;
    private final spq0 duration;
    private final spq0 format;
    private final spq0 index;
    private final boolean isBuffering;
    private final boolean isPaused;
    private final boolean isPlaying;
    private final boolean isSystemInitiated;
    private final b380 nextTracks;
    private final PlayerOptions options;
    private final j380 pageMetadata;
    private final PlayOrigin playOrigin;
    private final spq0 playbackId;
    private final spq0 playbackQuality;
    private final spq0 playbackSpeed;
    private final spq0 positionAsOfTimestamp;
    private final b380 prevTracks;
    private final String queueRevision;
    private final Restrictions restrictions;
    private final spq0 sessionCommandId;
    private final String sessionId;
    private final b380 signals;
    private final spq0 sleepTimer;
    private final Suppressions suppressions;
    private final long timestamp;
    private final spq0 track;

    private AutoValue_PlayerState(long j, String str, String str2, Restrictions restrictions, PlayOrigin playOrigin, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5, spq0 spq0Var6, spq0 spq0Var7, spq0 spq0Var8, spq0 spq0Var9, spq0 spq0Var10, boolean z, boolean z2, boolean z3, boolean z4, PlayerOptions playerOptions, Restrictions restrictions2, Suppressions suppressions, b380 b380Var, b380 b380Var2, j380 j380Var, j380 j380Var2, String str3, String str4, AudioStream audioStream, b380 b380Var3, spq0 spq0Var11) {
        this.timestamp = j;
        this.contextUri = str;
        this.contextUrl = str2;
        this.contextRestrictions = restrictions;
        this.playOrigin = playOrigin;
        this.index = spq0Var;
        this.track = spq0Var2;
        this.playbackId = spq0Var3;
        this.sessionCommandId = spq0Var4;
        this.format = spq0Var5;
        this.playbackQuality = spq0Var6;
        this.sleepTimer = spq0Var7;
        this.playbackSpeed = spq0Var8;
        this.positionAsOfTimestamp = spq0Var9;
        this.duration = spq0Var10;
        this.isPlaying = z;
        this.isPaused = z2;
        this.isBuffering = z3;
        this.isSystemInitiated = z4;
        this.options = playerOptions;
        this.restrictions = restrictions2;
        this.suppressions = suppressions;
        this.prevTracks = b380Var;
        this.nextTracks = b380Var2;
        this.contextMetadata = j380Var;
        this.pageMetadata = j380Var2;
        this.sessionId = str3;
        this.queueRevision = str4;
        this.audioStream = audioStream;
        this.signals = b380Var3;
        this.adBreakContext = spq0Var11;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 adBreakContext() {
        return this.adBreakContext;
    }

    @Override // com.spotify.player.model.PlayerState
    public AudioStream audioStream() {
        return this.audioStream;
    }

    @Override // com.spotify.player.model.PlayerState
    public j380 contextMetadata() {
        return this.contextMetadata;
    }

    @Override // com.spotify.player.model.PlayerState
    public Restrictions contextRestrictions() {
        return this.contextRestrictions;
    }

    @Override // com.spotify.player.model.PlayerState
    public String contextUri() {
        return this.contextUri;
    }

    @Override // com.spotify.player.model.PlayerState
    public String contextUrl() {
        return this.contextUrl;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerState) {
            PlayerState playerState = (PlayerState) obj;
            if (this.timestamp == playerState.timestamp() && this.contextUri.equals(playerState.contextUri()) && this.contextUrl.equals(playerState.contextUrl()) && this.contextRestrictions.equals(playerState.contextRestrictions()) && this.playOrigin.equals(playerState.playOrigin()) && this.index.equals(playerState.index()) && this.track.equals(playerState.track()) && this.playbackId.equals(playerState.playbackId()) && this.sessionCommandId.equals(playerState.sessionCommandId()) && this.format.equals(playerState.format()) && this.playbackQuality.equals(playerState.playbackQuality()) && this.sleepTimer.equals(playerState.sleepTimer()) && this.playbackSpeed.equals(playerState.playbackSpeed()) && this.positionAsOfTimestamp.equals(playerState.positionAsOfTimestamp()) && this.duration.equals(playerState.duration()) && this.isPlaying == playerState.isPlaying() && this.isPaused == playerState.isPaused() && this.isBuffering == playerState.isBuffering() && this.isSystemInitiated == playerState.isSystemInitiated() && this.options.equals(playerState.options()) && this.restrictions.equals(playerState.restrictions()) && this.suppressions.equals(playerState.suppressions())) {
                b380 b380Var = this.prevTracks;
                b380 b380VarPrevTracks = playerState.prevTracks();
                b380Var.getClass();
                if (z1p1.j(b380Var, b380VarPrevTracks)) {
                    b380 b380Var2 = this.nextTracks;
                    b380 b380VarNextTracks = playerState.nextTracks();
                    b380Var2.getClass();
                    if (z1p1.j(b380Var2, b380VarNextTracks)) {
                        j380 j380Var = this.contextMetadata;
                        j380 j380VarContextMetadata = playerState.contextMetadata();
                        j380Var.getClass();
                        if (mno1.l(j380VarContextMetadata, j380Var)) {
                            j380 j380Var2 = this.pageMetadata;
                            j380 j380VarPageMetadata = playerState.pageMetadata();
                            j380Var2.getClass();
                            if (mno1.l(j380VarPageMetadata, j380Var2) && this.sessionId.equals(playerState.sessionId()) && this.queueRevision.equals(playerState.queueRevision()) && this.audioStream.equals(playerState.audioStream())) {
                                b380 b380Var3 = this.signals;
                                b380 b380VarSignals = playerState.signals();
                                b380Var3.getClass();
                                if (z1p1.j(b380Var3, b380VarSignals) && this.adBreakContext.equals(playerState.adBreakContext())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 format() {
        return this.format;
    }

    public int hashCode() {
        long j = this.timestamp;
        return this.adBreakContext.hashCode() ^ ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.contextUri.hashCode()) * 1000003) ^ this.contextUrl.hashCode()) * 1000003) ^ this.contextRestrictions.hashCode()) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.index.hashCode()) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.playbackId.hashCode()) * 1000003) ^ this.sessionCommandId.hashCode()) * 1000003) ^ this.format.hashCode()) * 1000003) ^ this.playbackQuality.hashCode()) * 1000003) ^ this.sleepTimer.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.positionAsOfTimestamp.hashCode()) * 1000003) ^ this.duration.hashCode()) * 1000003) ^ (this.isPlaying ? 1231 : 1237)) * 1000003) ^ (this.isPaused ? 1231 : 1237)) * 1000003) ^ (this.isBuffering ? 1231 : 1237)) * 1000003) ^ (this.isSystemInitiated ? 1231 : 1237)) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.restrictions.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.contextMetadata.hashCode()) * 1000003) ^ this.pageMetadata.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.queueRevision.hashCode()) * 1000003) ^ this.audioStream.hashCode()) * 1000003) ^ this.signals.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 index() {
        return this.index;
    }

    @Override // com.spotify.player.model.PlayerState
    public boolean isBuffering() {
        return this.isBuffering;
    }

    @Override // com.spotify.player.model.PlayerState
    public boolean isPaused() {
        return this.isPaused;
    }

    @Override // com.spotify.player.model.PlayerState
    public boolean isPlaying() {
        return this.isPlaying;
    }

    @Override // com.spotify.player.model.PlayerState
    public boolean isSystemInitiated() {
        return this.isSystemInitiated;
    }

    @Override // com.spotify.player.model.PlayerState
    public b380 nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.PlayerState
    public PlayerOptions options() {
        return this.options;
    }

    @Override // com.spotify.player.model.PlayerState
    public j380 pageMetadata() {
        return this.pageMetadata;
    }

    @Override // com.spotify.player.model.PlayerState
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 playbackId() {
        return this.playbackId;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 playbackQuality() {
        return this.playbackQuality;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 positionAsOfTimestamp() {
        return this.positionAsOfTimestamp;
    }

    @Override // com.spotify.player.model.PlayerState
    public b380 prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.PlayerState
    public String queueRevision() {
        return this.queueRevision;
    }

    @Override // com.spotify.player.model.PlayerState
    public Restrictions restrictions() {
        return this.restrictions;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 sessionCommandId() {
        return this.sessionCommandId;
    }

    @Override // com.spotify.player.model.PlayerState
    public String sessionId() {
        return this.sessionId;
    }

    @Override // com.spotify.player.model.PlayerState
    public b380 signals() {
        return this.signals;
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 sleepTimer() {
        return this.sleepTimer;
    }

    @Override // com.spotify.player.model.PlayerState
    public Suppressions suppressions() {
        return this.suppressions;
    }

    @Override // com.spotify.player.model.PlayerState
    public long timestamp() {
        return this.timestamp;
    }

    @Override // com.spotify.player.model.PlayerState
    public PlayerState.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.contextUri;
        String str2 = this.contextUrl;
        String strValueOf = String.valueOf(this.contextRestrictions);
        String strValueOf2 = String.valueOf(this.playOrigin);
        String strValueOf3 = String.valueOf(this.index);
        String strValueOf4 = String.valueOf(this.track);
        String strValueOf5 = String.valueOf(this.playbackId);
        String strValueOf6 = String.valueOf(this.sessionCommandId);
        String strValueOf7 = String.valueOf(this.format);
        String strValueOf8 = String.valueOf(this.playbackQuality);
        String strValueOf9 = String.valueOf(this.sleepTimer);
        String strValueOf10 = String.valueOf(this.playbackSpeed);
        String strValueOf11 = String.valueOf(this.positionAsOfTimestamp);
        String strValueOf12 = String.valueOf(this.duration);
        boolean z = this.isPlaying;
        boolean z2 = this.isPaused;
        boolean z3 = this.isBuffering;
        boolean z4 = this.isSystemInitiated;
        String strValueOf13 = String.valueOf(this.options);
        String strValueOf14 = String.valueOf(this.restrictions);
        String strValueOf15 = String.valueOf(this.suppressions);
        String strValueOf16 = String.valueOf(this.prevTracks);
        String strValueOf17 = String.valueOf(this.nextTracks);
        String strValueOf18 = String.valueOf(this.contextMetadata);
        String strValueOf19 = String.valueOf(this.pageMetadata);
        String str3 = this.sessionId;
        String str4 = this.queueRevision;
        String strValueOf20 = String.valueOf(this.audioStream);
        String strValueOf21 = String.valueOf(this.signals);
        String strValueOf22 = String.valueOf(this.adBreakContext);
        StringBuilder sb = new StringBuilder("PlayerState{timestamp=");
        sb.append(j);
        sb.append(", contextUri=");
        sb.append(str);
        bb00.j(sb, ", contextUrl=", str2, ", contextRestrictions=", strValueOf);
        bb00.j(sb, ", playOrigin=", strValueOf2, ", index=", strValueOf3);
        bb00.j(sb, ", track=", strValueOf4, ", playbackId=", strValueOf5);
        bb00.j(sb, ", sessionCommandId=", strValueOf6, ", format=", strValueOf7);
        bb00.j(sb, ", playbackQuality=", strValueOf8, ", sleepTimer=", strValueOf9);
        bb00.j(sb, ", playbackSpeed=", strValueOf10, ", positionAsOfTimestamp=", strValueOf11);
        sb.append(", duration=");
        sb.append(strValueOf12);
        sb.append(", isPlaying=");
        sb.append(z);
        sb.append(", isPaused=");
        sb.append(z2);
        sb.append(", isBuffering=");
        sb.append(z3);
        sb.append(", isSystemInitiated=");
        sb.append(z4);
        sb.append(", options=");
        sb.append(strValueOf13);
        bb00.j(sb, ", restrictions=", strValueOf14, ", suppressions=", strValueOf15);
        bb00.j(sb, ", prevTracks=", strValueOf16, ", nextTracks=", strValueOf17);
        bb00.j(sb, ", contextMetadata=", strValueOf18, ", pageMetadata=", strValueOf19);
        bb00.j(sb, ", sessionId=", str3, ", queueRevision=", str4);
        bb00.j(sb, ", audioStream=", strValueOf20, ", signals=", strValueOf21);
        return l1d.q(sb, ", adBreakContext=", strValueOf22, "}");
    }

    @Override // com.spotify.player.model.PlayerState
    public spq0 track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_PlayerState(long j, String str, String str2, Restrictions restrictions, PlayOrigin playOrigin, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5, spq0 spq0Var6, spq0 spq0Var7, spq0 spq0Var8, spq0 spq0Var9, spq0 spq0Var10, boolean z, boolean z2, boolean z3, boolean z4, PlayerOptions playerOptions, Restrictions restrictions2, Suppressions suppressions, b380 b380Var, b380 b380Var2, j380 j380Var, j380 j380Var2, String str3, String str4, AudioStream audioStream, b380 b380Var3, spq0 spq0Var11, int i) {
        this(j, str, str2, restrictions, playOrigin, spq0Var, spq0Var2, spq0Var3, spq0Var4, spq0Var5, spq0Var6, spq0Var7, spq0Var8, spq0Var9, spq0Var10, z, z2, z3, z4, playerOptions, restrictions2, suppressions, b380Var, b380Var2, j380Var, j380Var2, str3, str4, audioStream, b380Var3, spq0Var11);
    }

    public static final class Builder extends PlayerState.Builder {
        private spq0 adBreakContext;
        private AudioStream audioStream;
        private j380 contextMetadata;
        private Restrictions contextRestrictions;
        private String contextUri;
        private String contextUrl;
        private spq0 duration;
        private spq0 format;
        private spq0 index;
        private boolean isBuffering;
        private boolean isPaused;
        private boolean isPlaying;
        private boolean isSystemInitiated;
        private b380 nextTracks;
        private PlayerOptions options;
        private j380 pageMetadata;
        private PlayOrigin playOrigin;
        private spq0 playbackId;
        private spq0 playbackQuality;
        private spq0 playbackSpeed;
        private spq0 positionAsOfTimestamp;
        private b380 prevTracks;
        private String queueRevision;
        private Restrictions restrictions;
        private spq0 sessionCommandId;
        private String sessionId;
        private byte set$0;
        private b380 signals;
        private spq0 sleepTimer;
        private Suppressions suppressions;
        private long timestamp;
        private spq0 track;

        public Builder(PlayerState playerState) {
            j5 j5Var = j5.a;
            this.index = j5Var;
            this.track = j5Var;
            this.playbackId = j5Var;
            this.sessionCommandId = j5Var;
            this.format = j5Var;
            this.playbackQuality = j5Var;
            this.sleepTimer = j5Var;
            this.playbackSpeed = j5Var;
            this.positionAsOfTimestamp = j5Var;
            this.duration = j5Var;
            this.adBreakContext = j5Var;
            this.timestamp = playerState.timestamp();
            this.contextUri = playerState.contextUri();
            this.contextUrl = playerState.contextUrl();
            this.contextRestrictions = playerState.contextRestrictions();
            this.playOrigin = playerState.playOrigin();
            this.index = playerState.index();
            this.track = playerState.track();
            this.playbackId = playerState.playbackId();
            this.sessionCommandId = playerState.sessionCommandId();
            this.format = playerState.format();
            this.playbackQuality = playerState.playbackQuality();
            this.sleepTimer = playerState.sleepTimer();
            this.playbackSpeed = playerState.playbackSpeed();
            this.positionAsOfTimestamp = playerState.positionAsOfTimestamp();
            this.duration = playerState.duration();
            this.isPlaying = playerState.isPlaying();
            this.isPaused = playerState.isPaused();
            this.isBuffering = playerState.isBuffering();
            this.isSystemInitiated = playerState.isSystemInitiated();
            this.options = playerState.options();
            this.restrictions = playerState.restrictions();
            this.suppressions = playerState.suppressions();
            this.prevTracks = playerState.prevTracks();
            this.nextTracks = playerState.nextTracks();
            this.contextMetadata = playerState.contextMetadata();
            this.pageMetadata = playerState.pageMetadata();
            this.sessionId = playerState.sessionId();
            this.queueRevision = playerState.queueRevision();
            this.audioStream = playerState.audioStream();
            this.signals = playerState.signals();
            this.adBreakContext = playerState.adBreakContext();
            this.set$0 = (byte) 31;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder adBreakContext(AdBreakContext adBreakContext) {
            this.adBreakContext = spq0.d(adBreakContext);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder audioStream(AudioStream audioStream) {
            if (audioStream != null) {
                this.audioStream = audioStream;
                return this;
            }
            bhn0.i("Null audioStream");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState build() {
            if (this.set$0 == 31 && this.contextUri != null && this.contextUrl != null && this.contextRestrictions != null && this.playOrigin != null && this.options != null && this.restrictions != null && this.suppressions != null && this.prevTracks != null && this.nextTracks != null && this.contextMetadata != null && this.pageMetadata != null && this.sessionId != null && this.queueRevision != null && this.audioStream != null && this.signals != null) {
                return new AutoValue_PlayerState(this.timestamp, this.contextUri, this.contextUrl, this.contextRestrictions, this.playOrigin, this.index, this.track, this.playbackId, this.sessionCommandId, this.format, this.playbackQuality, this.sleepTimer, this.playbackSpeed, this.positionAsOfTimestamp, this.duration, this.isPlaying, this.isPaused, this.isBuffering, this.isSystemInitiated, this.options, this.restrictions, this.suppressions, this.prevTracks, this.nextTracks, this.contextMetadata, this.pageMetadata, this.sessionId, this.queueRevision, this.audioStream, this.signals, this.adBreakContext, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" timestamp");
            }
            if (this.contextUri == null) {
                sb.append(" contextUri");
            }
            if (this.contextUrl == null) {
                sb.append(" contextUrl");
            }
            if (this.contextRestrictions == null) {
                sb.append(" contextRestrictions");
            }
            if (this.playOrigin == null) {
                sb.append(" playOrigin");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" isPlaying");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" isPaused");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" isBuffering");
            }
            if ((this.set$0 & 16) == 0) {
                sb.append(" isSystemInitiated");
            }
            if (this.options == null) {
                sb.append(" options");
            }
            if (this.restrictions == null) {
                sb.append(" restrictions");
            }
            if (this.suppressions == null) {
                sb.append(" suppressions");
            }
            if (this.prevTracks == null) {
                sb.append(" prevTracks");
            }
            if (this.nextTracks == null) {
                sb.append(" nextTracks");
            }
            if (this.contextMetadata == null) {
                sb.append(" contextMetadata");
            }
            if (this.pageMetadata == null) {
                sb.append(" pageMetadata");
            }
            if (this.sessionId == null) {
                sb.append(" sessionId");
            }
            if (this.queueRevision == null) {
                sb.append(" queueRevision");
            }
            if (this.audioStream == null) {
                sb.append(" audioStream");
            }
            if (this.signals == null) {
                sb.append(" signals");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextMetadata(Map<String, String> map) {
            this.contextMetadata = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextRestrictions(Restrictions restrictions) {
            if (restrictions != null) {
                this.contextRestrictions = restrictions;
                return this;
            }
            bhn0.i("Null contextRestrictions");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextUri(String str) {
            if (str != null) {
                this.contextUri = str;
                return this;
            }
            bhn0.i("Null contextUri");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextUrl(String str) {
            if (str != null) {
                this.contextUrl = str;
                return this;
            }
            bhn0.i("Null contextUrl");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder duration(Long l) {
            this.duration = spq0.d(l);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder format(Format format) {
            this.format = spq0.d(format);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder index(ContextIndex contextIndex) {
            this.index = spq0.d(contextIndex);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isBuffering(boolean z) {
            this.isBuffering = z;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isPaused(boolean z) {
            this.isPaused = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isPlaying(boolean z) {
            this.isPlaying = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isSystemInitiated(boolean z) {
            this.isSystemInitiated = z;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = b380.p(list);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder options(PlayerOptions playerOptions) {
            if (playerOptions != null) {
                this.options = playerOptions;
                return this;
            }
            bhn0.i("Null options");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder pageMetadata(Map<String, String> map) {
            this.pageMetadata = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playOrigin(PlayOrigin playOrigin) {
            if (playOrigin != null) {
                this.playOrigin = playOrigin;
                return this;
            }
            bhn0.i("Null playOrigin");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackId(String str) {
            this.playbackId = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackQuality(PlaybackQuality playbackQuality) {
            this.playbackQuality = spq0.d(playbackQuality);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackSpeed(Double d) {
            this.playbackSpeed = spq0.d(d);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder positionAsOfTimestamp(Long l) {
            this.positionAsOfTimestamp = spq0.d(l);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = b380.p(list);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            bhn0.i("Null queueRevision");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder restrictions(Restrictions restrictions) {
            if (restrictions != null) {
                this.restrictions = restrictions;
                return this;
            }
            bhn0.i("Null restrictions");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder sessionCommandId(String str) {
            this.sessionCommandId = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            bhn0.i("Null sessionId");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder signals(List<String> list) {
            this.signals = b380.p(list);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder sleepTimer(SleepTimer sleepTimer) {
            this.sleepTimer = spq0.d(sleepTimer);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder suppressions(Suppressions suppressions) {
            if (suppressions != null) {
                this.suppressions = suppressions;
                return this;
            }
            bhn0.i("Null suppressions");
            return null;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder timestamp(long j) {
            this.timestamp = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder track(ContextTrack contextTrack) {
            this.track = spq0.d(contextTrack);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.index = j5Var;
            this.track = j5Var;
            this.playbackId = j5Var;
            this.sessionCommandId = j5Var;
            this.format = j5Var;
            this.playbackQuality = j5Var;
            this.sleepTimer = j5Var;
            this.playbackSpeed = j5Var;
            this.positionAsOfTimestamp = j5Var;
            this.duration = j5Var;
            this.adBreakContext = j5Var;
        }
    }
}
