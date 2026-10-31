package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.TimerType;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetSleepTimerCommand extends SetSleepTimerCommand {
    private final spq0 loggingParams;
    private final spq0 options;
    private final TimerType timerType;

    private AutoValue_SetSleepTimerCommand(TimerType timerType, spq0 spq0Var, spq0 spq0Var2) {
        this.timerType = timerType;
        this.options = spq0Var;
        this.loggingParams = spq0Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetSleepTimerCommand) {
            SetSleepTimerCommand setSleepTimerCommand = (SetSleepTimerCommand) obj;
            if (this.timerType.equals(setSleepTimerCommand.timerType()) && this.options.equals(setSleepTimerCommand.options()) && this.loggingParams.equals(setSleepTimerCommand.loggingParams())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((this.timerType.hashCode() ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public TimerType timerType() {
        return this.timerType;
    }

    @Override // com.spotify.player.model.command.SetSleepTimerCommand
    public SetSleepTimerCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.loggingParams), "}", gvg.n("SetSleepTimerCommand{timerType=", String.valueOf(this.timerType), ", options=", String.valueOf(this.options), ", loggingParams="));
    }

    public /* synthetic */ AutoValue_SetSleepTimerCommand(TimerType timerType, spq0 spq0Var, spq0 spq0Var2, int i) {
        this(timerType, spq0Var, spq0Var2);
    }

    public static final class Builder extends SetSleepTimerCommand.Builder {
        private spq0 loggingParams;
        private spq0 options;
        private TimerType timerType;

        public Builder(SetSleepTimerCommand setSleepTimerCommand) {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.timerType = setSleepTimerCommand.timerType();
            this.options = setSleepTimerCommand.options();
            this.loggingParams = setSleepTimerCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand build() {
            TimerType timerType = this.timerType;
            if (timerType != null) {
                return new AutoValue_SetSleepTimerCommand(timerType, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: timerType");
            return null;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetSleepTimerCommand.Builder
        public SetSleepTimerCommand.Builder timerType(TimerType timerType) {
            if (timerType != null) {
                this.timerType = timerType;
                return this;
            }
            bhn0.i("Null timerType");
            return null;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
