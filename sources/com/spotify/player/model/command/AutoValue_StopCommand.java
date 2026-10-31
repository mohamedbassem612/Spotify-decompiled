package com.spotify.player.model.command;

import com.spotify.player.model.command.options.LoggingParams;
import p.f4i1;
import p.j5;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_StopCommand extends StopCommand {
    private final spq0 loggingParams;

    private AutoValue_StopCommand(spq0 spq0Var) {
        this.loggingParams = spq0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopCommand) {
            return this.loggingParams.equals(((StopCommand) obj).loggingParams());
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.StopCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.StopCommand
    public StopCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("StopCommand{loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    public /* synthetic */ AutoValue_StopCommand(spq0 spq0Var, int i) {
        this(spq0Var);
    }

    public static final class Builder extends StopCommand.Builder {
        private spq0 loggingParams;

        public Builder(StopCommand stopCommand) {
            this.loggingParams = j5.a;
            this.loggingParams = stopCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand build() {
            return new AutoValue_StopCommand(this.loggingParams, 0);
        }

        @Override // com.spotify.player.model.command.StopCommand.Builder
        public StopCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        public Builder() {
            this.loggingParams = j5.a;
        }
    }
}
