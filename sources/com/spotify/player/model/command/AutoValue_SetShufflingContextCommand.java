package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.eg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetShufflingContextCommand extends SetShufflingContextCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final boolean value;

    private AutoValue_SetShufflingContextCommand(boolean z, spq0 spq0Var, spq0 spq0Var2) {
        this.value = z;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetShufflingContextCommand) {
            SetShufflingContextCommand setShufflingContextCommand = (SetShufflingContextCommand) obj;
            if (this.value == setShufflingContextCommand.value() && this.options.equals(setShufflingContextCommand.options()) && this.loggingParams.equals(setShufflingContextCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    public SetShufflingContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.value;
        String strValueOf = String.valueOf(this.options);
        String strValueOf2 = String.valueOf(this.loggingParams);
        StringBuilder sb = new StringBuilder("SetShufflingContextCommand{value=");
        sb.append(z);
        sb.append(", options=");
        sb.append(strValueOf);
        sb.append(", loggingParams=");
        return l1d.n(strValueOf2, "}", sb);
    }

    @Override // com.spotify.player.model.command.SetShufflingContextCommand
    public boolean value() {
        return this.value;
    }

    public /* synthetic */ AutoValue_SetShufflingContextCommand(boolean z, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(z, spq0Var, spq0Var2);
    }

    public static final class Builder extends SetShufflingContextCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private byte set$0;
        private boolean value;

        public Builder(SetShufflingContextCommand setShufflingContextCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.value = setShufflingContextCommand.value();
            this.options = setShufflingContextCommand.options();
            this.loggingParams = setShufflingContextCommand.loggingParams();
            this.set$0 = (byte) 1;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SetShufflingContextCommand(this.value, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: value");
            return null;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetShufflingContextCommand.Builder
        public SetShufflingContextCommand.Builder value(boolean z) {
            this.value = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
