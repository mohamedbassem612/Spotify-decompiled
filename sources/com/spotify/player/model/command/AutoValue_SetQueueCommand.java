package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.List;
import p.b380;
import p.bb00;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;
import p.z1p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetQueueCommand extends SetQueueCommand {
    private final spq0 loggingParams;
    private final b380 nextTracks;
    private final spq0 options;
    private final b380 prevTracks;
    private final String queueRevision;

    private AutoValue_SetQueueCommand(String str, b380 b380Var, b380 b380Var2, spq0 spq0Var, spq0 spq0Var2) {
        this.queueRevision = str;
        this.prevTracks = b380Var;
        this.nextTracks = b380Var2;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetQueueCommand) {
            SetQueueCommand setQueueCommand = (SetQueueCommand) obj;
            if (this.queueRevision.equals(setQueueCommand.queueRevision())) {
                b380 b380Var = this.prevTracks;
                b380 b380VarPrevTracks = setQueueCommand.prevTracks();
                b380Var.getClass();
                if (z1p1.j(b380Var, b380VarPrevTracks)) {
                    b380 b380Var2 = this.nextTracks;
                    b380 b380VarNextTracks = setQueueCommand.nextTracks();
                    b380Var2.getClass();
                    if (z1p1.j(b380Var2, b380VarNextTracks) && this.options.equals(setQueueCommand.options()) && this.loggingParams.equals(setQueueCommand.loggingParams())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((((((this.queueRevision.hashCode() ^ 1000003) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public b380 nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public b380 prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public String queueRevision() {
        return this.queueRevision;
    }

    @Override // com.spotify.player.model.command.SetQueueCommand
    public SetQueueCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.queueRevision;
        String strValueOf = String.valueOf(this.prevTracks);
        String strValueOf2 = String.valueOf(this.nextTracks);
        String strValueOf3 = String.valueOf(this.options);
        String strValueOf4 = String.valueOf(this.loggingParams);
        StringBuilder sbN = gvg.n("SetQueueCommand{queueRevision=", str, ", prevTracks=", strValueOf, ", nextTracks=");
        bb00.j(sbN, strValueOf2, ", options=", strValueOf3, ", loggingParams=");
        return l1d.n(strValueOf4, "}", sbN);
    }

    public /* synthetic */ AutoValue_SetQueueCommand(String str, b380 b380Var, b380 b380Var2, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(str, b380Var, b380Var2, spq0Var, spq0Var2);
    }

    public static final class Builder extends SetQueueCommand.Builder {
        private spq0 loggingParams;
        private b380 nextTracks;
        private spq0 options;
        private b380 prevTracks;
        private String queueRevision;

        public Builder(SetQueueCommand setQueueCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.queueRevision = setQueueCommand.queueRevision();
            this.prevTracks = setQueueCommand.prevTracks();
            this.nextTracks = setQueueCommand.nextTracks();
            this.options = setQueueCommand.options();
            this.loggingParams = setQueueCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand build() {
            b380 b380Var;
            b380 b380Var2;
            String str = this.queueRevision;
            if (str != null && (b380Var = this.prevTracks) != null && (b380Var2 = this.nextTracks) != null) {
                return new AutoValue_SetQueueCommand(str, b380Var, b380Var2, this.options, this.loggingParams, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.queueRevision == null) {
                sb.append(" queueRevision");
            }
            if (this.prevTracks == null) {
                sb.append(" prevTracks");
            }
            if (this.nextTracks == null) {
                sb.append(" nextTracks");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = b380.p(list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = b380.p(list);
            return this;
        }

        @Override // com.spotify.player.model.command.SetQueueCommand.Builder
        public SetQueueCommand.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            bhn0.i("Null queueRevision");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
