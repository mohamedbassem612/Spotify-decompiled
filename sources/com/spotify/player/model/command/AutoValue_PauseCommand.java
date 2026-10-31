package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PauseCommand extends PauseCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 pauseOrigin;

    private AutoValue_PauseCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
        this.pauseOrigin = spq0Var3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PauseCommand) {
            PauseCommand pauseCommand = (PauseCommand) obj;
            if (this.options.equals(pauseCommand.options()) && this.loggingParams.equals(pauseCommand.loggingParams()) && this.pauseOrigin.equals(pauseCommand.pauseOrigin())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.pauseOrigin.hashCode() ^ ((((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public spq0 pauseOrigin() {
        return this.pauseOrigin;
    }

    @Override // com.spotify.player.model.command.PauseCommand
    public PauseCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.pauseOrigin), "}", gvg.n("PauseCommand{options=", String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), ", pauseOrigin="));
    }

    public /* synthetic */ AutoValue_PauseCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends PauseCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private spq0 pauseOrigin;

        public Builder(PauseCommand pauseCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.pauseOrigin = j5Var;
            this.options = pauseCommand.options();
            this.loggingParams = pauseCommand.loggingParams();
            this.pauseOrigin = pauseCommand.pauseOrigin();
        }

        public PauseCommand build() {
            return new AutoValue_PauseCommand(this.options, this.loggingParams, this.pauseOrigin, 0);
        }

        public PauseCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        public PauseCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        public PauseCommand.Builder pauseOrigin(PauseResumeOrigin pauseResumeOrigin) {
            this.pauseOrigin = spq0.d(pauseResumeOrigin);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.pauseOrigin = j5Var;
        }
    }
}
