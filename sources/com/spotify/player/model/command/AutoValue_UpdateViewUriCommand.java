package com.spotify.player.model.command;

import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_UpdateViewUriCommand extends UpdateViewUriCommand {
    private final String viewUri;

    private AutoValue_UpdateViewUriCommand(String str) {
        this.viewUri = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateViewUriCommand) {
            return this.viewUri.equals(((UpdateViewUriCommand) obj).viewUri());
        }
        return false;
    }

    public int hashCode() {
        return this.viewUri.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    public UpdateViewUriCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("UpdateViewUriCommand{viewUri=", this.viewUri, "}");
    }

    @Override // com.spotify.player.model.command.UpdateViewUriCommand
    public String viewUri() {
        return this.viewUri;
    }

    public /* synthetic */ AutoValue_UpdateViewUriCommand(String str, int i) {
        this(str);
    }

    public static final class Builder extends UpdateViewUriCommand.Builder {
        private String viewUri;

        public Builder(UpdateViewUriCommand updateViewUriCommand) {
            this.viewUri = updateViewUriCommand.viewUri();
        }

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand build() {
            String str = this.viewUri;
            if (str != null) {
                return new AutoValue_UpdateViewUriCommand(str, 0);
            }
            eg.m("Missing required properties: viewUri");
            return null;
        }

        @Override // com.spotify.player.model.command.UpdateViewUriCommand.Builder
        public UpdateViewUriCommand.Builder viewUri(String str) {
            if (str != null) {
                this.viewUri = str;
                return this;
            }
            bhn0.i("Null viewUri");
            return null;
        }

        public Builder() {
        }
    }
}
