package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_AddToQueueCommand extends AddToQueueCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final ContextTrack track;

    private AutoValue_AddToQueueCommand(ContextTrack contextTrack, spq0 spq0Var, spq0 spq0Var2) {
        this.track = contextTrack;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddToQueueCommand) {
            AddToQueueCommand addToQueueCommand = (AddToQueueCommand) obj;
            if (this.track.equals(addToQueueCommand.track()) && this.options.equals(addToQueueCommand.options()) && this.loggingParams.equals(addToQueueCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((this.track.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public AddToQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.loggingParams), "}", gvg.n("AddToQueueCommand{track=", String.valueOf(this.track), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.AddToQueueCommand
    public ContextTrack track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_AddToQueueCommand(ContextTrack contextTrack, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(contextTrack, spq0Var, spq0Var2);
    }

    public static final class Builder extends AddToQueueCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private ContextTrack track;

        public Builder(AddToQueueCommand addToQueueCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.track = addToQueueCommand.track();
            this.options = addToQueueCommand.options();
            this.loggingParams = addToQueueCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand build() {
            ContextTrack contextTrack = this.track;
            if (contextTrack != null) {
                return new AutoValue_AddToQueueCommand(contextTrack, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: track");
            return null;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.AddToQueueCommand.Builder
        public AddToQueueCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            bhn0.i("Null track");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
