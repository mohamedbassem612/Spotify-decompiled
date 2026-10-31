package com.spotify.player.model.command.options;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import p.bb00;
import p.bhn0;
import p.eg;
import p.gvg;
import p.i5w0;
import p.j380;
import p.j5;
import p.mno1;
import p.rjx;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
final class AutoValue_PreparePlayOptions extends PreparePlayOptions {
    private final spq0 alwaysPlaySomething;
    private final spq0 audioStream;
    private final j380 configurationOverride;
    private final spq0 initiallyPaused;
    private final spq0 license;
    private final spq0 playbackId;
    private final spq0 playerOptionsOverride;
    private final spq0 prefetchLevel;
    private final spq0 seekTo;
    private final spq0 seekToCreatorTimestamp;
    private final spq0 sessionId;
    private final spq0 skipTo;
    private final spq0 suppressions;
    private final spq0 systemInitiated;

    private AutoValue_PreparePlayOptions(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5, spq0 spq0Var6, spq0 spq0Var7, spq0 spq0Var8, spq0 spq0Var9, spq0 spq0Var10, spq0 spq0Var11, spq0 spq0Var12, j380 j380Var, spq0 spq0Var13) {
        this.playbackId = spq0Var;
        this.alwaysPlaySomething = spq0Var2;
        this.skipTo = spq0Var3;
        this.seekTo = spq0Var4;
        this.initiallyPaused = spq0Var5;
        this.systemInitiated = spq0Var6;
        this.playerOptionsOverride = spq0Var7;
        this.suppressions = spq0Var8;
        this.prefetchLevel = spq0Var9;
        this.audioStream = spq0Var10;
        this.sessionId = spq0Var11;
        this.license = spq0Var12;
        this.configurationOverride = j380Var;
        this.seekToCreatorTimestamp = spq0Var13;
    }

    public spq0 alwaysPlaySomething() {
        return this.alwaysPlaySomething;
    }

    public spq0 audioStream() {
        return this.audioStream;
    }

