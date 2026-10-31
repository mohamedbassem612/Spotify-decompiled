package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_UpdateTrackCommand extends UpdateTrackCommand {
    private final ContextTrack track;

    private AutoValue_UpdateTrackCommand(ContextTrack contextTrack) {
        this.track = contextTrack;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateTrackCommand) {
            return this.track.equals(((UpdateTrackCommand) obj).track());
        }
        return false;
    }

    public int hashCode() {
        return this.track.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    public UpdateTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("UpdateTrackCommand{track=", String.valueOf(this.track), "}");
    }

    @Override // com.spotify.player.model.command.UpdateTrackCommand
    public ContextTrack track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_UpdateTrackCommand(int i, ContextTrack contextTrack) {
        this(contextTrack);
    }

    public static final class Builder extends UpdateTrackCommand.Builder {
        private ContextTrack track;

        public Builder(UpdateTrackCommand updateTrackCommand) {
            this.track = updateTrackCommand.track();
        }

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand build() {
            ContextTrack contextTrack = this.track;
            if (contextTrack != null) {
                return new AutoValue_UpdateTrackCommand(0, contextTrack);
            }
            eg.m("Missing required properties: track");
            return null;
        }

        @Override // com.spotify.player.model.command.UpdateTrackCommand.Builder
        public UpdateTrackCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            bhn0.i("Null track");
            return null;
        }

        public Builder() {
        }
    }
}
