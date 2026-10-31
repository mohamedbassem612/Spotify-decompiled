package com.spotify.player.model.command.options;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class CommandOptions$Builder {
    public static CommandOptions$Builder builder() {
        return CommandOptions.builder();
    }

    public abstract CommandOptions build();

    public abstract CommandOptions$Builder onlyForLocalDevice(boolean z);

    public abstract CommandOptions$Builder onlyForPlaybackId(String str);

    public abstract CommandOptions$Builder overrideRestrictions(boolean z);

    public abstract CommandOptions$Builder systemInitiated(boolean z);
}