    public j380 configurationOverride() {
        return this.configurationOverride;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayOptions) {
            PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj;
            if (this.playbackId.equals(preparePlayOptions.playbackId()) && this.alwaysPlaySomething.equals(preparePlayOptions.alwaysPlaySomething()) && this.skipTo.equals(preparePlayOptions.skipTo()) && this.seekTo.equals(preparePlayOptions.seekTo()) && this.initiallyPaused.equals(preparePlayOptions.initiallyPaused()) && this.systemInitiated.equals(preparePlayOptions.systemInitiated()) && this.playerOptionsOverride.equals(preparePlayOptions.playerOptionsOverride()) && this.suppressions.equals(preparePlayOptions.suppressions()) && this.prefetchLevel.equals(preparePlayOptions.prefetchLevel()) && this.audioStream.equals(preparePlayOptions.audioStream()) && this.sessionId.equals(preparePlayOptions.sessionId()) && this.license.equals(preparePlayOptions.license())) {
                j380 j380Var = this.configurationOverride;
                j380 j380VarConfigurationOverride = preparePlayOptions.configurationOverride();
                j380Var.getClass();
                if (mno1.l(j380VarConfigurationOverride, j380Var) && this.seekToCreatorTimestamp.equals(preparePlayOptions.seekToCreatorTimestamp())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.seekToCreatorTimestamp.hashCode() ^ ((((((((((((((((((((((((((this.playbackId.hashCode() ^ 1000003) * 1000003) ^ this.alwaysPlaySomething.hashCode()) * 1000003) ^ this.skipTo.hashCode()) * 1000003) ^ this.seekTo.hashCode()) * 1000003) ^ this.initiallyPaused.hashCode()) * 1000003) ^ this.systemInitiated.hashCode()) * 1000003) ^ this.playerOptionsOverride.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prefetchLevel.hashCode()) * 1000003) ^ this.audioStream.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.configurationOverride.hashCode()) * 1000003);
    }

    public spq0 initiallyPaused() {
        return this.initiallyPaused;
    }

    public spq0 license() {
        return this.license;
    }

    public spq0 playbackId() {
        return this.playbackId;
    }

    public spq0 playerOptionsOverride() {
        return this.playerOptionsOverride;
    }

    public spq0 prefetchLevel() {
        return this.prefetchLevel;
    }

    public spq0 seekTo() {
        return this.seekTo;
    }

    public spq0 seekToCreatorTimestamp() {
        return this.seekToCreatorTimestamp;
    }

    public spq0 sessionId() {
        return this.sessionId;
    }

    public spq0 skipTo() {
        return this.skipTo;
    }

    public spq0 suppressions() {
        return this.suppressions;
    }

    public spq0 systemInitiated() {
        return this.systemInitiated;
    }

    public PreparePlayOptions$Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.playbackId);
        String strValueOf2 = String.valueOf(this.alwaysPlaySomething);
        String strValueOf3 = String.valueOf(this.skipTo);
        String strValueOf4 = String.valueOf(this.seekTo);
        String strValueOf5 = String.valueOf(this.initiallyPaused);
        String strValueOf6 = String.valueOf(this.systemInitiated);
        String strValueOf7 = String.valueOf(this.playerOptionsOverride);
        String strValueOf8 = String.valueOf(this.suppressions);
        String strValueOf9 = String.valueOf(this.prefetchLevel);
        String strValueOf10 = String.valueOf(this.audioStream);
        String strValueOf11 = String.valueOf(this.sessionId);
        String strValueOf12 = String.valueOf(this.license);
        String strValueOf13 = String.valueOf(this.configurationOverride);
        String strValueOf14 = String.valueOf(this.seekToCreatorTimestamp);
        StringBuilder sbN = gvg.n("PreparePlayOptions{playbackId=", strValueOf, ", alwaysPlaySomething=", strValueOf2, ", skipTo=");
        bb00.j(sbN, strValueOf3, ", seekTo=", strValueOf4, ", initiallyPaused=");
        bb00.j(sbN, strValueOf5, ", systemInitiated=", strValueOf6, ", playerOptionsOverride=");
        bb00.j(sbN, strValueOf7, ", suppressions=", strValueOf8, ", prefetchLevel=");
        bb00.j(sbN, strValueOf9, ", audioStream=", strValueOf10, ", sessionId=");
        bb00.j(sbN, strValueOf11, ", license=", strValueOf12, ", configurationOverride=");
        return rjx.o(sbN, strValueOf13, ", seekToCreatorTimestamp=", strValueOf14, "}");
    }

    public /* synthetic */ AutoValue_PreparePlayOptions(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, spq0 spq0Var5, spq0 spq0Var6, spq0 spq0Var7, spq0 spq0Var8, spq0 spq0Var9, spq0 spq0Var10, spq0 spq0Var11, spq0 spq0Var12, j380 j380Var, spq0 spq0Var13, int i) {
        this(spq0Var, spq0Var2, spq0Var3, spq0Var4, spq0Var5, spq0Var6, spq0Var7, spq0Var8, spq0Var9, spq0Var10, spq0Var11, spq0Var12, j380Var, spq0Var13);
    }

    public static final class Builder extends PreparePlayOptions$Builder {
        private spq0 alwaysPlaySomething;
        private spq0 audioStream;
        private j380 configurationOverride;
        private spq0 initiallyPaused;
        private spq0 license;
        private spq0 playbackId;
        private spq0 playerOptionsOverride;
        private spq0 prefetchLevel;
        private spq0 seekTo;
        private spq0 seekToCreatorTimestamp;
        private spq0 sessionId;
        private spq0 skipTo;
        private spq0 suppressions;
        private spq0 systemInitiated;

        public Builder(PreparePlayOptions preparePlayOptions) {
            j5 j5Var = j5.a;
            this.playbackId = j5Var;
            this.alwaysPlaySomething = j5Var;
            this.skipTo = j5Var;
            this.seekTo = j5Var;
            this.initiallyPaused = j5Var;
            this.systemInitiated = j5Var;
            this.playerOptionsOverride = j5Var;
            this.suppressions = j5Var;
            this.prefetchLevel = j5Var;
            this.audioStream = j5Var;
            this.sessionId = j5Var;
            this.license = j5Var;
            this.seekToCreatorTimestamp = j5Var;
            this.playbackId = preparePlayOptions.playbackId();
            this.alwaysPlaySomething = preparePlayOptions.alwaysPlaySomething();
            this.skipTo = preparePlayOptions.skipTo();
            this.seekTo = preparePlayOptions.seekTo();
            this.initiallyPaused = preparePlayOptions.initiallyPaused();
            this.systemInitiated = preparePlayOptions.systemInitiated();
            this.playerOptionsOverride = preparePlayOptions.playerOptionsOverride();
            this.suppressions = preparePlayOptions.suppressions();
            this.prefetchLevel = preparePlayOptions.prefetchLevel();
            this.audioStream = preparePlayOptions.audioStream();
            this.sessionId = preparePlayOptions.sessionId();
            this.license = preparePlayOptions.license();
            this.configurationOverride = preparePlayOptions.configurationOverride();
            this.seekToCreatorTimestamp = preparePlayOptions.seekToCreatorTimestamp();
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder alwaysPlaySomething(boolean z) {
            this.alwaysPlaySomething = new i5w0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder audioStream(AudioStream audioStream) {
            this.audioStream = spq0.d(audioStream);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions build() {
            if (this.configurationOverride != null) {
                return new AutoValue_PreparePlayOptions(this.playbackId, this.alwaysPlaySomething, this.skipTo, this.seekTo, this.initiallyPaused, this.systemInitiated, this.playerOptionsOverride, this.suppressions, this.prefetchLevel, this.audioStream, this.sessionId, this.license, this.configurationOverride, this.seekToCreatorTimestamp, 0);
            }
            eg.m("Missing required properties: configurationOverride");
            return null;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder configurationOverride(j380 j380Var) {
            if (j380Var != null) {
                this.configurationOverride = j380Var;
                return this;
            }
            bhn0.i("Null configurationOverride");
            return null;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder initiallyPaused(boolean z) {
            this.initiallyPaused = new i5w0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder license(String str) {
            this.license = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder playbackId(String str) {
            this.playbackId = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides) {
            this.playerOptionsOverride = spq0.d(playerOptionOverrides);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder prefetchLevel(PrefetchLevel prefetchLevel) {
            this.prefetchLevel = spq0.d(prefetchLevel);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder seekTo(Long l) {
            this.seekTo = spq0.d(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder seekToCreatorTimestamp(String str) {
            this.seekToCreatorTimestamp = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder sessionId(String str) {
            this.sessionId = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder skipTo(SkipToTrack skipToTrack) {
            this.skipTo = spq0.d(skipToTrack);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder suppressions(Suppressions suppressions) {
            this.suppressions = spq0.d(suppressions);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions$Builder
        public PreparePlayOptions$Builder systemInitiated(boolean z) {
            this.systemInitiated = new i5w0(Boolean.valueOf(z));
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.playbackId = j5Var;
            this.alwaysPlaySomething = j5Var;
            this.skipTo = j5Var;
            this.seekTo = j5Var;
            this.initiallyPaused = j5Var;
            this.systemInitiated = j5Var;
            this.playerOptionsOverride = j5Var;
            this.suppressions = j5Var;
            this.prefetchLevel = j5Var;
            this.audioStream = j5Var;
            this.sessionId = j5Var;
            this.license = j5Var;
            this.seekToCreatorTimestamp = j5Var;
        }
    }
}
