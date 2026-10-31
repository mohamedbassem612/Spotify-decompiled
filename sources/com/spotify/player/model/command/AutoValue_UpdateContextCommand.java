package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_UpdateContextCommand extends UpdateContextCommand {
    private final Context context;

    private AutoValue_UpdateContextCommand(Context context) {
        this.context = context;
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateContextCommand) {
            return this.context.equals(((UpdateContextCommand) obj).context());
        }
        return false;
    }

    public int hashCode() {
        return this.context.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.command.UpdateContextCommand
    public UpdateContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("UpdateContextCommand{context=", String.valueOf(this.context), "}");
    }

    public /* synthetic */ AutoValue_UpdateContextCommand(Context context, int i) {
        this(context);
    }

    public static final class Builder extends UpdateContextCommand.Builder {
        private Context context;

        public Builder(UpdateContextCommand updateContextCommand) {
            this.context = updateContextCommand.context();
        }

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand build() {
            Context context = this.context;
            if (context != null) {
                return new AutoValue_UpdateContextCommand(context, 0);
            }
            eg.m("Missing required properties: context");
            return null;
        }

        @Override // com.spotify.player.model.command.UpdateContextCommand.Builder
        public UpdateContextCommand.Builder context(Context context) {
            if (context != null) {
                this.context = context;
                return this;
            }
            bhn0.i("Null context");
            return null;
        }

        public Builder() {
        }
    }
}
