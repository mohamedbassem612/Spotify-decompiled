package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.eg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetRepeatingContextCommand extends SetRepeatingContextCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final boolean value;

    private AutoValue_SetRepeatingContextCommand(boolean z, spq0 spq0Var, spq0 spq0Var2) {
        this.value = z;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetRepeatingContextCommand) {
            SetRepeatingContextCommand setRepeatingContextCommand = (SetRepeatingContextCommand) obj;
            if (this.value == setRepeatingContextCommand.value() && this.options.equals(setRepeatingContextCommand.options()) && this.loggingParams.equals(setRepeatingContextCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public SetRepeatingContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.value;
        String strValueOf = String.valueOf(this.options);
        String strValueOf2 = String.valueOf(this.loggingParams);
        StringBuilder sb = new StringBuilder("SetRepeatingContextCommand{value=");
        sb.append(z);
        sb.append(", options=");
        sb.append(strValueOf);
        sb.append(", loggingParams=");
        return l1d.n(strValueOf2, "}", sb);
    }

    @Override // com.spotify.player.model.command.SetRepeatingContextCommand
    public boolean value() {
        return this.value;
    }

    public /* synthetic */ AutoValue_SetRepeatingContextCommand(boolean z, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(z, spq0Var, spq0Var2);
    }

    public static final class Builder extends SetRepeatingContextCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private byte set$0;
        private boolean value;

        public Builder(SetRepeatingContextCommand setRepeatingContextCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.value = setRepeatingContextCommand.value();
            this.options = setRepeatingContextCommand.options();
            this.loggingParams = setRepeatingContextCommand.loggingParams();
            this.set$0 = (byte) 1;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SetRepeatingContextCommand(this.value, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: value");
            return null;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingContextCommand.Builder
        public SetRepeatingContextCommand.Builder value(boolean z) {
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
