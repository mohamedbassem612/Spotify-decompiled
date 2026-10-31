package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.rjx;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SignalCommand extends SignalCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 parameters;
    private final String signalId;

    private AutoValue_SignalCommand(String str, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.signalId = str;
        this.parameters = spq0Var;
        this.options = spq0Var2;
        this.loggingParams = spq0Var3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignalCommand) {
            SignalCommand signalCommand = (SignalCommand) obj;
            if (this.signalId.equals(signalCommand.signalId()) && this.parameters.equals(signalCommand.parameters()) && this.options.equals(signalCommand.options()) && this.loggingParams.equals(signalCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((((this.signalId.hashCode() ^ 1000003) * 1000003) ^ this.parameters.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public spq0 parameters() {
        return this.parameters;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public String signalId() {
        return this.signalId;
    }

    @Override // com.spotify.player.model.command.SignalCommand
    public SignalCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.signalId;
        String strValueOf = String.valueOf(this.parameters);
        return rjx.o(gvg.n("SignalCommand{signalId=", str, ", parameters=", strValueOf, ", options="), String.valueOf(this.options), ", loggingParams=", String.valueOf(this.loggingParams), "}");
    }

    public /* synthetic */ AutoValue_SignalCommand(String str, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, int i) {
        this(str, spq0Var, spq0Var2, spq0Var3);
    }

    public static final class Builder extends SignalCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private spq0 parameters;
        private String signalId;

        public Builder(SignalCommand signalCommand) {
            j5 j5Var = j5.a;
            this.parameters = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.signalId = signalCommand.signalId();
            this.parameters = signalCommand.parameters();
            this.options = signalCommand.options();
            this.loggingParams = signalCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand build() {
            String str = this.signalId;
            if (str != null) {
                return new AutoValue_SignalCommand(str, this.parameters, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: signalId");
            return null;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder parameters(String str) {
            this.parameters = spq0.d(str);
            return this;
        }

        @Override // com.spotify.player.model.command.SignalCommand.Builder
        public SignalCommand.Builder signalId(String str) {
            if (str != null) {
                this.signalId = str;
                return this;
            }
            bhn0.i("Null signalId");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.parameters = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
