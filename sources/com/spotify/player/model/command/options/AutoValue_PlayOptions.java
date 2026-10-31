package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlayOptions extends PlayOptions {
    private final CommandOptions commandOptions;
    private final spq0 operation;
    private final spq0 trigger;

    private AutoValue_PlayOptions(spq0 spq0Var, spq0 spq0Var2, CommandOptions commandOptions) {
        this.operation = spq0Var;
        this.trigger = spq0Var2;
        this.commandOptions = commandOptions;
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayOptions) {
            PlayOptions playOptions = (PlayOptions) obj;
            if (this.operation.equals(playOptions.operation()) && this.trigger.equals(playOptions.trigger()) && this.commandOptions.equals(playOptions.commandOptions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.commandOptions.hashCode() ^ ((((this.operation.hashCode() ^ 1000003) * 1000003) ^ this.trigger.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public spq0 operation() {
        return this.operation;
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public PlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return l1d.n(String.valueOf(this.commandOptions), "}", gvg.n("PlayOptions{operation=", String.valueOf(this.operation), ", trigger=", String.valueOf(this.trigger), ", commandOptions="));
    }

    @Override // com.spotify.player.model.command.options.PlayOptions
    public spq0 trigger() {
        return this.trigger;
    }

    public /* synthetic */ AutoValue_PlayOptions(spq0 spq0Var, spq0 spq0Var2, CommandOptions commandOptions, int i) {
        this(spq0Var, spq0Var2, commandOptions);
    }

    public static final class Builder extends PlayOptions.Builder {
        private CommandOptions commandOptions;
        private spq0 operation;
        private spq0 trigger;

        public Builder(PlayOptions playOptions) {
            j5 j5Var = j5.a;
            this.operation = j5Var;
            this.trigger = j5Var;
            this.operation = playOptions.operation();
            this.trigger = playOptions.trigger();
            this.commandOptions = playOptions.commandOptions();
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions build() {
            if (this.commandOptions != null) {
                return new AutoValue_PlayOptions(this.operation, this.trigger, this.commandOptions, 0);
            }
            eg.m("Missing required properties: commandOptions");
            return null;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder commandOptions(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.commandOptions = commandOptions;
                return this;
            }
            bhn0.i("Null commandOptions");
            return null;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder operation(PlayOperation playOperation) {
            this.operation = spq0.d(playOperation);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PlayOptions.Builder
        public PlayOptions.Builder trigger(PlayTrigger playTrigger) {
            this.trigger = spq0.d(playTrigger);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.operation = j5Var;
            this.trigger = j5Var;
        }
    }
}
