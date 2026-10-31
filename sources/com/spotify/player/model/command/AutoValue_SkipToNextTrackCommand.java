package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SkipToNextTrackCommand extends SkipToNextTrackCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 track;

    private AutoValue_SkipToNextTrackCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.track = spq0Var;
        this.options = spq0Var2;
        this.loggingParams = spq0Var3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToNextTrackCommand) {
            SkipToNextTrackCommand skipToNextTrackCommand = (SkipToNextTrackCommand) obj;
            if (this.track.equals(skipToNextTrackCommand.track()) && this.options.equals(skipToNextTrackCommand.options()) && this.loggingParams.equals(skipToNextTrackCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public SkipToNextTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.loggingParams), "}", gvg.n("SkipToNextTrackCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.SkipToNextTrackCommand
    public spq0 track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_SkipToNextTrackCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends SkipToNextTrackCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private spq0 track;

        public Builder(SkipToNextTrackCommand skipToNextTrackCommand) {
            j5 j5Var = j5.a;
            this.track = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.track = skipToNextTrackCommand.track();
            this.options = skipToNextTrackCommand.options();
            this.loggingParams = skipToNextTrackCommand.loggingParams();
        }

        public SkipToNextTrackCommand build() {
            return new AutoValue_SkipToNextTrackCommand(this.track, this.options, this.loggingParams, 0);
        }

        public SkipToNextTrackCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        public SkipToNextTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        public SkipToNextTrackCommand.Builder track(ContextTrack contextTrack) {
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
