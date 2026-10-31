package com.spotify.player.model;

import java.util.Map;
import p.eg;
import p.i5w0;
import p.j380;
import p.j5;
import p.l1d;
import p.mno1;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_PlayerOptions extends PlayerOptions {
    private final j380 modes;
    private final spq0 playbackSpeed;
    private final boolean repeatingContext;
    private final boolean repeatingTrack;
    private final boolean shufflingContext;

    private AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3, spq0 spq0Var, j380 j380Var) {
        this.shufflingContext = z;
        this.repeatingContext = z2;
        this.repeatingTrack = z3;
        this.playbackSpeed = spq0Var;
        this.modes = j380Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerOptions) {
            PlayerOptions playerOptions = (PlayerOptions) obj;
            if (this.shufflingContext == playerOptions.shufflingContext() && this.repeatingContext == playerOptions.repeatingContext() && this.repeatingTrack == playerOptions.repeatingTrack() && this.playbackSpeed.equals(playerOptions.playbackSpeed())) {
                j380 j380Var = this.modes;
                j380 j380VarModes = playerOptions.modes();
                j380Var.getClass();
                if (mno1.l(j380VarModes, j380Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.modes.hashCode() ^ (((((((((this.shufflingContext ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.repeatingContext ? 1231 : 1237)) * 1000003) ^ (this.repeatingTrack ? 1231 : 1237)) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.PlayerOptions
    public j380 modes() {
        return this.modes;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public spq0 playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean repeatingContext() {
        return this.repeatingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public boolean shufflingContext() {
        return this.shufflingContext;
    }

    @Override // com.spotify.player.model.PlayerOptions
    public PlayerOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        boolean z = this.shufflingContext;
        boolean z2 = this.repeatingContext;
        boolean z3 = this.repeatingTrack;
        String strValueOf = String.valueOf(this.playbackSpeed);
        String strValueOf2 = String.valueOf(this.modes);
        StringBuilder sb = new StringBuilder("PlayerOptions{shufflingContext=");
        sb.append(z);
        sb.append(", repeatingContext=");
        sb.append(z2);
        sb.append(", repeatingTrack=");
        sb.append(z3);
        sb.append(", playbackSpeed=");
        sb.append(strValueOf);
        sb.append(", modes=");
        return l1d.n(strValueOf2, "}", sb);
    }

    public /* synthetic */ AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3, spq0 spq0Var, j380 j380Var, int i) {
        this(z, z2, z3, spq0Var, j380Var);
    }

    public static final class Builder extends PlayerOptions.Builder {
        private j380 modes;
        private spq0 playbackSpeed;
        private boolean repeatingContext;
        private boolean repeatingTrack;
        private byte set$0;
        private boolean shufflingContext;

        public Builder(PlayerOptions playerOptions) {
            this.playbackSpeed = j5.a;
            this.shufflingContext = playerOptions.shufflingContext();
            this.repeatingContext = playerOptions.repeatingContext();
            this.repeatingTrack = playerOptions.repeatingTrack();
            this.playbackSpeed = playerOptions.playbackSpeed();
            this.modes = playerOptions.modes();
            this.set$0 = (byte) 7;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions build() {
            if (this.set$0 == 7 && this.modes != null) {
                return new AutoValue_PlayerOptions(this.shufflingContext, this.repeatingContext, this.repeatingTrack, this.playbackSpeed, this.modes, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" shufflingContext");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" repeatingContext");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" repeatingTrack");
            }
            if (this.modes == null) {
                sb.append(" modes");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder modes(Map<String, String> map) {
            this.modes = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder playbackSpeed(float f) {
            this.playbackSpeed = new i5w0(Float.valueOf(f));
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingContext(boolean z) {
            this.repeatingContext = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder repeatingTrack(boolean z) {
            this.repeatingTrack = z;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.spotify.player.model.PlayerOptions.Builder
        public PlayerOptions.Builder shufflingContext(boolean z) {
            this.shufflingContext = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder() {
            this.playbackSpeed = j5.a;
        }
    }
}
