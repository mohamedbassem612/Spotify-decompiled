package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Map;
import p.bb00;
import p.eg;
import p.gvg;
import p.i5w0;
import p.j380;
import p.j5;
import p.l1d;
import p.mno1;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SetOptionsCommand extends SetOptionsCommand {
    private final spq0 loggingParams;
    private final j380 modes;
    private final spq0 options;
    private final spq0 playbackSpeed;
    private final spq0 repeatingContext;
    private final spq0 repeatingTrack;
    private final spq0 shufflingContext;

    private AutoValue_SetOptionsCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, j380 j380Var, spq0 spq0Var5, spq0 spq0Var6) {
        this.repeatingTrack = spq0Var;
        this.repeatingContext = spq0Var2;
        this.shufflingContext = spq0Var3;
        this.playbackSpeed = spq0Var4;
        this.modes = j380Var;
        this.options = spq0Var5;
        this.loggingParams = spq0Var6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetOptionsCommand) {
            SetOptionsCommand setOptionsCommand = (SetOptionsCommand) obj;
            if (this.repeatingTrack.equals(setOptionsCommand.repeatingTrack()) && this.repeatingContext.equals(setOptionsCommand.repeatingContext()) && this.shufflingContext.equals(setOptionsCommand.shufflingContext()) && this.playbackSpeed.equals(setOptionsCommand.playbackSpeed())) {
                j380 j380Var = this.modes;
                j380 j380VarModes = setOptionsCommand.modes();
                j380Var.getClass();
                if (mno1.l(j380VarModes, j380Var) && this.options.equals(setOptionsCommand.options()) && this.loggingParams.equals(setOptionsCommand.loggingParams())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.loggingParams.hashCode() ^ ((((((((((((this.repeatingTrack.hashCode() ^ 1000003) * 1000003) ^ this.repeatingContext.hashCode()) * 1000003) ^ this.shufflingContext.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.modes.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public j380 modes() {
        return this.modes;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public spq0 shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.command.SetOptionsCommand
    public SetOptionsCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.repeatingTrack);
        String strValueOf2 = String.valueOf(this.repeatingContext);
        String strValueOf3 = String.valueOf(this.shufflingContext);
        String strValueOf4 = String.valueOf(this.playbackSpeed);
        String strValueOf5 = String.valueOf(this.modes);
        String strValueOf6 = String.valueOf(this.options);
        String strValueOf7 = String.valueOf(this.loggingParams);
        StringBuilder sbN = gvg.n("SetOptionsCommand{repeatingTrack=", strValueOf, ", repeatingContext=", strValueOf2, ", shufflingContext=");
        bb00.j(sbN, strValueOf3, ", playbackSpeed=", strValueOf4, ", modes=");
        bb00.j(sbN, strValueOf5, ", options=", strValueOf6, ", loggingParams=");
        return l1d.n(strValueOf7, "}", sbN);
    }

    public /* synthetic */ AutoValue_SetOptionsCommand(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, j380 j380Var, spq0 spq0Var5, spq0 spq0Var6, int i) {
        this(spq0Var, spq0Var2, spq0Var3, spq0Var4, j380Var, spq0Var5, spq0Var6);
    }

    public static final class Builder extends SetOptionsCommand.Builder {
        private spq0 loggingParams;
        private j380 modes;
        private spq0 options;
        private spq0 playbackSpeed;
        private spq0 repeatingContext;
        private spq0 repeatingTrack;
        private spq0 shufflingContext;

        public Builder(SetOptionsCommand setOptionsCommand) {
            j5 j5Var = j5.a;
            this.repeatingTrack = j5Var;
            this.repeatingContext = j5Var;
            this.shufflingContext = j5Var;
            this.playbackSpeed = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.repeatingTrack = setOptionsCommand.repeatingTrack();
            this.repeatingContext = setOptionsCommand.repeatingContext();
            this.shufflingContext = setOptionsCommand.shufflingContext();
            this.playbackSpeed = setOptionsCommand.playbackSpeed();
            this.modes = setOptionsCommand.modes();
            this.options = setOptionsCommand.options();
            this.loggingParams = setOptionsCommand.loggingParams();
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand build() {
            j380 j380Var = this.modes;
            if (j380Var != null) {
                return new AutoValue_SetOptionsCommand(this.repeatingTrack, this.repeatingContext, this.shufflingContext, this.playbackSpeed, j380Var, this.options, this.loggingParams, 0);
            }
            eg.m("Missing required properties: modes");
            return null;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder modes(Map<String, String> map) {
            this.modes = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder playbackSpeed(float f) {
            this.playbackSpeed = new i5w0(Float.valueOf(f));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingContext(boolean z) {
            this.repeatingContext = new i5w0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = new i5w0(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.SetOptionsCommand.Builder
        public SetOptionsCommand.Builder shufflingContext(boolean z) {
            this.shufflingContext = new i5w0(Boolean.valueOf(z));
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.repeatingTrack = j5Var;
            this.repeatingContext = j5Var;
            this.shufflingContext = j5Var;
            this.playbackSpeed = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
        }
    }
}
