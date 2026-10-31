package com.spotify.player.model.command;

import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import p.cy30;
import p.j5;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlaySessionCommand extends PlaySessionCommand {
    private final spq0 loggingParams;
    private final spq0 playOptions;

    private AutoValue_PlaySessionCommand(spq0 spq0Var, spq0 spq0Var2) {
        this.playOptions = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaySessionCommand) {
            PlaySessionCommand playSessionCommand = (PlaySessionCommand) obj;
            if (this.playOptions.equals(playSessionCommand.playOptions()) && this.loggingParams.equals(playSessionCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((this.playOptions.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public spq0 playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlaySessionCommand
    public PlaySessionCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return cy30.p("PlaySessionCommand{playOptions=", String.valueOf(this.playOptions), ", loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    public /* synthetic */ AutoValue_PlaySessionCommand(spq0 spq0Var, spq0 spq0Var2, int i) {
        this(spq0Var, spq0Var2);
    }

    public static final class Builder extends PlaySessionCommand.Builder {
        private spq0 loggingParams;
        private spq0 playOptions;

        public Builder(PlaySessionCommand playSessionCommand) {
            j5 j5Var = j5.a;
            this.playOptions = j5Var;
            this.loggingParams = j5Var;
            this.playOptions = playSessionCommand.playOptions();
            this.loggingParams = playSessionCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand build() {
            return new AutoValue_PlaySessionCommand(this.playOptions, this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PlaySessionCommand.Builder
        public PlaySessionCommand.Builder playOptions(PlayOptions playOptions) {
            this.playOptions = spq0.d(playOptions);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.playOptions = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
