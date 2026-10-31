package com.spotify.player.model.command.options;

import p.gvg;
import p.i5w0;
import p.j5;
import p.rjx;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_CommandOptions extends CommandOptions {
    private final spq0 onlyForLocalDevice;
    private final spq0 onlyForPlaybackId;
    private final spq0 overrideRestrictions;
    private final spq0 systemInitiated;

    private AutoValue_CommandOptions(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4) {
        this.overrideRestrictions = spq0Var;
        this.onlyForLocalDevice = spq0Var2;
        this.systemInitiated = spq0Var3;
        this.onlyForPlaybackId = spq0Var4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommandOptions) {
            CommandOptions commandOptions = (CommandOptions) obj;
            if (this.overrideRestrictions.equals(commandOptions.overrideRestrictions()) && this.onlyForLocalDevice.equals(commandOptions.onlyForLocalDevice()) && this.systemInitiated.equals(commandOptions.systemInitiated()) && this.onlyForPlaybackId.equals(commandOptions.onlyForPlaybackId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.onlyForPlaybackId.hashCode() ^ ((((((this.overrideRestrictions.hashCode() ^ 1000003) * 1000003) ^ this.onlyForLocalDevice.hashCode()) * 1000003) ^ this.systemInitiated.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public spq0 onlyForLocalDevice() {
        return this.onlyForLocalDevice;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public spq0 onlyForPlaybackId() {
        return this.onlyForPlaybackId;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public spq0 overrideRestrictions() {
        return this.overrideRestrictions;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public spq0 systemInitiated() {
        return this.systemInitiated;
    }

    @Override // com.spotify.player.model.command.options.CommandOptions
    public CommandOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.overrideRestrictions);
        String strValueOf2 = String.valueOf(this.onlyForLocalDevice);
        return rjx.o(gvg.n("CommandOptions{overrideRestrictions=", strValueOf, ", onlyForLocalDevice=", strValueOf2, ", systemInitiated="), String.valueOf(this.systemInitiated), ", onlyForPlaybackId=", String.valueOf(this.onlyForPlaybackId), "}");
    }

    public /* synthetic */ AutoValue_CommandOptions(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, int i) {
        this(spq0Var, spq0Var2, spq0Var3, spq0Var4);
    }

    public static final class Builder extends CommandOptions.Builder {
        private spq0 onlyForLocalDevice;
        private spq0 onlyForPlaybackId;
        private spq0 overrideRestrictions;
        private spq0 systemInitiated;

        public Builder(CommandOptions commandOptions) {
            j5 j5Var = j5.a;
            this.overrideRestrictions = j5Var;
            this.onlyForLocalDevice = j5Var;
            this.systemInitiated = j5Var;
            this.onlyForPlaybackId = j5Var;
            this.overrideRestrictions = commandOptions.overrideRestrictions();
            this.onlyForLocalDevice = commandOptions.onlyForLocalDevice();
            this.systemInitiated = commandOptions.systemInitiated();
            this.onlyForPlaybackId = commandOptions.onlyForPlaybackId();
        }

        public CommandOptions build() {
            return new AutoValue_CommandOptions(this.overrideRestrictions, this.onlyForLocalDevice, this.systemInitiated, this.onlyForPlaybackId, 0);
        }

        public CommandOptions.Builder onlyForLocalDevice(boolean z) {
            this.onlyForLocalDevice = new i5w0(Boolean.valueOf(z));
            return this;
        }

        public CommandOptions.Builder onlyForPlaybackId(String str) {
            this.onlyForPlaybackId = spq0.d(str);
            return this;
        }

        public CommandOptions.Builder overrideRestrictions(boolean z) {
            this.overrideRestrictions = new i5w0(Boolean.valueOf(z));
            return this;
        }

        public CommandOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = new i5w0(Boolean.valueOf(z));
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.overrideRestrictions = j5Var;
            this.onlyForLocalDevice = j5Var;
            this.systemInitiated = j5Var;
            this.onlyForPlaybackId = j5Var;
        }
    }
}
