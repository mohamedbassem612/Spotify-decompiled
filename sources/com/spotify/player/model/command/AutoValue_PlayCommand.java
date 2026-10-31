package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import p.bb00;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlayCommand extends PlayCommand {
    private final Context context;
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 playOptions;
    private final PlayOrigin playOrigin;

    private AutoValue_PlayCommand(Context context, PlayOrigin playOrigin, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.context = context;
        this.playOrigin = playOrigin;
        this.options = spq0Var;
        this.playOptions = spq0Var2;
        this.loggingParams = spq0Var3;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public Context context() {
        return this.context;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayCommand) {
            PlayCommand playCommand = (PlayCommand) obj;
            if (this.context.equals(playCommand.context()) && this.playOrigin.equals(playCommand.playOrigin()) && this.options.equals(playCommand.options()) && this.playOptions.equals(playCommand.playOptions()) && this.loggingParams.equals(playCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.playOptions.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public spq0 playOptions() {
        return this.playOptions;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.command.PlayCommand
    public PlayCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.context);
        String strValueOf2 = String.valueOf(this.playOrigin);
        String strValueOf3 = String.valueOf(this.options);
        String strValueOf4 = String.valueOf(this.playOptions);
        String strValueOf5 = String.valueOf(this.loggingParams);
        StringBuilder sbN = gvg.n("PlayCommand{context=", strValueOf, ", playOrigin=", strValueOf2, ", options=");
        bb00.j(sbN, strValueOf3, ", playOptions=", strValueOf4, ", loggingParams=");
        return l1d.n(strValueOf5, "}", sbN);
    }

    public /* synthetic */ AutoValue_PlayCommand(Context context, PlayOrigin playOrigin, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(context, playOrigin, spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends PlayCommand.Builder {
        private Context context;
        private spq0 loggingParams;
        private spq0 options;
        private spq0 playOptions;
        private PlayOrigin playOrigin;

        public Builder(PlayCommand playCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.playOptions = j5Var;
            this.loggingParams = j5Var;
            this.context = playCommand.context();
            this.playOrigin = playCommand.playOrigin();
            this.options = playCommand.options();
            this.playOptions = playCommand.playOptions();
            this.loggingParams = playCommand.loggingParams();
        }

        public PlayCommand build() {
            PlayOrigin playOrigin;
            Context context = this.context;
            if (context != null && (playOrigin = this.playOrigin) != null) {
                return new AutoValue_PlayCommand(context, playOrigin, this.options, this.playOptions, this.loggingParams, 0);
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

        public PlayCommand.Builder context(Context context) {
            if (context != null) {
                this.context = context;
                return this;
            }
            bhn0.i("Null context");
            return null;
        }

        public PlayCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        public PlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            this.options = spq0.d(preparePlayOptions);
            return this;
        }

        public PlayCommand.Builder playOptions(PlayOptions playOptions) {
            this.playOptions = spq0.d(playOptions);
            return this;
        }

        public PlayCommand.Builder playOrigin(PlayOrigin playOrigin) {
            if (playOrigin != null) {
                this.playOrigin = playOrigin;
                return this;
            }
            bhn0.i("Null playOrigin");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.playOptions = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
