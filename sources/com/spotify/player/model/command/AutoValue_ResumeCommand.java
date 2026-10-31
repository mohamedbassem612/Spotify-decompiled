package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_ResumeCommand extends ResumeCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 resumeOrigin;

    private AutoValue_ResumeCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
        this.resumeOrigin = spq0Var3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResumeCommand) {
            ResumeCommand resumeCommand = (ResumeCommand) obj;
            if (this.options.equals(resumeCommand.options()) && this.loggingParams.equals(resumeCommand.loggingParams()) && this.resumeOrigin.equals(resumeCommand.resumeOrigin())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.resumeOrigin.hashCode() ^ ((((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public spq0 resumeOrigin() {
        return this.resumeOrigin;
    }

    @Override // com.spotify.player.model.command.ResumeCommand
    public ResumeCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.resumeOrigin), "}", gvg.n("ResumeCommand{options=", String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), ", resumeOrigin="));
    }

    public /* synthetic */ AutoValue_ResumeCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends ResumeCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private spq0 resumeOrigin;

        public Builder(ResumeCommand resumeCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.resumeOrigin = j5Var;
            this.options = resumeCommand.options();
            this.loggingParams = resumeCommand.loggingParams();
            this.resumeOrigin = resumeCommand.resumeOrigin();
        }

        public ResumeCommand build() {
            return new AutoValue_ResumeCommand(this.options, this.loggingParams, this.resumeOrigin, 0);
        }

        public ResumeCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        public ResumeCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        public ResumeCommand.Builder resumeOrigin(PauseResumeOrigin pauseResumeOrigin) {
            this.resumeOrigin = spq0.d(pauseResumeOrigin);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.resumeOrigin = j5Var;
        }
    }
}
