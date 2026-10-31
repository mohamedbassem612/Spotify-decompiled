package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import p.bhn0;
import p.cy30;
import p.eg;
import p.j5;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SkipToPrevTrackOptions extends SkipToPrevTrackOptions {
    private final spq0 allowSeeking;
    private final CommandOptions commandOptions;

    private AutoValue_SkipToPrevTrackOptions(spq0 spq0Var, CommandOptions commandOptions) {
        this.allowSeeking = spq0Var;
        this.commandOptions = commandOptions;
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    public spq0 allowSeeking() {
        return this.allowSeeking;
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    @JsonUnwrapped
    public CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackOptions) {
            SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) obj;
            if (this.allowSeeking.equals(skipToPrevTrackOptions.allowSeeking()) && this.commandOptions.equals(skipToPrevTrackOptions.commandOptions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.commandOptions.hashCode() ^ ((this.allowSeeking.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions
    public SkipToPrevTrackOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return cy30.p("SkipToPrevTrackOptions{allowSeeking=", String.valueOf(this.allowSeeking), ", commandOptions=", String.valueOf(this.commandOptions), "}");
    }

    public /* synthetic */ AutoValue_SkipToPrevTrackOptions(spq0 spq0Var, CommandOptions commandOptions, int i) {
        this(spq0Var, commandOptions);
    }

    public static final class Builder extends SkipToPrevTrackOptions.Builder {
        private spq0 allowSeeking;
        private CommandOptions commandOptions;

        public Builder(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.allowSeeking = j5.a;
            this.allowSeeking = skipToPrevTrackOptions.allowSeeking();
            this.commandOptions = skipToPrevTrackOptions.commandOptions();
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder allowSeeking(Boolean bool) {
            this.allowSeeking = spq0.d(bool);
            return this;
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions build() {
            if (this.commandOptions != null) {
                return new AutoValue_SkipToPrevTrackOptions(this.allowSeeking, this.commandOptions, 0);
            }
            eg.m("Missing required properties: commandOptions");
            return null;
        }

        @Override // com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder
        public SkipToPrevTrackOptions.Builder commandOptions(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.commandOptions = commandOptions;
                return this;
            }
            bhn0.i("Null commandOptions");
            return null;
        }

        public Builder() {
            this.allowSeeking = j5.a;
        }
    }
}
