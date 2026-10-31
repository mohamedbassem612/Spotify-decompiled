package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SkipToPrevTrackCommand extends SkipToPrevTrackCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 track;

    private AutoValue_SkipToPrevTrackCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.track = spq0Var;
        this.options = spq0Var2;
        this.loggingParams = spq0Var3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackCommand) {
            SkipToPrevTrackCommand skipToPrevTrackCommand = (SkipToPrevTrackCommand) obj;
            if (this.track.equals(skipToPrevTrackCommand.track()) && this.options.equals(skipToPrevTrackCommand.options()) && this.loggingParams.equals(skipToPrevTrackCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public SkipToPrevTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.loggingParams), "}", gvg.n("SkipToPrevTrackCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.SkipToPrevTrackCommand
    public spq0 track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_SkipToPrevTrackCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends SkipToPrevTrackCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private spq0 track;

        public Builder(SkipToPrevTrackCommand skipToPrevTrackCommand) {
            j5 j5Var = j5.a;
            this.track = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.track = skipToPrevTrackCommand.track();
            this.options = skipToPrevTrackCommand.options();
            this.loggingParams = skipToPrevTrackCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand build() {
            return new AutoValue_SkipToPrevTrackCommand(this.track, this.options, this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.options = spq0.d(skipToPrevTrackOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SkipToPrevTrackCommand.Builder
        public SkipToPrevTrackCommand.Builder track(ContextTrack contextTrack) {
            this.track = spq0.d(contextTrack);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.track = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
