package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PreparePlayCommand extends PreparePlayCommand {
    private final Context context;
    private final spq0 options;
    private final PlayOrigin playOrigin;

    private AutoValue_PreparePlayCommand(Context context, PlayOrigin playOrigin, spq0 spq0Var) {
        this.context = context;
        this.playOrigin = playOrigin;
        this.options = spq0Var;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayCommand) {
            PreparePlayCommand preparePlayCommand = (PreparePlayCommand) obj;
            if (this.context.equals(preparePlayCommand.context()) && this.playOrigin.equals(preparePlayCommand.playOrigin()) && this.options.equals(preparePlayCommand.options())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.options.hashCode() ^ ((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PreparePlayCommand
    public PreparePlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.options), "}", gvg.n("PreparePlayCommand{context=", String.valueOf(this.context), ", playOrigin=", String.valueOf(this.playOrigin), ", options="));
    }

    public /* synthetic */ AutoValue_PreparePlayCommand(Context context, PlayOrigin playOrigin, spq0 spq0Var, int i) {
        this(context, playOrigin, spq0Var);
    }

    public static final class Builder extends PreparePlayCommand.Builder {
        private Context context;
        private spq0 options;
        private PlayOrigin playOrigin;

        public Builder(PreparePlayCommand preparePlayCommand) {
            this.options = j5.a;
            this.context = preparePlayCommand.context();
            this.playOrigin = preparePlayCommand.playOrigin();
            this.options = preparePlayCommand.options();
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand build() {
            PlayOrigin playOrigin;
            Context context = this.context;
            if (context != null && (playOrigin = this.playOrigin) != null) {
                return new AutoValue_PreparePlayCommand(context, playOrigin, this.options, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.context == null) {
                sb.append(" context");
            }
            if (this.playOrigin == null) {
                sb.append(" playOrigin");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder context(Context context) {
            if (context != null) {
                this.context = context;
                return this;
            }
            bhn0.i("Null context");
            return null;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = spq0.d(preparePlayOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.PreparePlayCommand.Builder
        public PreparePlayCommand.Builder playOrigin(PlayOrigin playOrigin) {
            if (playOrigin != null) {
                this.playOrigin = playOrigin;
                return this;
            }
            bhn0.i("Null playOrigin");
            return null;
        }

        public Builder() {
            this.options = j5.a;
        }
    }
}
