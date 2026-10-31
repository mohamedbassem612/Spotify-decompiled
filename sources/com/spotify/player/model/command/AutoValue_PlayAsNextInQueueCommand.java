package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.List;
import p.b380;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;
import p.z1p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlayAsNextInQueueCommand extends PlayAsNextInQueueCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final b380 tracks;

    private AutoValue_PlayAsNextInQueueCommand(b380 b380Var, spq0 spq0Var, spq0 spq0Var2) {
        this.tracks = b380Var;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayAsNextInQueueCommand) {
            PlayAsNextInQueueCommand playAsNextInQueueCommand = (PlayAsNextInQueueCommand) obj;
            b380 b380Var = this.tracks;
            b380 b380VarTracks = playAsNextInQueueCommand.tracks();
            b380Var.getClass();
            if (z1p1.j(b380Var, b380VarTracks) && this.options.equals(playAsNextInQueueCommand.options()) && this.loggingParams.equals(playAsNextInQueueCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((this.tracks.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public PlayAsNextInQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.loggingParams), "}", gvg.n("PlayAsNextInQueueCommand{tracks=", String.valueOf(this.tracks), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand
    public b380 tracks() {
        return this.tracks;
    }

    public /* synthetic */ AutoValue_PlayAsNextInQueueCommand(b380 b380Var, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(b380Var, spq0Var, spq0Var2);
    }

    public static final class Builder extends PlayAsNextInQueueCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private b380 tracks;

        public Builder(PlayAsNextInQueueCommand playAsNextInQueueCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.tracks = playAsNextInQueueCommand.tracks();
            this.options = playAsNextInQueueCommand.options();
            this.loggingParams = playAsNextInQueueCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand build() {
            b380 b380Var = this.tracks;
            if (b380Var != null) {
                return new AutoValue_PlayAsNextInQueueCommand(b380Var, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: tracks");
            return null;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PlayAsNextInQueueCommand.Builder
        public PlayAsNextInQueueCommand.Builder tracks(List<ContextTrack> list) {
            this.tracks = b380.p(list);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
