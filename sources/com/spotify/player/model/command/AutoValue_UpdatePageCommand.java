package com.spotify.player.model.command;

import com.spotify.player.model.ContextPage;
import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_UpdatePageCommand extends UpdatePageCommand {
    private final ContextPage page;

    private AutoValue_UpdatePageCommand(ContextPage contextPage) {
        this.page = contextPage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdatePageCommand) {
            return this.page.equals(((UpdatePageCommand) obj).page());
        }
        return false;
    }

    public int hashCode() {
        return this.page.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    public ContextPage page() {
        return this.page;
    }

    @Override // com.spotify.player.model.command.UpdatePageCommand
    public UpdatePageCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("UpdatePageCommand{page=", String.valueOf(this.page), "}");
    }

    public /* synthetic */ AutoValue_UpdatePageCommand(ContextPage contextPage, int i) {
        this(contextPage);
    }

    public static final class Builder extends UpdatePageCommand.Builder {
        private ContextPage page;

        public Builder(UpdatePageCommand updatePageCommand) {
            this.page = updatePageCommand.page();
        }

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand build() {
            ContextPage contextPage = this.page;
            if (contextPage != null) {
                return new AutoValue_UpdatePageCommand(contextPage, 0);
            }
            eg.m("Missing required properties: page");
            return null;
        }

        @Override // com.spotify.player.model.command.UpdatePageCommand.Builder
        public UpdatePageCommand.Builder page(ContextPage contextPage) {
            if (contextPage != null) {
                this.page = contextPage;
                return this;
            }
            bhn0.i("Null page");
            return null;
        }

        public Builder() {
        }
    }
}
