package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.eg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetRepeatingTrackCommand extends SetRepeatingTrackCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final boolean value;

    private AutoValue_SetRepeatingTrackCommand(boolean z, spq0 spq0Var, spq0 spq0Var2) {
        this.value = z;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetRepeatingTrackCommand) {
            SetRepeatingTrackCommand setRepeatingTrackCommand = (SetRepeatingTrackCommand) obj;
            if (this.value == setRepeatingTrackCommand.value() && this.options.equals(setRepeatingTrackCommand.options()) && this.loggingParams.equals(setRepeatingTrackCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ (((((this.value ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    public SetRepeatingTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.value;
        String strValueOf = String.valueOf(this.options);
        String strValueOf2 = String.valueOf(this.loggingParams);
        StringBuilder sb = new StringBuilder("SetRepeatingTrackCommand{value=");
        sb.append(z);
        sb.append(", options=");
        sb.append(strValueOf);
        sb.append(", loggingParams=");
        return l1d.n(strValueOf2, "}", sb);
    }

    @Override // com.spotify.player.model.command.SetRepeatingTrackCommand
    public boolean value() {
        return this.value;
    }

    public /* synthetic */ AutoValue_SetRepeatingTrackCommand(boolean z, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(z, spq0Var, spq0Var2);
    }

    public static final class Builder extends SetRepeatingTrackCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private byte set$0;
        private boolean value;

        public Builder(SetRepeatingTrackCommand setRepeatingTrackCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.value = setRepeatingTrackCommand.value();
            this.options = setRepeatingTrackCommand.options();
            this.loggingParams = setRepeatingTrackCommand.loggingParams();
            this.set$0 = (byte) 1;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SetRepeatingTrackCommand(this.value, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: value");
            return null;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetRepeatingTrackCommand.Builder
        public SetRepeatingTrackCommand.Builder value(boolean z) {
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
